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
public class Verificacao implements Acao{
    @Override
    public void executar() {
        //executar regra de negocio
        System.out.println("Verificando no Sistema...");
        if(true){
            //instanciar Requisicao
            Requisicao r = new Requisicao();
            //chamar o metodo executar da instancia criada
            r.executar();
        }
    }
}
