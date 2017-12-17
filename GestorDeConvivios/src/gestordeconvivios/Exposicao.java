/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

import java.util.ArrayList;

/**
 *
 * @author Pedro Feliciano
 */
public class Exposicao extends Local {

    private String formaArtistica;
    private float custoIngresso;
    private int quantidadeEstudantes;
    
    /**
     * Cria uma nova instancia de Exposicao.
     * 
     * @param nome do local da exposição
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     * @param custoIngresso valor que sera cobrado para entrar no local
     * @param formaArtistica forma de arte que sera apresentada
     */
    public Exposicao(String nome, float lat, float lng, float custoIngresso, 
            String formaArtistica) {
        super(nome, lat, lng);
        this.custoIngresso = custoIngresso;
        this.formaArtistica = formaArtistica;
        
        quantidadeEstudantes = 0;
    }

    /**
     * Adiciona um novo inscrito ao local.
     * 
     * @param inscricoes - ArrayList de Inscricao
     * @return true, sempre.
     */
    @Override
    public boolean addInscrito(ArrayList<Inscricao> inscricoes) {
        setInscritos(getInscritos() + 1);
        
        quantidadeEstudantes = 0;
        for (Inscricao i: inscricoes) {
            if (eEstudante(i)) quantidadeEstudantes++; 
        }
        
        return true;
    }
    
    /**
     * Verifica se o inscrito é estudante
     * 
     * @param inscr inscrição da pessoa que deseja verificar
     * @return true caso seja estudante, false caso não seja
     */
    public boolean eEstudante(Inscricao inscr) {
        return inscr.getInscrito().getTipoPessoa().equalsIgnoreCase("estudante");
    }
    
    /**
     * Calcula e retorna um valor estimado de receita para o local, contando com 
     * o desconto de 10% para estudantes.
     * 
     * @return float
     */
    @Override
    public float estimaReceita() {
        return (float) ((getInscritos() - quantidadeEstudantes) * 
                custoIngresso + quantidadeEstudantes * 0.9 * custoIngresso);
    }

    /**
     * Retonar uma String com a forma de arte da Exposicao.
     * 
     * @return String
     */
    public String getFormaArtistica() {
        return formaArtistica;
    }

    /**
     * Retonar o custo do ingresso para a Exposicao.
     * 
     * @return float
     */
    public float getCustoIngresso() {
        return custoIngresso;
    }

    /**
     * Função que retorna um String já formatada contendo todos os dados desse
     * tipo de local
     * 
     * @return String formada com os dados do local
     */
    @Override
    public String toString() {
        return "Tipo................: exposição\n" + 
               "Forma Artística.....: " + formaArtistica + "\n" +
               "Custo do ingresso...: " + custoIngresso + "\n" +
               "Estudantes Inscritos: " + quantidadeEstudantes;
    }
    
}
