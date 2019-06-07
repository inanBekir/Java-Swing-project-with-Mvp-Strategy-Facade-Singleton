/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Presenter.SinavOlusturmaPresenter;
import Presenter.StrategyPattern.ContextSinav;
import Presenter.StrategyPattern.SinavKolaySorular;

/**
 *
 * @author inanb
 */
public class SinavOlusturmaView extends javax.swing.JFrame {

    private SinavOlusturmaPresenter presenter;
    ContextSinav context=new ContextSinav(new SinavKolaySorular());
    
    public void setPresenter(SinavOlusturmaPresenter pres)
    {
        presenter = pres;
    }
    
    private static SinavOlusturmaView instance;
    public static SinavOlusturmaView getİnstance(){
        if(instance==null)
        {
            instance=new SinavOlusturmaView();
            
        }
        return instance;
    }
    
   
    public SinavOlusturmaView() {
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


        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 753, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jInternalFrame1, javax.swing.GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
         presenter.DosyaOku();
    }//GEN-LAST:event_formWindowOpened

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
            context.executeStrategy3(jComboBox1.getSelectedItem().toString(),jComboBox5.getSelectedItem().toString(),
            jComboBox2.getSelectedItem().toString(),jComboBox3.getSelectedItem().toString(),
            jComboBox4.getSelectedItem().toString(),Integer.valueOf(jTextField1.getText()));
    }//GEN-LAST:event_jButton1ActionPerformed

   public void updateStatusComboBox3(String line)
    {
        jComboBox1.addItem(line);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JComboBox jComboBox4;
    private javax.swing.JComboBox jComboBox5;
    private javax.swing.JInternalFrame jInternalFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}