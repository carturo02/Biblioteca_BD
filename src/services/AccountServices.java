package services;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import model.User;
import utils.GlobalFlag;

/**
 * Las llamadas a las funciones de account
 */
public class AccountServices {

	/**
	 * 
	 */
	public boolean getLoginUser(String user, char[] pass) {
	    // Llama la conexion
	    Connection conn = ServicesLocator.getConnection();
	    boolean flag = false;

	    try {
	        // Crea una sentencia para procesar la consulta
	        PreparedStatement stmt = conn.prepareStatement("SELECT * FROM account WHERE user_name = ?");
	        stmt.setString(1, user);

	        // Ejecutar la consulta
	        ResultSet rs = stmt.executeQuery();

	        // Procesar el resultado
	        if (rs.next()) {
	            User user_0 = new User();
	            user_0.setCod_user(rs.getInt("cod_account"));
	            user_0.setUsername(rs.getString("user_name"));	   
	            user_0.setCod_rol(rs.getInt("cod_rol"));

	            // Crear una sentencia
	            PreparedStatement stmt1 = conn.prepareStatement("SELECT rol_name FROM rol WHERE cod_rol = ?");
	            stmt1.setInt(1, user_0.getCod_rol());

	            // Ejecutar la consulta
	            ResultSet rs1 = stmt1.executeQuery();

	            // Procesar el resultado
	            String rol = "";
	            if (rs1.next()) {
	                rol = rs1.getString("rol_name");
	            }

	            GlobalFlag.getGlobalFlag();
	            GlobalFlag.getGlobalFlag().setRol(rol);

	            // Crear una sentencia esta se usa para boolean
	            CallableStatement stmt2 = conn.prepareCall("{? = call password_compare(?, ?)}");

	            // Registrar el tipo de los parámetros de salida y de entrada
	            stmt2.registerOutParameter(1, Types.BIT);
	            stmt2.setString(2, new String(pass));
	            stmt2.setInt(3, user_0.getCod_user());

	            // Ejecutar la función
	            stmt2.execute();

	            // Obtener el resultado
	            flag = stmt2.getBoolean(1);
	        }
	    } catch (SQLException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	    } finally {
	        // Asegúrate de cerrar tus recursos de JDBC	 
	        if (conn != null) {
	            try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	        }
	    }

	    return flag;
	}



	
}
	
	
	
	
	
	
	
	
	
	
	
	
	

