import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MANTENIMIENTO_RUTINARIO {
  
  int op1;
  ArrayList<Maquinas> maquinaria=new ArrayList<Maquinas>();
  ArrayList<Inventario> inventario=new ArrayList<Inventario>();
  ArrayList<Trabajadores> trabajadores=new ArrayList<Trabajadores>();
  
  CONECTAR_BD e1=new CONECTAR_BD();
  Scanner leer=new Scanner(System.in); 
  
  public void MenuRutinario() throws InputMismatchException {
    
    
    do
    {
      try
      {
        System.out.println

}
