/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package booktap;
import java.sql.*;

/**
 *
 * @author sravy
 */
public class Interests extends javax.swing.JFrame {

    /**
     * Creates new form Interests
     */String uname;
    public Interests(String Username) {
        initComponents();
        this.uname=Username;
    }
   
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel15 = new javax.swing.JLabel();
        jCheckBox2 = new javax.swing.JCheckBox();
        scrollpane = new javax.swing.JScrollPane();
        outerlayeredpane = new javax.swing.JLayeredPane();
        outerpanel = new javax.swing.JPanel();
        innerlayeredpane = new javax.swing.JLayeredPane();
        innerpanel = new javax.swing.JPanel();
        Headinglabel = new javax.swing.JLabel();
        Captionlabel = new javax.swing.JLabel();
        saveandnextbutton = new javax.swing.JButton();
        mysteryImagelabel = new javax.swing.JLabel();
        mysterycb = new javax.swing.JCheckBox();
        mysterylabel = new javax.swing.JLabel();
        romanceimagelabel = new javax.swing.JLabel();
        romancecb = new javax.swing.JCheckBox();
        romancelabel = new javax.swing.JLabel();
        nonfictioncb = new javax.swing.JCheckBox();
        nonfictionimagelabel = new javax.swing.JLabel();
        nonfictionlabel = new javax.swing.JLabel();
        Adventurecb = new javax.swing.JCheckBox();
        Adventureimagelabel = new javax.swing.JLabel();
        poetryimagelabel = new javax.swing.JLabel();
        horrorcb = new javax.swing.JCheckBox();
        horrorlabel = new javax.swing.JLabel();
        horrorimagelabel = new javax.swing.JLabel();
        Adventurelabel = new javax.swing.JLabel();
        fictionlabel = new javax.swing.JLabel();
        fictioncb = new javax.swing.JCheckBox();
        fictionimagelabel = new javax.swing.JLabel();
        poetrylabel = new javax.swing.JLabel();
        poetrycb = new javax.swing.JCheckBox();
        childrencb = new javax.swing.JCheckBox();
        childrenlabel = new javax.swing.JLabel();
        classicsimagelabel = new javax.swing.JLabel();
        fantasycb = new javax.swing.JCheckBox();
        fantasylabel = new javax.swing.JLabel();
        fantasyimagelabel = new javax.swing.JLabel();
        classicscb = new javax.swing.JCheckBox();
        classicslabel = new javax.swing.JLabel();
        childrenimagelabel = new javax.swing.JLabel();

        jLabel15.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Adventure");

        jCheckBox2.setBackground(new java.awt.Color(43, 37, 56));
        jCheckBox2.setForeground(new java.awt.Color(43, 37, 56));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("INTERESTS");
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setSize(new java.awt.Dimension(1000, 600));

        scrollpane.setPreferredSize(new java.awt.Dimension(1300, 1158));

        outerlayeredpane.setPreferredSize(new java.awt.Dimension(1290, 1156));

        outerpanel.setBackground(new java.awt.Color(43, 37, 56));

        innerpanel.setBackground(new java.awt.Color(17, 94, 111));
        innerpanel.setPreferredSize(new java.awt.Dimension(884, 496));

        Headinglabel.setFont(new java.awt.Font("Malgun Gothic", 0, 58)); // NOI18N
        Headinglabel.setForeground(new java.awt.Color(255, 255, 255));
        Headinglabel.setText("Choose Interests");

        Captionlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 18)); // NOI18N
        Captionlabel.setForeground(new java.awt.Color(255, 255, 255));
        Captionlabel.setText("Select all the genres that you like");

        saveandnextbutton.setBackground(new java.awt.Color(255, 182, 28));
        saveandnextbutton.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        saveandnextbutton.setForeground(new java.awt.Color(43, 37, 56));
        saveandnextbutton.setText("Save and Next");
        saveandnextbutton.setBorder(null);
        saveandnextbutton.setFocusPainted(false);
        saveandnextbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveandnextbuttonActionPerformed(evt);
            }
        });

        mysteryImagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Mystery.PNG"))); // NOI18N

        mysterycb.setBackground(new java.awt.Color(43, 37, 56));
        mysterycb.setForeground(new java.awt.Color(43, 37, 56));

        mysterylabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        mysterylabel.setForeground(new java.awt.Color(255, 255, 255));
        mysterylabel.setText("Mystery");

        romanceimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Romance.jpg"))); // NOI18N

        romancecb.setBackground(new java.awt.Color(43, 37, 56));
        romancecb.setForeground(new java.awt.Color(43, 37, 56));

        romancelabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        romancelabel.setForeground(new java.awt.Color(255, 255, 255));
        romancelabel.setText("Romance");

        nonfictioncb.setBackground(new java.awt.Color(43, 37, 56));
        nonfictioncb.setForeground(new java.awt.Color(43, 37, 56));

        nonfictionimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Non-fiction.jpg"))); // NOI18N

        nonfictionlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        nonfictionlabel.setForeground(new java.awt.Color(255, 255, 255));
        nonfictionlabel.setText("Non-fiction");

        Adventurecb.setBackground(new java.awt.Color(43, 37, 56));
        Adventurecb.setForeground(new java.awt.Color(43, 37, 56));

        Adventureimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Adventure.jpg"))); // NOI18N
        Adventureimagelabel.setToolTipText("");

        poetryimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Poetry.jpg"))); // NOI18N

        horrorcb.setBackground(new java.awt.Color(43, 37, 56));
        horrorcb.setForeground(new java.awt.Color(43, 37, 56));

        horrorlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        horrorlabel.setForeground(new java.awt.Color(255, 255, 255));
        horrorlabel.setText("Horror");

        horrorimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Horror.PNG"))); // NOI18N

        Adventurelabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        Adventurelabel.setForeground(new java.awt.Color(255, 255, 255));
        Adventurelabel.setText("Adventure");

        fictionlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        fictionlabel.setForeground(new java.awt.Color(255, 255, 255));
        fictionlabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        fictionlabel.setText("Fiction");

        fictioncb.setBackground(new java.awt.Color(43, 37, 56));
        fictioncb.setForeground(new java.awt.Color(43, 37, 56));

        fictionimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Fiction.jpg"))); // NOI18N

        poetrylabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        poetrylabel.setForeground(new java.awt.Color(255, 255, 255));
        poetrylabel.setText("Poetry");

        poetrycb.setBackground(new java.awt.Color(43, 37, 56));
        poetrycb.setForeground(new java.awt.Color(43, 37, 56));

        childrencb.setBackground(new java.awt.Color(43, 37, 56));
        childrencb.setForeground(new java.awt.Color(43, 37, 56));

        childrenlabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        childrenlabel.setForeground(new java.awt.Color(255, 255, 255));
        childrenlabel.setText("Children");

        classicsimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Classics.jpg"))); // NOI18N

        fantasycb.setBackground(new java.awt.Color(43, 37, 56));
        fantasycb.setForeground(new java.awt.Color(43, 37, 56));

        fantasylabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        fantasylabel.setForeground(new java.awt.Color(255, 255, 255));
        fantasylabel.setText("Fantasy");

        fantasyimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Fantasy.jpg"))); // NOI18N

        classicscb.setBackground(new java.awt.Color(43, 37, 56));
        classicscb.setForeground(new java.awt.Color(43, 37, 56));

        classicslabel.setFont(new java.awt.Font("Malgun Gothic", 1, 16)); // NOI18N
        classicslabel.setForeground(new java.awt.Color(255, 255, 255));
        classicslabel.setText("Classics");

        childrenimagelabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login_Interests images/Children.jpg"))); // NOI18N

        javax.swing.GroupLayout innerpanelLayout = new javax.swing.GroupLayout(innerpanel);
        innerpanel.setLayout(innerpanelLayout);
        innerpanelLayout.setHorizontalGroup(
            innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerpanelLayout.createSequentialGroup()
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(innerpanelLayout.createSequentialGroup()
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(mysteryImagelabel)
                                    .addGroup(innerpanelLayout.createSequentialGroup()
                                        .addGap(107, 107, 107)
                                        .addComponent(mysterycb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(mysterylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(innerpanelLayout.createSequentialGroup()
                                        .addGap(116, 116, 116)
                                        .addComponent(nonfictioncb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nonfictionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(nonfictionimagelabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(innerpanelLayout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(fictionimagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(childrenimagelabel))
                                    .addGroup(innerpanelLayout.createSequentialGroup()
                                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(innerpanelLayout.createSequentialGroup()
                                                .addGap(69, 69, 69)
                                                .addComponent(Adventurecb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(Adventurelabel))
                                            .addComponent(horrorimagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Adventureimagelabel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(classicsimagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(poetryimagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(fantasyimagelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                                                .addComponent(poetrycb)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(poetrylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(97, 97, 97))))))
                            .addGroup(innerpanelLayout.createSequentialGroup()
                                .addComponent(Captionlabel)
                                .addGap(293, 293, 293)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(innerpanelLayout.createSequentialGroup()
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(romanceimagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(innerpanelLayout.createSequentialGroup()
                                .addGap(120, 120, 120)
                                .addComponent(romancecb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(romancelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                                        .addComponent(classicscb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(classicslabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(92, 92, 92))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                                        .addComponent(fantasycb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fantasylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(93, 93, 93))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                                        .addComponent(childrencb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(childrenlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(94, 94, 94))))
                            .addGroup(innerpanelLayout.createSequentialGroup()
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(innerpanelLayout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(fictioncb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(fictionlabel))
                                    .addGroup(innerpanelLayout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(horrorcb)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(horrorlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(Headinglabel)
                        .addGap(221, 221, 221))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveandnextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
        );
        innerpanelLayout.setVerticalGroup(
            innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerpanelLayout.createSequentialGroup()
                .addComponent(Headinglabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Captionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(innerpanelLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(mysteryImagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mysterylabel)
                            .addComponent(mysterycb))
                        .addGap(18, 18, 18)
                        .addComponent(nonfictionimagelabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nonfictionlabel)
                            .addComponent(nonfictioncb))
                        .addGap(18, 18, 18)
                        .addComponent(romanceimagelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(romancecb)
                            .addComponent(romancelabel)))
                    .addGroup(innerpanelLayout.createSequentialGroup()
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(innerpanelLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(poetryimagelabel)
                                .addGap(7, 7, 7)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(poetrycb)
                                    .addComponent(poetrylabel))
                                .addGap(18, 18, 18)
                                .addComponent(fantasyimagelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fantasylabel)
                                    .addComponent(fantasycb))
                                .addGap(17, 17, 17)
                                .addComponent(classicsimagelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(classicslabel)
                                    .addComponent(classicscb))
                                .addGap(29, 29, 29)
                                .addComponent(childrenimagelabel))
                            .addGroup(innerpanelLayout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(Adventureimagelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(Adventurecb)
                                    .addComponent(Adventurelabel))
                                .addGap(20, 20, 20)
                                .addComponent(horrorimagelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(horrorcb)
                                    .addComponent(horrorlabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fictionimagelabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(fictionlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fictioncb))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(innerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(childrenlabel)
                            .addComponent(childrencb))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveandnextbutton, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );

        innerlayeredpane.setLayer(innerpanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout innerlayeredpaneLayout = new javax.swing.GroupLayout(innerlayeredpane);
        innerlayeredpane.setLayout(innerlayeredpaneLayout);
        innerlayeredpaneLayout.setHorizontalGroup(
            innerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(innerlayeredpaneLayout.createSequentialGroup()
                .addComponent(innerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 148, Short.MAX_VALUE))
        );
        innerlayeredpaneLayout.setVerticalGroup(
            innerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, innerlayeredpaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(innerpanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout outerpanelLayout = new javax.swing.GroupLayout(outerpanel);
        outerpanel.setLayout(outerpanelLayout);
        outerpanelLayout.setHorizontalGroup(
            outerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerpanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(innerlayeredpane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(192, Short.MAX_VALUE))
        );
        outerpanelLayout.setVerticalGroup(
            outerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outerpanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(innerlayeredpane, javax.swing.GroupLayout.PREFERRED_SIZE, 1100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        outerlayeredpane.setLayer(outerpanel, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout outerlayeredpaneLayout = new javax.swing.GroupLayout(outerlayeredpane);
        outerlayeredpane.setLayout(outerlayeredpaneLayout);
        outerlayeredpaneLayout.setHorizontalGroup(
            outerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        outerlayeredpaneLayout.setVerticalGroup(
            outerlayeredpaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(outerpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        scrollpane.setViewportView(outerlayeredpane);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 1006, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollpane, javax.swing.GroupLayout.DEFAULT_SIZE, 1175, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void saveandnextbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveandnextbuttonActionPerformed
        // TODO add your handling code here:
        
        String array[];
        array=new String[10];
         //JCheckBox cb=new Jcheckbox()
         if(mysterycb.isSelected())
         {
             array[0]="Mystery";
         }
         else
         {
             array[0]=";";
         }
         if(Adventurecb.isSelected())
         {
             array[1]="Adventure";
         }
         else
         {
             array[1]=";";
         }
         if(poetrycb.isSelected())
         {
             array[2]="Poetry";
         }
          else
         {
             array[2]=";";
         }
         if(nonfictioncb.isSelected())
         {
             array[3]="Non-Fiction";
         }
          else
         {
             array[3]=";";
         }
         if(horrorcb.isSelected())
         {
             array[4]="Horror";
         }
          else
         {
             array[4]=";";
         }
        if(poetrycb.isSelected())
         {
             array[5]="Poetry";
         }
          else
         {
             array[5]=";";
         }
        if(fantasycb.isSelected())
         {
             array[6]="Fantasy";
         }
          else
         {
             array[6]=";";
         }
        if(romancecb.isSelected())
         {
             array[7]="Romance";
         }
          else
         {
             array[7]=";";
         }
        if(fictioncb.isSelected())
         {
             array[8]="Fiction";
         }
          else
         {
             array[8]=";";
         }
        if(childrencb.isSelected())
         {
             array[9]="Children";
         }
          else
         {
             array[9]=";";
         }
        try {
        	Class.forName("oracle.jdbc.driver.OracleDriver"); 
    		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","nikitha","password8502");  
    				for (int j = 0; j < 10; j++) {
    					if (array[j]!=";") {
                                          
    						String query = "INSERT INTO LIKEDGENRES (USERNAME,INTERESTS)" + " values (?, ?)";
    						PreparedStatement pst = con.prepareStatement(query);
    						pst.setString(1, uname);
    						pst.setString(2, array[j]);
    						pst.execute();
                                                  
    					}
    				}
                                  con.close();
        		} 
                    catch (Exception exc) {
        			System.out.println(exc);
        		}

        
        
        
        HomePage hp=new HomePage(this.uname);
        hp.show();
        dispose();
    }//GEN-LAST:event_saveandnextbuttonActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interests.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
///        java.awt.EventQueue.invokeLater(new Runnable() {
///            public void run() {
///                new Interests().setVisible(true);
///            }
///        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Adventurecb;
    private javax.swing.JLabel Adventureimagelabel;
    private javax.swing.JLabel Adventurelabel;
    private javax.swing.JLabel Captionlabel;
    private javax.swing.JLabel Headinglabel;
    private javax.swing.JCheckBox childrencb;
    private javax.swing.JLabel childrenimagelabel;
    private javax.swing.JLabel childrenlabel;
    private javax.swing.JCheckBox classicscb;
    private javax.swing.JLabel classicsimagelabel;
    private javax.swing.JLabel classicslabel;
    private javax.swing.JCheckBox fantasycb;
    private javax.swing.JLabel fantasyimagelabel;
    private javax.swing.JLabel fantasylabel;
    private javax.swing.JCheckBox fictioncb;
    private javax.swing.JLabel fictionimagelabel;
    private javax.swing.JLabel fictionlabel;
    private javax.swing.JCheckBox horrorcb;
    private javax.swing.JLabel horrorimagelabel;
    private javax.swing.JLabel horrorlabel;
    private javax.swing.JLayeredPane innerlayeredpane;
    private javax.swing.JPanel innerpanel;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel mysteryImagelabel;
    private javax.swing.JCheckBox mysterycb;
    private javax.swing.JLabel mysterylabel;
    private javax.swing.JCheckBox nonfictioncb;
    private javax.swing.JLabel nonfictionimagelabel;
    private javax.swing.JLabel nonfictionlabel;
    private javax.swing.JLayeredPane outerlayeredpane;
    private javax.swing.JPanel outerpanel;
    private javax.swing.JCheckBox poetrycb;
    private javax.swing.JLabel poetryimagelabel;
    private javax.swing.JLabel poetrylabel;
    private javax.swing.JCheckBox romancecb;
    private javax.swing.JLabel romanceimagelabel;
    private javax.swing.JLabel romancelabel;
    private javax.swing.JButton saveandnextbutton;
    private javax.swing.JScrollPane scrollpane;
    // End of variables declaration//GEN-END:variables
}
