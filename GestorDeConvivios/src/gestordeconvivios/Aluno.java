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
     * Construtor para criação de um objecto do tipo Aluno
     *
     * @param curso define o curso que o aluno frequenta
     */
    public Aluno(String nome, String perfil, String departamento, String mail,
            String palavraChave, String curso) {

        super(nome, perfil, departamento, mail, palavraChave);
        this.curso = curso;

    }
    @Override
    public String getCurso() {
        return curso;
    }

    /**
     *
     * @param curso define o curso que o aluno frequenta
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
