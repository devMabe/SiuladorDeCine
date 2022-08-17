/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import java.awt.Color;
import java.awt.Label;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import principal.Pelicula;
import static principal.principal.compras;
import static principal.principal.peliculas;
import static principal.principal.ranking;

/**
 *
 * @author Yeya
 */
public class Pagos extends javax.swing.JFrame {
    private Tarjeta[] tarjetas = new Tarjeta[2];
    public static CompraPeli compra;
    private int numTar; 

    public Pagos() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        inicio();
    }

    public void inicio(){
        tar1.setVisible(false);
        tar2.setVisible(false);
        llenarDes(compra.getTipoPago());
        llenarOtros();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        titular = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        desplegable = new javax.swing.JComboBox<>();
        dia = new javax.swing.JTextField();
        mes = new javax.swing.JTextField();
        anio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pago = new javax.swing.JTextField();
        agregarT = new javax.swing.JButton();
        cuenta = new javax.swing.JFormattedTextField();
        cvv = new javax.swing.JFormattedTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        totalPagado = new javax.swing.JTextField();
        panelTar = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tar1 = new javax.swing.JTextPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tar2 = new javax.swing.JTextPane();
        finalizarCompra = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre del titular");

        jLabel2.setText("Numero de cuenta");

        jLabel3.setText("codigo cvv");

        dia.setText("0");

        mes.setText("0");

        anio.setText("0");
        anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioActionPerformed(evt);
            }
        });

        jLabel4.setText("Fecha vencimiento");

        jLabel5.setText("Dia");

        jLabel6.setText("Mes");

        jLabel7.setText("Año");

        jLabel8.setText("Monto a pagar");

        pago.setText("0");

        agregarT.setText("Añadir");
        agregarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarTActionPerformed(evt);
            }
        });

        try {
            cuenta.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####-####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            cvv.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        cvv.setText("0  ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titular, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(agregarT)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(cuenta)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(desplegable, javax.swing.GroupLayout.Alignment.LEADING, 0, 290, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel5)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(26, 26, 26)
                                        .addComponent(jLabel7))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pago, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(desplegable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(titular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cvv, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pago, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(agregarT)
                .addContainerGap())
        );

        jLabel9.setText("Monto total");

        jLabel10.setText("Monto pagado");

        panelTar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)), "Tarjetas agregadas"));

        tar1.setEditable(false);
        tar1.setBackground(new java.awt.Color(204, 204, 255));
        tar1.setBorder(null);
        jScrollPane1.setViewportView(tar1);

        tar2.setEditable(false);
        tar2.setBackground(new java.awt.Color(204, 204, 255));
        tar2.setBorder(null);
        jScrollPane2.setViewportView(tar2);

        javax.swing.GroupLayout panelTarLayout = new javax.swing.GroupLayout(panelTar);
        panelTar.setLayout(panelTarLayout);
        panelTarLayout.setHorizontalGroup(
            panelTarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelTarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        panelTarLayout.setVerticalGroup(
            panelTarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
                .addContainerGap())
        );

        finalizarCompra.setText("Finalizar Compra");
        finalizarCompra.setEnabled(false);
        finalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarCompraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(panelTar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalPagado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 43, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(finalizarCompra)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(totalPagado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelTar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(finalizarCompra)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioActionPerformed

    private void agregarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarTActionPerformed
        // TODO add your handling code here:
        String c, t, cv;
        double monto;
        int  d, m, a;
        
        c = cuenta.getText();
        t = titular.getText();
        cv =cvv.getText();
        monto = Double.parseDouble(pago.getText());
        d = Integer.parseInt(dia.getText());
        m = Integer.parseInt(mes.getText());
        a = Integer.parseInt(anio.getText());
        if(!c.equals("") && !t.equals("") && !cv.equals("") && monto > 0 ){
            if(desplegable.getSelectedItem().toString().equals("Tarjeta de credito")){
                if(verificarFecha(d,m,a)){
                    Tarjeta tar = new Tarjeta();
                    tar.setTitular(t);
                    tar.setNumero(c);
                    tar.setCvv(cv);
                    tar.setDia(d);
                    tar.setMes(m);
                    tar.setAnio(a);
                    tar.setTipo("TARJETA DE CREDITO");
                    
                    if(numTar == 2){
                       tar2.setVisible(true);
                       tar2.setText("=== TARJETA DE CREDITO ===\nNumero:  "+tar.getNumero()+"\nTitular: "+tar.getTitular());
                       numTar--;   
                       llenarDes(2);
                       tarjetas[0] = tar;
                    }else{
                        if(tar2.isVisible()){
                            tar1.setVisible(true);
                            tar1.setText("=== TARJETA DE CREDITO ===\nNumero:  "+tar.getNumero()+"\nTitular: "+tar.getTitular());
                            tarjetas[1] = tar;
                        }else{
                            tar2.setVisible(true);
                            tar2.setText("=== TARJETA DE CREDITO ===\nNumero:  "+tar.getNumero()+"\nTitular: "+tar.getTitular());
                            tarjetas[0] = tar;
                        }  
                    }
                    
                    compra.setTotalPagado(compra.getTotalPagado()+ Double.parseDouble(pago.getText()));
                    limpiarDatos();
                    llenarOtros();
                    
                }else{
                    JOptionPane.showMessageDialog(null, "Esta tarjeta ya esta vencida");
                }
            }else{
                Tarjeta tar = new Tarjeta();
                    tar.setTitular(t);
                    tar.setNumero(c);
                    tar.setCvv(cv);
                    tar.setDia(d);
                    tar.setMes(m);
                    tar.setAnio(a);
                    tar.setTipo("TARJETA DE DEBITO");
                    JLabel label = new JLabel();
                    label.setText(tar.getNumero());
                    label.setVisible(true);
                    if(numTar == 2){
                       tar2.setVisible(true);
                       tar2.setText("=== TARJETA DE DEBITO ===\nNumero:  "+tar.getNumero()+"\nTitular: "+tar.getTitular());
                       numTar--;   
                       llenarDes(1);
                       tarjetas[0] = tar;
                    }else{
                        if(tar2.isVisible()){
                            tar1.setVisible(true);
                            tar1.setText("=== TARJETA DE DEBITO ===\nNumero:  "+tar.getNumero()+"\nTitular: "+tar.getTitular());
                            tarjetas[1] = tar;
                        }else{
                            tar2.setVisible(true);
                            tar2.setText("=== TARJETA DE DEBITO ===\nNumero:  "+tar.getNumero()+"\nTitular: "+tar.getTitular());
                            tarjetas[0] = tar;
                        }  
                    }
                    compra.setTotalPagado(compra.getTotalPagado()+ Double.parseDouble(pago.getText()));
                    limpiarDatos();
                    llenarOtros();
            }
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Faltan datos por llevar");
        }
        
    }//GEN-LAST:event_agregarTActionPerformed

    private void finalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarCompraActionPerformed
        // TODO add your handling code here:
        compra.setTarjeta(tarjetas);
        compra.setTipoCompra("Pagado");
        compras.add(compra);
        actualizarRanking();
        Factura.facturar = compra;
        Factura f = new Factura();
        f.setVisible(true);
        dispose();
    }//GEN-LAST:event_finalizarCompraActionPerformed
    
    public void actualizarRanking(){
        Iterator it = ranking.iterator();
        while(it.hasNext()){
            Ranking rk = (Ranking)it.next();
            if(rk.getNombre().equals(compra.getNombre())){
                rk.setCantidad(rk.getCantidad()+compra.getCantidad());
            }
        }
    }
    public boolean verificarFecha(int d, int m, int a){
        
        boolean sw = false;
        if(d>0 && d<32 && m>0 &&m<13 &&a>0){
            Date f = new Date();
            int aD = f.getDate();
            int aM = f.getMonth()+1;
            int aA = f.getYear()+1900;
            
            if(a-aA > 0){
                sw = true;
            }else if(a-aA == 0 && m-aM > 0){
                sw = true;
            }else if(a-aA == 0 && m-aM == 0 && d-aD > 0){
                sw =true;
            }
            
        }
        return sw;
    }
    
    public void limpiarDatos(){
        cuenta.setText("");
        titular.setText("");
        cvv.setText("0");
        dia.setText("0");
        mes.setText("0");
        anio.setText("0");
    }
    public void llenarOtros(){
        total.setEditable(false);
        total.setText(""+compra.getTotalPagar());
        totalPagado.setEditable(false);
        totalPagado.setText(""+compra.getTotalPagado());
        double p = compra.getTotalPagar() - compra.getTotalPagado();
        
        if(p >0 ){
            finalizarCompra.setEnabled(false);
        }else{
            finalizarCompra.setEnabled(true);
            agregarT.setEnabled(false);
            finalizarCompra.setBackground(Color.GREEN);
        }
        if(numTar == 2){
            pago.setEditable(true);
            
        }else{
            pago.setEditable(false);

            pago.setText(""+p);
            
        }
        
        
    }
    public void llenarDes(int n){
       
        desplegable.removeAllItems();
        if(n == 1){
            desplegable.addItem("Tarjeta de credito");
            numTar = 1;
        }
        if(n ==2) {
            desplegable.addItem("Tarjeta debito");
            numTar = 1;
        }
        if(n ==3){
            desplegable.addItem("Tarjeta de credito");
            desplegable.addItem("Tarjeta debito");
            numTar = 2;
        }
    }
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
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Pagos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pagos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarT;
    private javax.swing.JTextField anio;
    private javax.swing.JFormattedTextField cuenta;
    private javax.swing.JFormattedTextField cvv;
    private javax.swing.JComboBox<String> desplegable;
    private javax.swing.JTextField dia;
    private javax.swing.JButton finalizarCompra;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField mes;
    private javax.swing.JTextField pago;
    private javax.swing.JPanel panelTar;
    private javax.swing.JTextPane tar1;
    private javax.swing.JTextPane tar2;
    private javax.swing.JTextField titular;
    private javax.swing.JTextField total;
    private javax.swing.JTextField totalPagado;
    // End of variables declaration//GEN-END:variables
}
