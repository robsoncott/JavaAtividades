package com.projeto.metodos;

public class Metodos {

	public static void main(String[] args) {
		
		
		//aqui pode ser chamado o metodo a baixo pelo nome, caso não tenha nada dentro do metodo principal não irá aparecer nada.
		//se o o metodo tem parametros, tem que colocar os parametros entre parentes, ao chamar o metodo na principal
	multiplicar(2,5);

	}
	
	public static void meuMetodo(){
		
		// parentes são utilizados caso seja necessário passar parametros
		//corpo do metodo
		
		System.out.println("Esse é meu metodo");
	}
	
		// metodos com void-(vazio) não retorna nada.
	
	public static void multiplicar(int numero1, int numero2){
		
		int resultado = 0;
				
				resultado = numero1 * numero2;
		
		System.out.println(resultado);
		
	}

}
