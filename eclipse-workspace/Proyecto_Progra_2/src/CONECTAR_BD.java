Connection con=null;
	public CONECTAR_BD()
	{
		try{
			System.out.println("Intentando conectar ....");
			Class.forName("com.mysql.jdbc.Driver");
			
			System.out.println("Conectando a la base de datos........");
		 con = DriverManager.getConnection("jdbc:mysql://localhost/plan_mantenimiento", "root","");
			System.out.println("conexión a BD establecida");
		}catch(SQLException ex){
			System.out.println("Error de mysql");
		} catch (ClassNotFoundException e){
			e.printStackTrace();
		} catch (Exception e){
				System.out.println("se produjo un error inesperado: " + e.getMessage());	
			}		
	}
	public void leerdatosMantenimiento_Rutinario() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("SELECT * FROM MANTENIMIENTO WHERE MANTENIMIENTO_RUTINARIO=MANTENIMIENTO_RUTINARIO");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(2));
			
		}
	}
	
	public void leerdatosMantenimiento_NO_Rutinario() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("SELECT * FROM MANTENIMIENTO WHERE MANTENIMIENTO_NO_RUTINARIO=MANTENIMIENTO_NO_RUTINARIO");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(3));
			
		}
	}
	
	public void leerdatosMantenimiento_Preventivo() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("SELECT * FROM MANTENIMIENTO WHERE MANTENIMIENTO_PREVENTIVO=MANTENIMIENTO_PREVENTIVO");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(4));
			
		}
	}
	
	public void leerdatosInventario() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("SELECT * FROM INVENTARIO WHERE DETALLES=DETALLES");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(2));
			
		}
	}
	
	public void leerdatosCalendario() throws SQLException
	{
	
		PreparedStatement stat = con.prepareStatement("SELECT * FROM CALENDARIO WHERE CODIGO_CALENDARIO_MANTENIMIENTO=CODIGO_CALENDARIO_MANTENIMIENTO");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
			
		}
	}
	
	public void Orden_del_dia(int cod, String OrdenDia) throws SQLException
	{
		String insertar="INSERT INTO mantenimiento (codigo_mantenimiento,mantenimiento_rutinario) VALUES(?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
//	    inse.setInt(1,ci);
//		inse.setString(2,no);
//		inse.setString(3, ap);
//		inse.setInt(4, fo);
		inse.setInt(1, cod);
		inse.setString(2, OrdenDia);
		inse.executeUpdate();
	}
	
	public void Orden_Mantenimiento_No_Rutinario(int cod2, String Programa) throws SQLException
	{
		String insertar="INSERT INTO mantenimiento (codigo_mantenimiento,mantenimiento_no_rutinario) VALUES(?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	
//	    inse.setInt(1,ci);
//		inse.setString(2,no);
//		inse.setString(3, ap);
//		inse.setInt(4, fo);
		inse.setInt(1, cod2);
		inse.setString(2, Programa);
		inse.executeUpdate();
	}
	
	public void Encargo_De_piezas(int cod3, String pedido) throws SQLException
	{
		
		String insertar="INSERT INTO mantenimiento (codigo_mantenimiento,mantenimiento_preventivo) VALUES(?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
		
		inse.setInt(1, cod3);
		inse.setString(2, pedido);
		inse.executeUpdate();
	}
	
	public void Mostrar_Lista_Inventario() throws SQLException
	{

		PreparedStatement stat = con.prepareStatement("SELECT * FROM INVENTARIO WHERE CODIGO_PIEZA=CODIGO_PIEZA");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
			
		}
	
	}
	
	public void Mostrar_Lista_de_Maquinas () throws SQLException
	{
		
PreparedStatement stat = con.prepareStatement("SELECT * FROM MAQUINARIA WHERE CODIGO_MAQUINARIA=CODIGO_MAQUINARIA");
		
		ResultSet result = stat.executeQuery();
		while (result.next())
		{
			System.out.println(result.getString(1) + " " + result.getString(2) + " " + result.getString(3) + " " + result.getString(4));
			
		}
	}
	
	public void Calendario ()
	{
		
	}
	
	public void Registro_Residencia_Trabajadores(int cod, String ciudad, String departamento, String pais, int codEmpleado) throws SQLException {
		
		
		
		String insertar="insert into registros_residencia_trabajadores(codigo_ciudad,nombre_ciudad,departamento,pais,codigo_trabajador ) values(?,?,?,?,?)";
		PreparedStatement inse = con.prepareStatement(insertar);
	

		inse.setInt(1, cod);
		inse.setString(2, ciudad);
		inse.setString(3, departamento);
		inse.setString(4, pais);
		inse.setInt(5, codEmpleado);
		inse.executeUpdate();
		
		
	}
	
}
public class CONECTAR_BD {

}
