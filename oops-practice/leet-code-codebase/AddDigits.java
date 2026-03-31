package Leet_code_codebase;

import java.util.Scanner;

public class AddDigits {
	public int addDigits(int num) {
        while(num >= 10){
            int sum = 0;
            while(num > 0){
                sum += num % 10;
                num = num/10;
            }
            num=sum;
        }
        return num;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		AddDigits ad = new AddDigits();
		System.out.println(ad.addDigits(num));
		sc.close();

	}

}
