package cuentaRegresiva;

public class cuenta {
 
	public static void main(String[] args)throws InterruptedException {
	/*Realizar un programa que realice la cuenta regresiva de 60 segundos y al finalizar el
	tiempo termine el programa*/
		
	int numero = 60;
	
	while(!(numero==0)) {
		if(numero <10) {
			System.out.print("0"+numero);
		}else {
			System.out.print(numero);
		}
		System.out.println("");
		
		if(numero!=0) {
			numero--;
		}
		Thread.sleep(100);
		}
	System.out.println(0);
	System.exit(0);
	}
}
