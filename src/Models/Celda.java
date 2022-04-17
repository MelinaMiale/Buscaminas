package Models;

public class Celda {
	
	private Integer valor; //mina = 1  y vacio = 0
	private Boolean chequeado;
	private Integer numeroFila;
	private Integer numeroColumna;	
	
	public Integer getValue() {
		return valor;
	}
	public void setValue(Integer value) {
		this.valor = value;
	}
	public Boolean getChecked() {
		return chequeado;
	}
	public void setChecked(Boolean checked) {
		this.chequeado = checked;
	}
	public Integer getNumeroFila() {
		return numeroFila;
	}
	public void setNumeroFila(Integer numeroFila) {
		this.numeroFila = numeroFila;
	}
	public Integer getNumeroColumna() {
		return numeroColumna;
	}
	public void setNumeroColumna(Integer numeroColumna) {
		this.numeroColumna = numeroColumna;
	}
	
	
	
	
		
}
