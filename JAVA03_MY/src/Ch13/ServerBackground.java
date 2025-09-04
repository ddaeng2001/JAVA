package Ch13;

import java.io.*;
import java.net.*;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ServerBackground {
	ServerSocket server;
	ServerUI gui;
	Map<String,DataOutputStream> ClientList; //!!
	//String : Client가 nickname을 입력하면 DatOutputStream은 두 번째 값을 value로 취급
	Socket client;
	
	
	ServerBackground(ServerUI ui)
	{
		gui = ui;
		ClientList = new HashMap();
		Collections.synchronizedMap(ClientList);//컬렉션 동기화 
		
	}
	
	
	public void Setting() {
		try {
			
			server = new ServerSocket(5555);

			
			//클라이언트 접속 계속 받는 중
			while(true) {
				gui.area.append("서버 접속 요청 대기중....\n");
				client=server.accept();
				gui.area.append(client.getInetAddress()+" 에서 접속중..\n");
				
				//수신 스레드 처리 
				ServerRecvThread recv = new ServerRecvThread(client,this,gui);
				Thread th = new Thread(recv);
				th.start();
				
			}	
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	//클라이언트 추가 작업
	public void addClient(String nick, DataOutputStream Dout) {
		broadCast(nick  + " 님이 접속하셨습니다" +client.getInetAddress()+"\n");
		ClientList.put(nick, Dout);
		
	}
	//접속해제 시 리스트에서 클라이언트 제거
	public void removeClient(String nick) {
		gui.area.append(nick + " 님이 퇴장하셨습니다\n");
		ClientList.remove(nick);
	}
	
	//접속 클라이언트에게 내용을 브로드캐스팅해주는 작업
	public void broadCast(String msg) {
	
		for(String key : ClientList.keySet()) {
			try {		
				ClientList.get(key).writeUTF(msg);
				ClientList.get(key).flush();		
			}catch(Exception e) {}
			
		}
		
		
		
	}
	
	public void broadCast(String nick, String msg) throws IOException {

		for(String tmpnick : ClientList.keySet())
		{
			if(!nick.equals(tmpnick))
			{
				DataOutputStream out =  ClientList.get(tmpnick);	//nick에 대응되는 outputStream을 꺼냄
				out.writeUTF(msg);
				out.flush();
			}
			
		}
		
		
	}
	

}
