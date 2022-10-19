package Jogo01.java;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Cenario mapa = new Cenario();
		
		boolean continuarPartida = true;
		String entrada;
		
		while(continuarPartida) {
			
			System.out.println("Entre com as posicoes x e y");
			entrada = scanner.nextLine();
			String[] numeros = entrada.split(",");
			
			int x = Integer.parseInt(numeros[0]);
			int y = Integer.parseInt(numeros[1]);
			
			System.out.println("x = " + x + ", y = "+ y);
			
			
			continuarPartida = mapa.disparo(x,y);
			
			mapa.desenhaCenario();
			
			
		}
			
			
			
	
		
		
		

	}

}
