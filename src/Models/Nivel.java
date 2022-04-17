package Models;

public enum Nivel {

	Inicial(1, Constants.NIVEL_1, 3, 3, 2),
	Moderado(2, Constants.NIVEL_2, 9, 9, 4),
	Experto(3, Constants.NIVEL_3, 12, 12, 6);
	
	private final Integer  id;
	private final String description;
	private final Integer filas;
	private final Integer columnas;
	private final Integer cantidadDeMinas;
	
	
	Nivel(int id, String description, Integer filas, Integer columnas, Integer cantidadDeMinas){
		this.id = id;
		this.description = description;
		this.filas = filas;
		this.columnas = columnas;
		this.cantidadDeMinas = cantidadDeMinas;
	}
	
	public int getId() {
		return this.id;
	}
	
	public String getDescription() {
		return this.description;
	}

	public Integer getFilas() {
		return filas;
	}

	public Integer getColumnas() {
		return columnas;
	}
	
	public Integer getMinas() {
		return this.cantidadDeMinas;
	}

	public static Nivel setById(Integer idNivel) {
		switch (idNivel) {
			case 1: return Inicial;
			case 2: return Moderado;
			case 3: return Experto;
			default: return null;
		}
	}

	public static class Constants {

		public static final String NIVEL_1 = "Inicial";
		public static final String NIVEL_2 = "Moderado";
		public static final String NIVEL_3 = "Experto";

	}	

}


