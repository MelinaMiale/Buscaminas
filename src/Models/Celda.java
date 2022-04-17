package Models;

public class Celda {
	
	private String valor; //mina = *  y vacio = o
	private Boolean chequeado;
	private Integer numeroFila;
	private Integer numeroColumna;	
	
	public String getValue() {
		return valor;
	}
	public void setValue(String value) {
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
