
public class Jefe_Mantenimiento {

}

int op=0;
	CONECTAR_BD E1=new CONECTAR_BD();
	Scanner teclado=new Scanner(System.in);
	ArrayList<Maquinas> maquinaria=new ArrayList<Maquinas>();
	ArrayList<Inventario> inventario=new ArrayList<Inventario>();
	ArrayList<Trabajadores> trabajadores=new ArrayList<Trabajadores>();
	public void Menu_Jefe() {
		
		do {
			
			System.out.println("Bien Venido A La Base De Datos Ineniero ¨X¨");
			System.out.println("Cual Opcion Desea Desempeñar?? \n");
			
			
			System.out.println("1-Mantenimiento Rutinario");
			System.out.println("2-Mantenimiento no Rutinario");
			System.out.println("3-Mantenimiento Preventivo");
			System.out.println("4-Inventario");
			System.out.println("5-Calendario");
			
			System.out.println("6-Registrar la residencia de los trabajadores");
			
			
			System.out.println("7-Elija su opcion");
			
			op=teclado.nextInt();
			
			
		/*	INSERT INTO CALENDARIO VALUES(010,2017,NULL,NULL,NULL);
		 *  INSERT INTO CALENDARIO VALUES(020,2017,NULL,NULL,NULL);
		 *  INSERT INTO CALENDARIO VALUES(030,2017,null,null,null);
		 *  insert into calendario values(040,2017,null,null,null);
		 *  insert into calendario values(050,2017,null,null,null);
		 *  insert into calendario values(060,2017,null,null,null);
		 *  insert into calendario values(070,2017,null,null,null);
		 */
			
		switch(op)
		{
		
		case 1:
			
			//Excel
			try {
				E1.leerdatosMantenimiento_Rutinario();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
			
		case 2:
			
			try {
				E1.leerdatosMantenimiento_NO_Rutinario();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			break;
			
		case 3:
			
			try {
				E1.leerdatosMantenimiento_Preventivo();
			
		
	}
	

}
