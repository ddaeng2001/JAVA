package Ch01;

class C02Simple
{
	int n;
	C02Simple(int n) {
		this.n = n;
	} //equals를 사용하려면 클래스에서는 재정의해서 사용해야함
		//r : 객체의 위치값이 아니라 들어가있는 n(멤버 변수)값을 비교해야하기 때문에!!
	
	@Override
						 //모든 객체를 다 담아낼 수 있는 상태(업캐스팅 된 상태)지만 C02Simple로 만들어진 객체인지 아닌지부터 판단해야함
	public boolean equals(Object obj) { //오버라이드는 함수의 헤더는 그대로 두고 
		if(obj instanceof C02Simple) {//본체 부분만 바뀜 - C02Simple
			
			C02Simple down = (C02Simple)obj; //다운캐스팅 - r : 업캐스팅된 상태에서 확장된 멤버에 접근하기 위함
//															Object obj는 기본적으로 상위클래스형 참조변수이기에 C02Simple에서 만들어놓은 멤버 변수
														  //n에 접근이 불가능하기 때문에 여기에 접근하기 위해서 다운캐스팅
			return this.n == down.n;
			//현재 기준이되는 멤버변수n과 비교하는 멤버변수 n을 비교함
		}
		return false;
	}
}
public class C02ObjectMain { //equals(Object obj) : 기존 객체의 위치값과 대상 객체의 위치값을 비교해서 boolean값으로 결과 반환

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10);
		C02Simple ob2 = new C02Simple(10);
		C02Simple ob3 = new C02Simple(10);
		
		System.out.println(ob1.equals(ob2)); 
		System.out.println(ob1.equals(ob3));

	}

}
