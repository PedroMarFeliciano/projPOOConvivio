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
public class Bar extends Local {

    private int lotacao, guestLimit, inscritos;
    private float consumoMinimo;
    
    /**
     * Cria uma nova instancia de Bar.
     * 
     * @param nome nome do local
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     * @param lotacao capacidade maxima do Bar
     * @param porcentagemGuestList porcentagem da capacidade que sera utilizada
     * para a guest list. Deve estar no formato de porcentagem (i.e. 30%, 20%)
     * @param consumoMinimo consumo mínimo admitido pelo bar
     */
    public Bar(String nome, float lat, float lng, int lotacao, 
            float porcentagemGuestList, float consumoMinimo) {
        super(nome, lat, lng);
        this.lotacao = lotacao;
        this.consumoMinimo = consumoMinimo;
        
        guestLimit = (int) (lotacao * porcentagemGuestList / 100);
    }
    
    /**
     * Verifica se o pretendente tem o perfil boemio e, caso consiga fazer a
     * incricao retorna true, senao false.
     * 
     * @param inscricoes - ArrayList de Inscricao
     * @return boolean
     */
    @Override
    public boolean addInscrito(ArrayList<Inscricao> inscricoes, Pessoa p) {
        Inscricao naoBoemio;
            
        if (getInscritos() < lotacao) {
            setInscritos(getInscritos() + 1);
            return true;        
        } else if ((naoBoemio = procuraNaoBoemio(inscricoes)) != null){
            naoBoemio.getInscrito().setNumLocais(naoBoemio.getInscrito().getNumLocais()+ 1);
            naoBoemio.setInscrito(p);
            return true;
        }
        return false;
    }
    
    /**
     * Utiliza o atual numero de inscritos no bar e o consumo minimo cadastrado
     * para estimar a receita.
     * 
     * @return float
     */
    @Override
    public float estimaReceita() {
        return (getInscritos() * consumoMinimo);
    }
    
    /**
     * Procura a ultima pessoa inscrita no Bar que nao e' boemia e retorna essa
     * pessoa.
     * 
     * @param inscricoes - ArrayList de Inscricao
     * @return Pessoa
     */
    protected Inscricao procuraNaoBoemio(ArrayList<Inscricao> inscricoes) {
        Inscricao ultimoNaoBoemio = null;
        int limiteGuestList = 0;
        
        //laço para percorrer todos os valores de inscritos e devolver o indice
        //do ultimo inscrito que nao seja boemio
        for (Inscricao inscrito: inscricoes) {
            if (inscrito.getLocal().equals(this) &&
                    (inscrito.getInscrito().getPerfil().equalsIgnoreCase("boemio")
                    == false) && limiteGuestList < guestLimit) {
                limiteGuestList++;
                ultimoNaoBoemio = inscrito;
            }
        }
        
        return ultimoNaoBoemio;
    }

    /**
     * Retorna a lotacao do Bar.
     * 
     * @return int
     */
    public int getLotacao() {
        return lotacao;
    }

    /**
     * Retorna o consumo minimo do Bar.
     * 
     * @return float
     */
    public float getConsumoMinimo() {
        return consumoMinimo;
    }

    /**
     * Função que retorna um String já formatada contendo todos os dados desse
     * tipo de local
     * 
     * @return String formada com os dados do local
     */
    @Override
    public String toString() {
        return "Tipo.............: bar\n" +
               "Lotação..........: " + lotacao + "\n" +
               "Limite guest list: " + guestLimit + "\n" +
               "Inscritos........: " + inscritos + "\n" +
               "Consumo mínimo...: " + consumoMinimo;
    }

    /**
     * Retorna o tipo de local
     * @return AreaDesportiva
     */
    @Override
    public String getTipoLocal() {
        return "Bar";
    }

    /**
     * Retorna o limite da guestlist
     * 
     * @return int com o limite da guest list
     */
    @Override
    public int getGuestLimit() {
        return guestLimit;
    }
    
    
}
