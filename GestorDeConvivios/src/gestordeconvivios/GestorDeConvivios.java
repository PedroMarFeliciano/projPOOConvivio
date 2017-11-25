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
    
    public GestorDeConvivios() {
        pessoas = new ArrayList();
        locaisCoimbra = new ArrayList();
        convivios = new ArrayList();
        
        
    }
    
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    public void addLocal(Local local) {
        locaisCoimbra.add(local);
    }
    
    public void removeLocal(Local local) {
        locaisCoimbra.remove(local);
    }
}
