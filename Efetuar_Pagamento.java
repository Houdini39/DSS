/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Java.Apartamento;
import Java.Despesa;
import Java.Morador;
import Java.QuantiaInvalidaException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.SpinnerListModel;

/**
 *
 * @author Houdini
 */
public class Efetuar_Pagamento extends javax.swing.JFrame {

    private Apartamento apartamento;
    private String username;
    /**
     * Creates new form Efetuar_Pagamento
     */
    public Efetuar_Pagamento(Apartamento a, String username) {
        initComponents();
        this.apartamento = a;
        this.username = username;
        setSpinnersTipo();
        setSpinnersCategoria();
    }
    
    private void setSpinnersTipo() {
        SpinnerListModel tl;
        List<String> l = new ArrayList<>();
        List<String> t = new ArrayList<>();
        t.add("Recorrente");
        t.add("Extraordinária");
        
        tl = new SpinnerListModel(t);
        jSpinnerTipo.setModel(tl);
    }
    
    private void setSpinnersCategoria() {
        SpinnerListModel pl;
        List<String> l = new ArrayList<>();
        for(Despesa d : apartamento.getListaTotal().values()){
            l.add(d.getCategoria());
        }
        pl = new SpinnerListModel(l);
        jSpinnerCategoria.setModel(pl);
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

        jSpinnerTipo = new javax.swing.JSpinner();
        jSpinnerCategoria = new javax.swing.JSpinner();
        jTextFieldNum = new javax.swing.JTextField();
        jTextFieldPaga = new javax.swing.JTextField();
        jLabelButtonHome = new javax.swing.JLabel();
        jLabelShop = new javax.swing.JLabel();
        jLabelCatagoria = new javax.swing.JLabel();
        jLabelTipo = new javax.swing.JLabel();
        jLabelNum = new javax.swing.JLabel();
        jLabelPagamento = new javax.swing.JLabel();
        jLabelPagamentos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(jSpinnerTipo);
        jSpinnerTipo.setBounds(400, 340, 160, 30);
        getContentPane().add(jSpinnerCategoria);
        jSpinnerCategoria.setBounds(400, 400, 160, 30);
        getContentPane().add(jTextFieldNum);
        jTextFieldNum.setBounds(400, 280, 160, 30);
        getContentPane().add(jTextFieldPaga);
        jTextFieldPaga.setBounds(400, 220, 160, 30);

        jLabelButtonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ButtonHome.png"))); // NOI18N
        jLabelButtonHome.setText("jLabel2");
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

        jLabelShop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ButtonShop.png"))); // NOI18N
        jLabelShop.setText("jLabel2");
        jLabelShop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelShopMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabelShopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabelShopMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabelShopMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLabelShopMouseReleased(evt);
            }
        });
        getContentPane().add(jLabelShop);
        jLabelShop.setBounds(620, 280, 80, 80);

        jLabelCatagoria.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabelCatagoria.setForeground(new java.awt.Color(255, 255, 255));
        jLabelCatagoria.setText("Categoria");
        getContentPane().add(jLabelCatagoria);
        jLabelCatagoria.setBounds(270, 400, 130, 30);

        jLabelTipo.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabelTipo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTipo.setText("Tipo da Despesa");
        getContentPane().add(jLabelTipo);
        jLabelTipo.setBounds(200, 340, 200, 30);

        jLabelNum.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabelNum.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNum.setText("Número da Despesa");
        getContentPane().add(jLabelNum);
        jLabelNum.setBounds(170, 280, 230, 26);

        jLabelPagamento.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        jLabelPagamento.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagamento.setText("Pagamento");
        getContentPane().add(jLabelPagamento);
        jLabelPagamento.setBounds(260, 220, 140, 30);

        jLabelPagamentos.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabelPagamentos.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPagamentos.setText("Pagamentos");
        getContentPane().add(jLabelPagamentos);
        jLabelPagamentos.setBounds(70, 120, 190, 80);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SignUp_screen.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 560);

        setSize(new java.awt.Dimension(806, 599));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabelShopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShopMouseEntered
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonShop_over.png"));
        jLabelShop.setIcon(II);
    }//GEN-LAST:event_jLabelShopMouseEntered

    private void jLabelShopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShopMouseExited
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonShop.png"));
        jLabelShop.setIcon(II);
    }//GEN-LAST:event_jLabelShopMouseExited

    private void jLabelShopMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShopMousePressed
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonShop_pressed.png"));
        jLabelShop.setIcon(II);
    }//GEN-LAST:event_jLabelShopMousePressed

    private void jLabelShopMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShopMouseReleased
        ImageIcon II = new ImageIcon(getClass().getResource("/Imagens/ButtonShop_over.png"));
        jLabelShop.setIcon(II);
    }//GEN-LAST:event_jLabelShopMouseReleased

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
        Menu_Inicial s = new Menu_Inicial(apartamento, username);
        s.setVisible(true);
    }//GEN-LAST:event_jLabelButtonHomeMouseClicked

    private void jLabelShopMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelShopMouseClicked
        Morador m = apartamento.getListaMoradores().get(username);
        boolean tipo = false;
        if(jSpinnerTipo.getValue().equals("Recorrente")) tipo = true;
        try {
            m.efetuapagamento(Integer.parseInt(jTextFieldNum.getText()), tipo, Float.parseFloat(jTextFieldPaga.getText()));
            apartamento.ListaMoradores.put(m.getUsername(), m);
        } catch (QuantiaInvalidaException ex) {
            Logger.getLogger(Efetuar_Pagamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        close();
        Menu_Inicial s = new Menu_Inicial(apartamento, username);
        s.setVisible(true);
    }//GEN-LAST:event_jLabelShopMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelButtonHome;
    private javax.swing.JLabel jLabelCatagoria;
    private javax.swing.JLabel jLabelNum;
    private javax.swing.JLabel jLabelPagamento;
    private javax.swing.JLabel jLabelPagamentos;
    private javax.swing.JLabel jLabelShop;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JSpinner jSpinnerCategoria;
    private javax.swing.JSpinner jSpinnerTipo;
    private javax.swing.JTextField jTextFieldNum;
    private javax.swing.JTextField jTextFieldPaga;
    // End of variables declaration//GEN-END:variables
}
