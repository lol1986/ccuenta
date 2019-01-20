
public class Ccuenta {

	// Atributos de cuenta
	private String nombre;
	private String cuenta;
	private double saldo;
	private double tipoInteres;

	public Ccuenta(String nom, String cue, double sal, double tipo) {
		nombre = nom;
		cuenta = cue;
		saldo = sal;
		tipoInteres = tipo;
	}

	public String getName() {
		return nombre;
	}
	
	public double getSaldo() {
		return saldo;
	}

	// Para probar Junit
	public void ingresar(double cantidad) {
		if (cantidad < 0)
			System.out.println("Cantidad negativa");
		saldo = saldo + cantidad;
	}

	// Para probar JUnit
	public void retirar(double cantidad) {
		if (cantidad < 0)
			System.out.println("Cantidad Negativa");
		if (this.getSaldo() < cantidad)
			System.out.println("Saldo insuficiente");
		saldo = saldo - cantidad;
	}

	// Método que me devuelve el número de cuenta
	public String getCuenta() {
		return cuenta;
	}
}
