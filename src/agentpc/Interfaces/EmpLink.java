/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package agentpc.Interfaces;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.naming.event.EventContext;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

/**
 *
 * @author NRV
 */
public class EmpLink extends javax.swing.JFrame {
public weblink skt;
boolean isconnect=false;
    /**
     * Creates new form EmpLink
     */
    public EmpLink() {
        initComponents();
        getPos_btn.disable();
        getMny_btn.enable(false);
        getSales_btn.enable(false);
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        map = new javax.swing.JLabel();
        connect_btn = new javax.swing.JButton();
        getPos_btn = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        getSales_btn = new javax.swing.JButton();
        getMny_btn = new javax.swing.JButton();
        totlab = new javax.swing.JLabel();
        mnhlb = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        state = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        connect_btn.setText("Connect");
        connect_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                connect_btnMouseClicked(evt);
            }
        });
        connect_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connect_btnActionPerformed(evt);
            }
        });

        getPos_btn.setText("Get Position");
        getPos_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getPos_btnMouseClicked(evt);
            }
        });
        getPos_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getPos_btnActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Rep01(Randul)", "Rep02(Kasun)", "Rep03(Dhanuka)" }));
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        getSales_btn.setText("Get Sales");
        getSales_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getSales_btnMouseClicked(evt);
            }
        });
        getSales_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getSales_btnActionPerformed(evt);
            }
        });

        getMny_btn.setText("Get Money in hand");
        getMny_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                getMny_btnMouseClicked(evt);
            }
        });
        getMny_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getMny_btnActionPerformed(evt);
            }
        });

        totlab.setText("Total");

        mnhlb.setText("Money in hand");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("                             Spy Window");

        state.setText("Disconnected");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(getPos_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getSales_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(getMny_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(connect_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(state, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
            .addGroup(layout.createSequentialGroup()
                .addGap(234, 234, 234)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mnhlb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totlab, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(totlab, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mnhlb, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(map, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(state)
                        .addGap(38, 38, 38)
                        .addComponent(connect_btn)
                        .addGap(32, 32, 32)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(getPos_btn)
                        .addGap(18, 18, 18)
                        .addComponent(getSales_btn)
                        .addGap(18, 18, 18)
                        .addComponent(getMny_btn)))
                .addContainerGap(507, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void connect_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_connect_btnActionPerformed
    
    }//GEN-LAST:event_connect_btnActionPerformed
private void getSales_btnActionPerformed(ActionEvent evt){}
private void getPos_btnActionPerformed(ActionEvent evt){}
private void getMny_btnActionPerformed(ActionEvent evt){}

    private void connect_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_connect_btnMouseClicked
try {
    state.setText("Connecting.....");
    state.setBackground(Color.ORANGE);
    System.out.println("helooooo");
        skt = new weblink(new URI("ws://connect.mysensors.mobi:8080"));
        
        skt.connect();
       while(!isconnect){
           try{
           skt.send("LOGIN #name nirm #skey 12345 @mysensors");
           isconnect=true;
           getPos_btn.enable(true);
        getMny_btn.enable(true);
        getSales_btn.enable(true);
        state.setText("Connected");
        state.setBackground(Color.GREEN);
        
           }
           catch(Exception e){
           }
       }
       
       
        System.out.println("******");
// TODO add your handling code here:
    }
    catch(Exception e){
        e.printStackTrace();
    }        
// TODO add your handling code here:
    }//GEN-LAST:event_connect_btnMouseClicked

    private void getPos_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getPos_btnMouseClicked
        if (!isconnect){
       JOptionPane.showMessageDialog(null, "Please use connect button to reconnect" , "You are not connected", JOptionPane.ERROR_MESSAGE);
       return;
   }
        String u=jComboBox1.getSelectedItem().toString().replace("(","~").replace(")", "~").split("~")[1];
        skt.send("GET #loc @"+u);// TODO add your handling code here:
    }//GEN-LAST:event_getPos_btnMouseClicked

 
 

    

    private void getSales_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getSales_btnMouseClicked
      if (!isconnect){
       JOptionPane.showMessageDialog(null, "Please use connect button to reconnect" , "You are not connected", JOptionPane.ERROR_MESSAGE);
       return;
   }
      String u=jComboBox1.getSelectedItem().toString().replace("(","~").replace(")", "~").split("~")[1];
        skt.send("GET #tot @"+u);  // TODO add your handling code here:
    }//GEN-LAST:event_getSales_btnMouseClicked

    private void getMny_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_getMny_btnMouseClicked
   if (!isconnect){
       JOptionPane.showMessageDialog(null, "Please use connect button to reconnect" , "You are not connected", JOptionPane.ERROR_MESSAGE);
       return;
   }
        String u=jComboBox1.getSelectedItem().toString().replace("(","~").replace(")", "~").split("~")[1];
        skt.send("GET #mnh @"+u);      // TODO add your handling code here:
    }//GEN-LAST:event_getMny_btnMouseClicked

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
               // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
         //System.out.println(jComboBox1.getSelectedItem().toString());// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ItemStateChanged

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
            java.util.logging.Logger.getLogger(EmpLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmpLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmpLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmpLink.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmpLink().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton connect_btn;
    private javax.swing.JButton getMny_btn;
    private javax.swing.JButton getPos_btn;
    private javax.swing.JButton getSales_btn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private static javax.swing.JLabel map;
    private javax.swing.JLabel mnhlb;
    private javax.swing.JLabel state;
    private javax.swing.JLabel totlab;
    // End of variables declaration//GEN-END:variables

class weblink extends WebSocketClient{

        public weblink(URI serverURI) {
            super(serverURI);
        }

        @Override
        public void onOpen(ServerHandshake sh) {
            System.out.println("open");
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onMessage(String string) {
            System.out.println(string);
            handlemessages(string);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        @Override
        public void onClose(int i, String string, boolean bln) {
            System.out.println("Oops");
            isconnect=false;
            getPos_btn.show(false);
            connect_btn.setBackground(Color.YELLOW);
        getMny_btn.enable(false);
        getSales_btn.enable(false);
            this.connect();
          JOptionPane.showMessageDialog(null, "Please use connect button to reconnect" , "You are Disconnected", JOptionPane.ERROR_MESSAGE);
       
       
   }
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        

        @Override
        public void onError(Exception excptn) {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public void handlemessages(String s){
            if (s.contains("#loc")){
                String j[]=s.split(" ");
                if(j.length>3){
                   String destinationFile = "image.png";
        String link="https://maps.googleapis.com/maps/api/staticmap?zoom=14&size=1200x600&maptype=roadmap" +
           "&markers=color:blue%7Clabel:S%7C";
        s=link+j[8]+","+j[7];
        //string=string+"&markers=color:green%7Clabel:S%7C40.702147,-75.015794";
        try {
            saveImage(s, destinationFile);
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        } catch (IOException ex) {
            //Logger.getLogger(JavaApplication2.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        }
        System.out.println("Done");
        try{    
        DisplayImage();
        }
        catch (Exception e){
    }
                }
                
            }
            else if (s.contains("mnh")){
                String j[]=s.split(" ");
                mnhlb.setText("Money in hand :- Rs "+j[3]+" for "+j[0].replace('@', '.'));
            }
            
            else if (s.contains("tot")){
                String j[]=s.split(" ");
                totlab.setText("Total Collected money :- Rs "+j[3]+" for "+j[0].replace('@', '.'));
            }
            else if (s.contains("GETSendFailed")){
                 JOptionPane.showMessageDialog(null, "Sorry We Cannot get Data from "+s.split(":")[1] , "Error in Link", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public void saveImage(String imageUrl, String destinationFile) throws IOException {
		URL url = new URL(imageUrl);
		InputStream is = url.openStream();
		OutputStream os = new FileOutputStream(destinationFile);

		byte[] b = new byte[2048];
		int length;

		while ((length = is.read(b)) != -1) {
			os.write(b, 0, length);
		}

		is.close();
		os.close();
	}

 
    
     public static void DisplayImage() throws IOException
    {
        BufferedImage img=ImageIO.read(new File("image.png"));
        ImageIcon icon=new ImageIcon(img);
       // jPanel2 frame=new JFrame();
       //jLabel1.setBounds((int)jLabel1.getBounds().getX(),(int)jLabel1.getBounds().getY(), icon.getIconWidth(), icon.getIconHeight());
        map.setIcon(icon);
        //jLabel1.add(lbl);
         map.setVisible(true);
        //jPanel2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}

