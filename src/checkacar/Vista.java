/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkacar;

/**
 *
 * @author kathe
 */
public class Vista extends javax.swing.JFrame {
        boolean startExecution = false;

    /**
     * Creates new form Vista
     */
    public Vista() {
        initComponents();
        homejPanel.setVisible(true);
        mainjPanel.setVisible(false);
        lockjTextArea.setEditable(false);
        firstjTextArea.setEditable(false);
        secondjTextArea.setEditable(false);
        thirdjTextArea.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        homejPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        startjButton = new javax.swing.JButton();
        mainjPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lockjTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        firstjTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        secondjTextArea = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        thirdjTextArea = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        fixingjTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 800));
        setPreferredSize(new java.awt.Dimension(850, 800));
        setResizable(false);

        homejPanel.setBackground(new java.awt.Color(25, 150, 155));
        homejPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Bienvenido", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        homejPanel.setMaximumSize(new java.awt.Dimension(800, 750));
        homejPanel.setMinimumSize(new java.awt.Dimension(800, 750));
        homejPanel.setPreferredSize(new java.awt.Dimension(800, 750));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkacar/carro3.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Elephant", 0, 68)); // NOI18N
        jLabel2.setText("Check a Car");

        startjButton.setBackground(new java.awt.Color(188, 186, 190));
        startjButton.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        startjButton.setText("Comenzar");
        startjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout homejPanelLayout = new javax.swing.GroupLayout(homejPanel);
        homejPanel.setLayout(homejPanelLayout);
        homejPanelLayout.setHorizontalGroup(
            homejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homejPanelLayout.createSequentialGroup()
                .addContainerGap(177, Short.MAX_VALUE)
                .addGroup(homejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(278, 278, 278))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homejPanelLayout.createSequentialGroup()
                        .addComponent(startjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(295, 295, 295))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homejPanelLayout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 444, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
        );
        homejPanelLayout.setVerticalGroup(
            homejPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homejPanelLayout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(startjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
        );

        mainjPanel.setBackground(new java.awt.Color(25, 150, 155));
        mainjPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3), "Check a Car", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Lucida Bright", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        mainjPanel.setMaximumSize(new java.awt.Dimension(800, 750));
        mainjPanel.setMinimumSize(new java.awt.Dimension(800, 750));
        mainjPanel.setPreferredSize(new java.awt.Dimension(800, 750));

        jScrollPane1.setBackground(new java.awt.Color(188, 186, 190));
        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setMaximumSize(new java.awt.Dimension(166, 96));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(166, 96));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(160, 90));

        lockjTextArea.setEditable(false);
        lockjTextArea.setBackground(new java.awt.Color(188, 186, 190));
        lockjTextArea.setColumns(20);
        lockjTextArea.setRows(5);
        lockjTextArea.setMaximumSize(new java.awt.Dimension(164, 94));
        lockjTextArea.setMinimumSize(new java.awt.Dimension(164, 94));
        lockjTextArea.setPreferredSize(new java.awt.Dimension(150, 90));
        jScrollPane1.setViewportView(lockjTextArea);

        jScrollPane2.setBackground(new java.awt.Color(188, 186, 190));
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(166, 96));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(166, 96));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(160, 90));

        firstjTextArea.setEditable(false);
        firstjTextArea.setBackground(new java.awt.Color(188, 186, 190));
        firstjTextArea.setColumns(20);
        firstjTextArea.setRows(5);
        firstjTextArea.setMaximumSize(new java.awt.Dimension(164, 94));
        firstjTextArea.setMinimumSize(new java.awt.Dimension(164, 94));
        firstjTextArea.setPreferredSize(new java.awt.Dimension(150, 90));
        jScrollPane2.setViewportView(firstjTextArea);

        jScrollPane3.setBackground(new java.awt.Color(188, 186, 190));
        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setMaximumSize(new java.awt.Dimension(166, 96));
        jScrollPane3.setMinimumSize(new java.awt.Dimension(166, 96));
        jScrollPane3.setPreferredSize(new java.awt.Dimension(160, 90));

        secondjTextArea.setEditable(false);
        secondjTextArea.setBackground(new java.awt.Color(188, 186, 190));
        secondjTextArea.setColumns(20);
        secondjTextArea.setRows(5);
        secondjTextArea.setMaximumSize(new java.awt.Dimension(164, 94));
        secondjTextArea.setMinimumSize(new java.awt.Dimension(164, 94));
        secondjTextArea.setName(""); // NOI18N
        secondjTextArea.setPreferredSize(new java.awt.Dimension(150, 90));
        jScrollPane3.setViewportView(secondjTextArea);

        jScrollPane4.setBackground(new java.awt.Color(188, 186, 190));
        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setMaximumSize(new java.awt.Dimension(166, 96));
        jScrollPane4.setMinimumSize(new java.awt.Dimension(166, 96));
        jScrollPane4.setPreferredSize(new java.awt.Dimension(160, 90));

        thirdjTextArea.setEditable(false);
        thirdjTextArea.setBackground(new java.awt.Color(188, 186, 190));
        thirdjTextArea.setColumns(20);
        thirdjTextArea.setRows(5);
        thirdjTextArea.setPreferredSize(new java.awt.Dimension(150, 90));
        jScrollPane4.setViewportView(thirdjTextArea);

        jLabel3.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bloqueados");

        jLabel4.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Prioridad 1");

        jLabel5.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Prioridad 2");

        jLabel6.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Prioridad 3");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkacar/lock.png"))); // NOI18N
        jLabel7.setText("jLabel7");

        fixingjTextField.setEditable(false);
        fixingjTextField.setBackground(new java.awt.Color(188, 186, 190));
        fixingjTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fixingjTextFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Lucida Bright", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("En el mecánico");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/checkacar/tools.png"))); // NOI18N
        jLabel9.setText("jLabel7");

        javax.swing.GroupLayout mainjPanelLayout = new javax.swing.GroupLayout(mainjPanel);
        mainjPanel.setLayout(mainjPanelLayout);
        mainjPanelLayout.setHorizontalGroup(
            mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainjPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainjPanelLayout.createSequentialGroup()
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainjPanelLayout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel4)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel5)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel6))
                            .addGroup(mainjPanelLayout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(fixingjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(54, Short.MAX_VALUE))))
        );
        mainjPanelLayout.setVerticalGroup(
            mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainjPanelLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(fixingjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(mainjPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homejPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(homejPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mainjPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startjButtonActionPerformed

        startExecution = true;
        homejPanel.setVisible(false);
        mainjPanel.setVisible(true);
    }//GEN-LAST:event_startjButtonActionPerformed

    private void fixingjTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fixingjTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fixingjTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Vista().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea firstjTextArea;
    public javax.swing.JTextField fixingjTextField;
    private javax.swing.JPanel homejPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTextArea lockjTextArea;
    private javax.swing.JPanel mainjPanel;
    public javax.swing.JTextArea secondjTextArea;
    private javax.swing.JButton startjButton;
    public javax.swing.JTextArea thirdjTextArea;
    // End of variables declaration//GEN-END:variables
}
