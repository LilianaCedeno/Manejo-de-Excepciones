package principal;

import clases.Automotora;
import interfaces.InterfazLeer;

public class Principal implements InterfazLeer {

	public static void main(String[] args) {
			int op=0;
			Automotora automotora = new Automotora();
			
				
		do {
            System.out.println("MENU - AUTOMOTORA STFA");
            System.out.println("-----------------------------");
            System.out.println("1: Ingresar un nuevo auto.");
            System.out.println("2: Ingresar una nueva moto.");
            System.out.println("3: Mostrar todos los vehiculos con su valor de venta.");
            System.out.println("4: Buscar un vehiculo por su patente");
            System.out.println("5: Mostrar todos los vehiculos agrupados por marca.");
            System.out.println("6: Vender un vehiculo por su patente.");
            System.out.println("7: Salir ");
            System.out.println("-----------------------------");
            System.out.println("Digite la opción: ");
            op = leer.nextInt();
            leer.nextLine();  
           
            switch (op) {
                case 1:
                	System.out.println(" Ingresando un nuevo auto.");
                	System.out.println("--------------------------");
                	automotora.setListaAutos();            	
                	break;
                case 2:
                	System.out.println(" Ingresando una nueva Moto.");
                	System.out.println("---------------------------");
                	automotora.setListaMoto();
                    break;
                case 3:
                	System.out.println("Mostrar Vehículos.");
                	System.out.println("------------------");
                	automotora.MostrarTodos();
                	
                    break;
                case 4:
                	System.out.println(" Buscando Vehiculo.");
                	System.out.println("-------------------");
                	automotora.buscarVehiculo();
                    break;
                case 5:
                	System.out.println("Mostrando los vehiculos por marca.");
                	System.out.println("----------------------------------");
                	automotora.mostrarVehiculosPorMarca();
                    break;
                case 6:
                	System.out.println(" Vender Vehiculo.");
                	System.out.println("-------------------");
                	automotora.venderVehiculo();
                	break;
                case 7:
                	System.out.println("---------------------");
                    System.out.println("Saliendo del Sistema");
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        } while (op != 7);
	
	}
}
