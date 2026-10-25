package cdac.com;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		int digit=0;
		int sum=0;
		int i=0;
		Scanner s =new Scanner(System.in);
		System.out.println("enter digits to sum: ");
        int n=s.nextInt();
        while(n>0) {
        	
        	digit=n%10;
        	n=n/10;
        	sum=sum+digit;
        }
	System.out.println("sum of digit = "+sum);
	
	}

}
