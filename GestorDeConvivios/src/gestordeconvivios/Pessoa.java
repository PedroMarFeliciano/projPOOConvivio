
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

import java.io.Serializable;

/**
 *
 * @author marcomiranda
 */
public abstract class Pessoa implements Serializable{

    private String nome;
    private String perfil;
    private String departamento;
    private String mail;
    private String palavraChave;
    private int numLocais;

    /**
     * Construtor que cria uma nova pessoa
     *
     * @param nome definição do nome da pessoa
     * @param perfil definição do perfil da pessoa: Desportivo, Cultural, Boémio
     * ou Poupadinho
     * @param departamento definição do departamento a que a pessoa pertence
     * @param mail nome de utilizador, inserido pelo próprio utilizador
     * @param palavraChave palavra passe, definida pelo utilizador
     */
    public Pessoa(String nome, String perfil, String departamento, String mail,
            String palavraChave) {

        this.nome = nome;
        this.perfil = perfil;
        this.departamento = departamento;
        this.mail = mail;
        this.palavraChave = palavraChave;
        this.numLocais = 0;
    }

    /**
     *
     * @return devolve o nome da pessoa
     */
    public String getNome() {
        return nome;
    }

    /**
     *
     * @return devolve o perfil da pessoa
     */
    public String getPerfil() {
        return perfil;
    }

    /**
     *
     * @return devolve o departamento a que a pessoa pertence
     */
    public String getDepartamento() {
        return departamento;
    }
    
    /**
     * 
     * @return devolve o mail da pessoa
     */
    public String getMail() {
        return mail;
    }
    
    /**
     * Retorna a palavra chave do usuário.
     * 
     * @return String
     */
    public String getPalavraChave() {
        return palavraChave;
    }
    
    /**
     * 
     * @return devolve o tipo de pessoa: Aluno, funcionario, professor.
     */
    public abstract String getTipoPessoa();
    
    /**
     *
     * @param nome altera o nome da pessoa
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     *
     * @param perfil altera o perfil da pessoa
     */
    public void setPerfil(String perfil) {
        this.perfil = perfil;
    }

    /**
     *
     * @param departamento altera o departamento a que a pessoa pertence
     */
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    /**
     *
     * @param utilizador altera o nome de utilizador associado ao login
     */
    public void setUtilizador(String utilizador) {
        this.mail = mail;
    }

    /**
     *
     * @param palavraChave altera a palavra passe do utilizador associado ao
     * login
     */
    public void setPalavraChave(String palavraChave) {
        this.palavraChave = palavraChave;
    }
    
    /**
     * Verifica se a pessoa está inscrita em menos do que 5 locais e incrementa
     * a variável numLocais
     * 
     * @return true se estiver inscrita em 4 ou menos locais e false caso
     * contrário
     */
    public boolean contaLocais(){
        
        if (this.numLocais < 5){
            this.numLocais++;
            return true;
        }
        return false;
    }

    /**
     * Retorna o numero de locais
     * @return int, numero de locais inscritos
     */
    public int getNumLocais() {
        return numLocais;
    }
    
    /**
     * Retorna o curso da pessoa
     * 
     * @return null
     */
    public String getCurso() {
        return "";
    }

    /**
     * Define um novo valor para numLocais
     * 
     * @param numLocais novo valor de numLocais
     */
    public void setNumLocais(int numLocais) {
        this.numLocais = numLocais;
    }
    
    
}

