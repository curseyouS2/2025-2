package w4;
// 시험에 낼거임: 생성자의 특징을 4가지 서술하시오...
// overloading (다형성의 하나)
// 자바에서는 객체를 new를 통해서만 만들 수 있다.
// 생성자는 new를 통해 만들 때 자동으로 하나만 호출된다.
// 메소드 = 함수... 메소드의 구성요소: 리턴값, 이름, 매개변수
// 하지만 생성자 메소드는 메소드이지만 리턴값 가지지 않는다. 
// 생성자의 목표: 객체 생성 -> 필요한 초기작업...필드 초기화, 네트워크 연결...
// 기본 생성자 = 디폴트 생성자
// 기본 생성자 작동하지 않는경우: 클래스 내 생성자 존재할 때 ...
// this: 객체 자기 자신에 대한 '참조' -> 빈칸?
// 

class Circle
{	// 필드 + 메소드
	// 기본생성자: 컴파일러가 자동으로 넣어줌 ㅋㅋ
	// 접근지정자 생략시...private가 아니라 package(생략형 -> 패키지범위)
	
	// 필드
	int radius; 
	String name;
	
	// 메소드
	double getArea()
	{
		return 3.14*radius*radius;
	}
	
	// 생성자 -> 기본적으로 멤버변수를 초기화 한다...리턴값 x
	Circle()
	{
		radius = 1;
	}
	
	Circle(int radius)
	{
		//radius = r;
		this.radius = radius;	//매개변수와 필드의 이름이 같을 경우...
	}
	
	Circle(int r, String n)
	{
		radius = r;
		name = n;
	}
}
public class circleEx {
	public static void main(String[] args)
	{	// 객체 생성 = 메모리 할당
		//Circle donut;	// C++에서는 가능 java는 안돼!!
		Circle pizza = new Circle();	//java에서는 new를 이용해야만해...참고: 자바는 포인터가 없다
		double res = pizza.getArea();
		System.out.println("피자의 면적은 "+ res + "입니다.");
		
		// 2번째 실습
		pizza.radius = 10;
		pizza.name = "피자";
		res = pizza.getArea();
		System.out.println("피자의 면적은 " + res + "입니다.");
		
		// 추가된 생성자
		Circle donut = new Circle(5);	// new 생성자함수 라고 생각하면 되는군...
		res = donut.getArea();
		System.out.println("도넛의 면적은 " + res + "입니다.");
	}
}
