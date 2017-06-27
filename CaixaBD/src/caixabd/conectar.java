package caixabd;


import java.sql.Connection;
import java.sql.DriverManager;


public class conectar {
    Connection con = null;
    
    
    public Connection conectar(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/caixa","root","scott");
        } catch (Exception e){
            System.out.println("Erro ao conectar ao banco");
        }
        return con;
    }
}
