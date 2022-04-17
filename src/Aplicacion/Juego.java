package Aplicacion;

import java.util.Scanner;

import Models.Buscaminas;
import Models.Nivel;

public class Juego {

	public static void main(String[] args) {
		
		System.out.println("¡Bienvenido a Buscaminas!");
	    Integer  nivelElegido;
	    
	    Scanner lector = new Scanner(System.in);
	    
	    System.out.println("Ingrese el nivel de dificultad \n");
	    System.out.println("Para el " + Nivel.Inicial.getDescription() + " ingrese: "+   Nivel.Inicial.getId());
	    System.out.println("Para el " + Nivel.Moderado.getDescription() + " ingrese: "+   Nivel.Moderado.getId());
	    System.out.println("Para el " + Nivel.Experto.getDescription() + " ingrese: "+   Nivel.Experto.getId());
	    
	    nivelElegido = lector.nextInt();
		Nivel nivelDeDificultad = Nivel.setById(nivelElegido);
				
		Buscaminas nuevoJuego = new Buscaminas(nivelDeDificultad);
		nuevoJuego.inicializarMatriz();
		nuevoJuego.generarMinas(nivelDeDificultad);

		System.out.println("¡Que inice el juego!");
		System.out.println("Nivel de dificultad: " + nivelDeDificultad.getDescription());
		
		boolean juegoFinalizado = false;
		
		nuevoJuego.mostrarPartida(juegoFinalizado);
	   boolean minaEncontrada = false;
	    
	   do {
		    	System.out.println("Elija una casilla");
		    	 String celda = lector.next();
		    	 minaEncontrada = nuevoJuego.buscarMina(celda);
	   } while (!minaEncontrada);
	    
	    if(minaEncontrada) {
	    	juegoFinalizado = true;
	    	 System.out.println("Fin del Juego");
	    	nuevoJuego.mostrarPartida(juegoFinalizado);
	    }
	}

}
