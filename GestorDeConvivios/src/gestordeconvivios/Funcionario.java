/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

/**
 *
 * @author marcomiranda
 */
public class Funcionario extends Pessoa {

    private String tipo;

    /**
     * Construtor para criação de um objecto do tipo Pessoa
     *
     * @param tipo define o tipo do funcionario: Tempo parcial ou Tempo integral
     */
    public Funcionario(String nome, String perfil, String departamento, String mail,
            String palavraChave, String tipo) {

        super(nome, perfil, departamento, mail, palavraChave);
        this.tipo = tipo;
    }

    /**
     *
     * @return devolve o tipo do funcionario
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo altera o tipo do funcionario
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public String getTipoPessoa() {
        return "Funcionario";
    }

}
