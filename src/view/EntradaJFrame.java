/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import dao.ProdutoDao;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Produto;

/**
 *
 * @author Dell
 */
public class EntradaJFrame extends javax.swing.JFrame {

    /**
     * Creates new form EntradaJFrame
     */
    public EntradaJFrame() {
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

        jComboBoxGrupo = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldCodigoBarra = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldCusto = new javax.swing.JTextField();
        jTextFieldAtacado = new javax.swing.JTextField();
        jTextFieldVarejo = new javax.swing.JTextField();
        jRadioButtonAtacado = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldproduto = new javax.swing.JTextField();
        jTextFieldMarca = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jComboBoxUnidade = new javax.swing.JComboBox<String>();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldQuantidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldArmazenamento = new javax.swing.JTextField();
        jLabelCalculadora = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelNovo = new javax.swing.JLabel();
        jLabelSalvar = new javax.swing.JLabel();
        jLabelCancel = new javax.swing.JLabel();
        jTextFieldcapacidadeIndividual = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabelTime1 = new view.JLabelTime();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVisualizador = new javax.swing.JTable();
        jTextFieldLote = new javax.swing.JTextField();
        jTextFieldDataFabricacao = new javax.swing.JTextField();
        jTextFieldValidade = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabelCodigo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Entrada de Mercadorias");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBoxGrupo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Bebidas", "Casquinha", "Coberturas", "Congelados", "Diversos", "Doces", "Picoles", "Salgados", "Sorvetes" }));
        jComboBoxGrupo.setSelectedIndex(-1);
        jComboBoxGrupo.setToolTipText(" Informe o grupo correspondente");
        getContentPane().add(jComboBoxGrupo, new org.netbeans.lib.awtextra.AbsoluteConstraints(211, 41, 85, -1));

        jLabel1.setText("Grupo:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 44, -1, -1));
        getContentPane().add(jTextFieldCodigoBarra, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 41, 122, -1));

        jLabel2.setText("Codigo de Barras");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 20, -1, -1));
        getContentPane().add(jTextFieldCusto, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 41, 70, -1));
        getContentPane().add(jTextFieldAtacado, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 41, 68, -1));
        getContentPane().add(jTextFieldVarejo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, 70, -1));

        jRadioButtonAtacado.setText("Atacado");
        getContentPane().add(jRadioButtonAtacado, new org.netbeans.lib.awtextra.AbsoluteConstraints(613, 16, -1, -1));

        jLabel3.setText("Valor de Custo");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 44, -1, -1));

        jLabel4.setText("Atacado");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 44, -1, -1));

        jLabel5.setText("Varejo");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(756, 44, -1, -1));

        jLabel6.setText("Produto");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 82, -1, -1));
        getContentPane().add(jTextFieldproduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 105, 275, -1));

        jTextFieldMarca.setText("Eskimo");
        getContentPane().add(jTextFieldMarca, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 105, 70, -1));

        jLabel8.setText("Marca");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(381, 108, -1, -1));

        jLabel9.setText("Unidade");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(746, 108, -1, -1));

        jComboBoxUnidade.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "grama", "kg", "l", "ml" }));
        jComboBoxUnidade.setSelectedIndex(-1);
        getContentPane().add(jComboBoxUnidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        jLabel7.setText("Quantidade");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(576, 108, -1, -1));
        getContentPane().add(jTextFieldQuantidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(636, 105, 68, -1));

        jLabel10.setText("Local de Armazenamento");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));
        getContentPane().add(jTextFieldArmazenamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 275, -1));

        jLabelCalculadora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/technology (2).png"))); // NOI18N
        jLabelCalculadora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCalculadoraMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCalculadora, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 380, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/doorway.png"))); // NOI18N
        jLabel11.setText("Sair");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 480, -1, -1));

        jLabelNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/001-add.png"))); // NOI18N
        jLabelNovo.setText("Novo");
        getContentPane().add(jLabelNovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        jLabelSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/save.png"))); // NOI18N
        jLabelSalvar.setText("Salvar");
        jLabelSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelSalvarMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelSalvar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 480, -1, -1));

        jLabelCancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/update.png"))); // NOI18N
        jLabelCancel.setText("Cancelar");
        jLabelCancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelCancelMouseClicked(evt);
            }
        });
        getContentPane().add(jLabelCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, -1, -1));
        getContentPane().add(jTextFieldcapacidadeIndividual, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 80, 48, -1));

        jLabel12.setText("Capacidade Individual");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(704, 82, -1, -1));

        jLabelTime1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jLabelTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 490, -1, -1));

        jTableVisualizador.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Codigo", "Produto", "Quantidade", "Preço Varejo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableVisualizador);
        if (jTableVisualizador.getColumnModel().getColumnCount() > 0) {
            jTableVisualizador.getColumnModel().getColumn(0).setResizable(false);
            jTableVisualizador.getColumnModel().getColumn(1).setResizable(false);
            jTableVisualizador.getColumnModel().getColumn(2).setResizable(false);
            jTableVisualizador.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, 860, 260));
        getContentPane().add(jTextFieldLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 70, -1));
        getContentPane().add(jTextFieldDataFabricacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 70, -1));
        getContentPane().add(jTextFieldValidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 160, 70, -1));

        jLabel13.setText("Lote:");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 160, -1, -1));

        jLabel14.setText("Data de Fabricação:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jLabel15.setText("Validade:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 160, -1, -1));

        jLabelCodigo.setText("Codigo:");
        getContentPane().add(jLabelCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
        byte resul = 0;
    private void jLabelCalculadoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCalculadoraMouseClicked
    
       try{
          Runtime.getRuntime().exec("calc");
         }catch(IOException e){
        e.printStackTrace();
   }

    }//GEN-LAST:event_jLabelCalculadoraMouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        int resultado = JOptionPane.showConfirmDialog(null,"Deseja salvar alterações?");
        if(resultado == 0){
            JOptionPane.showMessageDialog(null, "ERRO! Sem Conexão com o MYSQL");
            return;
        }if(resultado ==1){
            dispose();
            return;
        }
        
    }//GEN-LAST:event_jLabel11MouseClicked
      
    public void verficaCamposEntrada(){//Metodo Criado para verificar se o usuario preencher todos os campos
        if(jTextFieldCodigoBarra.getText().equals("")){// e solicitar o prenchimento.
         JOptionPane.showMessageDialog(null,"Codigo de Barras Invalido");
         jTextFieldCodigoBarra.requestFocus();
         resul++;
         return;
      }if (jComboBoxGrupo.getSelectedIndex() == -1){
          JOptionPane.showMessageDialog(null, "E obrigatório informar o grupo!");
          jComboBoxGrupo.requestFocus();
          resul++;
          return;
      }if (jTextFieldCusto.getText().equals("")){
          JOptionPane.showMessageDialog(null,"Você deve Informar o Custo!");
          jTextFieldCusto.requestFocus();
          resul++;
          return;
      }if(jTextFieldVarejo.getText().equals("")){
          JOptionPane.showMessageDialog(null,"E obrigatório informar o preço de Varejo!");
          jTextFieldVarejo.requestFocus();
          resul++;
          return;
      }if(!jRadioButtonAtacado.isSelected()){
          jTextFieldAtacado.setText(jTextFieldVarejo.getText());
          resul++;
          return;
      }    
      if(jTextFieldproduto.getText().equals("")){
          JOptionPane.showMessageDialog(null,"E obrigatório informar o nome do Produto");
          jTextFieldproduto.requestFocus();
          resul++;
          return;
      }if(jTextFieldQuantidade.getText().equals("")){
          JOptionPane.showMessageDialog(null,"E obrigatório informar a quantidade!");
          jTextFieldQuantidade.requestFocus();
          resul++;
          return;
      }if(jComboBoxUnidade.getSelectedIndex()==-1){
          JOptionPane.showMessageDialog(null,"E obrigatório informar o unidade de capacidade do produto!");
          jComboBoxUnidade.requestFocus();
          resul++;
          return;
      }//System.out.println(resul);
      resul=0;
   } 
    
    private void jLabelCancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelCancelMouseClicked
        int resposta = JOptionPane.showConfirmDialog(null,"Você tem Certeza que deseja cancelar "
                + "e perde as informações digitadas?");
            if(resposta ==0){
        dispose();
       new EntradaJFrame().setVisible(true);
                
    }return;
        
    }//GEN-LAST:event_jLabelCancelMouseClicked

    private void jLabelSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelSalvarMouseClicked
        verficaCamposEntrada();
      float valorCusto =Float.parseFloat(jTextFieldCusto.getText());
       float valorVarejo = Float.parseFloat(jTextFieldVarejo.getText());
      if(valorCusto >= valorVarejo){
          resul++;
          JOptionPane.showMessageDialog(null, "Valor de produto invalido! Valor de atacado e varejo deve ser maior que o valor de custo.");
          jTextFieldAtacado.requestFocus();
          return;
      }
      if (resul <=0){
        int resposta =JOptionPane.showConfirmDialog(null,"Você deseja Salvar seu novo registro?" );
        if (resposta == 0){
            Produto produto = new Produto();
            produto.setCodigo(Integer.parseInt(jTextFieldCodigoBarra.getText().trim()));
            produto.setGrupo(jComboBoxGrupo.getSelectedItem().toString());
            produto.setCusto(Float.parseFloat(jTextFieldCusto.getText()));
            produto.setAtacadista(jRadioButtonAtacado.isSelected());
            produto.setAtacado(Float.parseFloat(jTextFieldAtacado.getText()));
            produto.setVarejo(Float.parseFloat(jTextFieldVarejo.getText()));
            produto.setNome(jTextFieldproduto.getText());
            produto.setMarca(jTextFieldMarca.getText());
            produto.setQuantidade(Integer.parseInt(jTextFieldQuantidade.getText()));
            produto.setCapacidade(jTextFieldcapacidadeIndividual.getText());
            produto.setUnidade(jComboBoxUnidade.getSelectedItem().toString());
            if(jLabelCodigo.getText().equals("Codigo:")){
                int codigo = new ProdutoDao().inserir(produto);
                if (codigo >0){
                    jLabelCodigo.setText(String.valueOf(codigo));
                    JOptionPane.showMessageDialog(null, "Registrado com Sucesso");
                }else{
                    produto.setId(Integer.parseInt(jLabelCodigo.getText()));
                }
            }
        }
        
      }
      dispose();
       new EntradaJFrame().setVisible(true);
      populaTableSorvetes();
    }//GEN-LAST:event_jLabelSalvarMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        populaTableSorvetes();
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(EntradaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EntradaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EntradaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EntradaJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EntradaJFrame().setVisible(true);
            }
        });
    }
    private void populaTableSorvetes(){
        ArrayList<Produto> produtos = new ProdutoDao().retornaTodos();
        DefaultTableModel dtm = (DefaultTableModel)jTableVisualizador.getModel();
        dtm.setRowCount(0);
        
        for (Produto produto: produtos){
            dtm.addRow(new Object[]{
                produto.getId(),
                produto.getNome(),
                produto.getQuantidade(),
                produto.getVarejo()
            });
        
        }
        }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> jComboBoxGrupo;
    private javax.swing.JComboBox<String> jComboBoxUnidade;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCalculadora;
    private javax.swing.JLabel jLabelCancel;
    private javax.swing.JLabel jLabelCodigo;
    private javax.swing.JLabel jLabelNovo;
    private javax.swing.JLabel jLabelSalvar;
    private view.JLabelTime jLabelTime1;
    private javax.swing.JRadioButton jRadioButtonAtacado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableVisualizador;
    private javax.swing.JTextField jTextFieldArmazenamento;
    private javax.swing.JTextField jTextFieldAtacado;
    private javax.swing.JTextField jTextFieldCodigoBarra;
    private javax.swing.JTextField jTextFieldCusto;
    private javax.swing.JTextField jTextFieldDataFabricacao;
    private javax.swing.JTextField jTextFieldLote;
    private javax.swing.JTextField jTextFieldMarca;
    private javax.swing.JTextField jTextFieldQuantidade;
    private javax.swing.JTextField jTextFieldValidade;
    private javax.swing.JTextField jTextFieldVarejo;
    private javax.swing.JTextField jTextFieldcapacidadeIndividual;
    private javax.swing.JTextField jTextFieldproduto;
    // End of variables declaration//GEN-END:variables
}
