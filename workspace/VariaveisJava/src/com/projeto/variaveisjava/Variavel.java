package com.projeto.variaveisjava;

public class Variavel {
	
	//vari�veis
	
	//byte - N�meros - 1,2,3 (range) byte: � capaz de armazenar valores entre -128 at� 127.
	
	//short: � capaz de armazenar valores entre � 32768 at� 32767.
	
	//int - N�meros - 1000, 23003, 2, 1 (� capaz de armazenar valores entre �2147483648 at� 2147483647.)
	
	//Long - N�meros - 100000000000, 2 ,1 (long: � capaz de armazenar valores entre �9223372036854775808 at� 9223372036854775807.)
	
	
	//float - N�meros decimais - 1.1234, 2.34561 (float: � capaz de armazenar valores entre 3.4e�038 at� 3.4e+038)
	
	//double - N�meros decimais o dobro - 1.123132123  (double: � capaz de armazenar valores entre 1 .7e�308 at� 1.7e+308)
	
	//boolean - valores true/false
	
	//String - armazenar textos
	
	

	public static void main(String[] args) {
		
		byte minhaVariavelByte = 14;
		
		int minhaVariavelInt = 10000000;
		
		long minhaVariavellong = 100000000;
		
		float minhaVariavelfloat = 1.5f;
		
		double minhaVariaveldouble = 1.512313213;
		
		boolean minhaVariavelBoolean = false;
		
		String minhaVariavelstring = "cocacola 1 + 1  - ";
		
		
		
		System.out.println(minhaVariavelByte);
		
		System.out.println(minhaVariavelInt);
		
		System.out.println(minhaVariavellong);
		
		System.out.println(minhaVariaveldouble);
		
		System.out.println(minhaVariavelBoolean);
		
		System.out.println(minhaVariavelstring + minhaVariavelByte);
		
		
		

	}

}
