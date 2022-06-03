/**
 * @author 
 *
 *   /\_/\  _     ___
 *  |>'v'<||"| -/\, ,`>
 *     -=Edelstein=-
 * 
 */
public class mainGUI extends javax.swing.JFrame {
    //"inspirational quotes"
    final String QUOTE_ONE   = "one";
    final String QUOTE_TWO   = "two";
    final String QUOTE_THREE = "three";
    final String QUOTE_FOUR  = "four";
    final String QUOTE_FIVE  = "five";
    final String QUOTE_SIX   = "six";
    final String QUOTE_SEVEN = "seven";
    final String QUOTE_EIGHT = "eight";
    
    final String[] quotes = {"One","Two", "Three", "Four", "Five", "Six", "Seven", "Eight"};
    
    
    public mainGUI() {
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

        generateButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        quoteOutput = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generateButton.setText("Generate Quote");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Liberation Sans", 1, 16)); // NOI18N
        jLabel1.setText("Positive Practice!");

        quoteOutput.setText("    ");

        jLabel3.setText("Click generate if you want to be inspired!");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sickVibes.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(generateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(quoteOutput)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(generateButton)
                .addGap(18, 18, 18)
                .addComponent(quoteOutput)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        //predefined methods
        int methodValue = (int)Math.round(Math.random()*1+1);
        int quoteValue = (int)Math.round(Math.random()*7+1);
        
        switch (methodValue) {
            //Inefficent way of doing things
            case 1:
                switch(quoteValue){
                    case 1:
                        quoteOutput.setText(String.valueOf(QUOTE_ONE));
                        break;
                    case 2:
                        quoteOutput.setText(String.valueOf(QUOTE_TWO));
                        break;
                    case 3:
                        quoteOutput.setText(String.valueOf(QUOTE_THREE));
                        break;
                    case 4:
                        quoteOutput.setText(String.valueOf(QUOTE_FOUR));
                        break;
                    case 5:
                        quoteOutput.setText(String.valueOf(QUOTE_FIVE));
                        break;
                    case 6:
                        quoteOutput.setText(String.valueOf(QUOTE_SIX));
                        break;
                    case 7:
                        quoteOutput.setText(String.valueOf(QUOTE_SEVEN));
                        break;
                    case 8:
                        quoteOutput.setText(String.valueOf(QUOTE_EIGHT));
                        break;
                    default:
                        System.out.println("Something went wrong!");
                        break;
                        
                }   break;
                //How to do all of that in 1 line
            case 2:
                quoteOutput.setText(String.valueOf(quotes[quoteValue-1]));
                break;
                
            default:
                System.out.println("Something went wrong!");
                break;
        }
        
    }//GEN-LAST:event_generateButtonActionPerformed

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
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel quoteOutput;
    // End of variables declaration//GEN-END:variables
}
