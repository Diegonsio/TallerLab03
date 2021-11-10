package Empresa_transporte;

import java.util.ArrayList;
import Empresa_transporte.Pack;

public class Producto {
	private Object codigoProducto;
	private Object tipoProducto;
	public ArrayList<Pack> unnamed_Pack_ = new ArrayList<Pack>();

	public void getCodigoProducto() {
		return this.codigoProducto;
	}

	public void setCodigoProducto(Object codigoProducto) {
		this.codigoProducto = codigoProducto;
	}

	public void getTipoProducto() {
		return this.tipoProducto;
	}

	public void setTipoProducto(Object tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
}