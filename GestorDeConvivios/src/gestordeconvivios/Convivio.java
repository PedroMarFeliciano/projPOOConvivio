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
public class Convivio {
    
    private ArrayList<Inscricao> inscricoes;
    
    /**
     * Cria uma nova instância de Convivio.
     */
    public Convivio() {
        inscricoes = new ArrayList();
    }
    
    /**
     * Adiciona uma nova inscricao ao convivio.
     * 
     * @param local para o qual a pessoa quer fazer a inscricao
     * @param pessoa que quer fazer a inscricao
     */
    public void adInscricao(Local local, Pessoa pessoa) {
        if (local.addInscrito(inscricoes)) {
            inscricoes.add(new Inscricao(local, pessoa));
            System.out.println("Inscrição realizada com sucesso.");
        }
        else {
            System.out.println("Erro ao realizar a inscricao.");
        }
        
    }
    
    // Nao deveria ficar junto dos devidos ArrayLists?
    public void selecionaLocais() {
        
    }
    
    public void mostraGuestList() {
        
    }
    
    public void serializaLocais() {
        
    }
    
    public void contabilizaRceitas() {
        
    }
}
