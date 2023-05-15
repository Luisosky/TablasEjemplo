


import javax.swing.DefaultBoundedRangeModel;
import javax.swing.table.DefaultTableModel;

public class TablaMoto extends javax.swing.JPanel {

    DefaultTableModel agrega;
    Object[] moto;
    
    
    public TablaMoto() {
        initComponents();
        agrega= new DefaultTableModel();
        String titulos [] = {"Marca","Modelo","Cilindraje","Velocidad Maxima","Nuevo","Manual","Precio"};
        agrega.setColumnIdentifiers(titulos);
        
        
        Object [][] listaMoto={ {"Marca","Modelo","Cilindraje","Velocidad Maxima","Nuevo","Manual","Precio"},
                                {"Marca","Modelo","Cilindraje","Velocidad Maxima","Nuevo","Manual","Precio"},
                                {"Marca","Modelo","Cilindraje","Velocidad Maxima","Nuevo","Manual","Precio"} };
        
        for (Object[] rowData : listaMoto){
            agrega.addRow(rowData);
        }
        tblMoto.setModel(agrega);
        
        
    }
    
    
 


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMoto = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(518, 340));

        jLabel1.setText("Moto");

        tblMoto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblMoto);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblMoto;
    // End of variables declaration//GEN-END:variables
}
