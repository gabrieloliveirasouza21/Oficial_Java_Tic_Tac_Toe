/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogoVelha;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class TelaDoJogo extends javax.swing.JFrame {
    public int x[][] = new int[3][3];
    public static int res[][] = new int[2][5];
    public int i, j;
    public int num;
    public boolean jogador = false;
    public boolean ganhador = false;
    public int pont1;
    public int pont2;
    public int jogo = 0;
    public int velha = 0;
    public int rodadas = 0;
    
    
    

    /**
     * Creates new form TelaDoJogo
     */
    public TelaDoJogo() {
        initComponents();
        this.setLocationRelativeTo(null);
        jButton1.setVisible(false);
        int num = 2;
        for(i = 0; i < 3; i++){
            for(j = 0; j < 3; j++){
                x[i][j] = num;
                num++;
            }
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane1 = new javax.swing.JLayeredPane();
        jButton10 = new javax.swing.JButton();
        jButton00 = new javax.swing.JButton();
        jButton01 = new javax.swing.JButton();
        jButton22 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton20 = new javax.swing.JButton();
        jButton21 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton02 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        TelaDeFundo = new javax.swing.JLabel();

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(0, 102, 153));
        setBounds(new java.awt.Rectangle(1, 1, 1, 1));
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setMaximumSize(new java.awt.Dimension(649, 679));
        setMinimumSize(new java.awt.Dimension(649, 679));
        setResizable(false);
        getContentPane().setLayout(null);

        jButton10.setBackground(new java.awt.Color(0, 0, 0));
        jButton10.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton10.setForeground(new java.awt.Color(0, 0, 0));
        jButton10.setBorder(null);
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(150, 240, 100, 90);

        jButton00.setBackground(new java.awt.Color(0, 0, 0));
        jButton00.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton00.setForeground(new java.awt.Color(0, 0, 0));
        jButton00.setBorder(null);
        jButton00.setMaximumSize(new java.awt.Dimension(100, 100));
        jButton00.setMinimumSize(new java.awt.Dimension(100, 100));
        jButton00.setPreferredSize(new java.awt.Dimension(100, 100));
        jButton00.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton00MouseClicked(evt);
            }
        });
        jButton00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton00ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton00);
        jButton00.setBounds(150, 110, 100, 100);

        jButton01.setBackground(new java.awt.Color(0, 0, 0));
        jButton01.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton01.setForeground(new java.awt.Color(0, 0, 0));
        jButton01.setBorder(null);
        jButton01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton01MouseClicked(evt);
            }
        });
        jButton01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton01ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton01);
        jButton01.setBounds(280, 110, 90, 100);

        jButton22.setBackground(new java.awt.Color(0, 0, 0));
        jButton22.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton22.setForeground(new java.awt.Color(0, 0, 0));
        jButton22.setBorder(null);
        jButton22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton22MouseClicked(evt);
            }
        });
        getContentPane().add(jButton22);
        jButton22.setBounds(400, 360, 100, 100);

        jButton11.setBackground(new java.awt.Color(0, 0, 0));
        jButton11.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton11.setForeground(new java.awt.Color(0, 0, 0));
        jButton11.setBorder(null);
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton11ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton11);
        jButton11.setBounds(280, 240, 90, 90);

        jButton12.setBackground(new java.awt.Color(0, 0, 0));
        jButton12.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton12.setForeground(new java.awt.Color(0, 0, 0));
        jButton12.setBorder(null);
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton12);
        jButton12.setBounds(400, 240, 100, 90);

        jButton20.setBackground(new java.awt.Color(0, 0, 0));
        jButton20.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton20.setForeground(new java.awt.Color(0, 0, 0));
        jButton20.setBorder(null);
        jButton20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton20MouseClicked(evt);
            }
        });
        getContentPane().add(jButton20);
        jButton20.setBounds(150, 360, 100, 100);

        jButton21.setBackground(new java.awt.Color(0, 0, 0));
        jButton21.setFont(new java.awt.Font("Bookman Old Style", 0, 48)); // NOI18N
        jButton21.setForeground(new java.awt.Color(0, 0, 0));
        jButton21.setBorder(null);
        jButton21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton21MouseClicked(evt);
            }
        });
        getContentPane().add(jButton21);
        jButton21.setBounds(280, 360, 90, 100);

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Book Antiqua", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Jogar novamente");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(190, 510, 256, 36);

        jButton02.setBackground(new java.awt.Color(0, 0, 0));
        jButton02.setFont(new java.awt.Font("Book Antiqua", 0, 48)); // NOI18N
        jButton02.setForeground(new java.awt.Color(0, 0, 0));
        jButton02.setBorder(null);
        jButton02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton02MouseClicked(evt);
            }
        });
        getContentPane().add(jButton02);
        jButton02.setBounds(400, 110, 100, 100);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Vez dos Humanos");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 30, 320, 48);

        TelaDeFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jogoVelha/Tela de fundo Jogo da velha.png"))); // NOI18N
        TelaDeFundo.setMaximumSize(new java.awt.Dimension(619, 679));
        TelaDeFundo.setMinimumSize(new java.awt.Dimension(619, 679));
        getContentPane().add(TelaDeFundo);
        TelaDeFundo.setBounds(0, 0, 648, 680);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton02MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton02MouseClicked
        if(x[0][2] != 0 && x[0][2] != 1 && !ganhador){
            if(jogador){
                x[0][2] = 0;
                jButton02.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[0][2] = 1;
                jButton02.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton02MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(jogador){
            jLabel1.setText("Vez dos Aliens");
        }else jLabel1.setText("Vez dos Humanos");
        if(rodadas < 5){
            int num = 2;
            for(i = 0; i < 3; i++){
                for(j = 0; j < 3; j++){
                    x[i][j] = num;
                    num++;
                }
            }
            ganhador = false;
            limpeza();
            jButton1.setVisible(false);
            if(rodadas == 4){
                jButton1.setText("Ver resultados");
            }
        }
        else{
            dispose();
            TelaResultado resultado = new TelaResultado();
            resultado.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton21MouseClicked
        if(x[2][1] != 0 && x[2][1] != 1 && !ganhador){
            if(jogador){
                x[2][1] = 0;
                jButton21.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[2][1] = 1;
                jButton21.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton21MouseClicked

    private void jButton20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton20MouseClicked
        if(x[2][0] != 0 && x[2][0] != 1 && !ganhador){
            if(jogador){
                x[2][0] = 0;
                jButton20.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[2][0] = 1;
                jButton20.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton20MouseClicked

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton12ActionPerformed

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        if(x[1][2] != 0 && x[1][2] != 1 && !ganhador){
            if(jogador){
                x[1][2] = 0;
                jButton12.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[1][2] = 1;
                jButton12.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton11ActionPerformed

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        if(x[1][1] != 0 && x[1][1] != 1 && !ganhador){
            if(jogador){
                x[1][1] = 0;
                jButton11.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[1][1] = 1;
                jButton11.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton22MouseClicked
        if(x[2][2] != 0 && x[2][2] != 1 && !ganhador){
            if(jogador){
                x[2][2] = 0;
                jButton22.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[2][2] = 1;
                jButton22.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton22MouseClicked

    private void jButton01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton01ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton01ActionPerformed

    private void jButton01MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton01MouseClicked
        if(x[0][1] != 0 && x[0][1] != 1 && !ganhador){
            if(jogador){
                x[0][1] = 0;
                jButton01.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[0][1] = 1;
                jButton01.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton01MouseClicked

    private void jButton00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton00ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton00ActionPerformed

    private void jButton00MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton00MouseClicked
        if(x[0][0] != 0 && x[0][0] != 1 && !ganhador){
            if(jogador){
                x[0][0] = 0;
                jButton00.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[0][0] = 1;
                jButton00.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton00MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if(x[1][0] != 0 && x[1][0] != 1 && !ganhador){
            if(jogador){
                x[1][0] = 0;
                jButton10.setIcon(new javax.swing.ImageIcon("Jogador 2 Fundo preto.png"));
            }else{
                x[1][0] = 1;
                jButton10.setIcon(new javax.swing.ImageIcon("Jogador 1.png"));
            }
            sansung();
        }
    }//GEN-LAST:event_jButton10MouseClicked

    public void sansung(){
        for(i = 0; i < 3; i++){
            if(x[i][0] == x[i][1] && x[i][0] == x[i][2]) ganhador = true; //checando ganhador linha
            if(x[0][i] == x[1][i] && x[0][i] == x[2][i]) ganhador = true; // checando ganhador coluna
        }
        if(x[0][0] == x[1][1] && x[0][0] == x[2][2]) ganhador = true; //checando diagonal principal
        if(x[2][0] == x[1][1] && x[1][1] == x[0][2]) ganhador = true; // checando diagonal secundaria
        
        velha ++;
        if(ganhador){
            jLabel1.setText("");
            int num = 2;
            for(i = 0; i < 3; i++){
                for(j = 0; j < 3; j++){
                x[i][j] = num;
                num++;
                }
            }
           if(rodadas == 0){
                if(jogador){
                 res[0][rodadas] = res[0][rodadas] + 5;
                 JOptionPane.showInternalMessageDialog(null,"Os Aliens Ganharam a Batalha");
                }else{
                 res[1][rodadas] = res[0][rodadas] + 5;
                 JOptionPane.showInternalMessageDialog(null,"Os Humanos Ganharam a Batalha");
                }   
           }else{
                if(jogador){
                res[0][rodadas] = res[0][rodadas-1] + 5;
                res[1][rodadas] = res[1][rodadas-1];
                JOptionPane.showInternalMessageDialog(null,"Os Aliens Ganharam a Batalha");
            }else{
                res[1][rodadas] = res[1][rodadas-1] + 5;
                res[0][rodadas] = res[0][rodadas-1];
                JOptionPane.showInternalMessageDialog(null,"Os Humanos Ganharam a Batalha");
            }
           }
            rodadas++;
            velha = 0;
            jButton1.setVisible(true);
        }else{
            if(velha == 9){
                if(rodadas == 0){
                    res[0][rodadas] = res[0][rodadas] + 2;
                    res[1][rodadas] = res[1][rodadas] + 2;
                }else{
                    res[0][rodadas] = res[0][rodadas-1] + 2;
                    res[1][rodadas] = res[1][rodadas-1] + 2;
                }
                jLabel1.setText("");
                JOptionPane.showInternalMessageDialog(null,"Empate");
                rodadas++;
                velha = 0;
                jButton1.setVisible(true);
            }else{
                if(!jogador){
                    jLabel1.setText("Aliens Atacam");
                }else jLabel1.setText("Humanos Atacam");
            }
        }
        jogador = !jogador;
    }
    public void limpeza(){
        jButton00.setIcon(null);
        jButton01.setIcon(null);
        jButton02.setIcon(null);
        jButton10.setIcon(null);
        jButton11.setIcon(null);
        jButton12.setIcon(null);
        jButton20.setIcon(null);
        jButton21.setIcon(null);
        jButton22.setIcon(null);
    }
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
            java.util.logging.Logger.getLogger(TelaDoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaDoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaDoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaDoJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaDoJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TelaDeFundo;
    private javax.swing.JButton jButton00;
    private javax.swing.JButton jButton01;
    private javax.swing.JButton jButton02;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton20;
    private javax.swing.JButton jButton21;
    private javax.swing.JButton jButton22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    // End of variables declaration//GEN-END:variables
}
