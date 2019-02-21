

package vista;


import controlador.AspiranteControlador;
import controlador.CategoriaControlador;
import controlador.DisciplinaControlador;
import controlador.EscuelaControlador;
import controlador.RegistrarAspiranteControlador;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Aspirante;
import modelo.Categoria;
import modelo.Disciplina;
import modelo.Escuela;
import modelo.InscripcionAspirante;


public class RegistrarAspirante extends javax.swing.JFrame {
    
    private int idEsc=0;
    private String categoria = "null";
    private String aspirante = "null";
      
    public RegistrarAspirante() {
        initComponents();
        jButton1.setEnabled(false);
        cargarEscuela();
        
        cargarCategoria();
        
        cargarDisciplina();
    }
       
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Aspirante");
        setResizable(false);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("Seleccione una Entidad Educativa"));
        jList1.setForeground(new java.awt.Color(51, 51, 255));
        jList1.setToolTipText("Sleccione una Escuela para empezar...!!!");
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Aspirantes"));

        jList2.setForeground(new java.awt.Color(51, 51, 255));
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList2);

        jButton1.setText("Nuevo Aspirante");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 449, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(51, 274, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Competencias"));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", "Disciplina"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(20);
        }

        jList3.setBorder(javax.swing.BorderFactory.createTitledBorder("Categorias"));
        jList3.setForeground(new java.awt.Color(255, 51, 51));
        jList3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList3MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jList3);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Aceptar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("Cancelar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        
        DefaultListModel modeloEsc = new DefaultListModel();
        
        String mensaje;
        String Query;
        mensaje = jList1.getSelectedValue().toString();
        jList2.removeAll();
        
        EscuelaControlador ec = new EscuelaControlador();
        
        idEsc = ec.buscarEscuela(mensaje);
        
        
        
       AspiranteControlador ac=new AspiranteControlador();
        List<Aspirante> aspirantes=ac.buscarAspirantes(idEsc);
        
        for (Object o : aspirantes) {
            Aspirante asp = (Aspirante) o;
            modeloEsc.addElement(asp.getNombre()+" "+asp.getApellido());
        }
        
        jList2.setModel(modeloEsc);
        jButton1.setEnabled(true);
      
        
        
        
    }//GEN-LAST:event_jList1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NuevoAspirante na = new NuevoAspirante(idEsc);
        na.setLocationRelativeTo(null);
        na.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
        
       System.exit(0);  
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jList3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList3MouseClicked
        
        

              String cat;
              
              cat = jList3.getSelectedValue().toString();
              categoria=cat;
             
              
            

            
        
        
        
    }//GEN-LAST:event_jList3MouseClicked

    private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked
        
       
         try {
            String asp=null;
          asp = jList2.getSelectedValue().toString();
          aspirante = asp;
          
        } catch (Exception e) {
            
            System.err.println("Error "+e);
            
            
        
              
              JOptionPane.showMessageDialog(null, "Debes agregar aspirante/s para poder seleccionarlo...!!!", "Alerta", JOptionPane.WARNING_MESSAGE); 
            
        
        }
        
        
        
    }//GEN-LAST:event_jList2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            
            
         if ((this.aspirante != "null") && (this.categoria!="null")) {
            
        InscripcionAspirante ia = new InscripcionAspirante();
            ia.setAspirante(this.aspirante);
            ia.setCategoria(this.categoria);
            
            List<String> listaDis = new ArrayList<String>();
            Integer num = 0;
            for (int i = 0; i < jTable1.getRowCount(); i++) {
                 if (jTable1.getValueAt(i, 0).equals(true)) {
                    num = num +1;
                    listaDis.add((String) jTable1.getValueAt(i, 1));
                  }
             }
            if (num != 0) {
                RegistrarAspiranteControlador rac = new RegistrarAspiranteControlador();
                int idI=rac.agregarRegistroAspirante(ia);
                
                
                rac.altaDis(idI, num, listaDis);
                JOptionPane.showMessageDialog(null, "Se Registro el Aspirante con Exito...!!!", "INFORMACION", JOptionPane.INFORMATION_MESSAGE);
                this.aspirante = "null";
                this.categoria = "null";
                jList2.setListData(new Object[0]);
                listaDis.clear();
                jButton1.setEnabled(false);
                cargarEscuela();
                cargarCategoria();
                cargarDisciplina();
                
            
            } else {
           JOptionPane.showMessageDialog(null, "Debe seleccionar almenos una disciplina...!!!", "Alerta", JOptionPane.WARNING_MESSAGE); 
         }
        
        } else {
           JOptionPane.showMessageDialog(null, "Debe  seleccionar Aspirante y Categoria...!!!", "Alerta", JOptionPane.WARNING_MESSAGE);     
        }
        
            
        
    }//GEN-LAST:event_jButton2ActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JList jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarEscuela() {
        
        DefaultListModel modelo = new DefaultListModel();
        EscuelaControlador ec = new EscuelaControlador();
        
        List<Escuela> listadoEsc = ec.listarEscuela();
        
        for(Object o : listadoEsc) {
        Escuela  d = (Escuela)o;
          modelo.addElement(d.getNombreEscuela());
        }
        
        jList1.setModel(modelo);
        
    }

    private void cargarCategoria() {
        
        DefaultListModel modelo1 = new DefaultListModel();
        
        CategoriaControlador cc = new CategoriaControlador();
        List<Categoria> listadoCat = cc.listarCategoria();
        for (Object o : listadoCat) {
            Categoria c = (Categoria) o;
            modelo1.addElement(c.getNombreCategoria());
        }
        
        jList3.setModel(modelo1);
        
    }

    private void cargarDisciplina() {
        
        DisciplinaControlador dc = new DisciplinaControlador();
        
        List<Disciplina> listadoDis = dc.listarDisciplina();
        
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
       model.setRowCount(0);
        
        for (Object o : listadoDis) {
            Disciplina di = (Disciplina) o;
            model.addRow(new Object[]{false,di.getNombreDisciplina()});
            
            
        }
        
    }
}
