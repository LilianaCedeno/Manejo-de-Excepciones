package clases;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import interfaces.InterfazLeer;

public class Vehiculo implements InterfazLeer{
	private String patente;
	private String marca;
	private String modelo;
	private Integer valor;
	private Date fechaFabricacion;
	private Calendar calendario;
	private SimpleDateFormat formato;
	
	public Vehiculo() {
		
		formato = new SimpleDateFormat("dd/mm/yyyy");
		calendario = Calendar.getInstance();
		
		setPatente();
		setMarca();
		setModelo();
		setValor();
		setFechaFabricacion();
	}

	public String getPatente() {
		return patente;
	}

	public void setPatente() {
		System.out.println(" Ingrese la patente del Vehiculo");
		patente = leer.nextLine();
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca() {
		System.out.println(" Ingrese la Marca del Vehiculo");
		marca = leer.nextLine();
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo() {
		System.out.println(" Ingrese el modelo del Vehiculo");
		modelo = leer.nextLine();
	}

	public Date getFechaFabricacion() {
		return fechaFabricacion;
	}

	public void setFechaFabricacion() {
		
		try {
			System.out.println(" Ingrese la fecha de Fabricación del Vehiculo ::: FORMATO - 01/01/2024)");
			fechaFabricacion= formato.parse(leer.nextLine());
			calendario.setTime(fechaFabricacion);
		}catch(ParseException e) {
			System.err.println("error: " + e.getMessage()+ " por favor use el formato 01/01/2024");
			
		}
	}

	public Integer getValor() {
		return valor;
	}

	public void setValor() {
		System.out.println("Ingrese el valor del Vehículo");
		valor = leer.nextInt();
		leer.nextLine();
		
	}
	
	public Integer getIva() {
		Integer iva = valor * (19 / 100);
		return iva;
	}

	@Override
	public String toString() {
		return "Vehiculo [patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + ", valor=" + valor
				+ ", fechaFabricacion=" + fechaFabricacion + ", calendario=" + calendario + ", formato=" + formato
				+ ", getIva()=" + getIva() + "]";
	}
	

	
}
