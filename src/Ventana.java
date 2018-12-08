
import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;
import javax.swing.table.DefaultTableModel;

public class Ventana extends javax.swing.JFrame {

    public static int row, col, row1, col1, tamañoSO;

    SpinnerNumberModel[] vector_modelos = new SpinnerNumberModel[3];
    DefaultTableModel md;
    DefaultTableModel md1;
    DefaultTableModel md2;
    String data[][] = {};
    String data1[][] = {};
    String data2[][] = {};
    String cabeza[] = {"N° de Partición", "Tamaño(kb)"};
    String cabeza1[] = {"N° de Proceso", "Tamaño (kb)"};
    String cabeza2[] = {"N° de Proceso", "Tamaño (kb)", "Tiempo"};

    public Ventana() {
        initComponents();

        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(9);
        nm.setMinimum(0);

        SpinnerNumberModel nm1 = new SpinnerNumberModel();
        nm1.setMaximum(9);
        nm1.setMinimum(0);

        SpinnerNumberModel nm2 = new SpinnerNumberModel();
        nm2.setMinimum(0);

        md = new DefaultTableModel(data, cabeza);
        md1 = new DefaultTableModel(data1, cabeza1);
        md2 = new DefaultTableModel(data2, cabeza2);

        jTable1.setEnabled(false);
        jTable2.setEnabled(false);

        Spinner1.setModel(nm);
        Spinner2.setModel(nm1);
        Spinner3.setModel(nm2);

        Spinner1.setEnabled(false);
        Spinner2.setEnabled(false);
        Spinner3.setEnabled(false);

        aceptar.setEnabled(false);
        graficar.setEnabled(false);

        borrar.setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Spinner1 = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        Spinner2 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        Spinner3 = new javax.swing.JSpinner();
        aceptar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        borrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        selector = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        graficar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Simulador de Gestión de Memoria");

        jLabel2.setText("Numero de Procesos");

        jLabel3.setText("Numero de Particiones");

        jLabel4.setText("Tamaño de la memoria");

        aceptar.setText("Aceptar");
        aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aceptarActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("Tabla de Procesos");

        jLabel6.setText("Tabla de Partciones");

        borrar.setText("Borrar");
        borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                borrarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logotipo-buap-2014.gif"))); // NOI18N
        jLabel8.setText("jLabel8");

        selector.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona...", "Fija", "Variable" }));
        selector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectorActionPerformed(evt);
            }
        });

        jLabel9.setText("Tipo de particion");

        graficar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        graficar.setText("Generar grafico");
        graficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                graficarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel7)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 398, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(106, 106, 106)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(aceptar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(borrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addComponent(graficar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(70, 70, 70))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(selector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(aceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(borrar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Spinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Spinner2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Spinner3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(1, 1, 1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(graficar))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_borrarActionPerformed
        restablecer_todo();
        //aceptar.setEnabled(true);
        borrar.setEnabled(false);
        selector.setEnabled(true);
        aceptar.setEnabled(false);
        graficar.setEnabled(false);
        jLabel7.setText("");
    }//GEN-LAST:event_borrarActionPerformed

    private void aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aceptarActionPerformed
        // TODO add your handling code here:

        //borrar.setEnabled(false);
        selector.setEnabled(false);
        Monitor.memoria.clear();
        Monitor.procesos.clear();
        int a, b, c;
        a = (int) Spinner1.getValue();
        b = (int) Spinner2.getValue();
        c = (int) Spinner3.getValue();
        if (selector.getSelectedIndex() == 1) {

            if (a <= 0 || b <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor complete los campos correspondientes", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {
                jLabel7.setText("Acontinuacion, ingrese la informacion de particiones y procesos");
                aceptar.setEnabled(false);
                borrar.setEnabled(true);

                Spinner1.setEnabled(false);
                Spinner2.setEnabled(false);
                Spinner3.setEnabled(false);

                jTable1.setEnabled(true);
                jTable2.setEnabled(true);
                String datos[] = {""};

                datos[0] = "S.O";
                md.addRow(datos);
                for (int i = 1; i <= b; i++) {
                    datos[0] = String.valueOf(i);
                    md.addRow(datos);
                }

                for (int i = 0; i < a; i++) {
                    datos[0] = "P" + String.valueOf(i);
                    md1.addRow(datos);
                }
            }

        }

        if (selector.getSelectedIndex() == 2) {

            if (a <= 0 || c <= 0) {
                JOptionPane.showMessageDialog(null, "Por favor complete los campos correspondientes", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            } else {
                jLabel7.setText("Acontinuación, ingrese la informacion de los procesos");
                Spinner1.setEnabled(false);
                Spinner2.setEnabled(false);
                Spinner3.setEnabled(false);

                aceptar.setEnabled(false);
                borrar.setEnabled(true);

                jTable1.setEnabled(true);
                jTable2.setEnabled(true);

                String datos[] = {""};
                datos[0] = "S.O";
                md2.addRow(datos);
                Monitor.tam = c;
                for (int i = 1; i <= a; i++) {
                    datos[0] = "P" + String.valueOf(i);
                    md2.addRow(datos);
                }

            }

        }
    }//GEN-LAST:event_aceptarActionPerformed

    private void graficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_graficarActionPerformed

        if (selector.getSelectedIndex() == 1) {

            row = md.getRowCount();
            col = md.getColumnCount();
            row1 = md1.getRowCount();
            col1 = md1.getColumnCount();
            boolean band = false, band1 = false;
            for (int i = md.getRowCount() - 1; i >= 0; i--) {
                System.out.println("tabla de particiones");
                band = Validar(md, i, 1);
                if (band != true) {
                    break;

                }
            }

            for (int i = md1.getRowCount() - 1; i >= 0; i--) {
                System.out.println("tabla de procesos");
                band1 = Validar(md1, i, 1);
                if (band1 != true) {
                    break;
                }
            }

            if (band == false || band1 == false) {
                JOptionPane.showMessageDialog(null, "Por favor revise bien sus datos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

            } else {
                int opcion = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog(null, "Ya no podras modificar los valores, ¿Deseas continuar?", "Mensaje del sistema", opcion);

                if (opcion == JOptionPane.YES_OPTION) {
                    recuperar_inf();
                    this.setExtendedState(ICONIFIED);
                    Grafico grafico = new Grafico();
                    grafico.setVisible(true);
                    grafico.setResizable(false);
                    grafico.setLocationRelativeTo(null);
                }
                jTable1.setEnabled(false);
                jTable2.setEnabled(false);

            }
        }

        if (selector.getSelectedIndex() == 2) {

            row1 = md2.getRowCount();
            col1 = md2.getColumnCount();

            boolean band = false, band1 = false;
            for (int i = md2.getRowCount() - 1; i >= 0; i--) {
                band = Validar(md2, i, 1);
                if (band != true) {
                    break;

                }
            }

            if (band == false) {
                JOptionPane.showMessageDialog(null, "Por favor revise bien sus datos", "Mensaje de Error", JOptionPane.ERROR_MESSAGE);

            } else {
                int opcion = JOptionPane.YES_NO_OPTION;
                JOptionPane.showConfirmDialog(null, "Ya no podras modificar los valores, ¿Deseas continuar?", "Mensaje del sistema", opcion);

                if (opcion == JOptionPane.YES_OPTION) {
                    Principal.procesos[0][0] = Integer.parseInt(md2.getValueAt(0, 1).toString());
                    Principal.procesos[0][1] = Integer.parseInt(md2.getValueAt(0, 2).toString());
                    Monitor.procesos.add(new Proceso(Principal.procesos[0][0],Principal.procesos[0][1],"S.O"));
                    for (int i = 1; i < md2.getRowCount(); i++) {
                        Principal.procesos[i][0] = Integer.parseInt(md2.getValueAt(i, 1).toString());
                        Principal.procesos[i][1] = Integer.parseInt(md2.getValueAt(i, 2).toString());
                        Monitor.procesos.add(new Proceso(Principal.procesos[i][0],Principal.procesos[i][1],("P"+(i+1))));
                    }
                    //this.setExtendedState(ICONIFIED);

                    //Variable variable = new Variable();
                    //variable.setVisible(true);
                    //variable.setResizable(false);
                    //variable.setLocationRelativeTo(null);
                    Monitor.tam = (int) Spinner3.getValue();
                    Monitor mon = new Monitor();
                    row1 = md2.getRowCount();
                    col1 = md2.getColumnCount();
                    Principal.mostrar(row1);
                }
                jTable1.setEnabled(false);

            }

        }


    }//GEN-LAST:event_graficarActionPerformed

    private void selectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectorActionPerformed

        // TODO add your handling code here:
        if (selector.getSelectedIndex() == 1) {
            Spinner1.setEnabled(true);
            Spinner2.setEnabled(true);
            Spinner3.setEnabled(false);
            aceptar.setEnabled(true);
            graficar.setEnabled(true);

            jTable2.setModel(md);
            jTable1.setModel(md1);

        }
        if (selector.getSelectedIndex() == 2) {
            graficar.setEnabled(true);
            Spinner1.setEnabled(true);
            Spinner2.setEnabled(false);
            Spinner3.setEnabled(true);
            aceptar.setEnabled(true);
            jTable2.setEnabled(false);
            jTable1.setModel(md2);

        }
    }//GEN-LAST:event_selectorActionPerformed

    public void recuperar_inf() {

        for (int i = 0; i < md.getRowCount(); i++) {
            Principal.particiones[i][0] = i;
            Principal.particiones[i][1] = Integer.parseInt(md.getValueAt(i, 1).toString());
        }

        for (int i = 0; i < md1.getRowCount(); i++) {
            Principal.procesos[i][0] = i;
            Principal.procesos[i][1] = Integer.parseInt(md1.getValueAt(i, 1).toString());
        }

    }

    public void restablecer_todo() {

        for (int i = md.getRowCount() - 1; i >= 0; i--) {
            md.removeRow(md.getRowCount() - 1);
        }

        for (int i = md1.getRowCount() - 1; i >= 0; i--) {
            md1.removeRow(md1.getRowCount() - 1);
        }

        for (int i = md2.getRowCount() - 1; i >= 0; i--) {
            md2.removeRow(md2.getRowCount() - 1);
        }

        Spinner1.setValue(0);
        Spinner2.setValue(0);
        Spinner3.setValue(0);

        Spinner1.setEnabled(false);
        Spinner2.setEnabled(false);
        Spinner3.setEnabled(false);

        aceptar.setEnabled(false);
        selector.setSelectedIndex(0);
        Monitor.memoria.clear();
        Monitor.procesos.clear();
    }

    private boolean Validar(DefaultTableModel md, int fila, int columna) {
        String valor;
        System.out.println("en funcion Validar md: "+md+"fila: "+fila+"col:"+columna);
        if (md.getValueAt(fila, columna) == null) {
            System.out.println(""+md.getValueAt(fila, columna));
            return false;
        } else {
            valor = (String) md.getValueAt(fila, columna);
            System.out.println(""+valor);
            return true;
        }
    }

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner Spinner1;
    private javax.swing.JSpinner Spinner2;
    private javax.swing.JSpinner Spinner3;
    private javax.swing.JButton aceptar;
    private javax.swing.JButton borrar;
    private javax.swing.JButton graficar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JComboBox<String> selector;
    // End of variables declaration//GEN-END:variables
}
