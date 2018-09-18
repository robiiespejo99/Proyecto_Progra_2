import java.sql.SQLException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Mantenimiento_Rutinario {
  
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
        System.out.println("*****Menu Mantenimiento Rutinario*****");
        System.out.println("1> Orden rutinaria Instrumentista");
        System.out.println("2> Orden RUTINARIA Mecanico");
        System.out.println("3> Orden rutinaria electricista");
        System.out.println("4> Orden rutinaria soldador");
        System.out.println("5> Salir");
        
        System.out.println("Elija su opcion");
        op1=leer.nextInt();
        switch(op1)
        {
          case 1:
            System.out.println("Ingrese el codigo de 4 enteros");
            int cod=leer.nextInt();
            System.out.println("Ingrese la orden del dia");
            String OrdenDia=leer.next();
            
            try {
              e1.Orden_del_dia(cod, OrdenDia);
            } catch (SQLException e) {
              // TODO Auto-generated catch block
              e.printStackTrace();
            }
            
            break;
            
          case 2:
            System.out.println("Ingrese el codigo de 4 enteros");
            cod=leer.nextInt();
            System.out.println("Ingrese la orden del dia");
            OrdenDia=leer.next();
            
            try{
              e1.Orden_del_dia(cod, OrdenDia);
            } catch (SQLException e) {
              // TODO Auto-generated catch block
				e.printStackTrace();
            }
            
            break;
            
            case 3:
			System.out.println("Ingrese el codigo de 4 enteros");
			cod=leer.nextInt();
			System.out.println("Ingrese La Orden Del Dia");
			OrdenDia=leer.next();
			
			
			try {
				e1.Orden_del_dia(cod, OrdenDia);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
		case 4: 
			
			System.out.println("Ingrese el codigo de 4 enteros");
			cod=leer.nextInt();
			System.out.println("Ingrese La Orden Del Dia");
			OrdenDia=leer.next();
			
			
			try {
				e1.Orden_del_dia(cod, OrdenDia);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
		}
}
	catch(InputMismatchException e)
	{
	System.out.println("no existe ese tipo de datos");	
	}
    }while(op !=5);
  }
              

}
