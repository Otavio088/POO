package classes;

import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class TipoImovel extends Imovel {
    private String descricao;
    private String bairro;
    private String status;
    
    public static ArrayList<TipoImovel> listaImoveis = new ArrayList<TipoImovel>();
    
    public TipoImovel(String descricao, String bairro, String status, String tipo, Double aluguelbase) {
        super(tipo, aluguelbase);
        this.descricao = descricao;
        this.bairro = bairro;
        this.status = status;
    }
    
    public TipoImovel() {
        super();
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public void cadastrarImovel(TipoImovel imovel) {
        listaImoveis.add(imovel);
        
        JOptionPane.showMessageDialog(null,"Inclusão realizada com sucesso",
               "Cadastro de Imóvel",1);
    }
    
    void locarImovel(JTextField txtCodImovel, JTextField txtAluguelFinal, int i) {
        if (listaImoveis.get(i).getStatus().equals("d")) {
            JOptionPane.showMessageDialog(null,"Locação realizada com sucesso!",
               "Locado!",1);
            
            listaImoveis.get(i).setStatus("a");
            
            if (listaImoveis.get(i).getTipo().equals("Residencial")) {
                txtAluguelFinal.setText(String.valueOf((listaImoveis.get(i).getAluguelbase()) + 
                        (listaImoveis.get(i).getAluguelbase() * 0.05)));
            }
            if (listaImoveis.get(i).getTipo().equals("Galpão")) {
                txtAluguelFinal.setText(String.valueOf((listaImoveis.get(i).getAluguelbase()) + 
                        (listaImoveis.get(i).getAluguelbase() * 0.10)));
            }
            if (listaImoveis.get(i).getTipo().equals("Comercial")) {
                txtAluguelFinal.setText(String.valueOf((listaImoveis.get(i).getAluguelbase()) + 
                        (listaImoveis.get(i).getAluguelbase() * 0.15)));
            }
        } else {
            JOptionPane.showMessageDialog(null,"Imóvel indisponível!",
               "Erro",0);
        }
    }
    
    void devolverImovel(JTextField txtCodImovel, int i) {
        if (listaImoveis.get(i).getStatus().equals("a")) {
            JOptionPane.showMessageDialog(null,"Devolução realizada com sucesso!",
               "Locado!",1);
            
            listaImoveis.get(i).setStatus("d");
        } else {
            JOptionPane.showMessageDialog(null,"Esse imovel já está Disponível!\n"
                    + "Não pode ser devolvido...",
               "Erro",0);
        }
    }

    void consultarImovel(DefaultTableModel modelo, JComboBox<String> comboStatus) {
        Double aluguelFinal = null;
        
        
        for (TipoImovel i : listaImoveis) {
            if (i.getTipo().equals("Residencial")) {
                aluguelFinal = i.getAluguelbase() + i.getAluguelbase() * 0.05;
            }
            if (i.getTipo().equals("Galpão")) {
                aluguelFinal = i.getAluguelbase() + i.getAluguelbase() * 0.10;
            }
            if (i.getTipo().equals("Comercial")) {
                aluguelFinal = i.getAluguelbase() + i.getAluguelbase() * 0.15;
            }
                    
            if (i.getStatus().equals("a") && comboStatus.getSelectedItem().equals("a")) {
                modelo.addRow(new Object[]{
                    i.getCodigo(),
                    i.getTipo(),
                    i.getBairro(),
                    i.getAluguelbase(),
                    aluguelFinal
                });
            }
            if (i.getStatus().equals("d") && comboStatus.getSelectedItem().equals("d")) {
                modelo.addRow(new Object[]{
                i.getCodigo(),
                i.getTipo(),
                i.getBairro(),
                i.getAluguelbase(),
                "-----"
                });
            }
        }
        
        if (comboStatus.getSelectedItem().equals("Selecione...")){
            JOptionPane.showMessageDialog(null,"Selecione uma opção de Status!",
           "Erro",0);
        }
    }
}