/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gestordeconvivios;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Pedro Feliciano
 */
public class GestorDeConvivios {

    private ArrayList<Pessoa> pessoas;
    private ArrayList<Local> locaisCoimbra;
    private ArrayList<Convivio> convivios;
    
    public static void main(String[] args) {
        new GestorDeConvivios();
    }
    
    /**
     * Cria uma nova instancia de GestorDeConvivios
     */
    public GestorDeConvivios() {
        pessoas = new ArrayList<>();
        locaisCoimbra = new ArrayList<>();
        convivios = new ArrayList<>();
        
        fichPessoas();
        fichLocais();
        
        addConvivio(locaisCoimbra, "Primeiro Convivio");
        MenuInicial mi = new MenuInicial(this);
        
    }
    
         /**
         * Função que chama as funções de gestão de ficheiros relativos às pessoas
         */
    private void fichPessoas(){
                
        criaFichTxtPessoas();
           leFichTxtPessoas();
           printPessoas();
           
           try {
               criaFichObjPessoas();
           } catch (IOException ex) {
               System.out.println("Erro ao executar a funcao que cria ficheiro"
                       + " objecto.");
           }
           try {
               printFichObjPessoas();
           } catch (IOException ex) {
               System.out.println("Erro ao executar a funcao que faz print do "
                       + "ficheiro objecto.");
           }
    }
           
        
    /**
     * Cria o ficheiro PessoasTxt.txt e carrega informação de algumas pessoas:
     * nome, perfil, etc...
     */
    private void criaFichTxtPessoas() {
        
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(
                    new File("PessoasTxt.txt")));
            
            //Professores
            pw.println("prof,Paulo Oliveira,poupadinho,DEI,po@dei.uc.pt,"
                    + "qwerty,Auxiliar");
            pw.println("prof,Bacano,boemio,DEI,bacano@dei.uc.pt,"
                    + "asdfg,Associado");
            pw.println("prof,JMSR,cultural,DEM,jmsr@dem.uc.pt,1234,"
                    + "Catedratico");
            pw.println("prof,Manuel Silva,desportivo,DEI,ms@dei.uc.pt,"
                    + "a1b2c3,Catedratico");
            
            //Funcionários
            pw.println("func,Anabela Couto,boemio,DEC,ac@dec.uc.pt,aeiou,"
                    + "Temp integral");
            pw.println("func,Jose Maria,cultural,DEI,jm@dei.uc.pt,SLBGlorioso,"
                    + "Tempo integral");
            pw.println("func,Mafalda Pereira,desportivo,DEI,mp@dei.uc.pt,"
                    + "QWE$%&,Tempo parcial");
            pw.println("func,Carlos Afonso,boemio,DEI,ca@dei.uc.pt,tytyty,"
                    + "Tempo parcial");
            
            //Alunos
            pw.println("al,Anacleto Martins,boemio,DEI,am@dei.uc.pt,tatetitotu,"
                    + "Lic. Engenharia Informatica");
            pw.println("al,Maria Costa,poupadinho,DEI,mc@dei.uc.pt,deec1234,"
                    + "Lic. Engenharia Informatica");
            pw.println("al,Samuel S.,cultural,FL,ss@fl.uc.pt,"
                    + "mmnnbb,Lic. Letras");
            pw.println("al,Duarte Bom,boemio,DEI,db@dei.uc.pt,"
                    + "tintoecerveja,Lic. Design Multimedia");

