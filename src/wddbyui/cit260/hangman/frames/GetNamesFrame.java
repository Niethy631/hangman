/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wddbyui.cit260.hangman.frames;

import java.io.IOException;
import wddbyui.cit260.hangman.enums.ErrorType;
import wddbyui.cit260.hangman.exceptions.HangmanException;
import wddbyui.cit260.hangman.exceptions.MenuException;
import wddbyui.cit260.hangman.game.Game;
import wddbyui.cit260.hangman.game.Hangman;
import wddbyui.cit260.hangman.game.PlayerName;

/**
 *
 * @author gerrygj
 */
public class GetNamesFrame extends javax.swing.JFrame { //Paired Lesson 12, Lorna & Gerald

    private Game game = new Game();
    private PlayerName playerName = new PlayerName();
    
    /**
     * Creates new form GetNamesFrame
     */
    public GetNamesFrame() {
        initComponents();
        //this.game = game;
        //setLocationRelativeTo(null);
    }

    //public GetNamesFrame() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpForm = new javax.swing.JPanel();
        jNameLabel = new javax.swing.JLabel();
        jNameTextField = new javax.swing.JTextField();
        jNameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpForm.setBackground(new java.awt.Color(204, 204, 255));
        jpForm.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(66, 66, 166), 2, true));

        jNameLabel.setFont(new java.awt.Font("Minion Pro", 0, 24)); // NOI18N
        jNameLabel.setForeground(new java.awt.Color(61, 61, 155));
        jNameLabel.setText("Please enter your name:");

        jNameTextField.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N

        jNameButton.setFont(new java.awt.Font("Myriad Web Pro", 0, 16)); // NOI18N
        jNameButton.setText("Submit");
        jNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFormLayout = new javax.swing.GroupLayout(jpForm);
        jpForm.setLayout(jpFormLayout);
        jpFormLayout.setHorizontalGroup(
            jpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFormLayout.createSequentialGroup()
                        .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jNameButton))
                    .addComponent(jNameLabel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpFormLayout.setVerticalGroup(
            jpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFormLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jNameLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jNameButton)
                    .addComponent(jNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNameButtonActionPerformed
        
        playerName.promptName(this.jNameTextField.getText());
        this.dispose();
        // need to display player's name
        
     /*   try {
            game.playTheGame();
        } catch (IOException | MenuException | HangmanException e) {
            System.out.println(ErrorType.FATAL_ERROR.getMessage()
                + "\n" + e.getStackTrace().toString());
        }
        */
        GameFrame gameFrame = new GameFrame();
        gameFrame.setVisible(true);
    }//GEN-LAST:event_jNameButtonActionPerformed

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
            java.util.logging.Logger.getLogger(GetNamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GetNamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GetNamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GetNamesFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GetNamesFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jNameButton;
    private javax.swing.JLabel jNameLabel;
    private javax.swing.JTextField jNameTextField;
    private javax.swing.JPanel jpForm;
    // End of variables declaration//GEN-END:variables
}
