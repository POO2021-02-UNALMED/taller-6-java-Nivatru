package vehiculos;

public class Vehiculo {

	private static int numeroVehiculos;
	protected String placa;
	protected int puertas;
	protected int velocidadMaxima;
	protected String nombre;
	protected int precio;
	protected int peso;
	protected String traccion;
	protected Fabricante fabricante;
	
	public Vehiculo(String placa, int puertas, int velocidadMaxima, String nombre, int precio, int peso, String traccion, Fabricante fabricante) {
		this.nombre = nombre;
		this.puertas = puertas;
		this.velocidadMaxima = velocidadMaxima;
		this.placa = placa;
		this.precio = precio;
		this.peso = peso;
		this.traccion = traccion;
		this.fabricante = fabricante;
		setCantidadVehiculos(getCantidadVehiculos() + 1);
	}
	
	public String getPlaca() {
		return placa;
	}
	public int getPuertas() {
		return puertas;
	}
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public String getNombre() {
		return nombre;
	}
	public float getPrecio() {
		return precio;
	}
	public int getPeso() {
		return peso;
	}
	public String getTraccion() {
		return traccion;
	}
	public Fabricante getFabricante() {
		return fabricante;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public void setTraccion(String traccion) {
		this.traccion = traccion;
	}
	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	public static int getCantidadVehiculos() {
		return numeroVehiculos;
	}

	public static void setCantidadVehiculos(int numeroVehiculos) {
		Vehiculo.numeroVehiculos = numeroVehiculos;
	}
	
	
	public String vehiculosPorTipo () {
		String retorno = String.format("Automoviles: %a\nCamionetas: %cetas\nCamiones: %ces", Automovil.numeroAutomoviles, Camioneta.numeroCamionetas, Camion.numeroCamiones);
		return retorno;
	}
}
