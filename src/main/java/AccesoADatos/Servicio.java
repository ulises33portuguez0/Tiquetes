/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AccesoADatos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ulise
 */
public class Servicio {
    protected Connection conexion= null;
    
    public Servicio() {
        
    }
    public void conectar() throws SQLException,ClassNotFoundException 
    {
            Class.forName("oracle.jdbc.driver.OracleDriver");
       // try {
            conexion = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","!Jmurmor1979");
            //conexion = getJdbcMydbsource();
       /* } catch (NamingException ex) {
            ex.printStackTrace();
        }*/
        
    }
    
    public void desconectar() throws SQLException{
        if(!conexion.isClosed())
        {
            conexion.close();
        }
    }
}
