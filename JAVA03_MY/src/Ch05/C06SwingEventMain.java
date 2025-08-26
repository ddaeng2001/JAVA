//package Ch05;
//
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//class GUI extends JFrame implements ActionListener{
//	
//	//이벤트 등록을 위해 멤버 변수로 변환시킴
//	JButton btn1;
//	JButton btn2;
//	JButton btn3;
//	JButton btn4;
//	
//	public GUI(String title) {
//		//Frame기본설정
//		super(title);
//		setBounds(100,100,400,400);
//		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		//Pannel 설정
//		JPanel panel  = new JPanel();
//		panel.setLayout(null);
//		
//		//
//		btn1 = new JButton("파일로저장"); //지역변수여서 다른 곳에서는 사용할 수 없어 멤버 변수로 올려줌 - 그래야 이벤트 등록이 가능함!
//		btn1.setBounds(270,10,110,30);
//		btn2 = new JButton("1:1요청");
//		btn2.setBounds(270,50,110,30);
//		btn3 = new JButton("대화기록보기");
//		btn3.setBounds(270,90,110,30);
//		btn4 = new JButton("입력");
//		btn4.setBounds(270,300,110,30);
//		
//		//Event 처리
//		btn1.addActionListener(this);
//			 //this는 btn1의 this이기에 btn1를 이벤트감지항목의 요소가 되도록 만듦
//		btn2.addActionListener(this);
//		btn3.addActionListener(this);
//		btn4.addActionListener(this);
//		
//		//
//		JTextArea area = new JTextArea();
//		JScrollPane scroll = new JScrollPane(area);
//		scroll.setBounds(10,10,250,280);
//		//
//		JTextField txt1 = new JTextField();
//		txt1.setBounds(10,300,250,30);
//		
//		//Panel에 Component추가
//		panel.add(btn1);
//		panel.add(btn2);
//		panel.add(btn3);
//		panel.add(btn4);
//		panel.add(scroll);
//		panel.add(txt1);
//		
//		//Frame에 Panel추가
//		add(panel);
//		
//		//Frame표시여부
//		setVisible(true);
//	}
//
//	//미완성된 함수 완성시키기 - 그래야 이벤트 발생 후 확인 가능
//	//버튼을 멤버변수로 변환시켰기에 접근이 가능한 상태!
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("BTN 클릭!" + e.getSource());
//										//getSource : 해당 이벤트를 발생시킨 객체의 toString()값 확인 가능
										//e.getSource() : 어떤 버튼이 클릭됐는지 또는 어떤 컴포넌트에서 이벤트가 발생했는지 알려줌
//		if(e.getSource()==btn1) { //이벤트를 발생시킨 컴포넌트가 btn1인지 비교
//			System.out.println("파일로 저장버튼 클릭!");
//		}else if(e.getSource()==btn2) {
//			System.out.println("1:1 요청 버튼 클릭!");
//		}else if(e.getSource()==btn3) {
//			System.out.println("대화 기록보기 버튼 클릭!");
//		}else if(e.getSource()==btn4){
//			System.out.println("입력 버튼 클릭!");
//		}
//	}
//	
//}
//
//public class C06SwingEventMain {
//
//	
//	public static void main(String[] args) {
//		new GUI("Chatting");
//	}
//}
