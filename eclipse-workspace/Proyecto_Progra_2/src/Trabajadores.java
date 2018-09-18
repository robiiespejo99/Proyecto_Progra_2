
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
