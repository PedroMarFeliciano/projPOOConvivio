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
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     * @param custoIngresso valor que sera cobrado para entrar no local
     * @param formaArtistica forma de arte que sera apresentada
     */
    public Exposicao(float lat, float lng, float custoIngresso, 
            String formaArtistica) {
        super(lat, lng);
        this.custoIngresso = custoIngresso;
        this.formaArtistica = formaArtistica;
        
        quantidadeEstudantes = 0;
    }

    /**
     * Adiciona um novo inscrito ao local.
     * 
     * @param inscricoes - ArrayList<Inscricao>
     * @return true, sempre.
     */
    @Override
    public boolean addInscrito(ArrayList<Inscricao> inscricoes) {
        setInscritos(getInscritos() + 1);
        
        if (eEstudante()) quantidadeEstudantes++; 
        
        return true;
    }
    
    // TODO implementar metodo eEstudante()
    public boolean eEstudante() {
        return false;
    }
    
    /**
     * Calcula e retorna um valor estimado de receita para o local, contando com 
     * o desconto de 10% para estudantes.
     * 
     * @return float
     */
    public float estimaReceitaExposicao() {
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
    
}
