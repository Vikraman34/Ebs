/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myPackage;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Viki
 */
public class ChangePassword extends javax.swing.JFrame {

    /**
     * Creates new form ChangePassword
     */
    public ChangePassword() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        a = new javax.swing.JPasswordField();
        b = new javax.swing.JPasswordField();
        c = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Enter Old Pssword :");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, 130, 30));

        jLabel2.setText("Enter New Password : ");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 180, 150, 30));

        jLabel3.setText("Re Type Password :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 130, 30));

        jButton1.setText("Ok");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, 90, 40));

        jButton2.setText("Return");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 400, 79, 41));
        getContentPane().add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 92, 150, 30));
        getContentPane().add(b, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 182, 150, 30));
        getContentPane().add(c, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 260, 150, 30));

        setSize(new java.awt.Dimension(800, 480));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Page1_1 ob=new Page1_1();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
       String p1=new String(a.getPassword());
       String p2=new String(b.getPassword());
       String p3=new String(c.getText());

        ArrayList<UserDetails> B;
        try{
        FileInputStream fi1=new FileInputStream("User.tmp");
        ObjectInputStream o1 =new ObjectInputStream(fi1);
        B=(ArrayList<UserDetails>) o1.readObject();

        o1.close();
        fi1.close();
        }
        catch(Exception e)
        {
                B=new ArrayList<UserDetails>();
        }
        
        ArrayList<Index> arr;
        try{
        FileInputStream fi11=new FileInputStream("Number.tmp");
        ObjectInputStream o11 =new ObjectInputStream(fi11);
        arr=(ArrayList<Index>) o11.readObject();

        o11.close();
        fi11.close();
        }
        catch(Exception e)
        {
                arr=new ArrayList<Index>();
        }
        
        Index temp=new Index();
        temp=arr.get(0);
        
        UserDetails obj=B.get(temp.ind);
        
        if(obj.getPwd().equals(p1))
        {
            if(p2.equals(p3))
            {
                obj.setPwd(p2);
                B.set(temp.ind,obj);
                
                try{
                FileOutputStream fi=new FileOutputStream("User.tmp");
                ObjectOutputStream o =new ObjectOutputStream(fi);

                o.writeObject(B);

                o.close();
                fi.close();
                }
                catch(Exception e)
                {
                    
                }
                    JOptionPane.showMessageDialog(this,"Password Changed Successfully . You Are Logged out");
                    this.dispose();
                    Page1_1 ob=new Page1_1();
                    ob.setVisible(true);
             }
            else
            {
                JOptionPane.showMessageDialog(this,"Password does not match");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Invalid password");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePassword().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField a;
    private javax.swing.JPasswordField b;
    private javax.swing.JTextField c;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}