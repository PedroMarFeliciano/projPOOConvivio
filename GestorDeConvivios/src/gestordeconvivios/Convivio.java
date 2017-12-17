/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestordeconvivios;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Pedro Feliciano
 */
public class Convivio {
    
    private ArrayList<Inscricao> inscricoes;
    private ArrayList<Local> locaisCadastrados;
    private String titulo;

    
    /**
     * Cria uma nova instância de Convivio.
     * 
     * @param titulo titulo do convivio que sera criado
     */
    public Convivio(ArrayList<Local> locaisCadastrados, String titulo) {
        this.locaisCadastrados = locaisCadastrados;
        this.titulo = titulo;
        
        inscricoes = new ArrayList();
        locaisCadastrados = new ArrayList();
    }
    
    /**
     * Adiciona uma nova inscricao ao convivio.
     * 
     * @param local para o qual a pessoa quer fazer a inscricao
     * @param pessoa que quer fazer a inscricao
     */
    public void adInscricao(Local local, Pessoa pessoa) {
        boolean cadastrado = false;
        String dep;
        
        dep = pessoa.getDepartamento();
        
       if(dep.compareTo("DEI")!= 0){
           System.out.println("Não é possível fazer a inscrição da pessoa: " +
                   pessoa.getNome() + " / " + dep + 
                   ". Inscrição reservada à comunidade do DEI.");
           return;
       }
        
        for (Local localCadastrado: locaisCadastrados) {
            if (localCadastrado.equals(local)) {
                cadastrado = true;
                break;
            }
        }        
        
        if (!cadastrado) {
            System.out.println("Local não cadastrado.");
            return;
        }
        if (local.addInscrito(inscricoes)) {
        
            inscricoes.add(new Inscricao(local, pessoa));
            System.out.println("Inscrição realizada com sucesso: " +
                    pessoa.getNome() + ", remanescentes: " + 
                    (5 - pessoa.getNumLocais()));
        }
        else {
            System.out.println("Erro ao realizar a inscricao.");
        }
        
    }
    
    /**
     * Adiciona um novo local ao convivio
     * @param novoLocal 
     */
    public void addNovoLocal(Local novoLocal) {
        locaisCadastrados.add(novoLocal);
    }
    
    /**
     * Mostra a lista de convidados para um Bar.
     * 
     * @param bar
     * @return ArrayList<Pessoa> com todos os inscritos no Bar
     */
    
    public ArrayList<Pessoa> mostraGuestList(Bar bar) {
        ArrayList<Pessoa> pessoasNaGuestList = new ArrayList();
        
        for (Inscricao inscricao: inscricoes) {
            if (inscricao.getLocal().equals(bar)) {
                pessoasNaGuestList.add(inscricao.getInscrito());
            }
        }
        
        return pessoasNaGuestList;
    }
    
    /**
     * Ordena os locais em ordem decrescente de numero de inscritos
     * 
     * @return ArrayList<Local> ordenado
     */
    public ArrayList<Local> seriacaoLocais() {
        Collections.sort(locaisCadastrados, (Object o1, Object o2) -> {
            Local l1 = (Local) o1;
            Local l2 = (Local) o2;
            return l1.getInscritos() - l2.getInscritos();
        }); 
        
        return locaisCadastrados;
    }
    
    /**
     * Soma a receita de cada um dos lugares cadastrados.
     * 
     * @return valor total estimado de receitas.
     */
    public float contabilizaRceitas() {
        float receitaConvivio = 0;
        
        for (Local local: locaisCadastrados) {
            receitaConvivio += local.estimaReceita();
        }
        
        return receitaConvivio;
    }
    
    /**
     * Retorna o ArrayList de inscrições
     * 
     * @return ArrayList de Strings de todas as inscrições realizadas no 
     * convívio
     */
    public ArrayList<Inscricao> getInscricoes() {
        return inscricoes;
    }
    
    /**
     * Retorna o título do convívio
     * 
     * @return String contendo o título do convívio
     */
    public String getTitulo() {
        return titulo;
    }
}
