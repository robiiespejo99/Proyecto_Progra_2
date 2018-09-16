import javasql.SqlException;
public class MANTENIMIENTO_NO_RUTINARIO {
	
int op=0;
	
ArrayList<Maquinas> maquinaria=new ArrayList<Maquinas>();
ArrayList<Inventario> inventario=new ArrayList<Inventario>();
ArrayList<Trabajadores> trabajadores=new ArrayList<Trabajadores>();
	
	CONECTAR_BD e1=new CONECTAR_BD();
	
public void Menu_No_Rutinario() throws InputMismatchException {



	
	@SuppressWarnings("resource")
	Scanner leer=new Scanner(System.in);
	
	do
	{
		try
{
		System.out.println("*****Programa De Mantenimiento Instanciado*****");
		System.out.println("1>  Para Instrumentista");
		System.out.println("2>  Para Mecanico");
		System.out.println("3>  Para Soldador");
		System.out.println("4>  Para  Electricistas");
		
		System.out.println("5> SALIR ");
		
		System.out.println("Elija su opcion \n");
		op=leer.nextInt();
		switch(op)
		{
		
		case 1: 
			
			System.out.println("Ingrese el programa Ideado para los Instrumentistas \n");
			System.out.println("Ingrese El codigo de Registro");
			int cod2=leer.nextInt();
			System.out.println("Ingrese El Programa");
			String Programa=leer.next();
			
			try {
				e1.Orden_Mantenimiento_No_Rutinario(cod2, Programa);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
		case 2:
			
			System.out.println("Ingrese el programa Ideado para los Mecanicos \n");
			System.out.println("Ingrese El codigo de Registro");
			cod2=leer.nextInt();
			System.out.println("Ingrese El Programa");
			Programa=leer.next();
			
			try {
				e1.Orden_Mantenimiento_No_Rutinario(cod2, Programa);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
			
		case 3:
		

	
	
}
	


}


