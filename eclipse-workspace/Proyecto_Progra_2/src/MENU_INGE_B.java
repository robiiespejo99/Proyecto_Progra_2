
public class Menu_Ing_B {

 int op=0;
	Scanner teclado=new Scanner(System.in);
	public void MenuIng_A()  throws InputMismatchException
	{
	
		
	
	do {
		
		try {
			
		System.out.println("Bienvenido Ingeniero A");
		System.out.println("Que funcion desea desempeñar??" );
		
		
		System.out.println("1>  Registrar orden del dia");
		System.out.println("2>  Registrar Mantenimiento a Maquinaria");
		System.out.println("3>  Registrar Mantenimiento Preventivo");
		System.out.println("4>  Mostrar Lista de Inventario");
		System.out.println("5>  Mostrar Lista de Maquinas");
		System.out.println("6> Cancelar");
		
		op=teclado.nextInt();
		
		switch(op) {
		
		case 1:
			
			Mantenimiento_Rutinario m1=new Mantenimiento_Rutinario();
			m1.MenuRutinario();
			
			break;
		
		case 2:
			
			System.out.println("Para la maquina'Transporte hacia tolva de alimentacion'==>1001");
			System.out.println("Para la maquina'SILO DE HARIA DE CRUDO'==>1007");
			System.out.println("Para la maquina'SISTEMA PRECALENTADOR'==>1009");
			System.out.println("Para la maquina'HORNO'==>1015");
			System.out.println("Para la maquina'ENFRIADOR'==>1018");
			System.out.println("Para la maquina'TRANSPORTE HACIA TOLVA DE ALIMENTACION'==>1021");
			
			Mantenimiento_no_Rutinario m2=new Mantenimiento_no_Rutinario();
			m2.Menu_No_Rutinario();
			
			break;
			
		case 3:
			
			System.out.println("Para la maquina'Transporte hacia tolva de alimentacion'==>1001");
			System.out.println("Para la maquina'SILO DE HARIA DE CRUDO'==>1007");
			System.out.println("Para la maquina'SISTEMA PRECALENTADOR'==>1009");
			System.out.println("Para la maquina'HORNO'==>1015");
			System.out.println("Para la maquina'ENFRIADOR'==>1018");
			System.out.println("Para la maquina'TRANSPORTE HACIA TOLVA DE ALIMENTACION'==>1021");
			
			Mantenimiento_Preventivo m3=new Mantenimiento_Preventivo();
			m3.MenuPreventivo();
			
			break;
			
		case 4:
			
			CONECTAR_BD o1=new CONECTAR_BD();
			
			try {
				o1.Mostrar_Lista_Inventario();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
		case 5:
			
			CONECTAR_BD s1=new CONECTAR_BD();
			
			try {
				s1.Mostrar_Lista_de_Maquinas();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
		
		default : System.out.println("Gracias por Usar el Sistema");
		
		}
		}
		
		catch(InputMismatchException e) {
			
			System.out.println("Los datos Ingresados estan mal!!");
			
		}
		
	}while(op!=6);
		
		
	
	
	}
}

}
