/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.State;

/**
 *
 * @author Vinicius
 */
public class CarroNormal implements EstadoCarro{
    @Override
    public void adaptado(){
        System.out.println("Carro Normal");
    }
    
    @Override
    public void normal() {
        System.out.println("Não Possui Vaga Preferêncial");
    }
}
