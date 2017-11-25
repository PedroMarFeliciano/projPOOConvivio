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
public class GestorDeConvivios {

    ArrayList<Pessoa> pessoas;
    ArrayList<Local> locaisCoimbra;
    ArrayList<Convivio> convivios;
    
    public static void main(String[] args) {
        new GestorDeConvivios();
    }
    
    /**
     * Cria uma nova instancia de GestorDeConvivios
     */
    public GestorDeConvivios() {
        pessoas = new ArrayList();
        locaisCoimbra = new ArrayList();
        convivios = new ArrayList();
    }
    
    /**
     * Adiciona uma nova pessoa que pretende participar do convivio
     * 
     * @param pessoa - pretendente a participar do convivio
     */
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    /**
     * Adiciona um local que pretende participar do convivio
     * 
     * @param local - pretendente a participar do convivio
     */
    public void addLocal(Local local) {
        locaisCoimbra.add(local);
    }
    
    /**
     * Cria um novo convivio.
     * O usuario deve informar o titulo desse convivio.
     * 
     * @param titulo 
     */
    public void addConvivio(String titulo) {
        convivios.add(new Convivio(titulo));
    }
}
