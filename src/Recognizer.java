
import java.awt.Color;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

/**
 * @author Ammar Yasser
 */
public class Recognizer extends javax.swing.JFrame {

    public Recognizer() {
        initComponents();
        setLocationRelativeTo(null);
        moreInfoLabel.setVisible(false);
        executeBtn.setVisible(false);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputField = new javax.swing.JTextField();
        checkBtn = new javax.swing.JButton();
        moreInfoLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 32767));
        jSeparator1 = new javax.swing.JSeparator();
        commandsBtn = new javax.swing.JButton();
        grammar = new javax.swing.JButton();
        whoAreUs = new javax.swing.JButton();
        executeBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Linux Commads Recognizer");

        inputField.setFont(new java.awt.Font("Ubuntu", 0, 18)); // NOI18N
        inputField.setToolTipText("Enter command here");

        checkBtn.setFont(new java.awt.Font("Comfortaa", 1, 22)); // NOI18N
        checkBtn.setForeground(new java.awt.Color(102, 102, 102));
        checkBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search_1.png"))); // NOI18N
        checkBtn.setText("Check");
        checkBtn.setFocusable(false);
        checkBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkBtnActionPerformed(evt);
            }
        });

        moreInfoLabel.setFont(new java.awt.Font("Comfortaa", 0, 16)); // NOI18N
        moreInfoLabel.setForeground(new java.awt.Color(0, 51, 255));
        moreInfoLabel.setText(" More Info ");
        moreInfoLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        moreInfoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                moreInfoLabelMouseClicked(evt);
            }
        });

        resultLabel.setFont(new java.awt.Font("Comfortaa", 1, 18)); // NOI18N

        commandsBtn.setFont(inputField.getFont());
        commandsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4-512.png"))); // NOI18N
        commandsBtn.setToolTipText("All Supported Commands");
        commandsBtn.setContentAreaFilled(false);
        commandsBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        commandsBtn.setFocusPainted(false);
        commandsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandsBtnActionPerformed(evt);
            }
        });

        grammar.setFont(inputField.getFont());
        grammar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/info-147927_640.png"))); // NOI18N
        grammar.setToolTipText("Grammar");
        grammar.setContentAreaFilled(false);
        grammar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        grammar.setFocusPainted(false);
        grammar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                grammarActionPerformed(evt);
            }
        });

        whoAreUs.setFont(inputField.getFont());
        whoAreUs.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/people_1.png"))); // NOI18N
        whoAreUs.setToolTipText("who are us");
        whoAreUs.setContentAreaFilled(false);
        whoAreUs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        whoAreUs.setFocusPainted(false);
        whoAreUs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                whoAreUsActionPerformed(evt);
            }
        });

        executeBtn.setFont(new java.awt.Font("Comfortaa", 0, 20)); // NOI18N
        executeBtn.setForeground(new java.awt.Color(102, 102, 102));
        executeBtn.setText("execute");
        executeBtn.setFocusPainted(false);
        executeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(resultLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(inputField)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(checkBtn)))
                                                .addGap(10, 10, 10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(46, 46, 46))))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(moreInfoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(executeBtn)
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addContainerGap(50, Short.MAX_VALUE)
                                .addComponent(commandsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(grammar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(whoAreUs, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(50, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(15, 15, 15)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(inputField)
                                        .addComponent(checkBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(resultLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(executeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(moreInfoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 5, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(whoAreUs, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(grammar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(commandsBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void checkBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkBtnActionPerformed
        String Command = inputField.getText().trim();
        if (Command.equals("")) {
            resultLabel.setText("");
            moreInfoLabel.setVisible(false);
        } else if (new MyParser(Command).belong()) {
            resultLabel.setForeground(new Color(0, 150, 150));
            resultLabel.setText(" Command recognized successfully");
            moreInfoLabel.setText(" More Info about " + Command);
            moreInfoLabel.setVisible(true);
            // canExecute(Command);
        } else {
            resultLabel.setForeground(Color.RED);
            resultLabel.setText(" Unrecognized Command");
            moreInfoLabel.setVisible(false);
            executeBtn.setVisible(false);
        }
    }//GEN-LAST:event_checkBtnActionPerformed

    URI uri;

    private void moreInfoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_moreInfoLabelMouseClicked
        try {
            uri = new URI("http://manpages.ubuntu.com/manpages/precise/en/man1/" + inputField.getText().trim() + ".1.html");
            if (Desktop.isDesktopSupported()) {
                Desktop.getDesktop().browse(uri);
            } else {
                JOptionPane.showMessageDialog(rootPane, "There is problem in your browser");
            }
        } catch (IOException | URISyntaxException ex) {
            Logger.getLogger(Recognizer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_moreInfoLabelMouseClicked

    private void commandsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandsBtnActionPerformed
        String msg = "cal - cat - cd - cp\n"
                + "date - df\n"
                + "fg - file - find - free\n"
                + "id\n"
                + "man - mkdir - mv\n"
                + "rm - rmdir\n"
                + "su - sudo\n"
                + "w - who - whoami\n";
        JOptionPane.showMessageDialog(rootPane, msg, " All Supported Commands", ICONIFIED);
    }//GEN-LAST:event_commandsBtnActionPerformed

    private void grammarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_grammarActionPerformed
        String msg = "ST	  →  	C D F I M R S W $\n"
                + "C	  →  	c C1 | λ\n"
                + "C1	  →  	d , C1	  →  	p , C1	  →  	a C2\n"
                + "C2	  →  	t , C2	  →  	l\n"
                + "D	  →  	d D1 | λ\n"
                + "D1	  →  	f , D1	  →  	a D2\n"
                + "D2	  →  	t D3\n"
                + "D3	  →  	e\n"
                + "F	  →  	f F1 | λ\n"
                + "F1	  →  	g , F1	  →  	i F2 , F1	  →  	r F3\n"
                + "F2	  →  	l F4 , F2	  →  	n F5\n"
                + "F3	  →  	r F6\n"
                + "F4	  →  	e\n"
                + "F5	  →  	d\n"
                + "F6	  →  	e F4\n"
                + "I	  →  	i F5 | λ\n"
                + "M	  →  	m M1 | λ\n"
                + "M1	  →  	v , M1	  →  	a M2 , M1	  →  	k M3\n"
                + "M2	  →  	n \n"
                + "M3	  →  	d M4\n"
                + "M4	  →  	i M5\n"
                + "M5	  →  	r\n"
                + "R	  →  	r R1 | λ\n"
                + "R1	  →  	m R2\n"
                + "R2	  →  	λ | M3\n"
                + "S	  →  	s S1 | λ\n"
                + "S1	  →  	u S2\n"
                + "S2	  →  	λ | d S3\n"
                + "S3	  →  	o\n"
                + "W	  →  	w W1 | λ\n"
                + "W1	  →  	λ | h W2\n"
                + "W2	  →  	o W3\n"
                + "W3	  →  	λ | a W4\n"
                + "W4	  →  	m W5\n"
                + "W5	  →  	i";
        JOptionPane.showMessageDialog(rootPane, msg, " Grammar of Parser", ICONIFIED);
    }//GEN-LAST:event_grammarActionPerformed

    private void whoAreUsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_whoAreUsActionPerformed
        String msg
                = "1. AbouElkhair Rady   --> Sec.1\n"
                + "2. Ammar Yasser       --> Sec.2\n"
                + "3. Basant Adel        --> Sec.2\n"
                + "4. Nada Emad          --> Sec.4\n"
                + "5. Shady Aref         --> Sec.2\n"
                + "6. Waleed Wageh       --> Sec.4\n";
        JOptionPane.showMessageDialog(rootPane, msg, " Who are us ?", ICONIFIED);
    }//GEN-LAST:event_whoAreUsActionPerformed

    private void executeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeBtnActionPerformed
        /*OutputStream out = null;
        try {
//            Process proc = new ProcessBuilder("/bin/bash").start();
//            out = proc.getOutputStream();
//            out.write(inputField.getText().trim().getBytes());
//            out.flush();
//            System.out.println(proc.getInputStream());

//            ProcessBuilder p = new ProcessBuilder();
//            p.command("bash", inputField.getText().trim());
//            p.start();
//            new ProcessBuilder().command("bash", inputField.getText().trim()).start();
//            Runtime.getRuntime().exec("/bin/bash --disable-factory -e whoami");
            Process p = Runtime.getRuntime().exec(new String[]{"bash", "-c", "whoami"});
//            System.out.println(p.getInputStream());

        } catch (IOException e1) {
            // TODO Auto-generated catch block
            JOptionPane.showMessageDialog(rootPane, e1.getMessage());
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    JOptionPane.showMessageDialog(rootPane, e.getMessage());
                }
            }
        }
         */
    }//GEN-LAST:event_executeBtnActionPerformed

    public static void main(String args[]) throws IOException {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if (getUiName().equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Recognizer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Recognizer().setVisible(true);
        });
    }

    private static String getUiName() {
        return System.getProperty("os.name").startsWith("Windows") ? "Windows" : System.getProperty("os.name").equals("Linux") ? "GTK+" : "Nimbus";
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton checkBtn;
    private javax.swing.JButton commandsBtn;
    private javax.swing.JButton executeBtn;
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton grammar;
    private javax.swing.JTextField inputField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel moreInfoLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JButton whoAreUs;
    // End of variables declaration//GEN-END:variables

    // <editor-fold defaultstate="collapsed" desc="excute btn code">   
    /*
    String infoCommand[] = {"cal", "date", "df", "fg", "id", "w", "who", "whoami"};
    
    void canExecute(String command) {
        if (OS().equals("Linux")) {
            for (String com : infoCommand) {
                if (command.equals(com)) {
                    executeBtn.setVisible(true);
                    break;
                } else {
                    executeBtn.setVisible(false);
                }
            }
        }
    }

    String OS() {
        System.out.println("\n    The information about OS");
        System.out.println("Name         : " + System.getProperty("os.name"));
        System.out.println("Version      : " + System.getProperty("os.version"));
        System.out.println("Architecture : " + System.getProperty("os.arch"));
        return System.getProperty("os.name");
    }
     */
    // </editor-fold>   
}
