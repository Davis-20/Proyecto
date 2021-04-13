/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.interfaces;

import com.proyecto.animales.*;
import com.proyecto.persona.Granjero;
import com.proyecto.plantas.*;
import javax.swing.JOptionPane;

/**
 * Clase mercado
 * @author davis
 */
public class MercadoJFrame extends javax.swing.JFrame {
private Granjero granjero;

    /**
     * Constructor del mercado
     * @param granjero pasamos el objeto granjero
     */
    public MercadoJFrame(Granjero granjero) {
        this.granjero = granjero;
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

        mercadoPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        maizLabel = new javax.swing.JLabel();
        manzanoLabel = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        carneLabel = new javax.swing.JLabel();
        huevoLabel = new javax.swing.JLabel();
        lecheLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        vacaLabel = new javax.swing.JLabel();
        gallinaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel2.setText("Semillas");

        maizLabel.setText("Maiz");
        maizLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maizLabelMouseClicked(evt);
            }
        });

        manzanoLabel.setText("Manzano");
        manzanoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manzanoLabelMouseClicked(evt);
            }
        });

        jLabel3.setText("Alimentos");

        carneLabel.setText("Carne");
        carneLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                carneLabelMouseClicked(evt);
            }
        });

        huevoLabel.setText("Huevo");
        huevoLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                huevoLabelMouseClicked(evt);
            }
        });

        lecheLabel.setText("Leche");
        lecheLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecheLabelMouseClicked(evt);
            }
        });

        jLabel1.setText("Animales");

        vacaLabel.setText("Vaca");
        vacaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vacaLabelMouseClicked(evt);
            }
        });

        gallinaLabel.setText("Gallina");
        gallinaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gallinaLabelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout mercadoPanelLayout = new javax.swing.GroupLayout(mercadoPanel);
        mercadoPanel.setLayout(mercadoPanelLayout);
        mercadoPanelLayout.setHorizontalGroup(
            mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mercadoPanelLayout.createSequentialGroup()
                .addGroup(mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mercadoPanelLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(maizLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(manzanoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mercadoPanelLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)))
                    .addGroup(mercadoPanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(carneLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(huevoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lecheLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mercadoPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mercadoPanelLayout.createSequentialGroup()
                        .addComponent(vacaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(gallinaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(107, 107, 107))
        );
        mercadoPanelLayout.setVerticalGroup(
            mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mercadoPanelLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carneLabel)
                    .addComponent(huevoLabel)
                    .addComponent(lecheLabel))
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(17, 17, 17)
                .addGroup(mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(vacaLabel)
                    .addComponent(gallinaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mercadoPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maizLabel)
                    .addComponent(manzanoLabel))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mercadoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mercadoPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   /**
     * Comprar carne precio 20 oro
     */
    private void carneLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_carneLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 20 oro, Comprar(S/N)");
        
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getAlimentos().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                String [] alimentos= new String [this.granjero.getAlimentos().length+1];
                //System.out.println(alimentos.length);
                
                alimentos[0] = "Carne";
                this.granjero.setAlimentos(alimentos);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getAlimentos().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                String [] alimentos= new String [this.granjero.getAlimentos().length+1];
                System.arraycopy(this.granjero.getAlimentos(), 0, alimentos, 0, this.granjero.getAlimentos().length);
                alimentos[this.granjero.getAlimentos().length] = "Carne";
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setAlimentos(alimentos);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            
                
            this.granjero.setOro((this.granjero.getOro()-20));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    }//GEN-LAST:event_carneLabelMouseClicked
    /**
     *         for(int i =0; i< this.granjero.getAlimentos().length; i++){
                System.out.print(this.granjero.getAlimentos()[i]);
            }
     * Comprar huevo precio 10 oro
     */
    private void huevoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_huevoLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 10 oro, Comprar(S/N)");
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getAlimentos().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                String [] alimentos= new String [this.granjero.getAlimentos().length+1];
                //System.out.println(alimentos.length);
                
                alimentos[0] = "Huevo";
                this.granjero.setAlimentos(alimentos);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getAlimentos().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                String [] alimentos= new String [this.granjero.getAlimentos().length+1];
                System.arraycopy(this.granjero.getAlimentos(), 0, alimentos, 0, this.granjero.getAlimentos().length);
                alimentos[this.granjero.getAlimentos().length] = "Huevo";
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setAlimentos(alimentos);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            this.granjero.setOro((this.granjero.getOro()-10));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    
    }//GEN-LAST:event_huevoLabelMouseClicked
    /**
     * Comprar leche precio 10 oro
     */
    private void lecheLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecheLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 10 oro, Comprar(S/N)");
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getAlimentos().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                String [] alimentos= new String [this.granjero.getAlimentos().length+1];
                //System.out.println(alimentos.length);
                
                alimentos[0] = "Leche";
                this.granjero.setAlimentos(alimentos);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getAlimentos().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                String [] alimentos= new String [this.granjero.getAlimentos().length+1];
                System.arraycopy(this.granjero.getAlimentos(), 0, alimentos, 0, this.granjero.getAlimentos().length);
                alimentos[this.granjero.getAlimentos().length] = "Leche";
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setAlimentos(alimentos);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            this.granjero.setOro((this.granjero.getOro()-10));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    }//GEN-LAST:event_lecheLabelMouseClicked
    /**
     * Comprar maiz precio 200 oro
     */
    private void maizLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maizLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 200 oro, Comprar(S/N)");
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getPlantas().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                Planta [] plantasC= new Planta[this.granjero.getPlantas().length+1];
                //System.out.println(alimentos.length);
                Maiz plantaC = new Maiz("Maiz");
                plantasC[0] = plantaC;
                this.granjero.setPlantas(plantasC);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getPlantas().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                Planta [] plantasC= new Planta[this.granjero.getPlantas().length+1];
                System.arraycopy(this.granjero.getPlantas(), 0, plantasC, 0, this.granjero.getPlantas().length);
                Maiz plantaC = new Maiz("Maiz");
                plantasC[this.granjero.getPlantas().length] = plantaC;
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setPlantas(plantasC);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            this.granjero.setOro((this.granjero.getOro()-200));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    }//GEN-LAST:event_maizLabelMouseClicked
    /**
     * Comprar manzano precio 205 oro
     */
    private void manzanoLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manzanoLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 205 oro, Comprar(S/N)");
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getPlantas().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                Planta [] plantasC= new Planta[this.granjero.getPlantas().length+1];
                //System.out.println(alimentos.length);
                Manzano plantaC = new Manzano("Manzano");
                plantasC[0] = plantaC;
                this.granjero.setPlantas(plantasC);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getPlantas().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                Planta [] plantasC= new Planta[this.granjero.getPlantas().length+1];
                System.arraycopy(this.granjero.getPlantas(), 0, plantasC, 0, this.granjero.getPlantas().length);
                Manzano plantaC = new Manzano("Manzano");
                plantasC[this.granjero.getPlantas().length] = plantaC;
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setPlantas(plantasC);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            this.granjero.setOro((this.granjero.getOro()-205));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    }//GEN-LAST:event_manzanoLabelMouseClicked
    /**
     * Compa de Vaca precio 150 
     */
    private void vacaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vacaLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 150 oro, Comprar(S/N)");
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getAnimales().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                Animal [] plantasC= new Animal[this.granjero.getAnimales().length+1];
                //System.out.println(alimentos.length);
                Vaca plantaC = new Vaca("Vaca");
                plantasC[0] = plantaC;
                this.granjero.setAnimales(plantasC);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getAnimales().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                Animal [] plantasC= new Animal[this.granjero.getAnimales().length+1];
                System.arraycopy(this.granjero.getAnimales(), 0, plantasC, 0, this.granjero.getAnimales().length);
                Vaca plantaC = new Vaca("Vaca");
                plantasC[this.granjero.getAnimales().length] = plantaC;
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setAnimales(plantasC);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            this.granjero.setOro((this.granjero.getOro()-150));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    }//GEN-LAST:event_vacaLabelMouseClicked
    /**
     * Compra gallia costo 50
 
     */
    private void gallinaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gallinaLabelMouseClicked
        // TODO add your handling code here:
        String texto = JOptionPane.showInputDialog("Costo: 50 oro, Comprar(S/N)");
        if(texto.toLowerCase().equals("s")){
            //redimensionar el arreglo
            if((this.granjero.getAnimales().length) == 0){
                //System.out.println(this.granjero.getAlimentos().length);

                
                Animal [] plantasC= new Animal[this.granjero.getPlantas().length+1];
                //System.out.println(alimentos.length);
                Gallina plantaC = new Gallina("Gallina");
                plantasC[0] = plantaC;
                this.granjero.setAnimales(plantasC);
                //System.out.println(this.granjero.getAlimentos().length);
                
            
            }
            else if(this.granjero.getAnimales().length>=1){
                //System.out.println(this.granjero.getAlimentos().length);

                Animal [] plantasC= new Animal[this.granjero.getAnimales().length+1];
                System.arraycopy(this.granjero.getAnimales(), 0, plantasC, 0, this.granjero.getAnimales().length);
                Gallina plantaC = new Gallina("Gallina");
                plantasC[this.granjero.getAnimales().length] = plantaC;
                
                //System.out.println(this.granjero.getAlimentos().length);

                this.granjero.setAnimales(plantasC);
                //System.out.println(this.granjero.getAlimentos()[this.granjero.getAlimentos().length-1]);
                //System.out.println(this.granjero.getAlimentos().length);

            
            }
            this.granjero.setOro((this.granjero.getOro()-50));
            JOptionPane.showMessageDialog(null, "Compra Exitosa");
        }
        
        
        this.granjero.getBotonJLabel1().setText("Oro: "+ this.granjero.getOro());
    }//GEN-LAST:event_gallinaLabelMouseClicked
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carneLabel;
    private javax.swing.JLabel gallinaLabel;
    private javax.swing.JLabel huevoLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lecheLabel;
    private javax.swing.JLabel maizLabel;
    private javax.swing.JLabel manzanoLabel;
    private javax.swing.JPanel mercadoPanel;
    private javax.swing.JLabel vacaLabel;
    // End of variables declaration//GEN-END:variables
}
