package vehiculos;

public class Camion extends Vehiculo {

	private int ejes;
	public static int numeroCamiones;

	public Camion(String placa, String nombre, int precio, int peso, Fabricante fabricante, int ejes) {
		super(placa, 2, 80, nombre, precio, peso, "4X2", fabricante);
		this.placa = placa;
		this.puertas = 2;
		this.velocidadMaxima = 80;
		this.nombre = nombre;
		this.precio = precio;
		this.peso = peso;
		this.traccion = "4X2";
		this.fabricante = fabricante;
		this.ejes = ejes;
		numeroCamiones ++;
		fabricante.getPais().vehiculoFabricado();
		fabricante.vehiculoFabricado();
	}

	public int getEjes() {
		return ejes;
	}

	public void setEjes(int ejes) {
		this.ejes = ejes;
	}
	
	
	
}
