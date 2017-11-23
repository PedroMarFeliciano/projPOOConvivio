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
public class AreaDesportiva extends Parque {

    private ArrayList<String> modalidades;
    
    /**
     * Cria uma nova instancia de Local.
     * 
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     */
    public AreaDesportiva(float lat, float lng) {
        super(lat, lng);
        
        modalidades = new ArrayList<>();
    }

    /**
     * Adiciona um inscrito a Area Desportiva.
     * 
     * @return true, sempre
     */
    @Override
    public boolean addInscrito(ArrayList<Inscricao> inscricoes) {
        setInscritos(getInscritos() + 1);
        return true;
    }
    
    /**
     *  Adiciona uma nova modalidade a area desportiva.
     * 
     * @param inscricoes - ArrayList<Inscricao>
     * @param nomeModalidade nome da modalide que pode ser praticada nesse local
     */
    public void addModalidade(String nomeModalidade) {
        modalidades.add(nomeModalidade);
    }
    
    /**
     * Remove uma modalide de uma area desportiva.
     * 
     * @param nomeModalidade nome da modalidade que sera removida
     * 
     * @return true caso a operacao seja concluida com sucesso e false caso
     * contrario
     */
    public boolean remModalidade(String nomeModalidade) {
        if (modalidades.remove(nomeModalidade)) return true;
        return false;
    }

    /**
     * Retorna um ArrayList<String> com todas as modalidade presentes nessa
     * area.
     * 
     * @return ArrayList<String>
     */
    public ArrayList<String> getModalidades() {
        return modalidades;
    }
    
}