package RPS;
import java.util.Scanner;
import java.util.Random;

public class RPS {
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in); // 정해진 클래스 사용 ...
		// scanner타입의 메모리만큼을 할당해줘 -> 객체 생성됨
		System.out.println("가위바위보 게임을 시작합니다...\n가위, 바위, 보 중 하나를 입력하세요."); 	// syso 입력 후 컨트롤 스페이스바
		System.out.println("철수 >> ");
		String x = scanner.next(); // string클래스...!!! c: 배열로 처리, c++: string클래스 인클루드해서, java: 그냥 내부에...!!!
		// 스트링은 자료형이 아니라 기본 제공 클래스입니다...
//		System.out.println("영희 >> ");
//		String y = scanner.next();//아 클래스라서 string이 아니라 String이라고 쓰나봐...
		String select[] = {"가위", "바위", "보"};
		Random random = new Random();
		int selection = random.nextInt(3);	// random클래스의 메서드를 사용
		String y = select[selection];
		System.out.println("영희 >> "+y);
		
		if(x.equals("가위"))
		{
			if(y.equals("가위"))
			{
				System.out.println("비겼습니다.");
			}
			else if(y.equals("바위"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else
			{
				System.out.println("철수가 이겼습니다.");
			}
		}
		else if(x.equals("바위"))
		{
			if(y.equals("가위"))
			{
				System.out.println("철수가 이겼습니다.");
			}
			else if(y.equals("바위"))
			{
				System.out.println("비겼습니다.");
			}
			else
			{
				System.out.println("영희가 이겼습니다.");
			}
		}
		else if(x.equals("보"))
		{
			if(y.equals("가위"))
			{
				System.out.println("영희가 이겼습니다.");
			}
			else if(y.equals("바위"))
			{
				System.out.println("철수가 이겼습니다.");
			}
			else
			{
				System.out.println("비겼습니다.");
			}
		}
		else
		{
			System.out.println("잘못된 입력입니다.");
		}
	}
	
}
