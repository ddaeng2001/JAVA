package Ch03;

class Box <A,B>
{ //두개의 제너릭 타입 필요
	
	A ob1;
	B ob2;
	Box(A ob1, B ob2){ //2개의 제너릭 타입을 받아냄
		
		this.ob1 = ob1;
		this.ob2 = ob2;
	}
	
	//toString()
	@Override
	public String toString() {
		return "Box [ob1=" + ob1 + ", ob2=" + ob2 + "]";
	}
	
	
	
}
class Student{
	String name;
	String major;
	Integer level;
	@Override
	public String toString() {
		return "Student [name=" + name + ", major=" + major + ", level=" + level + "]";
	}
	
	
	
	
	
}



public class C06Ex {

	@Override
	public String toString() {
		return "C06Ex [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public static void print (int..age)(String[] args) {
						
		public static <T>: void print1() {
			
			System.out.println(ob);
			print(10); // 숫자형 데이터 출렬
		}
			
		}
		//BOX
		Box<Integer, Integer>ob1 = new Box(10,20);
		System.out.println(ob1);
		
		//BOX
		Box<String,String>ob2 = new Box("홍길동", "대구");
		System.out.println(ob2);
		
		//BOX
		Box<Student, Student> ob3 = new Box(new Student("홍길동", "컴공", 1), new Student("남길동", "의대", 2));
		System.out.println(ob3);
		
		
		
		
		
		
	}

}
