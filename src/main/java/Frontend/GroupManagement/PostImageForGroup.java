/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Frontend.GroupManagement;

import Backend.Manager;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author carls
 */
public class PostImageForGroup extends javax.swing.JPanel {

    /**
     * Creates new form GroupPostImage
     */
    Manager a;
    String name;
    String photo;
    String date;
    String text;
    String postId;
    String gpId;
    public PostImageForGroup(Manager a, String name, String photo, String date, String text, String postId, String gpId) {
        initComponents();
        this.a = a;
        this.name = name;
        this.date = date;
        this.photo = photo;
        textArea.setText(text);
        ImageIcon imageIcon = new ImageIcon(photo);
            Image image = imageIcon.getImage().getScaledInstance(
                276, 
                274, 
                Image.SCALE_SMOOTH
            );
            postPhoto.setIcon(new ImageIcon(image));
            postPhoto.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UserNameField = new javax.swing.JTextField();
        DateField = new javax.swing.JTextField();
        textArea = new javax.swing.JTextField();
        postPhoto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        AcceptButton1 = new javax.swing.JButton();
        DeclineButton2 = new javax.swing.JButton();

        UserNameField.setEditable(false);

        DateField.setEditable(false);

        textArea.setEditable(false);

        postPhoto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 255)));

        AcceptButton1.setBackground(new java.awt.Color(51, 153, 255));
        AcceptButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        AcceptButton1.setText("Accept");
        AcceptButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AcceptButton1ActionPerformed(evt);
            }
        });

        DeclineButton2.setBackground(new java.awt.Color(51, 153, 255));
        DeclineButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        DeclineButton2.setText("Decline");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(textArea, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                        .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(postPhoto, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(AcceptButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(DeclineButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(UserNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textArea, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(postPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(AcceptButton1)
                    .addComponent(DeclineButton2))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void AcceptButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AcceptButton1ActionPerformed
        // TODO add your handling code here:
        a.approvePostRequest(postId, gpId);
    }//GEN-LAST:event_AcceptButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AcceptButton1;
    private javax.swing.JTextField DateField;
    private javax.swing.JButton DeclineButton2;
    private javax.swing.JTextField UserNameField;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel postPhoto;
    private javax.swing.JTextField textArea;
    // End of variables declaration//GEN-END:variables
}