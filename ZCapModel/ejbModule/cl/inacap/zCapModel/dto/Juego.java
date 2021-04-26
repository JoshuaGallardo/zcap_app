package cl.inacap.zCapModel.dto;

import java.time.LocalDate;

public class Juego {
	
	private String nombre;
	private String descripcion;
	private boolean aptoNinios;
	private int precio;
	private LocalDate fechalanzamiento;
	private Consola consola;
	
	public Consola getConsola() {
		return consola;
	}
	public void setConsola(Consola consola) {
		this.consola = consola;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean isAptoNinios() {
		return aptoNinios;
	}
	public void setAptoNinios(boolean aptoNinios) {
		this.aptoNinios = aptoNinios;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public LocalDate getFechalanzamiento() {
		return fechalanzamiento;
	}
	public void setFechalanzamiento(LocalDate fechalanzamiento) {
		this.fechalanzamiento = fechalanzamiento;
	}
	
	

}
