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
          case 1:
            System.out.println("Ingrese el codigo de 4 enteros");
            int cod3=leer.nextInt();
            System.out.println("Ingrese el plan preventivo");
            String pedido=leer.next();
            
            try{
              z1.Encargo_De_piezas(cod3, pedido);
            } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
            
            break;
            
          case 2:
            
            System.out.println("Ingrese el codigo de 4 enteros");
            cod3=leer.nextInt();
            System.out.println("Ingrese el plan preventivo");
            pedido=leer.next();
            
            try{
              z1.Encargo_De_Piezas(cod3, pedido);
            } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
            break;
            
            case3:

}
