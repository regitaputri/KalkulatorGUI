/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kalkulatorgui;

/**
 *
 * @author ASUS
 */
public class kalkulator extends javax.swing.JFrame {
    private double total1 ;
    private double total2 ;
    private char math_operator;
    String angka = "";
    double jumlah, angka1, angka2;
    int pilih;

    /**
     * Creates new form kalkulator
     */
    public kalkulator() {
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

        jButton24 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        text1 = new javax.swing.JTextField();
        nol = new javax.swing.JButton();
        desimal = new javax.swing.JButton();
        tambah = new javax.swing.JButton();
        satu = new javax.swing.JButton();
        dua = new javax.swing.JButton();
        tiga = new javax.swing.JButton();
        kurang = new javax.swing.JButton();
        empat = new javax.swing.JButton();
        lima = new javax.swing.JButton();
        enam = new javax.swing.JButton();
        kali = new javax.swing.JButton();
        tujuh = new javax.swing.JButton();
        delapan = new javax.swing.JButton();
        sembilan = new javax.swing.JButton();
        bagi = new javax.swing.JButton();
        backspace = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        clearentry = new javax.swing.JButton();
        plusmin = new javax.swing.JButton();
        hasil = new javax.swing.JButton();
        persen = new javax.swing.JButton();

        jButton24.setText(".");

        jButton19.setText("1");

        jButton13.setText("*");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 255, 204));
        jPanel1.setLayout(null);

        text1.setEditable(false);
        text1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                text1ActionPerformed(evt);
            }
        });
        jPanel1.add(text1);
        text1.setBounds(20, 10, 260, 70);

        nol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        nol.setText("0");
        nol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nolActionPerformed(evt);
            }
        });
        jPanel1.add(nol);
        nol.setBounds(10, 400, 130, 50);

        desimal.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        desimal.setText(".");
        desimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desimalActionPerformed(evt);
            }
        });
        jPanel1.add(desimal);
        desimal.setBounds(150, 400, 60, 50);

        tambah.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tambah.setText("+");
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(10, 160, 60, 50);

        satu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        satu.setText("1");
        satu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                satuActionPerformed(evt);
            }
        });
        jPanel1.add(satu);
        satu.setBounds(10, 340, 60, 50);

        dua.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dua.setText("2");
        dua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                duaActionPerformed(evt);
            }
        });
        jPanel1.add(dua);
        dua.setBounds(80, 340, 60, 50);

        tiga.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tiga.setText("3");
        tiga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tigaActionPerformed(evt);
            }
        });
        jPanel1.add(tiga);
        tiga.setBounds(150, 340, 60, 50);

        kurang.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kurang.setText("-");
        kurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kurangActionPerformed(evt);
            }
        });
        jPanel1.add(kurang);
        kurang.setBounds(80, 160, 60, 50);

        empat.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        empat.setText("4");
        empat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empatActionPerformed(evt);
            }
        });
        jPanel1.add(empat);
        empat.setBounds(10, 280, 60, 50);

        lima.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lima.setText("5");
        lima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limaActionPerformed(evt);
            }
        });
        jPanel1.add(lima);
        lima.setBounds(80, 280, 60, 50);

        enam.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        enam.setText("6");
        enam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enamActionPerformed(evt);
            }
        });
        jPanel1.add(enam);
        enam.setBounds(150, 280, 60, 50);

        kali.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        kali.setText("*");
        kali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kaliActionPerformed(evt);
            }
        });
        jPanel1.add(kali);
        kali.setBounds(150, 160, 60, 50);

        tujuh.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tujuh.setText("7");
        tujuh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tujuhActionPerformed(evt);
            }
        });
        jPanel1.add(tujuh);
        tujuh.setBounds(10, 220, 60, 50);

        delapan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        delapan.setText("8");
        delapan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delapanActionPerformed(evt);
            }
        });
        jPanel1.add(delapan);
        delapan.setBounds(80, 220, 60, 50);

        sembilan.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        sembilan.setText("9");
        sembilan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sembilanActionPerformed(evt);
            }
        });
        jPanel1.add(sembilan);
        sembilan.setBounds(150, 220, 60, 50);

        bagi.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bagi.setText("/");
        bagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bagiActionPerformed(evt);
            }
        });
        jPanel1.add(bagi);
        bagi.setBounds(220, 160, 60, 50);

        backspace.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        backspace.setText("←");
        backspace.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backspaceActionPerformed(evt);
            }
        });
        jPanel1.add(backspace);
        backspace.setBounds(10, 100, 60, 50);

        clear.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clear.setText("C");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(80, 100, 60, 50);

        clearentry.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        clearentry.setText("CE");
        jPanel1.add(clearentry);
        clearentry.setBounds(150, 100, 60, 50);

        plusmin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        plusmin.setText("±");
        jPanel1.add(plusmin);
        plusmin.setBounds(220, 100, 60, 50);

        hasil.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        hasil.setText("=");
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        jPanel1.add(hasil);
        hasil.setBounds(220, 280, 60, 170);

        persen.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        persen.setText("%");
        persen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                persenActionPerformed(evt);
            }
        });
        jPanel1.add(persen);
        persen.setBounds(220, 220, 60, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 400, 470);

        setSize(new java.awt.Dimension(315, 504));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void text1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_text1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_text1ActionPerformed

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(text1.getText());
        text1.setText("");
    }
    private void nolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nolActionPerformed
        // TODO add your handling code here:
        String nolText = text1.getText()+nol.getText();
        text1.setText(nolText);
    }//GEN-LAST:event_nolActionPerformed

    private void satuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_satuActionPerformed
        // TODO add your handling code here:
         String satuText = text1.getText()+satu.getText();
        text1.setText(satuText);
    }//GEN-LAST:event_satuActionPerformed

    private void duaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_duaActionPerformed
        // TODO add your handling code here:
         String duaText = text1.getText()+dua.getText();
        text1.setText(duaText);
    }//GEN-LAST:event_duaActionPerformed

    private void tigaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tigaActionPerformed
        // TODO add your handling code here:
         String tigaText = text1.getText()+tiga.getText();
        text1.setText(tigaText);
    }//GEN-LAST:event_tigaActionPerformed

    private void empatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empatActionPerformed
        // TODO add your handling code here:
         String empatText = text1.getText()+empat.getText();
        text1.setText(empatText);
    }//GEN-LAST:event_empatActionPerformed

    private void limaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limaActionPerformed
        // TODO add your handling code here:
         String limaText = text1.getText()+lima.getText();
        text1.setText(limaText);
    }//GEN-LAST:event_limaActionPerformed

    private void enamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enamActionPerformed
        // TODO add your handling code here:
         String enamText = text1.getText()+enam.getText();
        text1.setText(enamText);
    }//GEN-LAST:event_enamActionPerformed

    private void tujuhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tujuhActionPerformed
        // TODO add your handling code here:
         String tujuhText = text1.getText()+tujuh.getText();
        text1.setText(tujuhText);
    }//GEN-LAST:event_tujuhActionPerformed

    private void delapanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delapanActionPerformed
        // TODO add your handling code here:
         String delapanText = text1.getText()+delapan.getText();
        text1.setText(delapanText);
    }//GEN-LAST:event_delapanActionPerformed

    private void sembilanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sembilanActionPerformed
        // TODO add your handling code here:
         String sembilanText = text1.getText()+sembilan.getText();
        text1.setText(sembilanText);
    }//GEN-LAST:event_sembilanActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        // TODO add your handling code here:
        total2 = 0;
        text1.setText("");
    }//GEN-LAST:event_clearActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
        // TODO add your handling code here:
        switch (math_operator){
            case '+':
                total2 = total1 + Double.parseDouble(text1.getText());
                break;
                
            case '-':
                total2 = total1 - Double.parseDouble(text1.getText());
                break;
                
            case '*':
                total2 = total1 * Double.parseDouble(text1.getText());
                break;
                
            case '/':
                total2 = total1 / Double.parseDouble(text1.getText());
                break;
                
            case '%':
                jumlah = angka1*1/100;
                angka = Double.toString(jumlah);
                text1.setText(angka);
                break;
                
                
        }
        text1.setText(Double.toString(total2));
        total1 = 0;
        
    }//GEN-LAST:event_hasilActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        String button_text = tambah.getText();
        getOperator(button_text);
        text1.setText("+");
    }//GEN-LAST:event_tambahActionPerformed

    private void kurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kurangActionPerformed
        // TODO add your handling code here:
        String button_text = kurang.getText();
        getOperator(button_text);
        text1.setText("-");
    }//GEN-LAST:event_kurangActionPerformed

    private void kaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kaliActionPerformed
        // TODO add your handling code here:
        String button_text = kali.getText();
        getOperator(button_text);
        text1.setText("*");
    }//GEN-LAST:event_kaliActionPerformed

    private void bagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bagiActionPerformed
        // TODO add your handling code here:
        String button_text = bagi.getText();
        getOperator(button_text);
        text1.setText("/");
    }//GEN-LAST:event_bagiActionPerformed

    private void desimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desimalActionPerformed
        // TODO add your handling code here:
        text1.setText(text1.getText()+".");
    }//GEN-LAST:event_desimalActionPerformed

    private void backspaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backspaceActionPerformed
        //TODO add your handling code here:
        int length = text1.getText().length();
        int number = text1.getText().length()-1;
        String store;
        
        if (length>0);
        {
            StringBuilder back = new StringBuilder(text1.getText());
            back.deleteCharAt(number);
            store = back.toString();
            text1.setText(store);
        }
    }//GEN-LAST:event_backspaceActionPerformed

    private void persenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_persenActionPerformed
       jumlah = Double.parseDouble(text1.getText())*1/100;
                angka = Double.toString(jumlah);
                text1.setText(angka);
                text1.setText("%");
    }//GEN-LAST:event_persenActionPerformed

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
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backspace;
    private javax.swing.JButton bagi;
    private javax.swing.JButton clear;
    private javax.swing.JButton clearentry;
    private javax.swing.JButton delapan;
    private javax.swing.JButton desimal;
    private javax.swing.JButton dua;
    private javax.swing.JButton empat;
    private javax.swing.JButton enam;
    private javax.swing.JButton hasil;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kali;
    private javax.swing.JButton kurang;
    private javax.swing.JButton lima;
    private javax.swing.JButton nol;
    private javax.swing.JButton persen;
    private javax.swing.JButton plusmin;
    private javax.swing.JButton satu;
    private javax.swing.JButton sembilan;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField text1;
    private javax.swing.JButton tiga;
    private javax.swing.JButton tujuh;
    // End of variables declaration//GEN-END:variables
}
