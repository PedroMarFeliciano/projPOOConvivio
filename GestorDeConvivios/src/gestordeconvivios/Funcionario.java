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
     * Construtor para criação de um objecto do tipo Funcionario
     * 
     * @param nome nome do funcionário
     * @param perfil perfil do funcionário
     * @param departamento sigla do departamento para o qual trabalha
     * @param mail endereço de email do funcionário
     * @param palavraChave palavra chave para acessar o sistema
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
    
    /**
     * Retorna o tipo de pessoa
     * 
     * @return uma String com o tipo de pessoa, nesse caso: Funcionario
     */
    @Override
    public String getTipoPessoa() {
        return "Funcionario";
    }

}
