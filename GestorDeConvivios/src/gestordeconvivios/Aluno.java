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
public class Aluno extends Pessoa {

    private String curso;

    /**
     * Cria uma nova instância de Aluno
     * 
     * @param nome          - nome do aluno em questão
     * @param perfil        - perfil do aluno
     * @param departamento  - sigla departamento a qual pertece
     * @param mail          - email do aluno
     * @param palavraChave  - palavra chave para aceder ao sistema
     * @param curso         - curso que cursa
     */
    public Aluno(String nome, String perfil, String departamento, String mail,
            String palavraChave, String curso) {

        super(nome, perfil, departamento, mail, palavraChave);
        this.curso = curso;

    }
    
    /**
     * Retorna o curso do aluno
     * @return String contendo o nome do curso
     */
    public String getCurso() {
        return curso;
    }
    
    /**
     * Retorna o tipo de pessoa
     * @return String contendo o tipo de pessoa, no caso: Aluno
     */
    @Override
    public String getTipoPessoa() {
        return "Aluno";
    }

    /**
     *
     * @param curso define o curso que o aluno frequenta
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