            pw.close();
            
        }catch(IOException e){
            System.out.println("Ocorreu uma excepção ao criar o ficheiro "
                    + "PessoasTxt");
        }
        
        
    }
    /**
     * Faz a leitura do ficheiro PesssoasTxt.txt
     */
    private void leFichTxtPessoas(){
       
        try {
            BufferedReader fr = new BufferedReader(new FileReader(
                    new File("PessoasTxt.txt")));
            try {
                String linha;
                
                while ((linha = fr.readLine()) != null){
                    String temp[] = linha.split(",");
                    
                    addPessoaLista(temp);
                    
                }
            } catch (IOException ex) {
               System.out.println("Linha em branco.\nErro: " + ex);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("O ficheiro PessoasTxt não existe.\n" + ex);
        }
        
    }
    /**
     * Valida se a pessoa é professor, funcionario ou aluno, cria uma instancia
     * de pessoa consoante o tipo e adiciona a pessoa à lista "pessoas"
     * @param temp vector de strings com a informação acerca da pessoa
     * temp[o]: Identificador do tipo de pessoa (professor, funcionario, aluno)
     * / temp[1]; nome / temp[2]: perfil / temp[3]: departamento
     * temp[4]: mail (para login) / temp[5]: palavra-chave (para login)
     * temp[6]: tipo de prof. ou tipo de funcionário ou curso do aluno
     */
    private void addPessoaLista(String temp[]){
        
        if (temp[0].compareTo("prof") == 0) {
            Professor p = new Professor(temp[1], temp[2], temp[3],
                    temp[4], temp[5], temp[6]);
            pessoas.add(p);

        } else if (temp[0].compareTo("func") == 0) {
            Funcionario f = new Funcionario(temp[1], temp[2], temp[3],
                    temp[4], temp[5], temp[6]);
            pessoas.add(f);
            
        } else if (temp[0].compareTo("al") == 0) {
            Aluno a = new Aluno(temp[1], temp[2], temp[3],
                    temp[4], temp[5], temp[6]);
            pessoas.add(a);
        }
        
    }
    /**
     * Cria o ficheiro objecto relativo às pessoas e carrega neste ficheiro a
     * informação das pessoas
     * @throws IOException 
     */
    private void criaFichObjPessoas() throws IOException {
        
        
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(new File("PessoasObj")));
            System.out.println("Criacao do fich PessoaObj");
            os.writeObject(pessoas);
            
            os.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao escrever no ficheiro PessoasObj\n"
                    + "Erro:" + ex);
        }
    }
    
    /**
     * Le e imprime a informação contida no ficheiro objecto PessoasObj
     * @throws IOException 
     */
    private void printFichObjPessoas() throws IOException {

        ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                new File("PessoasObj")));

        try {
            ArrayList<Pessoa> lP;
            System.out.println("Leitura do ficheiro PessoasObj");

            lP = (ArrayList<Pessoa>) is.readObject();
            for (Pessoa p : lP) {
                System.out.println(p.getNome());
            }

            is.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Nao foi possivel ler o ficheiro PessoasObj");
        }

    }
    
    /**
     * Imprime os dados da lista global de pessoas
     */
    private void printPessoas(){
        
        for (Pessoa pessoa : pessoas)
            System.out.println("Nome: " + pessoa.getNome() + "\t" + "Curso:\t"
                    + pessoa.getCurso());
        
    }
    
    /**
     * Função que chama as funções de gestão de ficheiros relativos aos locais
     */
    private void fichLocais() {

        criaFichTxtLocais();
        leFichTxtLocais();
        printLocais();

        criaFichObjLocais();
        printFichObjLocais();
    }
           
        
    /**
     * Cria o ficheiro LocaisTxt.txt e carrega informação de alguns locais:
     * nome, coordenadas GPS, etc...
     */
    private void criaFichTxtLocais() {
        
        try{
            PrintWriter pw = new PrintWriter(new FileWriter(
                    new File("LocaisTxt.txt")));
            
            //Jardins
            pw.println("jar,Botanico,40.212,12.345,350.335");
            pw.println("jar,Sereia,30.898,8.6758,289.211");
            pw.println("jar,Penedo da Saudade,15.654,37.019,500.599");
            
            //Áreas desportivas
            pw.println("desp,Pavilhao Universitario,33.777,45.345,Raguebi");
            pw.println("desp,Pavilhao Mario Mexia,22.435,12.038,Basquetebol");
            pw.println("desp,Campo da Sereia,27.414,5.321,Futebol");
            
            //Exposições
            pw.println("exp,Galeria Casa da Cultura,28.331,4.902,3.0,Pintura");
            pw.println("exp,Museu Machado Castro,24.111,7.408,2.5,Escultura");
            pw.println("exp,TAGV,15.131,6.056,2.75,Fotografia");
            
            //Bares
            pw.println("bar,Quebra-Costas,40.212,12.345,45,5");
            pw.println("bar,Cantinas Amarelas,33.431,5.413,250,15");
            pw.println("bar,Jardins da AAC,20.111,7,715,400,10");
            
            pw.close();
            
            
        }catch(IOException e){
            System.out.println("Ocorreu uma excepção ao criar o ficheiro de"
                    + " texto");
        }
        
        
    }
    /**
     * Faz a leitura do ficheiro LocaisTxt.txt
     */
    private void leFichTxtLocais(){
       
        try {
            BufferedReader fr = new BufferedReader(new FileReader(
                    new File("LocaisTxt.txt")));
            try {
                String linha;
                
                while ((linha = fr.readLine()) != null){
                    String temp[] = linha.split(",");
                    
                    addLocalLista(temp);
                    
                }
            } catch (IOException ex) {
               System.out.println("Linha em branco");
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println("O ficheiro LocaisTxt não existe");
        }
        
    }
    /**
     * Valida qual o tipo de local, e chama a respectiva função para adicionar o
     * local, consoante o seu teipo
     * @param temp vector de strings com a informação acerca do local
     * temp[o]: identificado do tipo de local (jardim, área desportiva, exposição,
     * bar) / temp[1]; nome / temp[2]: latitude
     * / temp[3]: longitude / temp[4]: área (se jardim) ou modadalidade praticada
     * (se área desportiva) / custo do ingresso (se exposição) / lotação (se bar)
     * / temp[5]: Forma de expressão artística (se exposição) /
     * percentagem para guest-list (se bar) / N.A. para jardim e área desportiva
     */
    private void addLocalLista(String temp[]){
        
        if (temp[0].compareTo("jar") == 0) {
           addJardim(temp);

        } else if (temp[0].compareTo("desp") == 0) {
            addAreaDesportiva(temp);
            
        } else if (temp[0].compareTo("exp") == 0) {
            addExposicao(temp);
        }
        else if (temp[0].compareTo("bar") == 0) {
            addBar(temp);
        }
        
    }
    
    /**
     * Cria uma instancia do objecto do tipo Jardim e adiciona-o àlista de locais.
     * @param temp vector de strings com a informação acerca do local
     * temp[1]; nome / temp[2]: latitude / temp[3]: longitude / temp[4]: área
     */
    private void addJardim(String temp[]){
 
        Jardim j = new Jardim(temp[1],
                Float.parseFloat(temp[2]),
                Float.parseFloat(temp[3]),
                Float.parseFloat(temp[4]));
        locaisCoimbra.add(j);
        
    }
    
    /**
     * Cria uma instancia do objecto do tipo AreaDesportiva e adiciona-o à lista
     * de locais.
     * @param temp vector de strings com a informação acerca do local
     * temp[1]; nome / temp[2]: latitude / temp[3]: longitude
     * temp[4]: modadlidades praticadas
     */
    private void addAreaDesportiva(String temp[]){
        
        AreaDesportiva aP = new AreaDesportiva(temp[1],
                Float.parseFloat(temp[2]),
                Float.parseFloat(temp[3]));
        locaisCoimbra.add(aP);
        
    }
    
    /**
     * Cria uma instancia do objecto do tipo Exposicao e adiciona-o àlista de
     * locais.
     * @param temp vector de strings com a informação acerca do local
     * temp[1]: nome / temp[2]: latitude / temp[3]: longitude
     * temp[4]: custo do ingresso / temp[5]: forma artística
     * praticadas
     */
    private void addExposicao(String temp[]){
        
        Exposicao e = new Exposicao(temp[1],
                Float.parseFloat(temp[2]),
                Float.parseFloat(temp[3]),
                Float.parseFloat(temp[4]),
                temp[5]);
            locaisCoimbra.add(e);
    }
    
    private void addBar(String temp[]){
        
        Bar b = new Bar(temp[1],
                Float.parseFloat(temp[2]),
                Float.parseFloat(temp[3]),
                Integer.parseInt(temp[4]),
                Float.parseFloat(temp[5]));
            locaisCoimbra.add(b);
        
    }
    /**
     * Cria o ficheiro objecto carregando neste ficheiro a ArrayList de locais
     * @throws IOException 
     */
    private void criaFichObjLocais() {
        
        
        try {
            ObjectOutputStream os = new ObjectOutputStream(
                    new FileOutputStream(new File("LocaisObj")));
            System.out.println("Criacao do ficheiro objecto de Locais");
            os.writeObject(locaisCoimbra);
            
            os.close();

        } catch (FileNotFoundException ex) {
            System.out.println("Erro ao escrever no ficheiro LocaisObj.\n"
                    + "Erro: " + ex);
        } catch (IOException ex) {
            System.out.println("Erro na leitura.\nErro: " + ex);
        }
    }
    
    /**
     * Le o ficheiro LocaisObj e imprime a informação nele contida
     * @throws IOException 
     */
    private void printFichObjLocais() {
        try {
            ObjectInputStream is = new ObjectInputStream(new FileInputStream(
                    new File("LocaisObj")));
            
            ArrayList<Local> lL;
            System.out.println("Leitura do ficheiro LocaisObj\n");
            
            lL = (ArrayList<Local>) is.readObject();
            
            for (Local l : lL) {
                System.out.println(l.getNome());
            }

            is.close();

        } catch (ClassNotFoundException ex) {
            System.out.println("Nao foi possivel ler o ficheiro LocaisObj");
        } catch (FileNotFoundException ex) {
            System.out.println("Nao foi possivel encontrar o arquivo "
                    + "LocaisObj.\nErro: " + ex);
        } catch (IOException ex) {
            System.out.println("Erro na leitura.\nErro: " + ex);
        }

    }
    
    public void serializaLocais() {
        Collections.sort(locaisCoimbra, new Comparator<Local>() {
            @Override
            public int compare(Local o1, Local o2) {
                return o1.getInscritos() - o2.getInscritos();
            }
        });
    }
    
    /**
     * Imprime os dados da lista global de locais
     */
    private void printLocais(){
        
        for (Local l : locaisCoimbra)
            System.out.println("Nome: " + l.getNome() + "\t" + l.getLat());
        
    }
    
    /**
     * Adiciona uma nova pessoa que pretende participar do convivio
     * 
     * @param pessoa - pretendente a participar do convivio
     */
    public void addPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }
    
    /**
     * Adiciona um local que pretende participar do convivio
     * 
     * @param local - pretendente a participar do convivio
     */
    public void addLocal(Local local) {
        locaisCoimbra.add(local);
    }
    
    /**
     * Cria um novo convivio.
     * O usuario deve informar o titulo desse convivio.
     * 
     * @param titulo 
     */
    public void addConvivio(ArrayList<Local> locais, String titulo) {
        convivios.add(new Convivio(locais, titulo));
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }

    public ArrayList<Local> getLocaisCoimbra() {
        return locaisCoimbra;
    }

    public ArrayList<Convivio> getConvivios() {
        return convivios;
    }

    
}
