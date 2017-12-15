/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Local implements Serializable{
    
    private String nome;
    private float lat, lng;
    private int inscritos;
    
    /**
     * Cria uma nova instancia de Local.
     * @param nome String que representa o nome do local
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     */
    public Local(String nome, float lat, float lng) {
        this.nome = nome;
        this.lat = lat;
        this.lng = lng;
        inscritos = 0;
    }
    
    /**
     * Metodo para adicionar uma nova inscricao ao local. Recebe um ArrayList
     * com todas as inscricoes feitas nesse local.
     * 
     * @param inscricoes - ArrayList<Inscricao>
     * @return 
     */
    public abstract boolean addInscrito(ArrayList<Inscricao> inscricoes);
    
    /**
     * Estima a receita do estabelecimento em questao
     * 
     * @return float 
     */
    public abstract float estimaReceita();

    /**
     * Retorna a latitude do local.
     * 
     * @return float
     */
    
    
    public String getNome() {
        return nome;
    }

    public float getLat() {
        return lat;
    }

    /**
     * Retorna a longitude do local.
     * 
     * @return float
     */
    public float getLng() {
        return lng;
    }
    
    /**
     * Atribui um novo valor a variavel inscritos.
     * 
     * @param inscritos int
     */
    public void setInscritos(int inscritos) {
        this.inscritos = inscritos;
    }

    /**
     * Retorna o numero de inscricoes a um local.
     * 
     * @return int
     */
    public int getInscritos() {
        return inscritos;
    }
    
    @Override
    public abstract String toString();
    
}
