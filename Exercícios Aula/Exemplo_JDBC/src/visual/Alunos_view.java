package visual;

import controle.Aluno_controle;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import modelo.Aluno_model;

public class Alunos_view extends javax.swing.JFrame {

    ArrayList<Aluno_model> lista_alunos = new ArrayList<Aluno_model>();
    int ra;
    DefaultTableModel modelo = new DefaultTableModel();

    public Alunos_view() {
        initComponents();  
        preencher_tabela();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        fieldRa = new javax.swing.JTextField();
        fieldNome = new javax.swing.JTextField();
        fieldIdade = new javax.swing.JTextField();
        fieldCidade = new javax.swing.JTextField();
        comboEstado = new javax.swing.JComboBox();
        fieldEmail = new javax.swing.JTextField();
        fieldFone = new javax.swing.JFormattedTextField();
        botaoNovo = new javax.swing.JButton();
        botaoSalvar = new javax.swing.JButton();
        botaoAlterar = new javax.swing.JButton();
        botaoDeletar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("DADOS DO ALUNO"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setText("RA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("NOME");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("IDADE");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("FONE");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("CIDADE");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setText("ESTADO");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("EMAIL");

        comboEstado.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SP", "MG", "RJ" }));

        try {
            fieldFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 55, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(fieldIdade, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(fieldCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(fieldRa, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(fieldNome, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE)
                    .addComponent(fieldFone, javax.swing.GroupLayout.DEFAULT_SIZE, 345, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldRa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(fieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(fieldFone, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(fieldCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(fieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 10, 450, 220);

        botaoNovo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoNovo.setText("NEW");
        botaoNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoNovoActionPerformed(evt);
            }
        });
        getContentPane().add(botaoNovo);
        botaoNovo.setBounds(10, 240, 70, 23);

        botaoSalvar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSalvar.setText("SAVE");
        botaoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSalvar);
        botaoSalvar.setBounds(80, 240, 70, 23);

        botaoAlterar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoAlterar.setText("UPDATE");
        botaoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoAlterar);
        botaoAlterar.setBounds(150, 240, 80, 23);

        botaoDeletar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoDeletar.setText("DELETE");
        botaoDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDeletarActionPerformed(evt);
            }
        });
        getContentPane().add(botaoDeletar);
        botaoDeletar.setBounds(230, 240, 80, 23);

        botaoSair.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        botaoSair.setText("SAIR");
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        getContentPane().add(botaoSair);
        botaoSair.setBounds(390, 240, 70, 23);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RA", "NOME", "IDADE", "FONE", "CIDADE", "ESTADO", "EMAIL"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 280, 440, 120);

        setSize(new java.awt.Dimension(509, 456));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void limpar(){
        fieldRa.setText(null);
        fieldNome.setText(null);
        fieldIdade.setText(null);
        fieldCidade.setText(null);
        fieldEmail.setText(null);
        fieldFone.setValue(null);
        comboEstado.setSelectedIndex(-1);
    }
    private void botaoNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoNovoActionPerformed
        limpar(); 
    
    }//GEN-LAST:event_botaoNovoActionPerformed

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
       setVisible(false);
       Menu_view m = new Menu_view();
       m.setVisible(true);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSalvarActionPerformed
       
           Aluno_model alu = new Aluno_model();
           
           alu.setRa(Integer.parseInt(fieldRa.getText()));
           alu.setNome(fieldNome.getText());
           alu.setIdade(Integer.parseInt(fieldIdade.getText()));
           alu.setFone(fieldFone.getText());
           alu.setCidade(fieldCidade.getText());
           alu.setEstado(comboEstado.getSelectedItem().toString());
           alu.setEmail(fieldEmail.getText());
           
           Aluno_controle ac = new Aluno_controle();
           ac.inserir(alu);
           
           preencher_tabela();
        
    }//GEN-LAST:event_botaoSalvarActionPerformed

    private void botaoDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDeletarActionPerformed
       
            Aluno_controle ac = new Aluno_controle();
            ra = Integer.parseInt(fieldRa.getText());
            ac.excluir(ra);
            
            limpar();
    
            preencher_tabela();
            
        
    }//GEN-LAST:event_botaoDeletarActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int tam=jTable1.getSelectedRow();// pega a linha selecionada
        
        fieldRa.setText(String.valueOf(jTable1.getValueAt(tam, 0)));
        fieldNome.setText(String.valueOf(jTable1.getValueAt(tam, 1)));
        fieldIdade.setText(String.valueOf(jTable1.getValueAt(tam, 2)));
        fieldFone.setText(String.valueOf(jTable1.getValueAt(tam, 3)));
        fieldCidade.setText(String.valueOf(jTable1.getValueAt(tam, 4)));
        comboEstado.setSelectedItem(String.valueOf(jTable1.getValueAt(tam, 5)));
        fieldEmail.setText(String.valueOf(jTable1.getValueAt(tam, 6)));
        
 
    }//GEN-LAST:event_jTable1MouseClicked

    private void botaoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAlterarActionPerformed
    
           
           Aluno_model alu = new Aluno_model();
           alu.setRa(Integer.parseInt(fieldRa.getText()));
           alu.setNome(fieldNome.getText());
           alu.setIdade(Integer.parseInt(fieldIdade.getText()));
           alu.setFone(fieldFone.getText());
           alu.setCidade(fieldCidade.getText());
           alu.setEstado(comboEstado.getSelectedItem().toString());
           alu.setEmail(fieldEmail.getText());
           
           Aluno_controle ac = new Aluno_controle();
           ac.alterar(alu); // chamada do método
           
           preencher_tabela();
         
        

    }//GEN-LAST:event_botaoAlterarActionPerformed

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1MousePressed

    public void preencher_tabela()
    {
        
           modelo = (DefaultTableModel) jTable1.getModel();
           modelo.setRowCount(0);
           
           Aluno_controle ac = new Aluno_controle();
           lista_alunos = ac.busca2(); // busca e retorno
           
           for (int i=0; i<lista_alunos.size();i++) {
             modelo.addRow(new Object[]{
                      lista_alunos.get(i).getRa(),
                      lista_alunos.get(i).getNome(),
                      lista_alunos.get(i).getIdade(),
                      lista_alunos.get(i).getFone(),
                      lista_alunos.get(i).getCidade(),
                      lista_alunos.get(i).getEstado(),
                      lista_alunos.get(i).getEmail()
                    });
               }
       
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Alunos_view().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoAlterar;
    private javax.swing.JButton botaoDeletar;
    private javax.swing.JButton botaoNovo;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoSalvar;
    private javax.swing.JComboBox comboEstado;
    private javax.swing.JTextField fieldCidade;
    private javax.swing.JTextField fieldEmail;
    private javax.swing.JFormattedTextField fieldFone;
    private javax.swing.JTextField fieldIdade;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JTextField fieldRa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
