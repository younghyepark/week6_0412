package test.method;

import java.util.Scanner;

public class methodtest4 {

	static int add (int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		int n1 = 0, n2 = 0;
		while (true) {
		System.out.print("정수입력1: ");
		n1 = s1.nextInt();
		System.out.print("정수입력2: ");
		n2 = s1.nextInt();
		System.out.printf("%d + %d = %d\n", n1, n2, add(n1, n2));
		System.out.println("계속 하시겠습니까? (y or n):");
		String cont = s2.nextLine();
		if(cont.equals("n") || cont.equals("no"))
		break;
	}
	System.out.println("프로그램 종료됨");
		s1.close();
		s2.close();

	}

}
