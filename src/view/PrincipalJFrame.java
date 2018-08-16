/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import database.Conexao;
import java.io.IOException;
import java.sql.Connection;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import model.Produto;

/**
 *
 * @author Dell
 */
//615036gc senha adminstrador
public class PrincipalJFrame extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public PrincipalJFrame() {
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/icons/003-food-1.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabelTime1 = new relogiojava.JLabelTime();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Sorvetex");
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/001-analytics.png"))); // NOI18N
        jLabel1.setText("Relatorios.");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/002-tool.png"))); // NOI18N
        jLabel2.setText("Caixa");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/004-food.png"))); // NOI18N
        jLabel3.setText("Estoque");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/computer.png"))); // NOI18N
        jLabel4.setText("Entrada de Mercadoria");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/calc-botao.png"))); // NOI18N
        jLabel5.setText("Calculadora");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/toolbar-memory-64.png"))); // NOI18N
        jLabel6.setText("Configurações");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/doorway.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabelTime1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6))
                        .addGap(45, 45, 45))
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
       String SENHA =null;
       Produto password = new Produto();
       SENHA =password.getPassword();
        System.out.println(SENHA);
        //Criar a mensagem sera exibida
        JLabel label = new JLabel("Digite a senha:");
        //criar o componente grafico que recebera o que for digitado
        JPasswordField jpf = new JPasswordField();
        //Exibir a janela para o usuario
        JOptionPane.showConfirmDialog(null,
        new Object[]{label, jpf}, "Senha:",
        JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
 
        //Pegamos o que foi digitado e comparamos com a senha correta
        String senhaDigitada = new String(jpf.getPassword());
        if (SENHA.equals(senhaDigitada)){
           new EntradaJFrame().setVisible(true);
        }else{
           JOptionPane.showMessageDialog(null, "Senha Incorreta!");
        }   
      /* String senha = JOptionPane.showInputDialog(null, "Informe a senha de acesso!");
       String pas = null;
       Produto password = new Produto();
        pas = password.getPassword();
        if (pas.equals(senha)){
            new EntradaJFrame().setVisible(true);
        }*/
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
       //chama calculadora do windows
        try{
          Runtime.getRuntime().exec("calc");
         }catch(IOException e){
        e.printStackTrace();
   }
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       String SENHA =null;
       Produto password = new Produto();
       SENHA =password.getPassword();
        System.out.println(SENHA);
        //Criar a mensagem sera exibida
        JLabel label = new JLabel("Digite a senha:");
        //criar o componente grafico que recebera o que for digitado
        JPasswordField jpf = new JPasswordField();
        //Exibir a janela para o usuario
        JOptionPane.showConfirmDialog(null,
        new Object[]{label, jpf}, "Senha:",
        JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
 
        //Pegamos o que foi digitado e comparamos com a senha correta
        String senhaDigitada = new String(jpf.getPassword());
        if (SENHA.equals(senhaDigitada)){
           JOptionPane.showMessageDialog(null, "Senha Correta!");
        }else{
           JOptionPane.showMessageDialog(null, "Senha Incorreta!");
        }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
          String SENHA =null;
       Produto password = new Produto();
       SENHA =password.getPassword();
        System.out.println(SENHA);
        //Criar a mensagem sera exibida
        JLabel label = new JLabel("Digite a senha:");
        //criar o componente grafico que recebera o que for digitado
        JPasswordField jpf = new JPasswordField();
        //Exibir a janela para o usuario
        JOptionPane.showConfirmDialog(null,
        new Object[]{label, jpf}, "Senha:",
        JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
 
        //Pegamos o que foi digitado e comparamos com a senha correta
        String senhaDigitada = new String(jpf.getPassword());
        if (SENHA.equals(senhaDigitada)){
           JOptionPane.showMessageDialog(null, "Senha Correta!");
        }else{
           JOptionPane.showMessageDialog(null, "Senha Incorreta!");
        }
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
          String SENHA =null;
       Produto password = new Produto();
       SENHA =password.getPassword();
        System.out.println(SENHA);
        //Criar a mensagem sera exibida
        JLabel label = new JLabel("Digite a senha:");
        //criar o componente grafico que recebera o que for digitado
        JPasswordField jpf = new JPasswordField();
        //Exibir a janela para o usuario
        JOptionPane.showConfirmDialog(null,
        new Object[]{label, jpf}, "Senha:",
        JOptionPane.OK_CANCEL_OPTION,JOptionPane.PLAIN_MESSAGE);
 
        //Pegamos o que foi digitado e comparamos com a senha correta
        String senhaDigitada = new String(jpf.getPassword());
        if (SENHA.equals(senhaDigitada)){
           JOptionPane.showMessageDialog(null, "Senha Correta!");
            new ListasJFrame().setVisible(true);
        }else{
           JOptionPane.showMessageDialog(null, "Senha Incorreta!");
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
       new CaixaJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

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
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private relogiojava.JLabelTime jLabelTime1;
    // End of variables declaration//GEN-END:variables
}