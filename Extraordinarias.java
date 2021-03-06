/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frame;

import Java.Apartamento;
import Java.Despesa;
import Java.Morador;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Houdini
 */
public class Extraordinarias extends javax.swing.JFrame {

    private Apartamento apartamento;
    private String username;
    private String[] meses = {"Janeiro",      
                                  "Fevereiro",
                                  "Março",        
                                  "Abril",        
                                  "Maio",          
                                  "Junho",         
                                  "Julho",         
                                  "Agosto",       
                                  "Setembro",    
                                  "Outubro",      
                                  "Novembro",     
                                  "Dezembro"};
    /**
     * Creates new form Extraordinarias
     */
    public Extraordinarias(Apartamento a, String username) {
        initComponents();
        this.apartamento = a;
        this.username = username;
        TableAdd();
    }
    
    public void TableAdd() {
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        
        Date date= new Date();
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        String mes = meses[month];
        
        String pago;
        
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        String limite;
        for(Morador m : apartamento.getListaMoradores().values()){
            for(Despesa d : m.getListaExtra().values()){
                    if(d.isPago()) pago = "Pago";
                    else pago = "Não Pago";
                    limite = df.format(d.getLimite());
                    Object[] row = {d.getId_despesa(), "Recorrente", mes, d.getValor(), limite, pago, d.getReferencia()};
                    model.addRow(row);
            }
        }
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabelButtonHome = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nº", "Categoria", "Mês", "Quantia", "Data_Limite", "Estado", "Referência"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(110, 220, 600, 200);

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
        jLabelButtonHome.setBounds(20, 460, 80, 80);

        jLabelTitulo.setFont(new java.awt.Font("Cooper Black", 0, 30)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTitulo.setText("Despesas - Extraordinárias");
        getContentPane().add(jLabelTitulo);
        jLabelTitulo.setBounds(70, 130, 420, 35);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/SignUp_screen.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 792, 559);

        setSize(new java.awt.Dimension(808, 598));
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
        Menu_Inicial s = new Menu_Inicial(apartamento, username);
        s.setVisible(true);
    }//GEN-LAST:event_jLabelButtonHomeMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelButtonHome;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
