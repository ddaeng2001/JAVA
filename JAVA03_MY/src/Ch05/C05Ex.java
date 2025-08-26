//package Ch05;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//class C05 extends JFrame{
//	
//	//생성자, 창제목을 외부에서 받아보자
//	C05(String title){
//		super(title); //상위 클래스의 title을 전달하도록 할 것
//		setBounds(100,100,500,500);
//		
//		//x창을 눌렀을 때 백그라운드에서도 같이 꺼지기!
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		//판넬 세팅
//		JPanel panel = new JPanel();
//		panel.setLayout(null); //레이아웃 설정 무효화
//		
//		//컴포넌트 세팅
//		//TextArea
//		JTextArea area1 = new JTextArea();
//		
//		//TXT
//		JTextField txt1 = new JTextField();
//		txt1.setBounds(10,360,270,50);
//		
//		//버튼 추가
//		JButton btn1 = new JButton("파일로 저장");
//		btn1.setBounds(320,10,140,60);
//		
//		JButton btn2 = new JButton("1:1 요청");
//		btn2.setBounds(320,110,140,60);
//		
//		JButton btn3 = new JButton("대화기록보기");
//		btn3.setBounds(320,210,140,60);
//		
//		JButton btn4 = new JButton("입력");
//		btn4.setBounds(320,360,140,50);
//		
//		//스크롤 추가
//		JScrollPane scroll1 = new JScrollPane(area1);
//		scroll1.setBounds(10,10,270,330);
//		
//		//Panel에 component 추가
//		panel.add(scroll1);
//		panel.add(txt1);
//		panel.add(btn1);
//		panel.add(btn2);
//		panel.add(btn3);
//		panel.add(btn4);
//		
//		//Frame에 Panel 추가
//		add(panel);
//		
//		//설정완료 후 화면에 출력
//		setVisible(true);
//	}
//	
//}
//public class C05Ex {
//
//	public static void main(String[] args) {
//		new C05("Chatting Server");
//	}
//
//}
