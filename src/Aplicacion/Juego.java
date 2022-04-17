package Aplicacion;

import java.util.Scanner;

import Models.Buscaminas;
import Models.Nivel;

public class Juego {

	public static void main(String[] args) {
		
		System.out.println("¡Bienvenido a Buscaminas!");
	    Integer  nivelElegido;
	    
	    Scanner scanner = new Scanner(System.in);
	    
	    System.out.println("Ingrese el nivel de dificultad \n");
	    System.out.println("Para el " + Nivel.Inicial.getDescription() + " ingrese: "+   Nivel.Inicial.getId());
	    System.out.println("Para el " + Nivel.Moderado.getDescription() + " ingrese: "+   Nivel.Moderado.getId());
	    System.out.println("Para el " + Nivel.Experto.getDescription() + " ingrese: "+   Nivel.Experto.getId());
	    
	    nivelElegido = scanner.nextInt();
		System.out.println("Se elligió el nivel: " + nivelElegido);
		
		Nivel nivelDeDificultad = Nivel.setById(nivelElegido);
		
		Buscaminas nuevoJuego = new Buscaminas(nivelDeDificultad);
		nuevoJuego.inicializarMatriz();
		nuevoJuego.generarMinas(nivelDeDificultad);
		
		System.out.println("cantidad de filas de la matriz: " + nuevoJuego.getMatriz().length);
		System.out.println("cantidad de columnas: " + nuevoJuego.getMatriz()[0].length);
		System.out.print(nuevoJuego.obtenerUbicacionDeMinas());
		
		
	    
	    
	    
	    
	    
		
		
		//1. pedir al  usuario que elija el nivel en el que quiere jugar
		//2. crear nuevo buscaminas con valores del punto 1
		//3. generar valores aleatorios para cada celda de la matriz
		//4. agregar interaccion con usuario
				//4.a)  recepcionar celda elegida por el usuario, cambiar el estado y validar que valor tiene para saber si tiene o no una mina
				//4.b) en caso que el valor sea mina, entonces avisar que 'perdio el juego'
		
		//5. refactorizar para mostrar las minas una vez que se pierde el juego
		
		
		
	}

}
