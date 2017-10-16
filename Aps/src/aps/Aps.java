package aps;

import aps.Builder.Pessoa;
import aps.Builder.PessoaBuilder;
import aps.Adapter.Adaptar;
import aps.Proxy.Acao;
import aps.Proxy.Verificacao;

/**
 *
 * @author Vinicius
 */
public class Aps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PessoaBuilder pBuilder = new PessoaBuilder();
        Pessoa pessoa = pBuilder.criaPessoa()
                .chamada("João")
                .nascidaEm("14/10/1980")
                .queMoraEm("Patos de Minas")
                .builder();
        System.out.println(pessoa.nome);
        System.out.println(pessoa.endereco);
        System.out.println(pessoa.dataNacimento);
        
        Acao acao = new Verificacao();
        acao.executar();
        
        Adaptar ad = new Adaptar();
        ad.NormalParaAdaptado();
        
    }
    
}
