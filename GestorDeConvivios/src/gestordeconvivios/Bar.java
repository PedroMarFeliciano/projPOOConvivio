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
    
    /**
     * Cria uma nova instancia de Bar.
     * 
     * @param lat float que representa a latitude do local
     * @param lng float que representa a longitude do local
     * @param lotacao capacidade maxima do Bar
     * @param porcentagemGuestList porcentagem da capacidade que sera utilizada
     * para a guest list. Deve estar no formato de porcentagem (i.e. 30%, 20%)
     */
    public Bar(float lat, float lng, int lotacao, float porcentagemGuestList) {
        super(lat, lng);
        this.lotacao = lotacao;
        
        guestLimit = (int) (lotacao * porcentagemGuestList / 100);
    }
    
    /**
     * Verifica se o pretendente tem o perfil boemio e, caso consiga fazer a
     * incricao retorna true, senao false.
     * 
     * @return boolean
     */
    @Override
    public boolean addInscrito() {
        if (procuraNaoBoemio() != -1) {
            if (getInscritos() < lotacao) {
                setInscritos(getInscritos() + 1);
                return true;        
            }    
        }
        return false;
    }
    
    /**
     * Utiliza o atual numero de inscritos no bar e o consumo minimo cadastrado
     * para estimar a receita.
     * 
     * @return float
     */
    protected float estimaReceitaBar() {
        return (getInscritos() * consumoMinimo);
    }
    
    // TODO implementar metodo procuraNaoBoemio()
    protected int procuraNaoBoemio() {
        return 0;
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
    
}
