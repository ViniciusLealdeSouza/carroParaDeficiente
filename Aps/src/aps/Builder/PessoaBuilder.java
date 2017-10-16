/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps.Builder;

/**
 *
 * @author Vinicius
 */
public class PessoaBuilder {
    private Pessoa pessoa;
    
    
    public PessoaBuilder criaPessoa(){
        pessoa = new Pessoa();
        return this;
    }
    
   public PessoaBuilder chamada(String nome){
        pessoa.setNome(nome);
        return this;
    }
    
    public PessoaBuilder nascidaEm(String dataNacimento){
        pessoa.setDataNacimento(dataNacimento);
        return this;
    }
    
    public PessoaBuilder queMoraEm (String endereco){
        pessoa.setEndereco(endereco);
        return this;
    }
    
    public Pessoa builder(){
        return this.pessoa;
    }
}
