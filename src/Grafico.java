
import java.awt.Color;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class Grafico extends javax.swing.JFrame {

    public Grafico() {
        initComponents();
        text1.setOpaque(false);
        text2.setOpaque(false);
        stats();
        InsertarParticiones(35, 0, jPanel2);
        PrimerAjuste();
        InsertarParticiones(35, 0, jPanel3);
        MejorAjuste();
        InsertarParticiones(35, 0, jPanel4);
        PeorAjuste();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        text2 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Simulador de Gestión de Memoria");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Particiones");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Informacion general");

        text1.setColumns(20);
        text1.setRows(5);
        text1.setAutoscrolls(false);
        text1.setBorder(null);
        jScrollPane1.setViewportView(text1);

        text2.setColumns(20);
        text2.setRows(5);
        text2.setBorder(null);
        jScrollPane2.setViewportView(text2);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Procesos");

        jPanel4.setBackground(new java.awt.Color(255, 204, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true), "Peor Ajuste", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(255, 0, 255))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(153, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true), "Primer Ajuste", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 102, 255))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        jPanel3.setBackground(new java.awt.Color(204, 255, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true), "Mejor Ajuste", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14), new java.awt.Color(102, 255, 102))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 193, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 531, Short.MAX_VALUE)
        );

        jLabel8.setText("jLabel8");

        jLabel11.setText("jLabel11");

        jLabel9.setText("jLabel9");

        jLabel12.setText("jLabel12");

        jLabel10.setText("jLabel10");

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 195, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 199, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13)))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11))
        );

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setText("Procesos que no lograron entrar:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("Memoria sin asignación:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7))
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(187, 187, 187))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(43, 43, 43)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(40, 40, 40))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void InsertarProcesos(String proceso, int acum_y, boolean igual_o_menor, JPanel jPanel) {
        int x = 35;
        JTextField txtp, txt;
        txtp = new JTextField();
        txt = new JTextField();
        if (igual_o_menor == true) {
            txtp.setSize(105, 43);
        } else {
            txtp.setSize(105, 30);
            txt.setSize(105, 43 - 30);
            txt.setLocation(x, acum_y + 30);
        }
        txtp.setText(proceso);
        txtp.setLocation(x, acum_y);
        jPanel.add(txtp);
        jPanel.add(txt);
        txtp.setEditable(false);
        txt.setEditable(false);
    }

    public void PrimerAjuste() {
        Vector<Integer> v_part = new Vector<Integer>();
        Vector<Integer> v_proc = new Vector<Integer>();
        for (int i = 1; i < Ventana.row; i++) {
            v_part.add(Principal.particiones[i][1]);
        }

        for (int j = 0; j < Ventana.row1; j++) {
            v_proc.add(Principal.procesos[j][1]);
        }

        for (int i = 0; i < Ventana.row - 1; i++) {
            System.out.println(v_part.get(i).toString());
        }

        System.out.println("-------------------------");
        for (int i = 0; i < Ventana.row1; i++) {
            System.out.println(v_proc.get(i).toString());
        }

        int v = 0;
        int acum_y = 45;//posision y desde donde se ubicaran los procesos en las particiones
        for (int j = 0; j < v_part.size(); j++) {
            v = 0;
            for (int i = 0; i < v_proc.size(); i++) {
                if (v == 0) {
                    if (v_proc.get(i) < v_part.get(j) && !v_proc.get(i).equals(new Integer(0))) {
                        acum_y = 67 + 45 * (j);
                        InsertarProcesos("Proceso " + (i + 1) + ": " + v_proc.get(i) + "Kb", acum_y, false, jPanel2);
                        v_part.set(j, new Integer(0));
                        v = 1;
                    } else if (v_proc.get(i) - v_part.get(j) == new Integer(0) && !v_proc.get(i).equals(new Integer(0))) {
                        acum_y = 67 + 45 * (j);
                        InsertarProcesos("Proceso " + (i + 1) + ": " + v_proc.get(i) + "Kb", acum_y, true, jPanel2);
                        v_part.set(j, new Integer(0));
                        v = 1;
                    }
                    if (v == 1) {
                        v_proc.set(i, new Integer(0));
                    }
                }
            }
        }

//////////Verificando las particiones q no se ocuparon(q no son cero) y los procesos pendientes(q no spn cero)
         ProcPendientes_PartVacias(v_proc, v_part, jLabel8, jLabel11, jPanel2);
//////////
    }

    public void MejorAjuste() {
        Vector<Integer> v_part = new Vector<Integer>();
        Vector<Integer> v_proc = new Vector<Integer>();
        Hashtable<Integer, Integer> resta = new Hashtable<Integer, Integer>();
        for (int i = 1; i < Ventana.row; i++) {
            v_part.add(Principal.particiones[i][1]);
        }
        for (int j = 0; j < Ventana.row1; j++) {
            v_proc.add(Principal.procesos[j][1]);
        }

        int pos = -1;
        int acum_y = 45;//posision y desde donde se ubicaran los procesos en las particiones
        for (int j = 0; j < v_proc.size(); j++) {
            for (int i = 0; i < v_part.size(); i++) {
                if (!v_part.get(i).equals(new Integer(0)) && !v_proc.get(j).equals(new Integer(0))) {
                    resta.put(i, v_part.get(i) - v_proc.get(j));//guardamos  la resta y el indice dela particion q' tiene el espacio mas pequeno disponible
                }

            }
            Enumeration<Integer> e = resta.keys();//guardamos en "e" los indice dela particion q' tiene el espacio mas pequeno disponible
            Integer min = new Integer(100000);
            while (e.hasMoreElements()) {
                Integer indice = e.nextElement();
                //no colocamos <= porque sera la primera particion espacio mas grande encontrada
                if (resta.get(indice) < min && resta.get(indice) >= new Integer(0)) {
                    min = resta.get(indice);
                    pos = indice;//posision toma el valor del indice dela particion q' tiene el pequeno disponible
                }
            }
            ///////////////enviando parametros
            if (!min.equals(new Integer(100000))) {
                acum_y = 67 + 45 * (pos);
                if (!min.equals(new Integer(0))) {
                    InsertarProcesos("Proceso " + (j + 1) + ": " + v_proc.get(j) + "Kb", acum_y, false, jPanel3);
                } else {
                    InsertarProcesos("Proceso " + (j + 1) + ": " + v_proc.get(j) + "Kb", acum_y, true, jPanel3);
                }
                v_proc.set(j, new Integer(0));
            }
            resta.clear();//limpiamos el vestor resta
            if (pos != -1) {
                v_part.set(pos, new Integer(0));
            }
        }
        //////////Verificando las particiones q no se ocuparon(q no son cero) y los procesos pendientes
        ProcPendientes_PartVacias(v_proc, v_part, jLabel9, jLabel12, jPanel3);
//////////
    }

    public void PeorAjuste() {
        Vector<Integer> v_part = new Vector<Integer>();
        Vector<Integer> v_proc = new Vector<Integer>();
        Hashtable<Integer, Integer> resta = new Hashtable<Integer, Integer>();
                
        for (int i = 1; i < Ventana.row; i++) {
            v_part.add(Principal.particiones[i][1]);
        }
        for (int j = 0; j < Ventana.row1; j++) {
            v_proc.add(Principal.procesos[j][1]);
        }
        int pos = -1;
        int acum_y = 45;//posision y desde donde se ubicaran los procesos en las particiones

        for (int j = 0; j < v_proc.size(); j++) {
            for (int i = 0; i < v_part.size(); i++) {
                if (!v_part.get(i).equals(new Integer(0)) && !v_proc.get(j).equals(new Integer(0))) {
                    resta.put(i, v_part.get(i) - v_proc.get(j));//guardamos  la resta y el indice dela particion q' tiene el espacio mas pequeño suficiente
                }

            }
            Enumeration<Integer> e = resta.keys();//guardamos en "e" los indice dela particion q' tiene el espacio mas pequeño suficiente
            Integer max = new Integer(-1);
            while (e.hasMoreElements()) {
                Integer indice = e.nextElement();
                if (resta.get(indice) >= max && resta.get(indice) >= new Integer(0)) {
                    max = resta.get(indice);
                    pos = indice;//posision toma el valor del indice dela particion q' tiene el espacio mas grande suficiente
                }
            }
            ///////////////enviando parametros
            if (!max.equals(new Integer(-1))) {
                acum_y = 67 + 45 * (pos);
                if (!max.equals(new Integer(0))) {
                    InsertarProcesos("Proceso " + (j + 1) + ": " + v_proc.get(j) + "Kb", acum_y, false, jPanel4);
                } else {
                    InsertarProcesos("Proceso " + (j + 1) + ": " + v_proc.get(j) + "Kb", acum_y, true, jPanel4);
                }
                v_proc.set(j, new Integer(0));
            }
            resta.clear();//limpiamos el vestor resta
            if (pos != -1) {
                v_part.set(pos, new Integer(0));
            }
        }
        //////////Verificando las particiones q no se ocuparon(q no son cero) y los procesos pendientes
        ProcPendientes_PartVacias(v_proc, v_part, jLabel10, jLabel13, jPanel4);
    }

    void ProcPendientes_PartVacias(Vector<Integer> v_proc, Vector<Integer> v_part, JLabel jText, JLabel jTextx, JPanel jPanel) {
        int suma = 0, i = 1;
        int acum_y = 45;
        String texto = " ";
        for (Integer p : v_proc) {//for each
            if (!p.equals(new Integer(0))) {
                texto = texto + "P" + String.valueOf(i)+" ";
                suma += p;
            }
            i += 1;
        }
        //jText.setText(/*texto.substring(1, texto.length() - 2) + " = " */ suma + " Kb.");
        jText.setText(texto);
        jTextx.setText(suma+"Kb");
        i = 0;
        for (Integer par : v_part) {//for each
            if (!par.equals(new Integer(0))) {
                acum_y = 67 + 45 * (i);
                InsertarProcesos("", acum_y, true, jPanel);
            }
            i += 1;
        }
    }

    public void InsertarParticiones(int x, int y, JPanel jPanel) {
        int total;
        total = 0;
        for (int i = 0; i < Ventana.row; i++) {
            y = y + 45;
            JTextField txt;
            JLabel lbl;
            JSeparator separador;
            txt = new JTextField();
            lbl = new JLabel();
            separador = new JSeparator();
            separador.setSize(105 + 10, 2);
            lbl.setSize(30, 10);
            if (i == 0) {//Particion del S.O
                txt.setBackground(Color.lightGray);
                txt.setSize(105, 43 - 25);
                separador.setLocation(x, y);
                txt.setLocation(x, y + 2);
                txt.setText("             S.O");
                lbl.setLocation(x + 105, y + 45 - 25 + 2);
                y = y - 25;
            } else {
                separador.setLocation(x, y);
                lbl.setLocation(x + 105, y + 45 + 2);
            }
            jPanel.add(separador);
            jPanel.add(lbl);
            jPanel.add(txt);
            separador.setBackground(Color.black);
            total = total + Principal.particiones[i][1];/*Integer.parseInt(String.valueOf(jTable2.getValueAt(i, 1)))*/;
            lbl.setText(String.valueOf(total));

        }
    }

    public void stats() {
        /*System.out.println(Ventana.row);
        System.out.println(Ventana.row1);
        System.out.println(Ventana.col);
        System.out.println(Ventana.col1);
         */
        String cadena = "";
        for (int i = 0; i < Ventana.row; i++) {
            cadena += "Partición " + Principal.particiones[i][0] + " ---- " + Principal.particiones[i][1] + "kb\n";
            text1.setText("\n" + cadena);

        }

        cadena = "";
        for (int i = 0; i < Ventana.row1; i++) {
            cadena += "Proceso " + Principal.procesos[i][0] + " ---- " + Principal.procesos[i][1] + "kb\n";
            text2.setText("\n" + cadena);
        }

        text1.setEnabled(false);
        text2.setEnabled(false);

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
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Grafico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Grafico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea text1;
    private javax.swing.JTextArea text2;
    // End of variables declaration//GEN-END:variables
}
