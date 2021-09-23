import java.util.Scanner;

public class leap_year_with_Java {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int year;
		System.out.print("\nYear: ");
		year = in.nextInt();
		
		if(year % 4 == 0 && year % 100 != 0 || year % 100 == 0 && year % 400 == 0)
			System.out.print("윤년이 맞습니다");
		else
			System.out.print("윤년이 아닙니다");
	}
}
