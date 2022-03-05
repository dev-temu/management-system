import java.sql.*;

public class conn{
    Connection c;
    Statement s;
    public conn(){  
        try{  
            Class.forName("");  
            c =DriverManager.getConnection("");    
            s =c.createStatement();  
        
            
           
        }catch(Exception e){ 
            System.out.println(e);
        }  
    } 
    public static void main(String args[])
    {
        new conn();
        System.out.println("");
    }  
}  
