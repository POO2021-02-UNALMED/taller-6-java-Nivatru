package vehiculos;

public class Camioneta extends Vehiculo{

	
	private boolean volco;
	public static int numeroCamionetas;

	public Camioneta(String placa, int puertas, String nombre, int precio, int peso, Fabricante fabricante, boolean volco) {
		super();
		this.placa = placa;
		this.puertas = puertas;
		this.velocidadMaxima = 90;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = "4X4";
		this.fabricante = fabricante;
		this.volco = volco;
		numeroCamionetas ++;
		fabricante.getPais().vehiculoFabricado();
		fabricante.vehiculoFabricado();
	}

	public boolean isVolco() {
		return volco;
	}

	public void setVolco(boolean volco) {
		this.volco = volco;
	}
	
	
	
}
