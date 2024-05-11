package classes;

import static classes.Conta.listaContas;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MetodosContas {
    public void salvar(Conta x) {
        x.listaContas.add(x);
        
        JOptionPane.showMessageDialog(null,"Inclusão realizada com sucesso",
               "Cadastro de Conta",1);   
    }
    
    public void buscar(DefaultTableModel modelo, JComboBox comboBox) {
        
        for (int i = 0; i < listaContas.size(); i++) {
            if (comboBox.getSelectedItem().equals(listaContas.get(i).getCPF())) {
                modelo.addRow(new Object[]{ //criando um array de objetos e adicionando este vetor na linha do modelo
                    listaContas.get(i).getNomeCliente(),
                    listaContas.get(i).getnConta(),
                    listaContas.get(i).getTelefone(),
                    listaContas.get(i).getCidade(),
                    listaContas.get(i).getEstado(),
                    listaContas.get(i).getSaldo()
                });
            }
        }
        
    }
    
    public void alterar(Conta x, int i) {
        listaContas.get(i).setNomeCliente(x.getNomeCliente());
        listaContas.get(i).setTelefone(x.getTelefone());
        listaContas.get(i).setCidade(x.getCidade());
        listaContas.get(i).setEstado(x.getEstado());
        listaContas.get(i).setSaldo(x.getSaldo());

        JOptionPane.showMessageDialog(null,"Alteração realizada com sucesso!",
                "Alteração de Dados",1);
    }
    
    public void saque(int i, double qtdSaque) {
        if (qtdSaque < listaContas.get(i).getSaldo()) {
            listaContas.get(i).setSaldo(listaContas.get(i).getSaldo() - qtdSaque);
            
            JOptionPane.showMessageDialog(null,"Saque realizado com sucesso!",
                       "Saque",1);   
        } else {
            JOptionPane.showMessageDialog(null,"Não foi possível realizar o Saque,\nvalor insuficiente!",
                       "Erro",1);
        }
    }
    
    public void deposito(int i, double qtdDeposito) {

        if (qtdDeposito <= 0) {
            JOptionPane.showMessageDialog(null,"Não foi possível realizar depósito,\nvalores inválidos!!",
                   "Erro",1);
        } else {
            listaContas.get(i).setSaldo(listaContas.get(i).getSaldo() + qtdDeposito);
            
            JOptionPane.showMessageDialog(null,"Depósito realizado com sucesso!",
                   "Depósito",1);
        }
    }
}
