package Ch17;


//덧셈, 뺄셈, 곲셈, 나눗셈을 수행하는 함수형 인터페이스를 정의
interface Calculator{
	int calculate(int num1, int num2);
}

public class C03Lambda {

	public static void main(String[] args) {

		//덧셈 Calculator add 만들기
		Calculator add = (a,b)->{return a+b;};
		//뺄셈 Calculator sub 만들기
		Calculator sub = (a,b)->{return a<b?b-a:a-b;};
		//곱셈 Calculator mul 만들기
		Calculator mul = (a,b)->{return a*b;};
		//나눗셈 Calculator div 만들기
		Calculator div = (a,b)->{return a/b;};
		
		//결과
		System.out.println(add.calculate(10,20)); //덧셈
		System.out.println(sub.calculate(30,10)); //뺄셈
		System.out.println(mul.calculate(10,20)); //곱셈
		System.out.println(div.calculate(100,5)); //나눗셈
	}

}
