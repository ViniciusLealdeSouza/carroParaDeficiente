/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.Adapter;

import aps.State.EstadoCarro;
import aps.State.CarroAdaptado;

/**
 *
 * @author Vinicius
 */
public class Carro {
    private EstadoCarro estado; 
    
    public Carro(){
        this.estado = new CarroAdaptado();
    }
    
    public void setEstado(EstadoCarro estado) {
        this.estado = estado;
    }   
    
    public void normal(){
        estado.normal();
    }
    public void adaptado(){
        estado.adaptado();
    }
}
