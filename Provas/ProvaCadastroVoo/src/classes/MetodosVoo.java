package classes;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MetodosVoo {
    public void cadastrar(Voo x) {
        Voo.listaVoos.add(x);
        
        JOptionPane.showMessageDialog(null,"Inclusão realizada com sucesso",
               "Cadastro de Conta",1);   
    }
    
    public void consultar(DefaultTableModel modelo, JComboBox comboBox) {
        
        for (int i = 0; i < Voo.listaVoos.size(); i++) {
            if (comboBox.getSelectedItem().equals(Voo.listaVoos.get(i).getNumVoo())) {
                modelo.addRow(new Object[]{
                    Voo.listaVoos.get(i).getOrigemVoo(),
                    Voo.listaVoos.get(i).getDestinoVoo(),
                    Voo.listaVoos.get(i).getNumLugares()
                });
            }
        }
        
    }
     
    public void reservar(Voo voo) {
        
        if (voo.getNumLugares() >= 1) {
            voo.setNumLugares(voo.getNumLugares() - 1);
            JOptionPane.showMessageDialog(null,"Reserva Confirmada!",
                       "Parabéns",1);
        } else {
            JOptionPane.showMessageDialog(null,"Voo Lotado!",
                       "Erro",1);
        }
        
    }
}
