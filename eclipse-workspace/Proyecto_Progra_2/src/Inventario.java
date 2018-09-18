public class Inventario {



String PiezasGrandes, PiezasMedianas, PiezasPequeñas, Metales, NoMetales;
	int Cantidad;
	
public void Inventario(String piezasgrandes, String piezasmedianas, String piezaspequeñas, String metales, String no_metales)
{
	
	PiezasGrandes=piezasgrandes;
	PiezasMedianas=piezasmedianas;
	PiezasPequeñas=piezaspequeñas;
	Metales=metales;
	NoMetales=no_metales;
}

public String getPiezasGrandes() {
	return PiezasGrandes;
}

public void setPiezasGrandes(String piezasGrandes) {
	PiezasGrandes = piezasGrandes;
}

public String getPiezasMedianas() {
	return PiezasMedianas;
}

public void setPiezasMedianas(String piezasMedianas) {
	PiezasMedianas = piezasMedianas;
}

public String getPiezasPequeñas() {
	return PiezasPequeñas;
}

public void setPiezasPequeñas(String piezasPequeñas) {
	PiezasPequeñas = piezasPequeñas;
}

public String getMetales() {
	return Metales;
}

public void setMetales(String metales) {
	Metales = metales;
}

public String getNoMetales() {
	return NoMetales;
}

public void setNoMetales(String noMetales) {
	NoMetales = noMetales;
}

public int getCantidad() {
	return Cantidad;
}
	
public void setCantidad(int cantidad) {
	Cantidad = cantidad;
}
	
	public String LeerDatosInventario()
	{
	   return (getPiezasGrandes() + "/" +getPiezasMedianas() + "/" + getPiezasPequeñas() + "/" + getCantidad());
	}
}



