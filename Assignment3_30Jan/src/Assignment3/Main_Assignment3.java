/*

A graphical Java application. Using this application
user will be able to perform some analysis on text. The analysis will allow the user to check if
the data entered is a palindrome and will also report several other statistics of the usage of the
characters that comprises the entered data.

 */
package Assignment3;

/**
 *
 * @author zam
 */
public class Main_Assignment3 extends javax.swing.JFrame {

    
    /**
     * Creates new form Main_Assignment3
     */
    public Main_Assignment3() {
        initComponents();
    }
    // function to check Palindrom
    private String isPalindrome(String original){
        original = jText_input.getText();
        String result;
        String reverse = "";
        String originalLower = original.toLowerCase();
        originalLower = originalLower.replaceAll("[^a-zA-Z]", ""); // removing all no alpha characters.
        //originalLower = originalLower.replaceAll("[a-zA-Z]", ""); // removing all no numbers characters.
     for(int i = originalLower.length()-1; i >=0;i-- ){
         reverse = reverse + originalLower.charAt(i);
     }
       if (originalLower.equals(reverse)){
           result = ("Given String is Palindrom");
       }   
       else {
           result = ("Given String is NOT Palindrom");
       }   
       return result;
       
          
} // end of palindrom method.
    
    
    
    // start of counter methed i.e. stringStats()
    // this method returns an array of integers.
    private int  [] stringStats(String st){
    int digits =0;
    int upperCase =0;
    int lowerCase =0;
    int whiteSpace=0; 
    int controlChar =0;
    int alpha =0;
   

    // getting input string into variable st.
    st = jText_input.getText();
    
    //looping to analyse
    for (int i = 0; i<st.length(); i++){
        if (Character.isDigit(st.charAt(i))){
            digits++;
        }
        if (Character.isUpperCase(st.charAt(i))){
            upperCase++;
        }
        if (Character.isLowerCase(st.charAt(i))){
            lowerCase++;
        }  
        if(Character.isWhitespace(i)) {
            whiteSpace++;
        }
        // could not get better option for control characters.
        if(Character.isISOControl(i)) {
            controlChar++;
        }
        if(Character.isAlphabetic(i)) {
            alpha++;
        }       
}
    int[] A = {upperCase+lowerCase, digits,controlChar, lowerCase, upperCase, whiteSpace};    
    return A;
    }
    //end of counter method i.e stringStats()
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        alphaTXT = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane13 = new javax.swing.JScrollPane();
        numeric_TXT = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        controlTXT = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        lowerTXT = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        upperTXT = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        whiteTXT = new javax.swing.JTextArea();
        jText_input = new javax.swing.JTextField();
        jText_output = new javax.swing.JTextField();
        ANALYSE_BTN = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Assignment 3 (Zam)");

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setText("Please Enter String to analyse ");

        jLabel2.setBackground(new java.awt.Color(204, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("STATISTICS");

        alphaTXT.setColumns(20);
        alphaTXT.setRows(5);
        jScrollPane8.setViewportView(alphaTXT);

        jLabel3.setText("numeric");

        jLabel4.setText("alphabetic");

        jLabel5.setText("control");

        jLabel6.setText("lower");

        jLabel7.setText("upper");

        jLabel8.setText("whitespace");

        jButton2.setText("Show Statistics");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        numeric_TXT.setColumns(20);
        numeric_TXT.setRows(5);
        jScrollPane13.setViewportView(numeric_TXT);

        controlTXT.setColumns(20);
        controlTXT.setRows(5);
        jScrollPane14.setViewportView(controlTXT);

        lowerTXT.setColumns(20);
        lowerTXT.setRows(5);
        jScrollPane15.setViewportView(lowerTXT);

        upperTXT.setColumns(20);
        upperTXT.setRows(5);
        jScrollPane16.setViewportView(upperTXT);

        whiteTXT.setColumns(20);
        whiteTXT.setRows(5);
        jScrollPane17.setViewportView(whiteTXT);

        jText_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_inputActionPerformed(evt);
            }
        });

        jText_output.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jText_outputActionPerformed(evt);
            }
        });

        ANALYSE_BTN.setText("ANALYSE (Palindrome or NOT)");
        ANALYSE_BTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ANALYSE_BTNActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(54, 54, 54)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(40, 40, 40)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(jLabel7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2))
                        .addGap(18, 88, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jText_output, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jText_input)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ANALYSE_BTN)
                                    .addComponent(jLabel1))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jText_input, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jText_output, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ANALYSE_BTN)
                .addGap(52, 52, 52)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane16, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane17, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(169, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // getting input into string;
        stringStats(jText_input.getText());
        int[] B = stringStats(jText_input.getText());
        // geeting output into text fields.
        alphaTXT.setText(Integer.toString(B[0]));
        numeric_TXT.setText(Integer.toString(B[1]));
        controlTXT.setText(Integer.toString(B[2]));
        lowerTXT.setText(Integer.toString(B[3]));
        upperTXT.setText(Integer.toString(B[4]));
        whiteTXT.setText(Integer.toString(B[5]));
       
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jText_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_inputActionPerformed
        // TODO add your handling code here:
         String original = jText_input.getText();
    }//GEN-LAST:event_jText_inputActionPerformed

    private void jText_outputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jText_outputActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jText_outputActionPerformed

    private void ANALYSE_BTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ANALYSE_BTNActionPerformed
        //String original2 = jText_input.getText();
         String original2 = isPalindrome(jText_input.getText());
        // TODO add your handling code here:
        //jText_output.setText(jText_input.getText());
        jText_output.setText(original2);
    }//GEN-LAST:event_ANALYSE_BTNActionPerformed

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
            java.util.logging.Logger.getLogger(Main_Assignment3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main_Assignment3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main_Assignment3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main_Assignment3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main_Assignment3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ANALYSE_BTN;
    private javax.swing.JTextArea alphaTXT;
    private javax.swing.JTextArea controlTXT;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextField jText_input;
    private javax.swing.JTextField jText_output;
    private javax.swing.JTextArea lowerTXT;
    private javax.swing.JTextArea numeric_TXT;
    private javax.swing.JTextArea upperTXT;
    private javax.swing.JTextArea whiteTXT;
    // End of variables declaration//GEN-END:variables


}