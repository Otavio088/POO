
package controle;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import modelo.Aluno_model;

public class Aluno_controle {
    
    Conexao c = new Conexao();
       
    public void inserir(Aluno_model alu){
        
         try {
           c.conectar(); // chama o método conectar da classe Conexão
           
           PreparedStatement pst = c.con.prepareStatement("INSERT INTO Alunos " +
              " (ra,nome,idade,fone,cidade,estado,email) VALUES (?,?,?,?,?,?,?)");

            pst.setInt(1, alu.getRa());
            pst.setString(2, alu.getNome());
            pst.setInt(3, alu.getIdade());
            pst.setString(4, alu.getFone());
            pst.setString(5, alu.getCidade());
            pst.setString(6, alu.getEstado());
            pst.setString(7, alu.getEmail());
      
            pst.execute(); // executa o comando Insert

            JOptionPane.showMessageDialog(null,"Cadastro OK","",1);
          
            pst.close();
            c.Fechar_Conexao();


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }

    }
    
    public ArrayList busca(String ra){
        
        ArrayList<Aluno_model> lista = new ArrayList<Aluno_model>();
        
         try {
            
            c.conectar();
            
            PreparedStatement pst = c.con.prepareStatement("SELECT * FROM Alunos " +
                 " WHERE ra = "+ra);
            
           ResultSet rs = pst.executeQuery(); // executa o comando Select
           
           while(rs.next()){
               
              Aluno_model alu = new Aluno_model();
              alu.setRa(rs.getInt("ra"));
              alu.setNome(rs.getString("nome"));
              alu.setIdade(rs.getInt("idade"));
              alu.setFone(rs.getString("fone"));
              alu.setCidade(rs.getString("cidade"));
              alu.setEstado(rs.getString("estado"));
              alu.setEmail(rs.getString("email"));
              
              lista.add(alu);
              
           }
           
                rs.close();
                pst.close();
                c.Fechar_Conexao();
                
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), 
                                                                   "Alerta", 2);
         }
        
        return lista;
        
    }
    
    public ArrayList busca2(){
        
        ArrayList<Aluno_model> lista = new ArrayList<Aluno_model>();
        
         try {
            
            c.conectar();
            PreparedStatement pst = c.con.prepareStatement("SELECT * FROM Alunos ");
            
            ResultSet rs = pst.executeQuery(); // executa o comando Select
           
           while(rs.next()){
               
              Aluno_model alu = new Aluno_model();
              alu.setRa(rs.getInt("ra"));
              alu.setNome(rs.getString("nome"));
              alu.setIdade(rs.getInt("idade"));
              alu.setFone(rs.getString("fone"));
              alu.setCidade(rs.getString("cidade"));
              alu.setEstado(rs.getString("estado"));
              alu.setEmail(rs.getString("email"));
              
              lista.add(alu);
              
           }
            rs.close();
            pst.close();
            c.Fechar_Conexao();
                
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
         }
        
        return lista;
        
    }
    
    public void excluir(int ra){
        
         try {
            
            c.conectar();
            PreparedStatement pst = c.con.prepareStatement("DELETE FROM alu WHERE ra  = " + ra);
            
            pst.execute(); // executa o comando Delete

            JOptionPane.showMessageDialog(null,"Exclusão OK","",1);
          
            pst.close();
            c.Fechar_Conexao();


        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
        }
       
    }
    
    public void alterar(Aluno_model alu){
        
  try{
      c.conectar();
        PreparedStatement pst = c.con.prepareStatement(
                    "UPDATE alu " +
                    "SET " +
                    "    nome = ?, " +
                    "    idade = ?, " +
                    "    fone = ?, " +
                    "    cidade = ?, " +
                    "    estado = ?, " +
                    "    email = ? " +
                    "WHERE " +
                    "    ra = ?");
       
            pst.setString(1, alu.getNome());
            pst.setInt(2, alu.getIdade());
            pst.setString(3, alu.getFone());
            pst.setString(4, alu.getCidade());
            pst.setString(5, alu.getEstado());
            pst.setString(6, alu.getEmail());
            pst.setInt(7, alu.getRa());
            
            pst.execute(); // executa o comando Update
            
            pst.close();
            c.Fechar_Conexao();

        } catch(SQLException e){
           JOptionPane.showMessageDialog(null, "ERRO..."+
              e.getMessage(), "Alteração de alunos", 0);
        }
    }
    
    
    public void gerarPlanilha(){
        
        try {
            c.conectar();
            //PreparedStatement pst = c.con.prepareStatement("Select * from Alunos into outfile 'C:/Users/aluno/Desktop/planilhaAluno.xls'"); 
              PreparedStatement pst = c.con.prepareStatement("copy(select * from Alunos) to 'C:/Users/aluno/Desktop/Exemplo_JDBC/planilhaAluno.csv' encoding 'UTF8'");
            
            ResultSet rs = pst.executeQuery(); // executa o comando Select
           
            rs.close();
            pst.close();
            c.Fechar_Conexao();
                
         }catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 2);
         }
        
    }
}
