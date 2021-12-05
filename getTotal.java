package Projects_01;

public class getTotal {

	/*
	 * 
	 * Given three positive Strings remove all the non numeric numbers. change the
	 * Strings to int and print the total
	 * 
	 * Example: String num1 = "$15"; String num2 = "$20"; String num3 = "$30";
	 * output should be == 65;
	 * 
	 * NOTE : if the output less then 0 change output to -1
	 * 
	 */

	/*
	 * 3 tane pozitif String verildiğinde sayısal olmayan tüm karakterleri kaldırın.
	 * Stringleri int e çevirin ve total print edin
	 * 
	 * Ornek: String num1 = "$15"; String num2 = "$20"; String num3 = "$30"; output
	 * ----> 65; olmali
	 * 
	 * NOT : Eğer output 0 dan küçük ise outputu -1 e cevir
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		String num1 = "$15";
		String num2 = "$20";
		String num3 = "$30";
		
		
		int sayi1=Integer.parseInt(num1.replaceAll("\\D", ""));
		int sayi2=Integer.parseInt(num2.replaceAll("\\D", ""));
		int sayi3=Integer.parseInt(num3.replaceAll("\\D", ""));
		
		int top=sayi1+sayi2+sayi3;
		System.out.println(top);
				
		
	}

}
