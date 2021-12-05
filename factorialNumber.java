package Projects_01;

import java.util.Scanner;

public class factorialNumber {

    public static void main(String[] args) {

        /*
        Write a program to find the factorial value of any number entered through the scanner class.

        Example:
        number:7
        factorial:1*2*3*4*5*6*7=5040
        output should be == 5040

        number:6
        factorial:1*2*3*4*5*6=720
        output should be == 720

       */

        /*
        Scanner class aracılığıyla girilen herhangi bir sayının faktöriyel değerini bulmak için bir program yazın.

        number:6
        factorial:1*2*3*4*5*6=720
        output ---> 720

         */
    	
    	Scanner scanner = new Scanner(System.in);

        int sayi = scanner.nextInt();
        int factoriyel=1;
        while (sayi != 0) {
        	factoriyel *= sayi;
			sayi--;
		}

		System.out.println("With While loop   =" + factoriyel);
        
        scanner.close();
        
    }
}
