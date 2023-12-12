
/* Passo 1: (vale até 0,5 ponto) Ajustar classe Filme;
Passo 2: (vale até 0,5 ponto) Adicione polimorfismo ao seu projeto;
Passo 3: (Vale até 0,5 ponto) Trabalhe o conceito de herança no seu projeto;
Passo 4: (Vale até 0,5 ponto) – Implementar todas funcionalidades;
 */


public class Filme {
    
    //Atributos;
    private String selecioneFilme1 = "[1] Velozes e Furiosos, desafio em Maceió";
    private String selecioneFilme2 = "[2] A trança do Rei Careca";
    private String selecioneFilme3 = "[3] A volta dos que não foram 2";
    private String selecioneFilme4 = "[4] Os quatro cantos das sala redonda.";
    private String nomeDiretor;
    private String duracao;
    private String genero;
    private String descricao;
    private Boolean filme3D;

    public Filme(String nomeDiretor, String duracao, String genero, String descricao, Boolean filme3D) {
        this.nomeDiretor = nomeDiretor;
        this.duracao = duracao;
        this.genero = genero;
        this.descricao = descricao;
        this.filme3D = filme3D;


    }


    // get nome diretor//////////////////////////////////////////
    public String getNomeDiretor(){
        return this.nomeDiretor;
    }
    // set nome diretor
    public void setNomeDiretor1(){
        System.out.println("Diretor: Demetrius Rinchester");
    }
    public void setNomeDiretor2(){
        System.out.println("Diretor: Alexandre O Grande");
    }
    public void setNomeDiretor3(){
        System.out.println("Diretor: Faraó Terceiro");
    }
    public void setNomeDiretor4(){
        System.out.println("Diretor: Donald Trump");
    }

    //
    //

    // get duracao /////////////////////////////////
    public String duracao(){
        return this.duracao;
    }
    // set duracao
    public void setDuracao1(){
        System.out.print("Duração: 2:30h");    
        
    }
    public void setDuracao2(){
        System.out.print("Duração: 3:30h");    
    }
    public void setDuracao3(){
        System.out.print("Duração: 1:46h");    
    }
    public void setDuracao4(){
        System.out.print("Duração: 3:12h");    
    }


    // get Genêro //////////////////////////////////////
    public String getGenero(){
        return genero;
    }

    // set Genêro
    public void setGenero(){
        System.out.println("\nGênero: Comédia");
    }
    

    // get Descrição //////////////////////////////////
    public String getDescricao(){
        return descricao;
    }

    // set Descrição
    public void setDescricao1(){
        System.out.println("Sean Boswell é um piloto de rua que desafia seu rival e bate o carro no fim da corrida. Ele decide se mudar para o Maceió para evitar a prisão em Coité do Noia, já que os rachas não são nada populares com as autoridades. Em Maceió, ele começa a aprender um excitante e perigoso estilo novo de competir nas ruas.");
    }

    public void setDescricao2(){
        System.out.println("A Trança do Rei Careca é um filme de aventura e fantasia dirigido por Alexandre O Grande, com base no popular romance escrito por Lynette Eason. A história se passa no fictício reino de Barlia, onde a coroa foi roubada. Os irmãos Becket, Josh e Courtney, são escolhidos pelo Rei Careca para ajudar a recuperar a coroa.No caminho, eles enfrentam várias provações e obstáculos, como pântanos, terras selvagens e criaturas mágicas. Além disso, eles precisam resolver conflitos e unir a Barlia, que está dividida.Ao longo de sua jornada, os irmãos descobrem a verdade sobre a coroa e os responsáveis pelo roubo. Juntos, eles trabalham para superar as dificuldades e derrotar os inimigos, eventualmente recuperando a coroa e trazendo a unidade e a paz para o reino. A Trança do Rei Careca é uma história emocionante e envolvente que pode ser apreciada por todas as idades.");
    }

    public void setDescricao3(){
        System.out.println("A Volta dos Que Não Foram 2 é um filme brasileiro lançado em 2012. Escrito e dirigido por Faraó Terceiro, o filme conta a história de sete adolescentes que desaparecem em meio a um triângulo amoroso complexo. O enredo se baseia na pergunta de quem será a escolhida no final.");
    }

    public void setDescricao4(){
        System.out.println("Os quatro cantos das sala redonda é um filme independente brasileiro lançado em 2015. O filme é uma obra de autor dirigida por Donald Trump e protagonizada por Carla Marins e Ricardo Blat.");
    }
    




    //Métodos;

    public void mostrarFilmes(){
        System.out.println(selecioneFilme1);
        System.out.println(selecioneFilme2);
        System.out.println(selecioneFilme3);
        System.out.println(selecioneFilme4);
    }

    public void mostrarFilmeSelecionado1(){
        System.out.println(selecioneFilme1);
    }

    public void mostrarFilmeSelecionado2(){
        System.out.println(selecioneFilme2);
    }
    public void mostrarFilmeSelecionado3(){
        System.out.println(selecioneFilme3);
    }
    public void mostrarFilmeSelecionado4(){
        System.out.println(selecioneFilme4);
    }

    public void infoFilme1(){
        setNomeDiretor1();
        setDuracao1();
        setGenero();
        System.out.println("Descrição do Filme: ");
        setDescricao1();
            
    }
    public void infoFilme2(){
        setNomeDiretor2();
        setDuracao2();
        setGenero();
        System.out.println("Descrição do Filme: ");
        setDescricao2(); 
        

    }
    public void infoFilme3(){
        setNomeDiretor3();
        setDuracao3();
        setGenero();
        System.out.println("Descrição do Filme: ");
        setDescricao3();

    }
    public void infoFilme4(){
        setNomeDiretor4();
        setDuracao4();
        setGenero();
        System.out.println("Descrição do Filme: ");
        setDescricao4();

    }



//encapsulamento realizado.
}
