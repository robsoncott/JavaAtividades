package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		
		
		//aqui pode ser chamado o metodo a baixo pelo nome, caso n�o tenha nada dentro do metodo principal n�o ir� aparecer nada.
		//se o o metodo tem parametros, tem que colocar os parametros entre parentes, ao chamar o metodo na principal
	multiplicar(2,5);

	}
	
	public static void meuMetodo(){
		
		// parentes s�o utilizados caso seja necess�rio passar parametros
		//corpo do metodo
		
		System.out.println("Esse � meu metodo");
	}
	
		// metodos com void-(vazio) n�o retorna nada.
	
	public static void multiplicar(int numero1, int numero2){
		
		int resultado = 0;
				
				resultado = numero1 * numero2;
		
		System.out.println(resultado);
		
	}

}
