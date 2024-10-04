package clases;

import interfaces.InterfazLeer;

public class Moto extends Vehiculo implements InterfazLeer{
	
	private String conduccion;
	
	public Moto() {
		super();
		setConduccion();
		
	}

	public String getConduccion() {
		return conduccion;
	}

	public void setConduccion() {
		boolean tipoValido = false;
		
		while(!tipoValido) {
			 System.out.println("Ingrese el tipo de Conducción :::::::::: Estándar, Crucero o Deportiva");
			
			 String tipoIngresado = leer.nextLine();
			 try {
		            /** Aca hacemos el manejo para que se manejen solo tres tipos de vehiculos*/
		        	
		            if (tipoIngresado.equalsIgnoreCase("Estandar")) {
		                conduccion = "Estandar";
		                tipoValido = true;
		            } else if (tipoIngresado.equalsIgnoreCase("Crucero")) {
		            	conduccion = "Crucero";
		            	tipoValido = true;
		            } else if (tipoIngresado.equalsIgnoreCase("Deportiva")) {
		            	conduccion = "Deportiva";
		            	tipoValido = true;
		            } else {
		                    /** Lanzamos excepción si no se ingresa uno de los valores esperados*/
		            	
		                throw new Exception("Debe ingresar solo 3 opciones: Estándar, Crucero o Deportiva.");
		            }

		            System.out.println("El tipo de vehículo ingresado es: " + tipoIngresado);
		        } catch (Exception e) {
		            System.err.println("Error: " + e.getMessage());
		          }
		}
	}

	@Override
	public String toString() {
		return "Moto [ Patente= " + getPatente()+ ", Marca= " + getMarca() + ", Modelo= " + getModelo() + ", Fecha de Fabricacion= "
				+ formato.format(calendario.getTime()) + "Conducción ="+ conduccion +", Valor= " + getValor() + ", Valor Venta= " + getValorVenta() + "]";
	}


	
	
	
}