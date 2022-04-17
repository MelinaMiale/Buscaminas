package Models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Buscaminas {

	private Celda[][] matriz;
	private Nivel nivel;
	
	public Buscaminas (Nivel nivel) {
		this.nivel = nivel;
		this.matriz = new Celda[nivel.getFilas()][nivel.getColumnas()];
	}

	public Celda[][] getMatriz() {
		return matriz;
	}

	public void setMatriz(Celda[][] matriz) {
		this.matriz = matriz;
	}


	public void inicializarMatriz() {
		int cantidadDeFilas = this.matriz.length;
		int cantidadDeColumnas = this.matriz[0].length;
		
		for(int i = 0; i < cantidadDeFilas; i++) {
			for(int j = 0; j< cantidadDeColumnas; j++) {
				this.matriz[i][j] = new Celda();
				this.matriz[i][j].setValue("0");
				this.matriz[i][j].setChecked(false);
				this.matriz[i][j].setNumeroFila(i);
				this.matriz[i][j].setNumeroColumna(j);
			}
		}
		
	}
	
	public void  generarMinas(Nivel nivel) {
		int cantidadDeMinas = nivel.getMinas();
		int contadorMinas = 0;
		Random random = new Random();
		
		while(contadorMinas < cantidadDeMinas) {
			int numeroFila = random.nextInt(nivel.getFilas()-1);
			int numeroColumna = random.nextInt(nivel.getColumnas()-1);
			this.matriz[numeroFila][numeroColumna].setValue("*");
			contadorMinas++;
		}
				
	}
	

	public List <String> obtenerUbicacionDeMinas () {
			List <String> ubicacionMinas = new ArrayList <String>();			
			
			for(Integer  i = 0; i < this.nivel.getFilas() ; i++) {
				for(Integer  j = 0; j< this.nivel.getColumnas(); j++) {
					if(this.matriz[i][j].getValue().equals("*")) {
						ubicacionMinas.add( i.toString() + "-" + j.toString()); 
					}
				}
			}
			
			return ubicacionMinas ;
		}

	public void mostrarPartida(boolean juegoFinalizado) {
		int contadorColumnas = 0;
		while(contadorColumnas < this.nivel.getColumnas()) {
			System.out.print( "   " + contadorColumnas);
			contadorColumnas++;
		}
		System.out.println("");
		for(int i = 0; i < this.nivel.getFilas() ; i++) {
			for(int j = 0; j< this.nivel.getColumnas(); j++) {
				if(j == 0) {
					System.out.print(i);
				}
				if( j < this.matriz[i].length - 1) {
					System.out.print(juegoFinalizado ? "  " + this.matriz[i][j].getValue().toString()  : " O ");
				} else {
					System.out.print(juegoFinalizado ? "  " + this.matriz[i][j].getValue().toString()+"\n" : " O \n");
				}
			}
		}
		
	}

	public boolean buscarMina(String casilla) {
		if(casilla != null && !casilla.isEmpty()) {
			return this.obtenerUbicacionDeMinas().contains(casilla);
		}
		return false;
	}

	
}


/*
 Para el buscaminas necesito una clase que me permita seleccionar: cantidad de columnas y filas que van a determinar la matriz. 
 voy a tener que generar una matriz
 voy a necesitar un contador
 cada celda se representará con un objeto tipo celda ¿que atributos tiene? booleano para saber si ya esta chequeado y un numero 1 o 0.
necesito un metodo que permita saber si la celda esta checkeada
necesito un metodo que permita cambiar el estado de una celda de 'no chequeada' a chequeada.
 
 *
 */


 