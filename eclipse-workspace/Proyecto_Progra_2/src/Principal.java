
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
	
	
	String Usuario="";
	int pass=0;
	
	Scanner teclado=new Scanner(System.in);
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Principal e1=new Principal();
		e1.Ejecutar();
	}
public void Ejecutar()  throws InputMismatchException {
	
	try {
		
	do {
		
		//Jefe Usuario=fabricio pass=123
		//Ing A usuario=a pass1234
		//Ing B usuario=b pass=1235
		
		
		System.out.println("Entrar");
		System.out.println("Login usuario");
		Usuario=teclado.next();
		System.out.println("Ingrese su Contraseña");
		pass=teclado.nextInt();
		
		
		
		switch(pass) {
		
		case 123:
		
			switch(Usuario) {
				
			case "roberto":
				Jefe_Mantenimiento e1=new Jefe_Mantenimiento();
				e1.Menu_Jefe();
			}
		
		break;
		
		case 1234:
			
			switch (Usuario) {
			
			case "a":

				Menu_Ing_A a1=new Menu_Ing_A();
				a1.MenuIng_A();
			}
			break;
			
		case 1235:
			
			switch (Usuario) {
			
			case "b":
			
				Menu_Ing_B b1=new Menu_Ing_B();
			}
			break;
			
		
			
		
		default: System.out.println("Gracias por usar el sistema");
		
		}
		
		
	
	}while((Usuario!="roberto" && pass!=123) || (Usuario!="a" && pass!=1234) || (Usuario!="b" && pass!=1235));
	
	}
	catch(InputMismatchException e) {
		
		System.out.println("Datos No Computables!!");
		
	}
}
}
