import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MANTENIMIENTO_PREVENTIVO {
  
  int op;
  
  ArrayList<Maquinas> maquinaria= new ArrayList<Maquinas>();
  ArrayList<Inventario> inventario=new ArrayList<Inventario>();
  
  CONECTAR_BD z1=new CONECTAR_BD();
  Scanner leer=new Scanner(System.in);
  
  public void MenuPreventivo() throws InputMismatchException {
    
    
    Scanner leer=new Scanner(System.in);
    
    do
    {
      try
      {
        System.out.println("*****Menu De Mantenimiento Preventivo*****");
        System.out.println("1> Emergencia Mecanico");
        System.out.println("2> Emergencia Electricista");
        System.out.println("3> Emergencia Soldador");
        System.out.println("4> Emergencia Instrumentista");
        System.out.println("5> SALIR");
        
        System.out.println("Elija su opcion");
        op=leer.nextInt();
        switch(op)
        {

}
