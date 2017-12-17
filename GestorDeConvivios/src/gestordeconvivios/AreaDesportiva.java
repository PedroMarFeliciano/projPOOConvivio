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
     * @param nome String que representa o nome do local
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     */
    public AreaDesportiva(String nome, float lat, float lng) {
        super(nome, lat, lng);
        
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
     * Retorna a receita esperada do Jardim.
     * 
     * @return float
     */
    @Override
    public float estimaReceita() {
        return 0;
    }
    
    /**
     *  Adiciona uma nova modalidade a area desportiva.
     * 
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
     * Retorna um ArrayList de String com todas as modalidade presentes nessa
     * area.
     * 
     * @return ArrayList de String
     */
    public ArrayList<String> getModalidades() {
        return modalidades;
    }

    /**
     * Função que retorna um String já formatada contendo todos os dados desse
     * tipo de local
     * 
     * @return String formada com os dados do local
     */
    @Override
    public String toString() {
        String str = "Tipo........: área desportiva\n" +
                      "Modalidades: ";
        for (String m: modalidades) {
            str += m + "\n             ";
        }
        
        return str;
    }

    /**
     * Retorna o tipo de local
     * @return AreaDesportiva
     */
    @Override
    public String getTipoLocal() {
        return "AreaDesportiva";
    }
    
}
