package controle;

import java.sql.*; // pacote jdbc

public class Conexao {

  public Connection con;
  //static String usuario="postgres";
  static String usuario="postgres";
  static String senha="postgrefatec";
  static String database="alu"; // base de dados
 
  //static String url="jdbc:postgresql://localhost/javaJDBC"; 
  static String url="jdbc:postgresql://localhost/"+database;
    
  public Conexao(){ // construtor
      }
  
  public void conectar() { //conecta com o DB
    try {   
       Class.forName("org.postgresql.Driver"); //driver    
       con = DriverManager.getConnection(url,usuario,senha); //faz conexao mandando url, usuario e senha como parametros  
    } catch ( ClassNotFoundException exc ) {
       System.out.println("Erro no driver "+exc.getMessage());
    } catch(SQLException exc){
       System.out.println("Erro de conexao ="+exc.getMessage());
    }
  }

  public void Fechar_Conexao()  {
       try{
           con.close(); // fechando a conexao
       } catch(SQLException exc) {
           System.out.println(exc.getMessage());
       }
   }
}  // fechando a classe Conexao
