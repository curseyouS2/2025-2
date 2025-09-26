package w4;
import java.util.Scanner;
// 메소드 오버로딩의 조건을 써라...
// 이름 같을것
// 매개변수 개수 또는 타입, 순서 다를 것
// 리턴타입 상관 x

// Phone을 배열로 만들어서 전화번호부(PhoneBook를 만들어야지 ㅋㅋ 라는 생각임.
class Phone
{
	private String name;
	private String tel;
	
	// 생성자
	public Phone(String name, String tel) 
	{
		this.name = name;
		this.tel = tel;
	}
	
	// 메소드 - get기능
	public String getName() {return name;}
	public String getTel() {return tel;}
	
	
}


public class PhoneBook 
{
	// 필드
	// 레퍼런스 변수만 만들어보겟음 ( 메모리 할당 x )
	private Phone[] pArray;
	Scanner sc;
	
	// 생성자
	PhoneBook()
	{
		sc = new Scanner(System.in);
	}
	void input()
	{
		System.out.print("저장할 인원 수: ");
		int n = sc.nextInt();
		pArray = new Phone[n];
		
		for(int i =0;i<pArray.length;i++)
		{
			System.out.print("이름과 전화번호 입력:");
			String name = sc.next();
			String tel = sc.next();
			pArray[i] = new Phone(name, tel);
		}
	}
	
	String search(String name)
	{
		return name;
	}
	
	void run()
	{	// 데이터 입력
		input();
		while(true)
		{
			System.out.println("검색할 이름을 입력 >>");
			// 메뉴 입력
			String name = sc.next();
			if(name.equals("그만")) break;
			
			String tel = search(name);
		}
	}
	public static void main(String[] args)	
	{	
		// 이름을 따로 만들지 않을 수도 있다...
		new PhoneBook().run();
	}
}
