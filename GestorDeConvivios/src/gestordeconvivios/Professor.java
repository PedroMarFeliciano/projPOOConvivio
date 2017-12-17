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
public class Professor extends Pessoa {

    private String tipo;

    /**
     * Construtor para criação de um objecto do tipo Professor
     *
     * @param tipo define o tipo do professor: Auxiliar, Associado ou
     * Catedrático
     */
    /**
     * Construtor para criação de um objecto do tipo Professor
     * 
     * @param nome nome do professor
     * @param perfil perfil do professor
     * @param departamento sigla do departamento ao qual pertecem
     * @param mail endereço de email do professor
     * @param palavraChave palavra chave para acessar o sistema
     * @param tipo define o tipo do professor: Auxiliar, Associado ou
     * Catedrático
     */
    public Professor(String nome, String perfil, String departamento, String mail,
            String palavraChave, String tipo) {

        super(nome, perfil, departamento, mail, palavraChave);
        this.tipo = tipo;

    }

    /**
     *
     * @return devolve o tipo do professor
     */
    public String getTipo() {
        return tipo;
    }

    /**
     *
     * @param tipo altera o tipo do professor
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    /**
     * Retorna o tipo de pessoa
     * @return String contendo o tipo de pessoa, no caso: Professor
     */
    @Override
    public String getTipoPessoa() {
        return "Professor";
    }
}
