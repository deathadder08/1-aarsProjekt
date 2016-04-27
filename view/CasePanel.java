package view;

import java.awt.CardLayout;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import model.Case;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pdysted
 */
public class CasePanel extends javax.swing.JPanel {
    private DateFormat dateFormat = new SimpleDateFormat("dd/MM/YYYY HH:mm:ss");
    private GUI gui;
    private CardLayout cl;
    private Case c;
    private Calendar cal;

    /**
     * Creates new form CasePanel
     *
     * 
     * @param c the case object which's getter methods is used to set the labels with info
     * @param gui a reference to the gui, which allows the Panel to navigate through the cardlayout
     */
    public CasePanel(Case c, GUI gui) {
        initComponents();
        cal = Calendar.getInstance();
        this.c = c;
        caseNameLabel.setText(c.getCaseName());
        konsNrLabel.setText("" + c.getKonsNmb());
        //objectLabel.setText(c.);
        createdAtLabel.setText(dateFormat.format(c.getCreatedAt()));
        ownerLabel.setText(c.getCustomer().getCostumerName());
        cl = gui.getCl();
        this.gui = gui;
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        caseNameLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        konsNrLabel = new javax.swing.JLabel();
        objectLabel = new javax.swing.JLabel();
        createdAtLabel = new javax.swing.JLabel();
        casePanelEditButton = new javax.swing.JButton();
        ownerLabel = new javax.swing.JLabel();

        caseNameLabel.setText("Case name:");

        jLabel1.setText("Kons nr:");

        konsNrLabel.setText("Nr kons");

        objectLabel.setText("Object: ");

        createdAtLabel.setText("CreatedAt");

        casePanelEditButton.setText("Rediger");
        casePanelEditButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                casePanelEditButtonActionPerformed(evt);
            }
        });

        ownerLabel.setText("Owner:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(objectLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ownerLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(caseNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(createdAtLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(konsNrLabel)
                        .addContainerGap(33, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(casePanelEditButton)
                        .addGap(18, 18, 18))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(caseNameLabel)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(konsNrLabel)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ownerLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(objectLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(createdAtLabel)
                        .addContainerGap(36, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(casePanelEditButton)
                        .addContainerGap())))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void casePanelEditButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_casePanelEditButtonActionPerformed
        cl.next(gui.getCardPanel());
        gui.setC(c);
    }//GEN-LAST:event_casePanelEditButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel caseNameLabel;
    private javax.swing.JButton casePanelEditButton;
    private javax.swing.JLabel createdAtLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel konsNrLabel;
    private javax.swing.JLabel objectLabel;
    private javax.swing.JLabel ownerLabel;
    // End of variables declaration//GEN-END:variables
}
