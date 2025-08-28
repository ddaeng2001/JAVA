package Ch06;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

public class C11RestRequestResponseMain {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//01 요청URL 파라미터 지정
		String url = "https://www.daegufood.go.kr/kor/api/tasty.html";
		String mode = "json";
		String addr = "중구";
		url = url + "?mode=" + mode + "&addr=" + addr;
		
		//02 Http Request 구성
		HttpRequest httpRequest = HttpRequest.newBuilder().uri(URI.create(url)).GET().build();
								  //객체 생성을 위한 작업
		
		//03 Request 요청 -> Response 받기
		HttpClient httpClient = HttpClient.newHttpClient();
		HttpResponse<String> response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
																	 //응답받을 때는 문자열로 받겠다!
		//System.out.println(response.body());
		
		
		
		
		//04 받은 Data Class화 (1번이나 2번 중 선택~) - 프레임워크 restAPI에서도 사용할 예정
		
		ObjectMapper objectMapper = new ObjectMapper();
		
		//04-01) JSON Type 유지
		/*
		 * JsonNode jsonNode = objectMapper.readTree(response.body()); //JsonNode :
		 * Json파일 전체를 받아내는 단위 System.out.println("statue: " + jsonNode.get("status"));
		 * //key의 value값 확인 가능 System.out.println("total: " + jsonNode.get("total"));
		 * JsonNode data = jsonNode.get("data"); //data에 담긴 배열 object[{},{},{}]를 받을 수 있음
		 * //배열을 받기위한 반복처리 for(int i=0;i<data.size();i++) { //배열 형태 - 인덱스 번호 활용 가능
		 * JsonNode item = data.get(i); //모든 배열 확인 가능
		 * System.out.println(item.get("BZ_NM")); //상호명(BZ_NM)만 뽑아오기 가능 }
		 */		
		
		//04-02) JAVA Class로 변환 - Java 내부의 문법 적극활용 가능
		Root responseObject = objectMapper.readValue(response.body(), Root.class);
																	  //아래에서 정의된 root를 의미
		System.out.println("status: " + responseObject.status); //public이라 굳이 getter/setter로 접근 안해도 됨
		System.out.println("total: " + responseObject.total);
		responseObject.data.forEach(System.out::println);
	}					//data = ArrayList이기에 forEach함수 사용
						//toString()함수 사용하면 안의 내용 확인 가능
	
	//INNERCLASS : Class 내에서만 객체를 생성할 수 있는 class
	private static class Data{ //private static : 내부에서만 숨겨서 사용하는 클래스라 외부에서 이름이 중복되도 ㄱㅊ
	    public String cnt;
	    @JsonProperty("OPENDATA_ID") //JsonProperty : 특정 key가 oPENDATA_ID에 저장되게 해줌
	    public String oPENDATA_ID;
	    @JsonProperty("GNG_CS") 
	    public String gNG_CS;
	    @JsonProperty("FD_CS") 
	    public String fD_CS;
	    @JsonProperty("BZ_NM") 
	    public String bZ_NM;
	    @JsonProperty("TLNO") 
	    public String tLNO;
	    @JsonProperty("MBZ_HR") 
	    public String mBZ_HR;
	    @JsonProperty("SEAT_CNT") 
	    public String sEAT_CNT;
	    @JsonProperty("PKPL") 
	    public String pKPL;
	    @JsonProperty("HP") 
	    public String hP;
	    @JsonProperty("PSB_FRN") 
	    public String pSB_FRN;
	    @JsonProperty("BKN_YN") 
	    public String bKN_YN;
	    @JsonProperty("INFN_FCL") 
	    public String iNFN_FCL;
	    @JsonProperty("BRFT_YN") 
	    public String bRFT_YN;
	    @JsonProperty("DSSRT_YN") 
	    public String dSSRT_YN;
	    @JsonProperty("MNU") 
	    public String mNU;
	    @JsonProperty("SMPL_DESC") 
	    public String sMPL_DESC;
	    @JsonProperty("SBW") 
	    public String sBW;
	    @JsonProperty("BUS") 
	    public String bUS;
	    
		@Override
		public String toString() {
			return "Data [cnt=" + cnt + ", oPENDATA_ID=" + oPENDATA_ID + ", gNG_CS=" + gNG_CS + ", fD_CS=" + fD_CS
					+ ", bZ_NM=" + bZ_NM + ", tLNO=" + tLNO + ", mBZ_HR=" + mBZ_HR + ", sEAT_CNT=" + sEAT_CNT
					+ ", pKPL=" + pKPL + ", hP=" + hP + ", pSB_FRN=" + pSB_FRN + ", bKN_YN=" + bKN_YN + ", iNFN_FCL="
					+ iNFN_FCL + ", bRFT_YN=" + bRFT_YN + ", dSSRT_YN=" + dSSRT_YN + ", mNU=" + mNU + ", sMPL_DESC="
					+ sMPL_DESC + ", sBW=" + sBW + ", bUS=" + bUS + "]";
		}
	    
	    
	}

	private static class Root{ //private static : 클래스 단위로 작업 가능
	    public String status;
	    public String total;
	    public ArrayList<Data> data;
	    		//배열 object를 담기 위해 ArrayList사용
	}



}