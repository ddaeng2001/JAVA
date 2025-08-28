package Ch06;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//크롬서버.jar 다운로드 경로(셀레니움 공식 홈페이지)
//https://www.selenium.dev/downloads/

//크롬드라이브 다운로드 경로
//https://googlechromelabs.github.io/chrome-for-testing/#stable


public class C10SeleniumAPIMain { //JSOUP : 크롤링 봇을 만들어서 클릭 
								  //Selenium : 사람이 클릭하는 것처럼 보여줌
	
	private static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	private static final String WEB_DRIVER_PATH = "src/Drivers/chromedriver-win64/chromedriver.exe";

	public static void main(String[] args) throws InterruptedException {
		//Selenium 3.x 기준 브라우저 활성화 방법(4.x 부터는 chromedriver.exe를 윈도우 PATH에 등록 시 경로설정 필요없음)
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH); //->경로설정
		//크롬브라우저 옵션 설정
		ChromeOptions options = new ChromeOptions();
//		options.addArguments("--headless");		//백그라운드 실행
//		options.addArguments("--no-sandbox");	//리눅스 환경 sandbox 사용 여부
												//실행 시 권한 제한을 우회하기 위한 방법
		//크롬브라우저 활성화
		WebDriver driver = new ChromeDriver(options); //눈에는 안보여도 백그라운드에서 실행됨
		driver.get("https://naver.com");
		
		//특정 요소 위치 선택(키워드 입력하기) - 검색필드
		WebElement searchEl = driver.findElement(By.id("query"));	//By : 셀리니움에서 받은 파라미터
				   //검색 필드							//id이름
		//키워드 입력
		searchEl.sendKeys("모니터");
		
		//엔터키 전달
		searchEl.sendKeys(Keys.RETURN);
		
		//쇼핑버튼 클릭(.api_pcpg_wrap .tab:nth-child(1))
					//api_pcpg_wrap의 모든 자손 중 tab 자손 중 첫번째
		WebElement shoppingBtnEl = driver.findElement(By.cssSelector(".api_pcpg_wrap .tab:nth-child(1)"));
		
		//새창열기(target="_blank")제거 - JS코드 수정)
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].removeAttribute('target')", shoppingBtnEl);
						 //첫번째 요소의 target제거
						 
		shoppingBtnEl.click();
		
		Thread.sleep(500);
		
		//리뷰좋은 순 클릭(.subFilter_sort__4Q_hv._nlog_click._nlog_impression_element)
		WebElement reviewBtnEl = driver.findElement(By.cssSelector(".subFilter_sort__4Q_hv._nlog_click._nlog_impression_element"));
		reviewBtnEl.click();
		
		//크롤링 후 창을 닫을려면
		//driver.close();

	}

}