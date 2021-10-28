/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Vistas.MaestrosPanel;
import Vistas.PlantillaSeleccion;


/**
 *
 * @author usuario
 */
public class ControladorMaestros {
    private final MaestrosPanel panel;
    private final PlantillaSeleccion view;
    
    public ControladorMaestros(PlantillaSeleccion plantilla){
        this.panel = new MaestrosPanel();
        this.view = plantilla;
        this.view.setVisible(false);
        this.panel.setVisible(false);
    }
    
    public PlantillaSeleccion getView(){
        return this.view;
    }
    
    public void showMenuMaestros(){
        this.panel.setVisible(true);
        this.view.subtituloLabel.setText("Maestros");
        this.view.setVisible(true);
    }
    
}
