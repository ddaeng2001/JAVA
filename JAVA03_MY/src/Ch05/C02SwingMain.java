package Ch05;

import javax.swing.JFrame;

class C02GUI extends JFrame{
	
	//생성자 //창제목 외부에서 받기
	C02GUI(String title){ 
		
		//==this.setTitle(title)과 동일한 의미
		super(title); //Jframe 내부의 JFrame(String title)생성자 호출 -> 생성자 내부에서 setTitle(title); 실행됨
					  //-> 실제 윈도우 창 제목에 title 문자열이 표시됨
		
		
		setBounds(100,100,500,500); //JFrame을 상속받았기에 쓸 수 있음!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
}

public class C02SwingMain {//프레임을 직접 만들기보다 상속관계를 걸고 만듦!

	public static void main(String[] args) {
		new C02GUI("두번째 프레임 창입니다.");
	}

}
