package vehiculos;

public class Automovil extends Vehiculo {

	private int puestos;
	public static int numeroAutomoviles;
	

	public Automovil(String placa, String nombre, int precio, int peso, Fabricante fabricante, int puestos) {
		super();
		this.placa = placa;
		this.puertas = 4;
		this.velocidadMaxima = 100;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = "FWD";
		this.fabricante = fabricante;
		this.puestos = puestos;
		numeroAutomoviles ++;
		fabricante.getPais().vehiculoFabricado();
		fabricante.vehiculoFabricado();
	}

	public int getPuestos() {
		return puestos;
	}

	public void setPuestos(int puestos) {
		this.puestos = puestos;
	}
	
	
	
}
