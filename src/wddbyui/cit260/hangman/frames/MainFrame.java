/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wddbyui.cit260.hangman.frames;

import wddbyui.cit260.hangman.menus.MainMenuControl;

/**
 *
 * @author gerrygj
 */
public class MainFrame extends javax.swing.JFrame { //Paired Lesson 12, Lorna & Gerald
    
    private MainMenuControl mainMenuControl = new MainMenuControl();
    //private Game game = new Game();

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        jpBody = new javax.swing.JPanel();
        jpTitle = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jpContinueButton = new javax.swing.JButton();
        jpInstructionsButton = new javax.swing.JButton();
        jExitButton = new javax.swing.JButton();
        jpStartButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtWelcome = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setName("jpBody"); // NOI18N

        jpBody.setBackground(new java.awt.Color(204, 204, 255));
        jpBody.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 66, 166), 2, true));
        jpBody.setFont(new java.awt.Font("Myriad Web Pro", 0, 11)); // NOI18N

        jpTitle.setFont(new java.awt.Font("Minion Pro SmBd", 0, 36)); // NOI18N
        jpTitle.setForeground(new java.awt.Color(61, 61, 155));
        jpTitle.setText("Hangman");
        jpTitle.setName("jpTitle"); // NOI18N

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jpContinueButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpContinueButton.setText("Continue Playing");
        jpContinueButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpContinueButtonActionPerformed(evt);
            }
        });

        jpInstructionsButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jpInstructionsButton.setText("Display Instructions");
        jpInstructionsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpInstructionsButtonActionPerformed(evt);
            }
        });

        jExitButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jExitButton.setText("Exit Game");
        jExitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jExitButtonActionPerformed(evt);
            }
        });

        jpStartButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jpStartButton.setText("Start Game");
        jpStartButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jpStartButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jExitButton)
                .addGap(41, 41, 41))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpStartButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jpContinueButton, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpInstructionsButton)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jpStartButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpContinueButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpInstructionsButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jExitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jtWelcome.setBackground(new java.awt.Color(255, 247, 222));
        jtWelcome.setColumns(20);
        jtWelcome.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jtWelcome.setLineWrap(true);
        jtWelcome.setRows(5);
        jtWelcome.setText("Welcome to the game of Hangman!\n\nYou will be playing against the computer. The object of the game is to correctly guess all the letters of the mystery word before you are hung.\n\nGood Luck!!!");
        jtWelcome.setWrapStyleWord(true);
        jScrollPane1.setViewportView(jtWelcome);

        javax.swing.GroupLayout jpBodyLayout = new javax.swing.GroupLayout(jpBody);
        jpBody.setLayout(jpBodyLayout);
        jpBodyLayout.setHorizontalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpBodyLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpTitle)
                .addGap(119, 119, 119))
        );
        jpBodyLayout.setVerticalGroup(
            jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBodyLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jpTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpBodyLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBody, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jpInstructionsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpInstructionsButtonActionPerformed
        InstructionsFrame instructionsFrame = new InstructionsFrame();
        instructionsFrame.setVisible(true);
    }//GEN-LAST:event_jpInstructionsButtonActionPerformed

    private void jExitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jExitButtonActionPerformed
        this.dispose(); //exit the game
    }//GEN-LAST:event_jExitButtonActionPerformed

    private void jpContinueButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpContinueButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jpContinueButtonActionPerformed

    private void jpStartButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jpStartButtonActionPerformed
        
        GetNamesFrame getNamesFrame = new GetNamesFrame();
        getNamesFrame.setVisible(true);
        this.dispose();
        
        /*try {
            game.playTheGame();
        } catch (IOException | MenuException | HangmanException e) {
            System.out.println(ErrorType.FATAL_ERROR.getMessage()
                + "\n" + e.getStackTrace().toString());
        }*/
        
    }//GEN-LAST:event_jpStartButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jExitButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpBody;
    private javax.swing.JButton jpContinueButton;
    private javax.swing.JButton jpInstructionsButton;
    private javax.swing.JButton jpStartButton;
    private javax.swing.JLabel jpTitle;
    private javax.swing.JTextArea jtWelcome;
    // End of variables declaration//GEN-END:variables
}
