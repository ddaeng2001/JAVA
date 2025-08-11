package Ch03;

public class C05 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		// 나누어지는 수가 정수면 몫만 생각하면 됨
		// 결과값이 2이기에 int 자료형
		double dnum1 = (double)num1 / num2;	//num1를 10.0으로 바꿔서 4로 나누면 결과값은 2.5(나머지를 포함)의 결과값 도츠ㅜㄹ
		double dnum2 = (num1*1.0) / num2; //num2에 해도 상관은 없지만 보통은 앞쪽에 작업함
		double dnum3 = num1 / num2; //double이지만 int자료형이 더 작기에 자동 형변환으로 2.0이 결과값으로 도출
		System.out.println("dnum1 : " + dnum1);
		System.out.println("dnum2 : " + dnum2);
		System.out.println("dnum3 : " + dnum3);
	}

}
