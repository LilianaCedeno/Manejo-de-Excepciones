package clases;

import java.util.*;
import interfaces.InterfazLeer;

public class Automotora implements InterfazLeer{
	private String rut;
	protected ArrayList<Auto> listaAutos;
	protected ArrayList<Moto> listaMoto;
	
	public Automotora() {
		setRut();
		listaAutos = new ArrayList<>();  // Inicializa la lista de autos
        listaMoto = new ArrayList<>();   // Inicializa la lista de motos
	}

	public String getRut() {
		return rut;
	}

	public void setRut() {
		System.out.println("Ingrese el Rut de la empresa");
		rut= leer.nextLine();
	}

	public ArrayList<Auto> getListaAutos() {
		return listaAutos;
	}

	public void setListaAutos() {
		Auto auto= new Auto();
        listaAutos.add(auto);
		
		
	}

	public ArrayList<Moto> getListaMoto() {
		return listaMoto;
	}

	public void setListaMoto() {
		    Moto moto = new Moto();
	        listaMoto.add(moto);
		
	}

	public void buscarVehiculo() {
		System.out.println("Ingrese la patente a Buscar");
		String patenteB = leer.nextLine();
		
		Optional<Auto> auto = listaAutos.stream().filter(v -> v.getPatente().equals(patenteB)).findFirst();
        
        if (auto.isPresent()) {
            System.out.println("Auto encontrado: " + auto.get());
        } else {
            
            Optional<Moto> moto = listaMoto.stream().filter(v -> v.getPatente().equals(patenteB)).findFirst();
            
            if (moto.isPresent()) {
                System.out.println("Moto encontrada: " + moto.get());
            } else {
                System.out.println("Vehículo no encontrado");
            }
		
        }
	}
	
	public void venderVehiculo() {
		
		System.out.println("Ingrese la patente del Vehiculo a Vender");
		String patenteV = leer.nextLine();
		
        Optional<Auto> auto = listaAutos.stream().filter(v -> v.getPatente().equals(patenteV)).findFirst();
        if (auto.isPresent()) {
            listaAutos.remove(auto.get());
            System.out.println("Vehiculo vendido: " + auto.get());
        } else  {
        	 Optional<Moto> moto = listaMoto.stream().filter(v -> v.getPatente().equals(patenteV)).findFirst();
        	  
        	 if (moto.isPresent()) {
        		 listaMoto.remove(moto.get());
        		 System.out.println("Vehiculo vendido: " + moto.get());
        	 }else {
                 System.out.println("Vehiculo no encontrado");
        	 }
        }
	}	

    public void mostrarVehiculos() {
    	listaAutos.forEach(System.out::println);
    	listaMoto.forEach(System.out::println);
    	}

    public void mostrarVehiculosPorMarca() {
        // Crear un mapa para almacenar vehículos por marca
        HashMap<String, ArrayList<Vehiculo>> vehiculosPorMarca = new HashMap<>();

        // Agregar autos al mapa
        for (Auto auto : listaAutos) {
            vehiculosPorMarca
                .computeIfAbsent(auto.getMarca(), k -> new ArrayList<>())
                .add(auto);
        }

        // Agregar motos al mapa
        for (Moto moto : listaMoto) {
            vehiculosPorMarca
                .computeIfAbsent(moto.getMarca(), k -> new ArrayList<>())
                .add(moto);
        }

        // Mostrar los vehículos agrupados por marca
        for (String marca : vehiculosPorMarca.keySet()) {
            System.out.println("Marca: " + marca);
            for (Vehiculo vehiculo : vehiculosPorMarca.get(marca)) {
                System.out.println(vehiculo);
            }
        }
    }
    
  
    
	public void MostrarTodos() {
		for (Vehiculo veM : listaMoto) {
			System.out.println(veM);
		}
		
		for (Vehiculo veA : listaAutos) {
			System.out.println(veA);
			
		}
		
	}
	
 
    
}
