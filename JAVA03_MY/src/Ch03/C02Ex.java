package Ch03;

class taste{
	
}

class 캬라멜 extends taste{

	@Override
	public String toString() {
		return "캬라멜";
	}

}
	
	
class 버터옥수수 extends taste{

	@Override
	public String toString() {
		return "버터옥수수";
	}
	
}

class PopCorn <T extends taste>{ //제너릭 타입 제한
	private T 맛;
	public PopCorn(T 맛) {
		this.맛 = 맛;
	}
	
	@Override
	public String toString() {
		return "PopCorn [맛=" + 맛 + "]";
	}
	

	}
	
	
	




public class C02Ex {

	public static void main(String[] args) {
		PopCorn<캬라멜> ob1 = new PopCorn<캬라멜>(new 캬라멜());
		System.out.println(ob1);
		
		PopCorn<버터옥수수> ob2 = new PopCorn<버터옥수수>(new 버터옥수수());
		System.out.println(ob2);
	}

	}

