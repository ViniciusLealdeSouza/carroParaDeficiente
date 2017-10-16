/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.Proxy;

/**
 *
 * @author Vinicius
 */
public class Requisicao implements Acao{
     public Requisicao() {
    }     
    @Override
    public void executar() {
        System.out.println("Fazendo Requisicao...");
        System.out.println("Liberado");
    }    
}
