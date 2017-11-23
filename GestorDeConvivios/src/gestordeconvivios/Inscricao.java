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
public class Inscricao {
    private Local local;
    private Pessoa inscrito;
    
    /**
     * Cria uma nova instância de Inscricao. Recebe um local e a pessoa que
     * deseja fazer a inscricao
     * 
     * @param local - Local
     * @param inscrito - Pessoa
     */
    public Inscricao(Local local, Pessoa inscrito) {
        this.local = local;
        this.inscrito = inscrito;
    }

    /**
     * Retonar o valor de local
     * 
     * @return Local
     */
    public Local getLocal() {
        return local;
    }

    /**
     * Retorna a Pessoa inscrita.
     * 
     * @return Pessoa
     */
    public Pessoa getInscrito() {
        return inscrito;
    }
}