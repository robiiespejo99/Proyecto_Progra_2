
public class MENU_INGE_A {
  int op=0;
  Scanner teclado=new Scanner(System.in);
  public void MenuIng_A() 
    throw InputMismatchException
  {
    do{
      try{
        System.out.println("Bienvenido Ingeniero A");
        System.out.println(Que funcion desea desempenar??");
        
                           System.out.println("1> Registrar orden del dia")
                           System.out.println("2> Registrar Mantenimiento a Maquinaria");
                           System.out.println("3>  Registrar Mantenimiento Preventivo");
		                       System.out.println("4>  Mostrar Lista de Inventario");
		                       System.out.println("5>  Mostrar Lista de Maquinas");
		                       System.out.println("6> Cancelar");
                           op=teclado.nextInt();
                           switch(op) {
                             case 1:
                             Mantenimiento_Rutinario m1=new Mantenimiento_Rutinario();
                             break;
                             case 2:
                             System.out.println("Para la maquina'Transporte hacia tolva de alimentacion' ==>1000");
                             System.out.println("Para la maquina'SILO DE HARIA DE CRUDO'==>1006");
			                       System.out.println("Para la maquina'SISTEMA PRECALENTADOR'==>1006");
			                       System.out.println("Para la maquina'HORNO'==>1013");
			                       System.out.println("Para la maquina'ENFRIADOR'==>1016");
		                       	 System.out.println("Para la maquina'TRANSPORTE HACIA TOLVA DE ALIMENTACION'==>1020 \n");
			                       Mantenimiento_no_Rutinario m2=new Mantenimiento_no_Rutinario();
			                       m2.Menu_No_Rutinario();
                             break;
                             case 3:
                             System.out.println("Para la maquina'Transporte hacia tolva de alimentacion'==>1000");
			                       System.out.println("Para la maquina'SILO DE HARIA DE CRUDO'==>1006");
			                       System.out.println("Para la maquina'SISTEMA PRECALENTADOR'==>1006");
			                       System.out.println("Para la maquina'HORNO'==>1013");
			                       System.out.println("Para la maquina'ENFRIADOR'==>1016");
			                       System.out.println("Para la maquina'TRANSPORTE HACIA TOLVA DE ALIMENTACION'==>1020 \n");
                             Mantenimiento_Preventivo m3=new Mantenimiento_Preventivo();
                             m3.MenuPreventivo():
                             break;
                             case4:
                             

}
