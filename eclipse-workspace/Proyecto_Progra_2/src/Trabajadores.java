
public class Trabajadores {
  String Nombre, Trabajo, OrdenDiaria, PlanApoyo, PlanCautelar;
  
  public Trabajadores(String nombre, String trabajo, String orden_diaria, String plan_apoyo, String plan_cautelar)
  {
    Nombre=nombre;
    Trabajo=trabajo;
    OrdenDiaria=orden_diaria;
    PlanApoyo=plan_apoyo;
    PlanCautelar=plan_cautelar;
  }
  public String getNombre() {
    return Nombre;
  }
  
  public void setNombre(String nombre) {
    Nombre = nombre;

}
public String getTrabajo() {
	return Trabajo;
}

public void setTrabajo(String trabajo) {
	Trabajo = trabajo;
}

public String getOrdenDiaria() {
	return OrdenDiaria;
}

public void setOrdenDiaria(String ordenDiaria) {
	OrdenDiaria = ordenDiaria;
}

public String getPlanApoyo() {
	return PlanApoyo;
