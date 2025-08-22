package Ch01;

import java.util.Objects;

class C03Simple //hashCode()메서드
{
	int n;
	C03Simple(int n) {
		this.n = n;
	} 
	


	@Override			 
	public boolean equals(Object obj) { 
		
		if(obj instanceof C03Simple) {
			C03Simple down = (C03Simple)obj; 
			return this.n == down.n;
			
		}
		return false;
	}
	
	
	@Override 
	public int hashCode() { //해쉬알고리즘을 이용해서 메시지나 pw를 암호화시킴
		return Objects.hash(this.n); //n의 값을 알 수 없는 숫자로 전달함
	}
	
}
public class C03ObjectMain { 
	
	public static void main(String[] args) {
		
		C03Simple ob1 = new C03Simple(10);
		System.out.println(ob1.toString());
		System.out.printf("%x \n", ob1.hashCode());	//16진수형태 - %X
		//hashcode값을 노출하는 건 좋지X
		//보통 equal를 재정의할 때 hashcode값도 재정의하는 것이 좋음
		// ---> Collection에서 크게 다뤄야 할 자료구조는 list,set,map임
				//자료구조의 객체 일치 여부를 판단할 때 재정의가 되어있지 않으면 동일 여부를 판단하지 못함(ex> set(중복값X))
		

	}

}
