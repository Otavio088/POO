package C;

import java.sql.*; // importa o pacote jdbc para poder conectar com o DB

public class Conexao {
    public Connection con;
    
    static String usuario="postgres";
    static String senha="######";
    static String database="medicamentos";
    static String url="jdbc:postgresql://localhost/"+database;

    public Conexao() {
        
    }
    
    public void conectar() { //conecta com o DB
        try {   
            Class.forName("org.postgresql.Driver"); //driver    
            con = DriverManager.getConnection(url,usuario,senha); //faz conexao mandando url, usuario e senha como parametros  
        } catch (ClassNotFoundException exc) {
                System.out.println("Erro no driver "+exc.getMessage());
        } catch(SQLException exc){
                System.out.println("Erro de conexao ="+exc.getMessage());
        }
    }
    
    public void fecharConexao() {
        try {
            con.close(); //fecha a conexao
        } catch (SQLException exc) {
            System.out.println(exc.getMessage());
        }
    }
}
