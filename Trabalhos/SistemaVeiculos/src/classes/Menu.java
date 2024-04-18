/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package classes;

import javax.swing.JOptionPane;

/**
 *
 * @author Otavio Augusto
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DesktopMenu = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemVeiculoPasseio = new javax.swing.JMenuItem();
        itemVeiculoCarga = new javax.swing.JMenuItem();
        itemMotoristas = new javax.swing.JMenuItem();
        itemMovimentacoes = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemMovimentacoesListagem = new javax.swing.JMenuItem();
        itemVeiculosListagem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 440));

        DesktopMenu.setPreferredSize(new java.awt.Dimension(630, 410));
        DesktopMenu.setRequestFocusEnabled(false);

        javax.swing.GroupLayout DesktopMenuLayout = new javax.swing.GroupLayout(DesktopMenu);
        DesktopMenu.setLayout(DesktopMenuLayout);
        DesktopMenuLayout.setHorizontalGroup(
            DesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        DesktopMenuLayout.setVerticalGroup(
            DesktopMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );

        jMenu1.setText("Cadastros");

        itemVeiculoPasseio.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemVeiculoPasseio.setText("Veículo de Passeio");
        itemVeiculoPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVeiculoPasseioActionPerformed(evt);
            }
        });
        jMenu1.add(itemVeiculoPasseio);

        itemVeiculoCarga.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemVeiculoCarga.setText("Veículo de Carga");
        itemVeiculoCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVeiculoCargaActionPerformed(evt);
            }
        });
        jMenu1.add(itemVeiculoCarga);

        itemMotoristas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMotoristas.setText("Motoristas");
        itemMotoristas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMotoristasActionPerformed(evt);
            }
        });
        jMenu1.add(itemMotoristas);

        itemMovimentacoes.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemMovimentacoes.setText("Movimentações");
        itemMovimentacoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMovimentacoesActionPerformed(evt);
            }
        });
        jMenu1.add(itemMovimentacoes);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Listagem");

        itemMovimentacoesListagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemMovimentacoesListagem.setText("Movimentações");
        itemMovimentacoesListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemMovimentacoesListagemActionPerformed(evt);
            }
        });
        jMenu2.add(itemMovimentacoesListagem);

        itemVeiculosListagem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        itemVeiculosListagem.setText("Veículos");
        itemVeiculosListagem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemVeiculosListagemActionPerformed(evt);
            }
        });
        jMenu2.add(itemVeiculosListagem);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Sair");

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem7.setText("Sair");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(DesktopMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemVeiculoPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVeiculoPasseioActionPerformed
        CadVeiculosPasseio x = new CadVeiculosPasseio();

        DesktopMenu.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_itemVeiculoPasseioActionPerformed

    private void itemVeiculoCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVeiculoCargaActionPerformed
        CadVeiculosCarga x = new CadVeiculosCarga();

        DesktopMenu.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_itemVeiculoCargaActionPerformed

    private void itemMotoristasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMotoristasActionPerformed
        CadMotoristas x = new CadMotoristas();

        DesktopMenu.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_itemMotoristasActionPerformed

    private void itemMovimentacoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMovimentacoesActionPerformed
        CadMovimentacoes x = new CadMovimentacoes();

        DesktopMenu.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_itemMovimentacoesActionPerformed

    private void itemMovimentacoesListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemMovimentacoesListagemActionPerformed
        ListarMovimentacoes x = new ListarMovimentacoes();

        DesktopMenu.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_itemMovimentacoesListagemActionPerformed

    private void itemVeiculosListagemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemVeiculosListagemActionPerformed
        ListarVeiculos x = new ListarVeiculos();

        DesktopMenu.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_itemVeiculosListagemActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente sair?", "Aviso de saída...",
                JOptionPane.YES_NO_OPTION);
        
        if (resp == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopMenu;
    private javax.swing.JMenuItem itemMotoristas;
    private javax.swing.JMenuItem itemMovimentacoes;
    private javax.swing.JMenuItem itemMovimentacoesListagem;
    private javax.swing.JMenuItem itemVeiculoCarga;
    private javax.swing.JMenuItem itemVeiculoPasseio;
    private javax.swing.JMenuItem itemVeiculosListagem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem7;
    // End of variables declaration//GEN-END:variables
}
