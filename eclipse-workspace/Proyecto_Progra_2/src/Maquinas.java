
public class Maquinas {
  
  String NombreMaquina;
  String Seccion;
  String PiezasImportadas;
  String PiezasNoImportadas;
  int CantidadPiezas;
  int Presupuesto;
  
  public Maquinas(String NombreMaquinaria, String seccion, String piezas_importadas, String piezasno_importadas, int cantidadpieza, int presupuesto)
  {
    NombreMaquin=NombreMaquinaria;
    Seccion=seccion;
    PiezasImportadas=piezas_importadas;
    PiezasNoImportadas=piezasno_importadas;
    CantidadPiezas=cantidadpieza;
    Presupuesto=presupuesto;
}
  
  public String getNombreMaquina() {
    return NombreMaquina;
  }
  
  public void setNombreMaquina(String nombreMaquina) {
    NombreMaquina = nombreMaquina;
  }
  
  public String getSeccion() {
    return Seccion;
  }
  
  public void setSeccion(String seccion) {
    Seccion = seccion;
  }
  
  public String getPiezasImportadas() {
    return PiezasImportadas;
  }
  
  public void setPiezasImportadas(String piezasImportadas) {
    PiezasImportadas = piezasImportadas;
  }
  
  public String getPiezasNoImportadas() {
    return PiezasNoImportadas;
  }
  
  public void setPiezasNoImportadas(String piezasNoImportadas) {
    PiezasNoImportadas = piezasNoImportadas;
  }
  
  public int getCantidadPiezas() {
    return CantidadPiezas;
  }
  
  public void setCantidadPiezas(int cantidadPiezas) {
    CantidadPiezas = cantidadPiezas;
  }
  
  public int getPresupuesto() {
    return Presupuesto;
  }
  
  public void setPresupuesto(int presupuesto) {
    Presupuesto = presupuesto;
  }
  
  public String LeerDatos()
  {
    return (getNombreMaquina() + "/" + getSeccion() + "/" + getPiezasImportadas() + "/" +getPiezasNoImportadas() + "/" + getCantidadPiezas() + "/" + getPresupuesto());
  }
  
  
}
  
  
