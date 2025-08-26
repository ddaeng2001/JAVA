package Ch05;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class C04GUI extends JFrame{
	
	//생성자 //창제목 외부에서 받기
	C04GUI(String title){ 
		super(title); //Jframe에 필요한 값을 초기화시킴
		setBounds(100,100,500,500); //JFrame을 상속받았기에 쓸 수 있음!
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Panel Setting
		JPanel panel = new JPanel(); //JPanel : Java-Panel의 약자
		panel.setLayout(null); //레이아웃 설정을 무효화 : 중간 자동배치 방지함으로써 위치 선정 자유롭게 가능해짐
		
		//Component Setting : 레이아웃을 설정할 수 있는데 기본적으로 버튼이 중간에 위치하는 이유
		//ex>버튼, 텍스트 삽입
		JButton btn1 = new JButton("BTN01");
		btn1.setBounds(10,10,100,30); //버튼 위치 및 크기 지정
		
		JButton btn2 = new JButton("BTN02");
		btn2.setBounds(120,10,100,30);
					  //x축은 btn1의 위치& 크기를 고려해서!
		
		JTextField txt1 = new JTextField(); //== 입력받기 위한
		txt1.setBounds(10,50,210,30);
		JTextArea area1 = new JTextArea();
//		area1.setBounds(10,90,210,300);
		
		//범위를 벗어나는 텍스트 입력 시 scroll이 생성되도록!
		JScrollPane scroll1 = new JScrollPane(area1);
		scroll1.setBounds(10,90,210,300); //area에 scroll을 품어서!
		
		//Panel에 Component 추가
		panel.add(btn1);
		panel.add(btn2);
		panel.add(txt1);
//		panel.add(area1);
		panel.add(scroll1);
		
		//Frame에 Panel 추가- 이 상태에서 판넬 세팅을 시작해야함
		add(panel); 
		
		//설정이 다 된 후에 화면에 Frame이 출력되도록 설정
		setVisible(true);
		
	}
}

public class C04SwingMain {//프레임을 직접 만들기보다 상속관계를 걸고 만듦!

	public static void main(String[] args) {
		new C04GUI("네번째 프레임 창입니다.");
	}

}
