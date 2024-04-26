package transacciones;

import java.util.ArrayList;

public class Pago {
	
	private String tipoPago;
	private int valor;
	private int identificacion_cliente;
	private int codigoRegistro;

	public Pago(String tipoPago, int valor, int identificacion_cliente, int codigoRegistro) {
		super();
		this.tipoPago = tipoPago;
		this.valor = valor;
		this.identificacion_cliente = identificacion_cliente;
		this.codigoRegistro = codigoRegistro;
	}
	public String getTipoPago() {
		return tipoPago;
	}
	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
}
