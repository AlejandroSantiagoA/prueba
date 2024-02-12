package palindromo;

import java.util.Scanner;
public class palindromo {

	public static boolean comprobacion (String texto) {
		texto = texto.toLowerCase();
		texto = texto.replace(" ","");
		
		int primera=0;
		int ultima=texto.length() - 1;
		
		for (int i=0; i<texto.length(); i++) {
			if(texto.charAt(primera) == texto.charAt(ultima)) {
				primera++;
				ultima--;
			}else {
				return false;
			}
		}
		return true;
	}
	
	/*
	 Realizar un programa identifique si un texto es palindromo o no.
	Un palindromo es una palabra o frase que al leerse de izquierda a derecha y viceversa expresan o tienen
	el mismo sentido.
	Ejemplos:
	• luz azul
	• somos o no somos
	• oso
	• ana
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String texto;
	
				System.out.println("ingresa el texto a verificar");
				texto = sc.nextLine();
				
				if(comprobacion(texto)) {
					System.out.println("es palindromo");
				}else {
					System.out.println("no es palindromo");
				}
				
	}

}
