package clases;
import interfaces.InterfazLeer;

public class Auto extends Vehiculo implements InterfazLeer {
	
	protected Integer cantidadPuertas;
	protected String tipo;
	
	public Auto() {
		super();
		setTipo();
		setCantidadPuertas();
	}
 
	public Integer getCantidadPuertas() {
		return cantidadPuertas;
	}
 
	public void setCantidadPuertas() {
		System.out.println("Ingrese la cantidad de puertas");
		cantidadPuertas=leer.nextInt();
		leer.nextLine();
	}
 
	public String getTipo() {
		return tipo;
	}
 
	public void setTipo() {
		boolean tipoValido = false;
			 
		 /** Bucle que se repetirá hasta que se ingrese un tipo válido**/
		
		while (!tipoValido) { 
	        System.out.println("Ingrese el tipo de Vehículo :::::::::::  Sedan, Compacto o Deportivo");
	        String tipoIngresado = leer.nextLine();
	        	
	               /** Validar el tipo ingresado con un manejo de excepcion*/
	        try {
	           
	            if (tipoIngresado.equalsIgnoreCase("Sedan")) {
	                tipo = "Sedan";
	                tipoValido = true;
	            } else if (tipoIngresado.equalsIgnoreCase("Compacto")) {
	                tipo = "Compacto";
	                tipoValido = true;
	            } else if (tipoIngresado.equalsIgnoreCase("Deportivo")) {
	                tipo = "Deportivo";
	                tipoValido = true;
	            } else {
	                				/** Lanza excepción si no se ingresa un tipo válido*/
	            	
	                	throw new Exception("Debe ingresar solo 3 opciones: \nSedan, \nCompacto o \nDeportivo");
	            }
	
	           
	        } catch (Exception e) {
	            System.err.println("Error: " + e.getMessage());
	        }
		}
    }

	@Override
	public String toString() {
		return "Auto [ Patente= " + getPatente()	+ ", Marca= " + getMarca() + ", Modelo= " + getModelo() + ", Fecha de Fabricacion= "
				+ formato.format(calendario.getTime()) + ", Cantidad de Puertas= " + cantidadPuertas + ", Tipo= " + tipo + ", Valor= " + getValor() + ", Valor Venta= " + getValorVenta() + "]";
	}


	
	
}