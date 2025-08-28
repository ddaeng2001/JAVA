package Ch07;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

class Board implements Serializable{
	//클래스형 자료형을 String으로 전달할 때 보조 스트림 사용
	
	private static final long serialVersionUID = 1L;
							  //직렬처리 도중 데이터가 전송될 때(객체) 내용이 바뀌면 버전업을 시켜야할 때 : serialVersionID
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	public Board(int bno, String title, String content, String writer, Date date) {
		super();
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date;
	}
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", content=" + content + ", writer=" + writer + ", date="
				+ date + "]";
	}
	
	//All Args Constructor
	//Getter and Setter
	//toString
	
	
}

public class C04ObjectStreamMain {
	
	
	public static void main(String[] args) throws Exception{
		
//		outputstream에 보조 스트림에 끼워넣으면 object단위로 전달 가능
		FileOutputStream out = new FileOutputStream("c:\\IOTEST\\board.db");
		ObjectOutputStream oout = new ObjectOutputStream(out);
		oout.writeObject(new Board(1,"제목1","하2","홍길동",new Date()));; //객체 생성 단위를 파일로 저장
		oout.writeObject(new Board(2,"제목2","하3","남길동",new Date()));;
		oout.flush();
		oout.close();
		out.close();
		
		//
		FileInputStream in = new FileInputStream("c:\\IOTEST\\board.db");
		ObjectInputStream oin = new ObjectInputStream(in);

		//obj로 업캐스팅된 상태이기에 다운캐스팅을 해야 내용이 확인 가능함
 		Object obj =  oin.readObject();
		Board down = (Board)obj;
		System.out.println(down);
 		
		Object obj2 =  oin.readObject();
		Board down2 = (Board)obj2;
		System.out.println(down2);
//		//더이상 읽을것이 없으면 java.io.EOFException 발생 
 		Object obj3 =  oin.readObject();
		Board down3 = (Board)obj3;
		System.out.println(down3);

	}

}
