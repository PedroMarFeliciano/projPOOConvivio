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
public class Jardim extends Parque {

    private float area;
    
    /**
     * Cria uma nova instancia de Jardim.
     * 
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     * @param area tamanho do Jardim em metros quadrados
     */
    public Jardim(float lat, float lng, float area) {
        super(lat, lng);
        this.area = area;
    }

    /**
     * Adiciona um novo inscrito ao Jardim.
     * 
     * @param inscricoes - ArrayList<Inscricao>
     * @return true, sempre.
     */
    @Override
    public boolean addInscrito(ArrayList<Inscricao> inscricoes) {
        setInscritos(getInscritos() + 1);
        return true;
    }
    
    /**
     * Retorna o valor da area em metros quadrados do Jardim.
     * 
     * @return float
     */
    public float getArea() {
        return area;
    }
    
}
