/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterfacesGraficas;

import Entidades.*;
import java.awt.Color;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author chave
 */

public class JFrameTomarLista extends javax.swing.JFrame {

    /**
     * Creates new form JFrameTomarLista
     */
    JFrameSeleccionarCurso padre;
    private Aula aula;
    private DefaultListModel modeloListCitas;
    private List<Asistencia> listadeAsistencia = new ArrayList();
    
    public void agregarEstudiante(Estudiante estudiante){
        if(aula.getEstudiantes().size()<10){
            aula.agregarEstudiante(estudiante); 
            LocalDate currentDate = LocalDate.now();
            listadeAsistencia.add( new Asistencia(currentDate
                    ,"----------",estudiante));        
        }
        else{
            JOptionPane.showMessageDialog(null, "Has llegado al limite"
                    + " de estudiantes por aula",
                     "Agregar Estudiante", JOptionPane.INFORMATION_MESSAGE);
        }
       
    }
    public void agregarImagen(String ruta){
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource(ruta)));
        lblImage.setBackground(Color.white);
                
    }
    public void mostrarLista(){
        modeloListCitas = new DefaultListModel();
        lstEstudiantes.setModel(modeloListCitas);
        modeloListCitas.removeAllElements();   
        for (Asistencia item : listadeAsistencia) {
            modeloListCitas.addElement(item.toString());
        }
        
    }
   
    public JFrameTomarLista() {
        initComponents();
        
    }
    public JFrameTomarLista(JFrameSeleccionarCurso padre, Aula aula){
        initComponents();
        this.padre = padre;
        this.aula = aula;
        this.listadeAsistencia = this.aula.getAsistencia();
        lblCurso.setText("Curso: "+this.aula.getCurso());
        lblTurno.setText("Turno: "+this.aula.getHorario());
        LocalDate currentDate = LocalDate.now();
        lblFecha.setText("Fecha: "+currentDate.toString());
        mostrarLista();
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
        lblCurso = new javax.swing.JLabel();
        btnAgregarEstudiante = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstEstudiantes = new javax.swing.JList<>();
        lblTurno = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(47, 65, 90));

        lblCurso.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblCurso.setForeground(new java.awt.Color(255, 255, 255));
        lblCurso.setText("lblCurso");

        btnAgregarEstudiante.setBackground(new java.awt.Color(0, 204, 0));
        btnAgregarEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnAgregarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarEstudiante.setText("Agregar Estudiante");
        btnAgregarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEstudianteActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(255, 0, 0));
        btnSalir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(204, 204, 204));
        lblImage.setForeground(new java.awt.Color(255, 255, 255));

        lstEstudiantes.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2), "Lista de Asistencia", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14))); // NOI18N
        lstEstudiantes.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        lstEstudiantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lstEstudiantesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(lstEstudiantes);

        lblTurno.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblTurno.setForeground(new java.awt.Color(255, 255, 255));
        lblTurno.setText("lblTurno");

        lblFecha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblFecha.setForeground(new java.awt.Color(255, 255, 255));
        lblFecha.setText("lblFecha");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblTurno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblFecha)
                                .addGap(47, 47, 47))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCurso)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnAgregarEstudiante))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(34, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(lblCurso)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTurno)
                            .addComponent(lblFecha)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEstudiante, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        padre.actualizarAula(aula);
        this.dispose();
        padre.setVisible(true);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEstudianteActionPerformed
        JFrameAgregarEstudiante agregar = new JFrameAgregarEstudiante(this,aula);
        this.setVisible(false);
        agregar.setLocationRelativeTo(null);
        agregar.setVisible(true);
    }//GEN-LAST:event_btnAgregarEstudianteActionPerformed

    private void lstEstudiantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lstEstudiantesMouseClicked
        String rpta = "";
        int k = lstEstudiantes.getSelectedIndex();  
        if(k!=-1 && evt.getClickCount() == 2){           
            String j = lstEstudiantes.getSelectedValue().trim();
            for (int i = 0; i < listadeAsistencia.size(); i++) {
                if(listadeAsistencia.get(i).toString().equals(j)){                    
                    Asistencia asistencia =listadeAsistencia.get(i);
                    rpta = JOptionPane.showInputDialog(null,
                            "Ingrese estado( Asistio / Falto / Tardanza ) : "
                    , "Agregar Asistencia",3);
                    if(!"".equals(rpta)){                       
                        asistencia.setEstado(rpta);
                        listadeAsistencia.remove(i);
                        listadeAsistencia.add(i, asistencia);
                        mostrarLista();
                    }
                }
            }
        }
        
    }//GEN-LAST:event_lstEstudiantesMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEstudiante;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCurso;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblImage;
    private javax.swing.JLabel lblTurno;
    private javax.swing.JList<String> lstEstudiantes;
    // End of variables declaration//GEN-END:variables
}
