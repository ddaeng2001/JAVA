package Ch05;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

class C03GUI extends JFrame{
	
	//생성자 //창제목 외부에서 받기
	C03GUI(String title){ 
		super(title); //Jframe에 필요한 값을 초기화시킴
		setBounds(100,100,500,500); //JFrame을 상속받았기에 쓸 수 있음!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//Panel Setting
		JPanel panel = new JPanel(); //JPanel : Java-Panel의 약자
		Color col = new Color(255,255,0); // 프레임 색깔 지정
		panel.setBackground(col);
		
		add(panel); //Frame에 Panel 추가작업 - 이 상태에서 판넬 세팅을 시작해얗마
		
	}
}

public class C03SwingMain {//프레임을 직접 만들기보다 상속관계를 걸고 만듦!

	public static void main(String[] args) {
		new C03GUI("두번째 프레임 창입니다.");
	}

}
