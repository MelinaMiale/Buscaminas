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
				this.matriz[i][j].setValue(0);
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
			//obtener valores de celdas aleatorias (combo fila-columna) y asignarle una mina
			int numeroFila = random.nextInt(nivel.getFilas());
			int numeroColumna = random.nextInt(nivel.getColumnas());
		
			this.matriz[numeroFila][numeroColumna].setValue(1);
			contadorMinas++;
		}
				
	}
	

	public List <String> obtenerUbicacionDeMinas () {
			List <String> ubicacionMinas = new ArrayList <String>();			
			
			for(int i = 0; i < this.nivel.getFilas() ; i++) {
				for(int j = 0; j< this.nivel.getColumnas(); j++) {
					if(this.matriz[i][j].getValue() == 1) {
						ubicacionMinas.add("Celda: " + i + ", " + j); 
					}
				}
			}
			
			return ubicacionMinas ;
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


 