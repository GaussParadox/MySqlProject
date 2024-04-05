package bd_poo;
import java.sql.*;
import javax.swing.JOptionPane;
public class Conexion {
    
    private Conexion(){
        
    }

    private static Connection conexion;
    
    private static Conexion instancia;
    
    //variables para conectarse a la base de datos
    private static final String URL= "jdbc:mysql://localhost/bd_poo"; 
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    
    public Connection conectar (){
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion=DriverManager.getConnection(URL,USERNAME,PASSWORD);
           
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error : "+e);
        }
        return conexion;
    }
    
    
    
    public void cerrarConexion() throws SQLException{
        try{
       
            
        }catch(Exception e){
        JOptionPane.showMessageDialog(null, "Error : "+e);
        conexion.close();
        }finally{
            conexion.close();
        }
    }
    
    
    public static Conexion getInstance(){
        if(instancia==null){
            instancia=new Conexion();
        }
        return instancia;
    }
    
}
