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
public abstract class Parque extends Local {
    
    /**
     * Cria uma nova instancia de Parque.
     * @param nome String que representa o nome do local
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     */
    public Parque(String nome, float lat, float lng) {
        super(nome, lat, lng);
    }
    
}
