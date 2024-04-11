package classes;

import javax.swing.JOptionPane;

public class Tela1 extends javax.swing.JFrame {
    
    public Tela1() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemProdutos = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        itemTabela = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        addEstoque = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        removeEstoque = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        itemFechar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Cadastro");

        itemProdutos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemProdutos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/produtos.png"))); // NOI18N
        itemProdutos.setText("Produtos");
        itemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemProdutosActionPerformed(evt);
            }
        });
        jMenu1.add(itemProdutos);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Relatório");

        itemTabela.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemTabela.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/buscar.png"))); // NOI18N
        itemTabela.setText("Tabela consulta");
        itemTabela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemTabelaActionPerformed(evt);
            }
        });
        jMenu2.add(itemTabela);

        jMenuBar1.add(jMenu2);

        jMenu4.setText("Entrada");

        addEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        addEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/novo.png"))); // NOI18N
        addEstoque.setText("Adicionar Estoque");
        addEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEstoqueActionPerformed(evt);
            }
        });
        jMenu4.add(addEstoque);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Retirada");

        removeEstoque.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        removeEstoque.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fornecedores.png"))); // NOI18N
        removeEstoque.setText("Retirar do Estoque");
        removeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeEstoqueActionPerformed(evt);
            }
        });
        jMenu5.add(removeEstoque);

        jMenuBar1.add(jMenu5);

        jMenu3.setText("Sair");

        itemFechar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        itemFechar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/sair.png"))); // NOI18N
        itemFechar.setText("Fechar programa");
        itemFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFecharActionPerformed(evt);
            }
        });
        jMenu3.add(itemFechar);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemProdutosActionPerformed
        dispose(); //fechar a tela menu
        
        Tela2 x = new Tela2();
        x.setVisible(true); //mostra tela2 (produto)
    }//GEN-LAST:event_itemProdutosActionPerformed

    private void itemTabelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemTabelaActionPerformed
        dispose();
        
        Tela3 x = new Tela3();
        x.setVisible(true); //mostra tela3 (tabela)
    }//GEN-LAST:event_itemTabelaActionPerformed

    private void itemFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFecharActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, 
                "Deseja realmente sair?", "Aviso de saída...",
                JOptionPane.YES_NO_CANCEL_OPTION);
        
        System.out.println(resp);
        
        // 0 = yes, 1 = no, 2 = cancel
        if (resp == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_itemFecharActionPerformed

    private void removeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeEstoqueActionPerformed
        dispose();
        
        Tela5 x = new Tela5();
        x.setVisible(true);
    }//GEN-LAST:event_removeEstoqueActionPerformed

    private void addEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEstoqueActionPerformed
        dispose();
        
        Tela4 x = new Tela4();
        x.setVisible(true);
    }//GEN-LAST:event_addEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addEstoque;
    private javax.swing.JMenuItem itemFechar;
    private javax.swing.JMenuItem itemProdutos;
    private javax.swing.JMenuItem itemTabela;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem removeEstoque;
    // End of variables declaration//GEN-END:variables
}
