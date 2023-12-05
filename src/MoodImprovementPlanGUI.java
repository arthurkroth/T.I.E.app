
import java.awt.Component;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Objects;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Michael McCreary - x22171363
 */
public class MoodImprovementPlanGUI extends javax.swing.JFrame implements ActionListener {

    /**
     * Creates new form MoodImprovementPlanGUI
     */
    
    private UserGUI userGUI;
    private List<String> affirmations = new ArrayList<>();
    private JButton addCustomAffirmation;
    protected Yoga yoga;
    String yogaTips;
    
    public MoodImprovementPlanGUI(UserGUI userGUI) {
        initComponents();
        this.userGUI = userGUI;
 
        affirmations.add("I am worthy of love and happiness. ");
        affirmations.add("I radiate confidence, self-respect, and inner harmony. ");
        affirmations.add("I believe in my abilities and unique talents. ");
        affirmations.add("I attract positive energy and opportunities into my life. ");
        affirmations.add("I am resilient, strong, and capable of overcoming challenges. ");
        affirmations.add("I trust the journey of my life and embrace the present moment. ");
        affirmations.add("I am surrounded by love and support. ");
        affirmations.add("I am a magnet for success and prosperity. ");
        affirmations.add("I choose joy, love, and abundance in my life. ");
        affirmations.add("I am constantly evolving and improving.  ");
        affirmations.add("I deserve all the good things life has to offer. ");
        affirmations.add("My mind is full of positive and empowering thoughts. ");
        affirmations.add("I am in control of my thoughts and emotions. ");
        affirmations.add("I am open to new experiences and opportunities. ");
        affirmations.add("I forgive myself and let go of past mistakes. ");
        affirmations.add("I am a source of inspiration and positivity to others. ");
        affirmations.add("I am confident in my ability to achieve my goals. ");
        affirmations.add("I am at peace with my past and excited for the future. ");
        affirmations.add("I am surrounded by beauty and goodness. ");
        affirmations.add("I am a unique and valuable person. ");
        affirmations.add("I am deserving of success, happiness, and love. ");
        affirmations.add("I attract positive, like-minded individuals into my life. ");
        affirmations.add("I am grateful for the abundance in my life.");
        affirmations.add("I am worthy of success and prosperity. ");
        affirmations.add("I am free to create the life I desire. ");
        affirmations.add("I am in charge of my own happiness. ");
        affirmations.add("I release all fear and embrace love. ");
        affirmations.add("I am a beacon of positivity and optimism. ");
        affirmations.add("I am constantly growing and evolving. ");
        affirmations.add("I am at peace with who I am, and I am enough. ");
        affirmations.add("I am surrounded by love, light, and positive energy. ");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        activity = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        generateAffirmation = new javax.swing.JButton();
        btnMainMenu = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        generateTips = new javax.swing.JButton();
        isJournaling = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        label1.setText("label1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Are you journaling?");

        jLabel10.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel10.setText("T.I.E Mood Improvement");

        activity.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        activity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Breathing", "Meditation", "Visualisation", "Yoga" }));
        activity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activityActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("What type of Activity do you want tips for:");

        generateAffirmation.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        generateAffirmation.setText("Click here to generate the affirmation of the day");
        generateAffirmation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateAffirmationActionPerformed(evt);
            }
        });

        btnMainMenu.setText("Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Meditate.jpg"))); // NOI18N

        generateTips.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        generateTips.setText("Generate Tips");
        generateTips.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateTipsActionPerformed(evt);
            }
        });

        isJournaling.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                isJournalingActionPerformed(evt);
            }
        });

        jLabel4.setText("Yes / No");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(74, 74, 74)
                                .addComponent(btnMainMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(isJournaling, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(generateAffirmation))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addComponent(generateTips)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnMainMenu))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(isJournaling, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(activity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(77, 77, 77)
                .addComponent(generateTips)
                .addGap(60, 60, 60)
                .addComponent(generateAffirmation)
                .addGap(88, 88, 88))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void activityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activityActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);

        if(userGUI != null){
            userGUI.setVisible(true);
            userGUI.setLocationRelativeTo(null);
        }
    }//GEN-LAST:event_btnMainMenuActionPerformed
    
    private void generateAffirmationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateAffirmationActionPerformed
        // TODO add your handling code here:
        
            // Check if there are affirmations available
        if (affirmations.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No affirmations available.");
            return;
        }

        // Get a random affirmation
        Random random = new Random();
        int randomIndex = random.nextInt(affirmations.size());
        String randomAffirmation = affirmations.get(randomIndex);

        // Display the affirmation using JOptionPane
        int option = JOptionPane.showConfirmDialog(this,
                "Repeating a positive affirmation to yourself each day is a great way to improve your mood.\n"
                        + "Here is the affirmation of the day:\n" + randomAffirmation
                        + "\n\nDo you want to add a custom affirmation?",
                "Affirmation of the Day", JOptionPane.YES_NO_OPTION);

        if (option == JOptionPane.YES_OPTION) {
            addCustomAffirmation();
        }
    }//GEN-LAST:event_generateAffirmationActionPerformed

    private void generateTipsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateTipsActionPerformed
        // TODO add your handling code here:
        String selectedActivity = (String) activity.getSelectedItem();
        String tipsMessage = generateTips(selectedActivity, this);

        // Display the generated tip message in a JOptionPane dialog.
        JOptionPane.showMessageDialog(this, tipsMessage, "Tips", JOptionPane.INFORMATION_MESSAGE);

        // Write tips to a file and display the file path
        String filePath = writeTipsToFile(selectedActivity, tipsMessage);
        JOptionPane.showMessageDialog(this, "Tips written to file:\n" + filePath, "File Written", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_generateTipsActionPerformed

    private void isJournalingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_isJournalingActionPerformed
            // TODO add your handling code here:
            
            // Get the user's input from the JTextField
        String userInput = isJournaling.getText();

        // Update the isJournaling variable based on user input
        // You might want to perform some validation here to ensure the input is as expected
        if ("Yes".equalsIgnoreCase(userInput) || "No".equalsIgnoreCase(userInput)) {
            isJournaling.setText(userInput);
        } else {
            // Display an error message or handle invalid input
            JOptionPane.showMessageDialog(this, "Please enter 'Yes' or 'No' for journaling status.", "Invalid Input", JOptionPane.ERROR_MESSAGE);
            // You may choose to set a default value or leave it unchanged in case of invalid input
        }
    }//GEN-LAST:event_isJournalingActionPerformed

    // Method to write tips to a file and return the file path
    private String writeTipsToFile(String selectedActivity, String tipsMessage){
        
        // Create a file name based on the selected activity (lowercase) with ".txt" extension
        String fileName = selectedActivity.toLowerCase() + ".txt";
        
        try (FileWriter writer = new FileWriter(fileName)){
            // Write the tips message to the file
            writer.write(tipsMessage);
            
            // Return the absolute file path using Objects.requireNonNull to handle null case
            return Objects.requireNonNull(new File(fileName).getAbsolutePath());
        } catch (IOException e){
            // Display an error message if there's an exception during file writing
            JOptionPane.showMessageDialog(this, "Error writing tips to file.", "Error", JOptionPane.ERROR_MESSAGE);
            
            // Print the exception stack trace for debugging purposes
            e.printStackTrace();
            
            // Return null to indicate an error occurred
            return null;
        }
    }
     
        public String generateTips(String activity, Component parentComponent) {
            StringBuilder tipsMessage = new StringBuilder();

            // Add tips based on the selected activity
            switch (activity) {
                case "Breathing":
                    Breathing breathing = new Breathing(userGUI);
                    tipsMessage.append(breathing.generateTips(activity, parentComponent));
                    break;
                case "Meditation":
                    Meditation meditation = new Meditation(userGUI);
                    tipsMessage.append(meditation.generateTips(activity, parentComponent));
                    break;
                case "Visualisation":
                    Visualisation visualisation = new Visualisation(userGUI);
                    tipsMessage.append(visualisation.generateTips(activity, parentComponent));
                    break;
                case "Yoga":
                    Yoga yoga = new Yoga(userGUI);
                    tipsMessage.append(yoga.generateTips(activity, parentComponent));
                    break;
                default:
                    tipsMessage.append("No tips available for the selected activity.\n");
                    break;
            }

            // Add journaling tips based on user input
            String journalingInput = isJournaling.getText().trim();
            if ("Yes".equalsIgnoreCase(journalingInput)) {
                tipsMessage.append("\nAdditional Tips for Journaling:\n");
                tipsMessage.append("Include journaling as a reflection tool. Write about your thoughts, feelings, and experiences.");
            } else if ("No".equalsIgnoreCase(journalingInput)) {
                tipsMessage.append("\nConsider trying journaling as a way to reflect on your experiences and emotions.");
            }

            return tipsMessage.toString();
        }
    
        private void addCustomAffirmation(){
        // Prompt the user to enter a custom affirmation
        String customAffirmation = JOptionPane.showInputDialog(this, "Enter your custom affirmation:");

        // Check if the user entered something
        if (customAffirmation != null && !customAffirmation.trim().isEmpty()){
            // Add the custom affirmation to the list
            affirmations.add(customAffirmation);

            // Inform the user that the affirmation has been added
            JOptionPane.showMessageDialog(this, "Custom affirmation added!");
        } else {
            // Inform the user that the input was invalid
            JOptionPane.showMessageDialog(this, "Invalid input. Please enter a valid affirmation.");
        }
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]){
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
            java.util.logging.Logger.getLogger(MoodImprovementPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoodImprovementPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoodImprovementPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoodImprovementPlanGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            public void run(){
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> activity;
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton generateAffirmation;
    private javax.swing.JButton generateTips;
    private javax.swing.JTextField isJournaling;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
