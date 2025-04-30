package org.educastur.dzn50346;

public class Cuenta {
	private String numero;
	private float saldo;
	
	public Cuenta(String numero, float saldo) {
		super();
		this.numero = numero;
		this.saldo = saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public void ingresarDinero(float importe) {
		 saldo = saldo + importe;
	}
	
	public void extraerDinero(float importe) {
		 saldo = saldo - importe;
	}

	public void mostrarCuenta () {
		 System.out.println("Nº cuenta " + getNumero());
		 System.out.println("Saldo " + getSaldo() + "€");
	}

}
