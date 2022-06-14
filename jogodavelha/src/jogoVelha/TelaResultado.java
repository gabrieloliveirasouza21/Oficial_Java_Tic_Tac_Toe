/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jogoVelha;

/**
 *
 * @author HP
 */
public class TelaResultado extends javax.swing.JFrame {
    public int i = 0 , j = 0;
    public int v, t;
    public String valores = "";
    public int a[][] = new int[2][5];
    public int b[][] = new int[2][5];
    public int c[][] = new int[5][2];
    public int d[][] = new int[2][5];
    public int e[][] = new int[2][5];
    public int f[][] = new int[5][5];

    /**
     * Creates new form TelaResultado
     */
    public TelaResultado() {
        initComponents();
        this.setLocationRelativeTo(null);
        for(i = 0; i < 2; i ++){
            for(j = 0; j < 5; j++){
                a[i][j] = TelaDoJogo.res[i][j];
                b[i][j] = TelaDoJogo.res[i][4-j];
                c[j][i] = TelaDoJogo.res[i][j];
                d[i][j] = a[i][j] + b[i][j];
                e[i][j] = a[i][j] - b[i][j];
            }
        }
        f[0][0] = a[0][0]*c[0][0] + a[0][1]*c[1][0] + a[0][2]*c[2][0] + a[0][3]*c[3][0] + a[0][4]*c[4][0];
        f[0][1] = a[0][0]*c[0][1] + a[0][1]*c[1][1] + a[0][2]*c[2][1] + a[0][3]*c[3][1] + a[0][4]*c[4][1];
        f[1][0] = a[1][0]*c[0][0] + a[1][1]*c[1][0] + a[1][2]*c[2][0] + a[1][3]*c[3][0] + a[1][4]*c[4][0];
        f[1][1] = a[1][0]*c[0][1] + a[1][1]*c[1][1] + a[1][2]*c[2][1] + a[1][3]*c[3][1] + a[1][4]*c[4][1];
    }
    public String TrocaTroca(int x){
        v = 0;
        valores = "";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                v += a[i][j];
            }
        }
        while(v > 0){
            t = v%x;
            if(t >= 10){
                if(t < 11)valores = "A" + valores;
                else if(t < 12)valores = "B" + valores;
                else if(t < 13)valores = "C" + valores;
                else if(t < 14)valores = "D" + valores;
                else if(t < 15)valores = "E" + valores;
                else valores = "F" + valores;
            }else{
                 valores = t + valores;
            }
            v = v/x;
        }
        return(valores);
    } 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonA = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonBinario = new javax.swing.JButton();
        jButtonOctal = new javax.swing.JButton();
        jButtonHexadecimal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreaResultado = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setToolTipText("matriz B contendo os valores invertidos da matriz A");

        jButtonA.setText("Matriz A");
        jButtonA.setToolTipText("Matriz A contendo os mesmos valores da matriz resultado.");
        jButtonA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonAMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButtonAMouseEntered(evt);
            }
        });

        jButtonB.setText("Matriz B");
        jButtonB.setToolTipText("Matriz B contendo os valores invertidos da matriz A");
        jButtonB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBMouseClicked(evt);
            }
        });

        jButtonC.setText("Matriz C");
        jButtonC.setToolTipText("Matriz C transposta a matriz A");
        jButtonC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonCMouseClicked(evt);
            }
        });

        jButtonD.setText("Matriz D");
        jButtonD.setToolTipText("Matriz D que corresponde a adição entre a matriz A e a matriz B");
        jButtonD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonDMouseClicked(evt);
            }
        });

        jButtonE.setText("Matriz E");
        jButtonE.setToolTipText("Matriz E que corresponde a subtração entre a matriz A e a matriz B");
        jButtonE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonEMouseClicked(evt);
            }
        });

        jButtonF.setText("Matriz F");
        jButtonF.setToolTipText("Matriz F que corresponde a multiplicação entre a matriz A e a matriz C");
        jButtonF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonFMouseClicked(evt);
            }
        });

        jButtonBinario.setText("Binario");
        jButtonBinario.setToolTipText("Variável B1 que corresponde ao valor binário do somatório dos resultados existentes na Matriz Resultado. ");
        jButtonBinario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonBinarioMouseClicked(evt);
            }
        });

        jButtonOctal.setText("Octal");
        jButtonOctal.setToolTipText("Variável O1 que corresponde ao valor octal do somatório dos resultados existentes na Matriz Resultado. ");
        jButtonOctal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonOctalMouseClicked(evt);
            }
        });

        jButtonHexadecimal.setText("Hexadecimal");
        jButtonHexadecimal.setToolTipText("Variável H1 que corresponde ao valor hexadecimal do somatório dos resultados existentes na Matriz Resultado.");
        jButtonHexadecimal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonHexadecimalMouseClicked(evt);
            }
        });

        jTextAreaResultado.setColumns(20);
        jTextAreaResultado.setRows(5);
        jScrollPane1.setViewportView(jTextAreaResultado);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 51));
        jLabel1.setText("Resultados");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButtonHexadecimal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonOctal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonD, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonBinario, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(101, 101, 101))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jButtonA, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonB)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonC)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonD)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonF)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonBinario)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonOctal)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonHexadecimal))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jButtonA.getAccessibleContext().setAccessibleDescription("teste");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBinarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBinarioMouseClicked
        jTextAreaResultado.setText(TrocaTroca(2));
    }//GEN-LAST:event_jButtonBinarioMouseClicked

    private void jButtonAMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAMouseClicked
        valores = "";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                if(a[i][j] > 9) valores += " " + a[i][j] + " ";
                else valores += " " + a[i][j] + "  ";
            }
            valores += "\n";
        }
        jTextAreaResultado.setText(valores);                                   
    }//GEN-LAST:event_jButtonAMouseClicked

    private void jButtonOctalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonOctalMouseClicked
        jTextAreaResultado.setText(TrocaTroca(8));
    }//GEN-LAST:event_jButtonOctalMouseClicked

    private void jButtonHexadecimalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonHexadecimalMouseClicked
        jTextAreaResultado.setText(TrocaTroca(16));
    }//GEN-LAST:event_jButtonHexadecimalMouseClicked

    private void jButtonBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonBMouseClicked
        valores = "";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                if(b[i][j] > 9) valores += " " + b[i][j]+ "  ";
                else valores += " " + b[i][j] + "  ";
            }
            valores += "\n";
        }
        jTextAreaResultado.setText(valores);                                   
    }//GEN-LAST:event_jButtonBMouseClicked

    private void jButtonCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonCMouseClicked
        valores = "";
        for(i = 0; i < 5; i++){
            for(j = 0; j < 2; j++){
                if(c[i][j] > 9) valores += " " + c[i][j] + "  ";
                else valores += "  " + c[i][j] + "  ";
            }
            valores += "\n";
        }
        jTextAreaResultado.setText(valores);
    }//GEN-LAST:event_jButtonCMouseClicked

    private void jButtonDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonDMouseClicked
        valores = "";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                if(d[i][j] > 9) valores += "   " + d[i][j];
                else valores += "    " + d[i][j];
            }
            valores += "\n";
        }
        jTextAreaResultado.setText(valores);
    }//GEN-LAST:event_jButtonDMouseClicked

    private void jButtonEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonEMouseClicked
        valores = "";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 5; j++){
                if(e[i][j] > 9) valores += "   " + e[i][j];
                else valores += "    " + e[i][j];
            }
            valores += "\n";
        }
        jTextAreaResultado.setText(valores);                                    
    }//GEN-LAST:event_jButtonEMouseClicked

    private void jButtonFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonFMouseClicked
        valores = "";
        for(i = 0; i < 2; i++){
            for(j = 0; j < 2; j++){
                if(f[i][j] > 9) valores += "   " + f[i][j];
                else valores += "    " + f[i][j];
            }
            valores += "\n";
        }
        jTextAreaResultado.setText(valores);                                
    }//GEN-LAST:event_jButtonFMouseClicked

    private void jButtonAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonAMouseEntered
        
    }//GEN-LAST:event_jButtonAMouseEntered

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
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaResultado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaResultado().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonBinario;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonHexadecimal;
    private javax.swing.JButton jButtonOctal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreaResultado;
    // End of variables declaration//GEN-END:variables
}