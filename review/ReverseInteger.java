package Leet_code_codebase;

import java.util.Scanner;

public class ReverseInteger {
	public int reverse(int x) {
        int num = Math.abs(x);
        int rev = 0;
        while(num != 0){
            int ld = num%10;
            if(rev > Integer.MAX_VALUE/10 || rev < Integer.MIN_VALUE/10){
                return 0;
            }
            rev = rev*10 + ld;
            num = num /10;
        }
        return (x<0)?(-rev):rev;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		ReverseInteger reverse = new ReverseInteger();
		System.out.print(reverse.reverse(x));
		sc.close();
		
	}

}
