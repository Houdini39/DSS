/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Java.Apartamento;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author Houdini
 */
public class Adicionar_Despesas extends javax.swing.JFrame {

    private Apartamento apartamento;
    /**
     * Creates new form Adicionar_Despesas
     */
    public Adicionar_Despesas(Apartamento a) {
        initComponents();
        this.apartamento = a;
    }
    
    public void close() {
        WindowEvent winClosingEvent =  new WindowEvent(this, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinnerDataLimite = new javax.swing.JSpinner();
        jTextFieldQuantia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabelButtonHome = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelDataLimite = new javax.swing.JLabel();
        jLabelQuantia = new javax.swing.JLabel();
        jLabelCategoria = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelAdd = new javax.swing.JLabel();
        jLabelBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jCheckBox1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("MultiBanco");
        getContentPane().add(jCheckBox1);
        jCheckBox1.setBounds(540, 230, 111, 29);

        jCheckBox2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Dinheiro");
        getContentPane().add(jCheckBox2);
        jCheckBox2.setBounds(540, 270, 110, 29);

        jCheckBox3.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setText("Tranferência");
        getContentPane().add(jCheckBox3);
        jCheckBox3.setBounds(540, 310, 110, 30);
        getContentPane().add(jSpinner2);
        jSpinner2.setBounds(190, 290, 150, 30);
        getContentPane().add(jSpinner1);
        jSpinner1.setBounds(190, 230, 150, 30);

        jSpinnerDataLimite.setFont(new java.awt.Font("Arial Black", 0, 13)); // NOI18N
        jSpinnerDataLimite.setModel(new javax.swing.SpinnerDateModel());
        getContentPane().add(jSpinnerDataLimite);
        jSpinnerDataLimite.setBounds(190, 410, 150, 30);
        getContentPane().add(jTextFieldQuantia);
        jTextFieldQuantia.setBounds(190, 350, 150, 30);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(490, 410, 220, 120);

        jLabelButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ButtonHome.png"))); // NOI18N
        jLabelButtonHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelButtonHomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelButtonHomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelButtonHomeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelButtonHomeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelButtonHomeMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelButtonHome);
        jLabelButtonHome.setBounds(20, 470, 80, 80);

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("procedimento do pagamento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(490, 380, 214, 21);

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Introduza os dados para o");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 360, 200, 21);

        jLabel1.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Método de Pagamento");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(460, 140, 270, 40);

        jLabelDataLimite.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelDataLimite.setForeground(new java.awt.Color(255, 255, 255));
        jLabelDataLimite.setText("Data Limite");
        getContentPane().add(jLabelDataLimite);
        jLabelDataLimite.setBounds(80, 410, 90, 30);

        jLabelQuantia.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelQuantia.setForeground(new java.awt.Color(255, 255, 255));
        jLabelQuantia.setText("Quantia");
        getContentPane().add(jLabelQuantia);
        jLabelQuantia.setBounds(110, 350, 70, 30);

        jLabelCategoria.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCategoria.setText("Categoria");
        getContentPane().add(jLabelCategoria);
        jLabelCategoria.setBounds(100, 290, 80, 30);

        jLabelTipo.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo de Despesa");
        getContentPane().add(jLabelTipo);
        jLabelTipo.setBounds(50, 230, 130, 30);

        jLabelAdd.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabelAdd.setForeground(new java.awt.Color(255, 255, 255));
        jLabelAdd.setText("Adicionar Despesa");
        getContentPane().add(jLabelAdd);
        jLabelAdd.setBounds(60, 150, 240, 30);

        jLabelBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SignUp_screen.jpg"))); // NOI18N
        jLabelBackground.setText("jLabel1");
        getContentPane().add(jLabelBackground);
        jLabelBackground.setBounds(0, 0, 790, 560);

        setSize(new java.awt.Dimension(806, 603));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelButtonHomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonHomeMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonHome_over.png"));
        jLabelButtonHome.setIcon(II);
    }//GEN-LAST:event_jLabelButtonHomeMouseEntered

    private void jLabelButtonHomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonHomeMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonHome.png"));
        jLabelButtonHome.setIcon(II);
    }//GEN-LAST:event_jLabelButtonHomeMouseExited

    private void jLabelButtonHomeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonHomeMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonHome_pressed.png"));
        jLabelButtonHome.setIcon(II);
    }//GEN-LAST:event_jLabelButtonHomeMousePressed

    private void jLabelButtonHomeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonHomeMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonHome_over.png"));
        jLabelButtonHome.setIcon(II);
    }//GEN-LAST:event_jLabelButtonHomeMouseReleased

    private void jLabelButtonHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelButtonHomeMouseClicked
        close();
        Menu_Inicial s = new Menu_Inicial(apartamento);
        s.setVisible(true);
    }//GEN-LAST:event_jLabelButtonHomeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelAdd;
    private javax.swing.JLabel jLabelBackground;
    private javax.swing.JLabel jLabelButtonHome;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelDataLimite;
    private javax.swing.JLabel jLabelQuantia;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinnerDataLimite;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextFieldQuantia;
    // End of variables declaration//GEN-END:variables
}
