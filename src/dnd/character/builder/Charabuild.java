
package dnd.character.builder;

import java.util.Random;
public class Charabuild extends javax.swing.JFrame {

    public Charabuild() {
        initComponents();
    }

Random stat = new Random();

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        strength = new javax.swing.JLabel();
        dexterity = new javax.swing.JLabel();
        constitution = new javax.swing.JLabel();
        intelligence = new javax.swing.JLabel();
        wisdom = new javax.swing.JLabel();
        charisma = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        lastName = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        strmod = new javax.swing.JLabel();
        dexmod = new javax.swing.JLabel();
        conmod = new javax.swing.JLabel();
        intmod = new javax.swing.JLabel();
        wismod = new javax.swing.JLabel();
        chamod = new javax.swing.JLabel();
        Class = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        Race = new javax.swing.JComboBox();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        mAtk = new javax.swing.JLabel();
        rAtk = new javax.swing.JLabel();
        classLevel = new javax.swing.JSpinner();
        jButton3 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Basic DnD Character Builder", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("Roll'em");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 365, 81, -1));

        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(558, 365, 83, -1));

        jLabel1.setText("Strength");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 65, 53, 31));

        jLabel2.setText("Dexterity");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 102, -1, -1));

        jLabel3.setText("Constitution");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 134, -1, -1));

        jLabel4.setText("Intelligence");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 166, -1, -1));

        jLabel5.setText("Wisdom");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 210, -1, -1));

        jLabel6.setText("Charisma");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 242, -1, -1));
        jPanel4.add(strength, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 65, -1, -1));
        jPanel4.add(dexterity, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 102, -1, -1));
        jPanel4.add(constitution, new org.netbeans.lib.awtextra.AbsoluteConstraints(92, 134, -1, -1));
        jPanel4.add(intelligence, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 166, -1, -1));
        jPanel4.add(wisdom, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 210, -1, -1));
        jPanel4.add(charisma, new org.netbeans.lib.awtextra.AbsoluteConstraints(89, 242, -1, -1));

        firstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameActionPerformed(evt);
            }
        });
        jPanel4.add(firstName, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 27, 115, -1));

        lastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameActionPerformed(evt);
            }
        });
        jPanel4.add(lastName, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 27, 125, -1));

        jLabel7.setText("First Name");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 27, 69, 20));

        jLabel8.setText("Last Name");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(459, 27, 65, 20));
        jPanel4.add(strmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 65, -1, -1));
        jPanel4.add(dexmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 102, -1, -1));
        jPanel4.add(conmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 134, -1, -1));
        jPanel4.add(intmod, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 166, -1, -1));
        jPanel4.add(wismod, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 210, -1, -1));
        jPanel4.add(chamod, new org.netbeans.lib.awtextra.AbsoluteConstraints(145, 242, -1, -1));

        Class.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Barbarian", "Bard", "Cleric", "Druid", "Fighter", "Monk", "Paladin", "Ranger", "Rogue", "Sorcerer", "Wizard" }));
        jPanel4.add(Class, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, -1, -1));

        jLabel9.setText("Class:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 90, -1, -1));

        Race.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Dwarf", "Elf", "Gnome", "Half-Elf", "Half-Orc", "Halfling", "Human" }));
        jPanel4.add(Race, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 110, -1, -1));

        jLabel10.setText("Race");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, -1, -1));

        jLabel11.setText("Level");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 90, -1, -1));

        jLabel12.setText("Melee Attack Bonus:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 180, -1, -1));

        jLabel13.setText("Ranged Attack Bonus:");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 210, -1, -1));
        jPanel4.add(mAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, -1, -1));
        jPanel4.add(rAtk, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, -1, -1));

        classLevel.setModel(new javax.swing.SpinnerNumberModel(1, 1, 20, 1));
        jPanel4.add(classLevel, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, -1, -1));

        jButton3.setText("Exit");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 593, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        strength.setText("");
        dexterity.setText("");
        constitution.setText("");
        intelligence.setText("");
        wisdom.setText("");
        charisma.setText("");
        strmod.setText("");
        dexmod.setText("");
        conmod.setText("");
        intmod.setText("");
        wismod.setText("");
        chamod.setText("");
        firstName.setText("");
        lastName.setText("");
        mAtk.setText("");
        rAtk.setText("");
        Race.setSelectedIndex(0);
        Class.setSelectedIndex(0);
        classLevel.setValue(1);
           
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int str, dex, con, inte, wis, cha, smod, dmod, cmod, imod, wmod, chmod, melee, ranged, level;
        
        
        String characterRace = (String) Race.getSelectedItem();
        
        level = (int) classLevel.getValue();
        
        String characterClass = (String) Class.getSelectedItem();
        
        //Base Stats with Racial Modifiers
        
        str = (stat.nextInt(6)+1) + (stat.nextInt(6)+1) + (stat.nextInt(6)+1);
        
        if (characterRace.equals("Gnome") || characterRace.equals("Halfling" ))
        {
            str = str - 2;
        }
            
        dex = (stat.nextInt(6)+1) + (stat.nextInt(6)+1) + (stat.nextInt(6)+1);
        
        if (characterRace.equals("Elf") || characterRace.equals("Halfling" ))
        {
            dex = dex + 2;
        }
        
        con = (stat.nextInt(6)+1) + (stat.nextInt(6)+1) + (stat.nextInt(6)+1);
                
        if (characterRace.equals("Dwarf") || characterRace.equals("Gnome"))
        {
            con = con + 2;
        }
        if (characterRace.equals("Elf"))
        {
            con = con - 2;
            
        }
        
        inte = (stat.nextInt(6)+1) + (stat.nextInt(6)+1) + (stat.nextInt(6)+1);
        
        if (characterRace.equals("Elf"))
        {
            inte = inte + 2;
        }
            
        wis = (stat.nextInt(6)+1) + (stat.nextInt(6)+1) + (stat.nextInt(6)+1);
        
        if (characterRace.equals("Dwarf"))
        {
            wis = wis + 2;
        }
                
        cha = (stat.nextInt(6)+1) + (stat.nextInt(6)+1) + (stat.nextInt(6)+1);
        
        if (characterRace.equals("Gnome") || characterRace.equals("Halfling" ))
        {
            cha = cha + 2;
        }
        
        if (characterRace.equals("Dwarf"))
        {
            cha = cha - 2;
        }
        
        //Stat Modifiers
        
        smod = (str-10) / 2;        
        
        if (str-10 < 0 && 0 != (str%2)) 
        {
            --smod;
        }
        
        dmod = (dex-10) / 2;        
        
        if (dex-10 < 0 && 0 != (dex%2)) 
        {
            --dmod;
        }
        
        cmod = (con-10) / 2;
        
        if (con-10 < 0 && 0 != (con%2)) 
        {
            --cmod;
        }
        
        imod = (inte-10) / 2;
        
        if (inte-10 < 0 && 0 != (inte%2)) 
        {
            --imod;
        }
        
        wmod = (wis-10) / 2;
        
        if (wis-10 < 0 && 0 != (wis%2)) 
        {
            --wmod;
        }
        
        chmod = (cha-10) / 2;
        
        if (cha-10 < 0 && 0 != (cha%2)) 
        {
            --chmod;
        }
        
        // Melee and Ranged Attack Bonus
        
        double mod;
        
        if (characterClass.equals("Barbarian") || characterClass.equals("Fighter") || characterClass.equals("Paladin") || characterClass.equals("Ranger"))
        {
            mod = 1;
        }
        else if(characterClass.equals("Bard") || characterClass.equals("Cleric") || characterClass.equals("Druid") || characterClass.equals("Monk") || characterClass.equals("Rogue"))
        {
            mod = 0.75;
        }
        
        else
        {
            mod = 0.5;
        }
            
            melee = (int) (smod + (level * mod));
            
            ranged = (int) (dmod + (level * mod));
        
        
        
        strength.setText(String.valueOf(str));
        dexterity.setText(String.valueOf(dex));
        constitution.setText(String.valueOf(con));
        intelligence.setText(String.valueOf(inte));
        wisdom.setText(String.valueOf(wis));
        charisma.setText(String.valueOf(cha));
        
        strmod.setText(String.valueOf(smod));
        dexmod.setText(String.valueOf(dmod));
        conmod.setText(String.valueOf(cmod));
        intmod.setText(String.valueOf(imod));
        wismod.setText(String.valueOf(wmod));
        chamod.setText(String.valueOf(chmod));
        mAtk.setText(String.valueOf(melee));
        rAtk.setText(String.valueOf(ranged));
        
    
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void firstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameActionPerformed

    private void lastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameActionPerformed

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
            java.util.logging.Logger.getLogger(Charabuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Charabuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Charabuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Charabuild.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Charabuild().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Class;
    private javax.swing.JComboBox Race;
    private javax.swing.JLabel chamod;
    private javax.swing.JLabel charisma;
    private javax.swing.JSpinner classLevel;
    private javax.swing.JLabel conmod;
    private javax.swing.JLabel constitution;
    private javax.swing.JLabel dexmod;
    private javax.swing.JLabel dexterity;
    private javax.swing.JTextField firstName;
    private javax.swing.JLabel intelligence;
    private javax.swing.JLabel intmod;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField lastName;
    private javax.swing.JLabel mAtk;
    private javax.swing.JLabel rAtk;
    private javax.swing.JLabel strength;
    private javax.swing.JLabel strmod;
    private javax.swing.JLabel wisdom;
    private javax.swing.JLabel wismod;
    // End of variables declaration//GEN-END:variables
}
