package C;

import M.Medicamento;
import V.ListagemMedicamentosAbaixoMedia;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class MedicamentoC {
    Conexao c = new Conexao();
    
    public void inserir(Medicamento med) {
        try {
            c.conectar();

            PreparedStatement pst = c.con.prepareStatement("INSERT INTO med " +
                    " (cod, nome, validade, qtde) VALUES (?,?,?,?)");
            
            pst.setInt(1, med.getCod());
            pst.setString(2, med.getNome());
            pst.setString(3, med.getValidade());
            pst.setInt(4, med.getQtde());
            
            pst.execute(); //executa o insert
            
            JOptionPane.showMessageDialog(null,"Cadastro OK","",1);
            
            pst.close();
            c.fecharConexao();
        } catch (SQLException exp) {
            JOptionPane.showMessageDialog(null, "Erro: " + exp.getMessage(), "Alerta", 0);
        }
    }
    
     public ArrayList buscar(){   
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<Medicamento>();
        
         try {
            c.conectar();
            PreparedStatement pst = c.con.prepareStatement("SELECT * FROM med");
            ResultSet rs = pst.executeQuery(); // executa o comando Select
           
           while(rs.next()){
               
              Medicamento med = new Medicamento();
              med.setCod(rs.getInt("cod"));
              med.setNome(rs.getString("nome"));
              med.setValidade(rs.getString("validade"));
              med.setQtde(rs.getInt("qtde"));
              
              listaMedicamentos.add(med);  
           }
            rs.close();
            pst.close();
            c.fecharConexao();
                
         } catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 0);
         }
        
        return listaMedicamentos;   
    }
     
    public ArrayList buscar(Double media){   
        ArrayList<Medicamento> listaMedicamentos = new ArrayList<Medicamento>();
        
        try {
            c.conectar();
            PreparedStatement pst = c.con.prepareStatement("SELECT * FROM med");
            ResultSet rs = pst.executeQuery(); // executa o comando Select
            
            while(rs.next()){
               
                if ((media) > (rs.getInt("qtde"))) {
                    Medicamento med = new Medicamento();
                    
                    med.setCod(rs.getInt("cod"));
                    med.setNome(rs.getString("nome"));
                    med.setValidade(rs.getString("validade"));
                    med.setQtde(rs.getInt("qtde"));
              
                    listaMedicamentos.add(med);  
                }
            }
            rs.close();
            pst.close();
            c.fecharConexao();
                
            } catch(SQLException e){
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 0);
         }
        
        return listaMedicamentos;   
    }
     
    public Double calcularMedia() {
        Double media = 0.0;

        try {
            c.conectar();
            PreparedStatement pst = c.con.prepareStatement("SELECT * FROM med");
            ResultSet rs = pst.executeQuery(); // executa o comando Select
          
            int qtd = 0;
            while(rs.next()) {
                media += rs.getInt("qtde");
                qtd++;
            }
            
            media = media/qtd;
        } catch(SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage(), "Alerta", 0);
        }
        
        return media;
    }
    
    public void deletar(Integer cod) {
        try {
        c.conectar();
        PreparedStatement pst = c.con.prepareStatement("DELETE FROM med WHERE cod = ?");
        pst.setInt(1, cod);

        int linhasAfetadas = pst.executeUpdate();

        if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Exclusão OK", "", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum registro encontrado para o código informado.", "Alerta", 0);
        }

        pst.close();
        c.fecharConexao();
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Erro ao excluir: " + e.getMessage(), "Erro", 0);
    }
    }
    
}
