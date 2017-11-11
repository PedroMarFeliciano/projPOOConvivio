/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

/**
 *
 * @author Pedro Feliciano
 */
public abstract class Local {
    
    private float lat, lng;
    private int inscritos;
    
    /**
     * Cria uma nova instancia de Local.
     * 
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     */
    public Local(float lat, float lng) {
        this.lat = lat;
        this.lng = lng;
        inscritos = 0;
    }
    
    /**
     * Metodo para adicionar uma nova inscricao ao local.
     */
    public abstract boolean addInscrito();

    /**
     * Retorna a latitude do local.
     * 
     * @return float
     */
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
}
