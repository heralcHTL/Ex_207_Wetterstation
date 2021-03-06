/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import bl.WeatherStation;

/**
 *
 * @author Alex
 */
public class WeatherStationDialog extends javax.swing.JDialog {

    private WeatherStation ws;
    private boolean ok = true;
    /**
     * Creates new form WeatherStationDialog
     */
    public WeatherStationDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        tfPlace = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfSeaLevel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfTemperature = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfHumidity = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout(5, 2));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Place");
        getContentPane().add(jLabel1);

        tfPlace.setText("Feldbach");
        getContentPane().add(tfPlace);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Sea Level");
        getContentPane().add(jLabel2);

        tfSeaLevel.setText("282");
        getContentPane().add(tfSeaLevel);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Temperature");
        getContentPane().add(jLabel3);

        tfTemperature.setText("12");
        getContentPane().add(tfTemperature);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("rel. Humidity");
        getContentPane().add(jLabel4);

        tfHumidity.setText("92");
        getContentPane().add(tfHumidity);

        jButton1.setText("OK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onOK(evt);
            }
        });
        getContentPane().add(jButton1);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCancel(evt);
            }
        });
        getContentPane().add(jButton2);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onOK(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onOK
        // TODO add your handling code here:
        ws = new WeatherStation(tfPlace.getText(), Integer.parseInt(tfSeaLevel.getText()), Double.parseDouble(tfTemperature.getText()), Integer.parseInt(tfHumidity.getText()));
        ok = true;
        this.dispose();
    }//GEN-LAST:event_onOK

    private void onCancel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCancel
        // TODO add your handling code here:
        ok = false;
        this.dispose();
    }//GEN-LAST:event_onCancel

    public WeatherStation getWs() {
        return ws;
    }

    public boolean isOk() {
        return ok;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try
        {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels())
            {
                if ("Nimbus".equals(info.getName()))
                {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex)
        {
            java.util.logging.Logger.getLogger(WeatherStationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex)
        {
            java.util.logging.Logger.getLogger(WeatherStationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex)
        {
            java.util.logging.Logger.getLogger(WeatherStationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex)
        {
            java.util.logging.Logger.getLogger(WeatherStationDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                WeatherStationDialog dialog = new WeatherStationDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField tfHumidity;
    private javax.swing.JTextField tfPlace;
    private javax.swing.JTextField tfSeaLevel;
    private javax.swing.JTextField tfTemperature;
    // End of variables declaration//GEN-END:variables
}
