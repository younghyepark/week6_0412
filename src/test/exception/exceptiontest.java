package test.exception;

import java.util.Scanner;

public class exceptiontest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("* 분자(나누어지는 수) 입력: ");
		int n1 = s.nextInt();
		System.out.print("* 분모(나누는 수) 입력: ");
		int n2 = s.nextInt();
		
		System.out.printf("%d ÷ %d = %d", n1, n2, n1/n2);
	s.close();

	}
}

