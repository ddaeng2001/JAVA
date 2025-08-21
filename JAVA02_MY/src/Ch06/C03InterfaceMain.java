package Ch06;

interface Remocon{ //MAIN과 TV/RADIO를 이어주는 중간매체
	int MAX_VOL = 100; //public static final : 값을 바꿀 수 없음, 기준값
	int MIN_VOL = 0;   //public static final : 값 변경 불가능, 기준값
	
	void powerOn();		//추상메서드
	void powerOff();	//추상메서드
	void setVolume(int vol);
}

interface Browser{	//url을 받아서 서칭할 수 있게끔! //Remocon은 모름
	void searchURL(String url);
}
class Tv implements Remocon{
	  //unimplemented method clicked!

	//멤버변수
	private int nowVol; //현재 볼륨값 생성
	
	@Override
	public void powerOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int vol) {
		if(vol>=MAX_VOL)
			this.nowVol = MAX_VOL;
		else if(vol<=MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = vol;
		System.out.println("TV 현재 볼륨 : " + nowVol);
	}
}

class SmartTV extends Tv implements Browser{

	@Override
	public void searchURL(String url) {
		System.out.println(url + "로 이동합니다-!");
		
	}
	
}

class Radio implements Remocon{
	  //unimplemented method clicked!!
	
	
	//멤버변수
	private int nowVol; //현재 볼륨값 생성
	
	@Override
	public void powerOn() {
		System.out.println("라디오를 켭니다.");
	}

	@Override
	public void powerOff() {
		System.out.println("라디오를 끕니다");
		
	}

	@Override
	public void setVolume(int vol) {

		
		if(vol>=MAX_VOL)
			this.nowVol = MAX_VOL;
		else if(vol<=MIN_VOL)
			this.nowVol = MIN_VOL;
		else
			this.nowVol = vol;
		System.out.println("Radio 현재 볼륨 : " + nowVol);
	}
	
}



public class C03InterfaceMain {
	

	public static void TurnOn(Remocon controller) {
		controller.powerOn();
	}	
									  //controller에 TV or Radio 객체 연결 예정 
	public static void TurnOff(Remocon controller) {
		controller.powerOff();
	}
	
	public static void ChangeVolume(Remocon controller, int vol)
	{
		controller.setVolume(vol);
	}
	
	public static void Internet(Browser browser, String url) {
		browser.searchURL(url);
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		Radio radio = new Radio();
		SmartTV smartTv = new SmartTV();
		
		TurnOn(smartTv);
		ChangeVolume(smartTv,10);
		Internet(smartTv, "www.naver.com");
		TurnOff(smartTv);
		
//		TurnOn(tv); //재정의된 함수에 접근 가능함
////		tv.powerOn(); //결합도가 높음
//		TurnOn(radio); 
//		
//		ChangeVolume(tv,50);
//		ChangeVolume(tv,120);
//		ChangeVolume(radio,-10);
//		ChangeVolume(radio,70);
//		
//		TurnOff(tv);
//		TurnOff(radio);
//										  

	}

}
