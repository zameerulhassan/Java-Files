/*
This is class that creates JFrame adds JPanel as GridLayout.
 */
package GamePackage;
import java.awt.*;
import static java.awt.AWTEventMulticaster.add;
import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PlayGame extends javax.swing.JFrame {
    

    // this package contains 2 classes, i.e. -> PlayGame.java & Input.java
    public PlayGame() {
        initComponents();
        
        grid = new JButton[8][8]; // creating a grid of 8 x 8
        
        
        grid[0][0] = jButton1;
        grid[0][1] = jButton2;
        grid[0][2] = jButton3;
        grid[0][3] = jButton4;
        grid[0][4] = jButton5;
        grid[0][5] = jButton6;
        grid[0][6] = jButton7;
        grid[0][7] = jButton8;
        
        grid[1][0] = jButton9;
        grid[1][1] = jButton10;
        grid[1][2] = jButton11;
        grid[1][3] = jButton12;
        grid[1][4] = jButton13;
        grid[1][5] = jButton14;
        grid[1][6] = jButton15;
        grid[1][7] = jButton16;
        
        grid[2][0] = jButton17;
        grid[2][1] = jButton18;
        grid[2][2] = jButton19;
        grid[2][3] = jButton20;
        grid[2][4] = jButton21;
        grid[2][5] = jButton22;
        grid[2][6] = jButton23;
        grid[2][7] = jButton24;
        
        grid[3][0] = jButton25;
        grid[3][1] = jButton26;
        grid[3][2] = jButton27;
        grid[3][3] = jButton28;
        grid[3][4] = jButton29;
        grid[3][5] = jButton30;
        grid[3][6] = jButton31;
        grid[3][7] = jButton32;
        
        grid[4][0] = jButton33;
        grid[4][1] = jButton34;
        grid[4][2] = jButton35;
        grid[4][3] = jButton36;
        grid[4][4] = jButton37;
        grid[4][5] = jButton38;
        grid[4][6] = jButton39;
        grid[4][7] = jButton40;
        
        grid[5][0] = jButton41;
        grid[5][1] = jButton42;
        grid[5][2] = jButton43;
        grid[5][3] = jButton44;
        grid[5][4] = jButton45;
        grid[5][5] = jButton46;
        grid[5][6] = jButton47;
        grid[5][7] = jButton48;
        
        grid[6][0] = jButton49;
        grid[6][1] = jButton50;
        grid[6][2] = jButton51;
        grid[6][3] = jButton52;
        grid[6][4] = jButton53;
        grid[6][5] = jButton54;
        grid[6][6] = jButton55;
        grid[6][7] = jButton56;
        
        grid[7][0] = jButton57;
        grid[7][1] = jButton58;
        grid[7][2] = jButton59;
        grid[6][3] = jButton60;
        grid[6][4] = jButton61;
        grid[6][5] = jButton62;
        grid[6][6] = jButton63;
        grid[6][7] = jButton64;
        
    }

  
    @SuppressWarnings({"unchecked", "Convert2Lambda"})
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton18 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jButton47 = new javax.swing.JButton();
        jButton33 = new javax.swing.JButton();
        jButton57 = new javax.swing.JButton();
        jButton53 = new javax.swing.JButton();
        jButton58 = new javax.swing.JButton();
        jButton52 = new javax.swing.JButton();
        jButton51 = new javax.swing.JButton();
        jButton50 = new javax.swing.JButton();
        jButton32 = new javax.swing.JButton();
        jButton29 = new javax.swing.JButton();
        jButton41 = new javax.swing.JButton();
        jButton60 = new javax.swing.JButton();
        jButton64 = new javax.swing.JButton();
        jButton63 = new javax.swing.JButton();
        jButton62 = new javax.swing.JButton();
        jButton59 = new javax.swing.JButton();
        jButton54 = new javax.swing.JButton();
        jButton39 = new javax.swing.JButton();
        jButton49 = new javax.swing.JButton();
        jButton48 = new javax.swing.JButton();
        jButton35 = new javax.swing.JButton();
        jButton45 = new javax.swing.JButton();
        jButton44 = new javax.swing.JButton();
        jButton56 = new javax.swing.JButton();
        jButton55 = new javax.swing.JButton();
        jButton43 = new javax.swing.JButton();
        jButton28 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jButton25 = new javax.swing.JButton();
        jButton61 = new javax.swing.JButton();
        jButton46 = new javax.swing.JButton();
        jButton40 = new javax.swing.JButton();
        jButton37 = new javax.swing.JButton();
        jButton42 = new javax.swing.JButton();
        jButton38 = new javax.swing.JButton();
        jButton31 = new javax.swing.JButton();
        jButton36 = new javax.swing.JButton();
        jButton30 = new javax.swing.JButton();
        jButton34 = new javax.swing.JButton();
        jButton17 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton27 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton24 = new javax.swing.JButton();
        jButton23 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tic_Tac_Toe for Three Players (Developed By Zam)");
        setAlwaysOnTop(true);
        setFont(new java.awt.Font("Adobe Devanagari", 1, 18)); // NOI18N
        setLocationByPlatform(true);
        setMaximumSize(new java.awt.Dimension(1000, 800));
        setMinimumSize(new java.awt.Dimension(900, 700));
        setSize(new java.awt.Dimension(900, 700));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 500));
        jPanel1.setLayout(new java.awt.GridLayout(8, 8, 2, 3));

        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);

        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);

        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton9);

        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8);

        jButton18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton18ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton18);

        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton15);

        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton13);

        jButton22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton22ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton22);

        jButton21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton21ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton21);

        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton19);

        jButton47.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton47ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton47);

        jButton33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton33ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton33);

        jButton57.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton57ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton57);

        jButton53.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton53ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton53);

        jButton58.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton58ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton58);

        jButton52.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton52ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton52);

        jButton51.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton51ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton51);

        jButton50.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton50ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton50);

        jButton32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton32ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton32);

        jButton29.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton29ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton29);

        jButton41.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton41ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton41);

        jButton60.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton60ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton60);

        jButton64.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton64ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton64);

        jButton63.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton63ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton63);

        jButton62.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton62ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton62);

        jButton59.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton59ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton59);

        jButton54.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton54ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton54);

        jButton39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton39ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton39);

        jButton49.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton49ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton49);

        jButton48.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton48ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton48);

        jButton35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton35ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton35);

        jButton45.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton45ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton45);

        jButton44.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton44ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton44);

        jButton56.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton56ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton56);

        jButton55.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton55ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton55);

        jButton43.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton43ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton43);

        jButton28.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton28ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton28);

        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton26);

        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton25);

        jButton61.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton61ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton61);

        jButton46.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton46ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton46);

        jButton40.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton40ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton40);

        jButton37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton37ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton37);

        jButton42.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton42ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton42);

        jButton38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton38ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton38);

        jButton31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton31ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton31);

        jButton36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton36ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton36);

        jButton30.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton30ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton30);

        jButton34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton34ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton34);

        jButton17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton17ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton17);

        jButton16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton16ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton16);

        jButton27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton27ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton27);

        jButton20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton20ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton20);

        jButton24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton24ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton24);

        jButton23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton23ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton23);

        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton12);

        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton10);

        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);

        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton14);

        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton11);

        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);

        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JButton button = (JButton) evt.getSource();
        selectButton(button);
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
       
    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
     
    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton58ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton58ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
        
    }//GEN-LAST:event_jButton58ActionPerformed

    private void jButton64ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton64ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
       
    }//GEN-LAST:event_jButton64ActionPerformed

    private void jButton35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton35ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
        
    }//GEN-LAST:event_jButton35ActionPerformed

    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
       
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton36ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
        
    }//GEN-LAST:event_jButton36ActionPerformed

    private void jButton23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton23ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
       
    }//GEN-LAST:event_jButton23ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
        
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton53ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton53ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
       
    }//GEN-LAST:event_jButton53ActionPerformed

    private void jButton60ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton60ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
       
    }//GEN-LAST:event_jButton60ActionPerformed

    private void jButton48ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton48ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton48ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jButton31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton31ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton31ActionPerformed

    private void jButton24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton24ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton24ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton18ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton18ActionPerformed

    private void jButton57ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton57ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton57ActionPerformed

    private void jButton41ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton41ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton41ActionPerformed

    private void jButton49ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton49ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton49ActionPerformed

    private void jButton28ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton28ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton28ActionPerformed

    private void jButton38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton38ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton38ActionPerformed

    private void jButton20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton20ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton20ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton33ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton33ActionPerformed

    private void jButton29ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton29ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton29ActionPerformed

    private void jButton39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton39ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton39ActionPerformed

    private void jButton43ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton43ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton43ActionPerformed

    private void jButton42ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton42ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton42ActionPerformed

    private void jButton27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton27ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton27ActionPerformed

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton47ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton47ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton47ActionPerformed

    private void jButton32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton32ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton32ActionPerformed

    private void jButton54ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton54ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton54ActionPerformed

    private void jButton55ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton55ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton55ActionPerformed

    private void jButton37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton37ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton37ActionPerformed

    private void jButton16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton16ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton16ActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton19ActionPerformed

    private void jButton50ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton50ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton50ActionPerformed

    private void jButton59ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton59ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton59ActionPerformed

    private void jButton56ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton56ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton56ActionPerformed

    private void jButton40ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton40ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton40ActionPerformed

    private void jButton17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton17ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton17ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton10ActionPerformed

    private void jButton34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton34ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton34ActionPerformed

    private void jButton46ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton46ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton46ActionPerformed

    private void jButton44ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton44ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton44ActionPerformed

    private void jButton62ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton62ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton62ActionPerformed

    private void jButton51ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton51ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton51ActionPerformed

    private void jButton21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton21ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton21ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton22ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton22ActionPerformed

    private void jButton52ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton52ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton52ActionPerformed

    private void jButton63ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton63ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton63ActionPerformed

    private void jButton45ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton45ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton45ActionPerformed

    private void jButton61ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton61ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton61ActionPerformed

    private void jButton30ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton30ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton30ActionPerformed

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
        JButton button = (JButton) evt.getSource();
        selectButton(button);
    }//GEN-LAST:event_jButton12ActionPerformed

            boolean p1turn =true;
            boolean p2turn =false;
            boolean p3turn = false;
       private void selectButton(JButton button) {
        if (button.getText().equals("")) {
            
             
            if (p1turn){
                    button.setText("X");
                    p1turn = !p1turn;
                    p2turn = !p2turn;
                    }
            else if (p2turn){
                    button.setText("Y");
                    p2turn = !p2turn;
                    p3turn = !p3turn;
                    }
            else if (p3turn){
                    button.setText("Z");
                    p3turn = !p3turn;
                    p1turn = !p1turn;
                    }
                        }
        checkForTheWin();
       }
    // fuction to check for winner
    // create a string for the all rows, columns and diagonals
    // then check to see if there are three in a row for the current player
    public void checkForTheWin() {
        String moves = getRCD();

        if (moves.contains("XXX")) {
            JOptionPane.showMessageDialog(this, "The winner is: Player One");
        }
        if (moves.contains("YYY")) {
            JOptionPane.showMessageDialog(this, "The winner is: Player Two");
        }
        if (moves.contains("ZZZ")) {
            JOptionPane.showMessageDialog(this, "The winner is: Player Three");
        }
    }
 // i tried fixing this search logic- i spent more than three days, really not productive at all.
    //this loop only looks for top left 3x3 for winning logic.
    private String getRCD() {
        String result = "";
        // getting the rows into the result
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                result = result.concat(grid[row][col].getText());
            }
            result = result + " ";
        }

        // getting the columns into the result
        for (int col = 0; col < 3; col++) {
            for (int row = 0; row < 3; row++) {
                result = result.concat(grid[row][col].getText());
            }
            result = result + " ";
        }

        // get diagonal left top to right bottom
        int col = 0;
        for (int row = 0; row < 3; row++,col++) {
            result = result.concat(grid[row][col].getText());
        }
        result = result + " ";
        
        // get diagonal right top to left bottom
        col = 2;
        for (int row = 0; row < 3; row++,col--) {
            result = result.concat(grid[row][col].getText());
        }
        result = result + " ";

        return result;
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
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* this an instance of class "Input" that captures user input like
           Players Names, Their chosen Symbols to mark.*/
        
        Input userInput = new Input(); 
        
        /* 
         the fields of this object 'userInput' are not reachable thru here;
         I have tried all the possible options, but not reachable.
         I wanted to to use Players names, thier symbols to mark buttons.
         Since I could not reach the symbols, so I am marking 'X' for Player one
         'Y' for Player Two and 'Z' for Player-3.
         To be more specific, this instance of class and fields are only available within main()
         NOT available to other methods.
        */

        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlayGame().setVisible(true);
            }
        });
    }
        
    JButton grid[][];
       
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton17;
    private javax.swing.JButton jButton18;
    private javax.swing.JButton jButton19;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JButton jButton23;
    private javax.swing.JButton jButton24;
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JButton jButton27;
    private javax.swing.JButton jButton28;
    private javax.swing.JButton jButton29;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton30;
    private javax.swing.JButton jButton31;
    private javax.swing.JButton jButton32;
    private javax.swing.JButton jButton33;
    private javax.swing.JButton jButton34;
    private javax.swing.JButton jButton35;
    private javax.swing.JButton jButton36;
    private javax.swing.JButton jButton37;
    private javax.swing.JButton jButton38;
    private javax.swing.JButton jButton39;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton40;
    private javax.swing.JButton jButton41;
    private javax.swing.JButton jButton42;
    private javax.swing.JButton jButton43;
    private javax.swing.JButton jButton44;
    private javax.swing.JButton jButton45;
    private javax.swing.JButton jButton46;
    private javax.swing.JButton jButton47;
    private javax.swing.JButton jButton48;
    private javax.swing.JButton jButton49;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton50;
    private javax.swing.JButton jButton51;
    private javax.swing.JButton jButton52;
    private javax.swing.JButton jButton53;
    private javax.swing.JButton jButton54;
    private javax.swing.JButton jButton55;
    private javax.swing.JButton jButton56;
    private javax.swing.JButton jButton57;
    private javax.swing.JButton jButton58;
    private javax.swing.JButton jButton59;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton60;
    private javax.swing.JButton jButton61;
    private javax.swing.JButton jButton62;
    private javax.swing.JButton jButton63;
    private javax.swing.JButton jButton64;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    // I have thried all options including below, to defining another class here with public static fields.
    /*
    public static class userInput {
    public static String p1;
    public static String p2;
    public static String p3;
    
    public static String s1;
    public static String s2;
    public static String s3;
    
    public userInput(){
       String player1 = JOptionPane.showInputDialog(null,
               "Please Enter Name of Player-1:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       p1 = player1;
       String symbolPlayer1 = JOptionPane.showInputDialog(null,
               "Please Enter your Symbol:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       s1 = symbolPlayer1;
       
       String player2 = JOptionPane.showInputDialog(null,
               "Please Enter Name of Player-2:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       p2 = player2;
       String symbolPlayer2 = JOptionPane.showInputDialog(null,
               "Please Enter your Symbol:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       s2 = symbolPlayer2;
       
       String player3 = JOptionPane.showInputDialog(null,
               "Please Enter Name of Player-3:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       p3 = player3;
       String symbolPlayer3 = JOptionPane.showInputDialog(null,
               "Please Enter your Symbol:",
               "Players Names & Symbols",
               JOptionPane.QUESTION_MESSAGE);
       s3 = symbolPlayer3;
       
       //String player2 = JOptionPane.showInputDialog(null, "Please Enter Name of Player-2");
       //String player3 = JOptionPane.showInputDialog(null, "Please Enter Name of Player-3");
    }
    
    // getter
   // public String getSymbol1() { 
    //return s1;
} 
    */
}

