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
     * @param nome String que representa o nome do local
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     * @param area tamanho do Jardim em metros quadrados
     */
    public Jardim(String nome, float lat, float lng, float area) {
        super(nome, lat, lng);
        this.area = area;
    }

    /**
     * Adiciona um novo inscrito ao Jardim.
     * 
     * @param inscricoes - ArrayList de Inscricao
     * @return true, sempre.
     */
    @Override
    public boolean addInscrito(ArrayList<Inscricao> inscricoes) {
        setInscritos(getInscritos() + 1);
        return true;
    }
    
    /**
     * Retorna a receita esperada do Jardim.
     * 
     * @return float
     */
    @Override
    public float estimaReceita() {
        return 0;
    }
    
    /**
     * Retorna o valor da area em metros quadrados do Jardim.
     * 
     * @return float
     */
    public float getArea() {
        return area;
    }

    /**
     * Função que retorna um String já formatada contendo todos os dados desse
     * tipo de local
     * 
     * @return String formada com os dados do local
     */
    @Override
    public String toString() {
        return "Tipo: parque\n" +
               "Área: " + area;
    }

    /**
     * Retorna o tipo de local
     * @return AreaDesportiva
     */
    @Override
    public String getTipoLocal() {
        return "Jardim";
    }
    
}
