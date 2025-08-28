package Ch07;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class C03DataInoutStreamMain {//파일로 내용을 저장할 때 특정한 자료형 단위로 저장해서 전달 가능

	public static void main(String[] args) throws Exception{
		
//		FileOutputStream out = new FileOutputStream("c:\\IOTEST\\test3.txt");
//		DataOutputStream dout = new DataOutputStream(out);
//		dout.writeUTF("홍길동"); //자료형 단위로 전달하고자 하는 내용 담기
//		dout.writeDouble(95.5);
//		dout.writeInt(100);
//		dout.flush();
//		dout.close();
		
		FileInputStream in = new FileInputStream("c:\\IOTEST\\test3.txt");
		DataInputStream din = new DataInputStream(in);
		//저장한 순서대로 꺼내오면 됨(UTF->Double->Int)
		String name= din.readUTF();
		System.out.println(name);
		double weight = din.readDouble();
		System.out.println(weight);
		int data = din.readInt();
		System.out.println(data);
		
	}
}
