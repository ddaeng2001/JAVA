package Ch05;

import javax.swing.JFrame;

public class C01SwingMain { //Swing은 참고만 하기!
							//프레임창 제작할거에용

	public static void main(String[] args) {
		JFrame frame = new JFrame("첫번째 프레임입니다."); //JFrame : 프레임을 만들 때 사용되는 함수 
								   //상단에 보여지는 창 제목
		//프레임 위치 잡기
		frame.setBounds(100,100,500,500);
					    //왼쪽상단 기준으로
						//(x축,y축,width,height)
		
		//프레임 x버튼을 눌렀을 때 백그라운드에서도 같이 꺼지도록(기본 설정)
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//프레임 창을 화면에 활성화(True)/비활성화(False)
		frame.setVisible(true);

	}

}
