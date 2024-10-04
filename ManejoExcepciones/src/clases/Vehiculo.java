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
	private Integer iva;
	private Date fechaFabricacion;
	protected Calendar calendario;
	protected SimpleDateFormat formato;
	
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
			String fechaStr = leer.nextLine();
			fechaFabricacion= formato.parse(fechaStr);
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
		setIva();
		
	}
	
	public void setIva() {
        iva = (valor * 19 / 100);
    }

    public Integer getIva() {
        return iva;
    }

    public Integer getValorVenta() {
        return (valor + iva);
    }

		
}
