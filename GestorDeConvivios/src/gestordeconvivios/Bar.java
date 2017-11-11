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
public class Bar extends Local {

    private int lotacao, guestLimit;
    private float consumoMinimo;
    
    public Bar(float lat, float lng, int lotacao) {
        super(lat, lng);
        this.lotacao = lotacao;

    }
    
    @Override
    protected void addInscrito() {
        
    }
    
}
