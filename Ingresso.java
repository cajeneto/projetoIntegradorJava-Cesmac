import java.util.Scanner;

public class Ingresso {
    
    Scanner scan = new Scanner(System.in);
    Filme fil = new Filme(null, null, null, null, null);

    //Atributos;
    private String ingressoMeia = "[1] - Meia Entrada R$12,00";
    private String ingressoInteiro = "[2] - Entrada Inteira R$24,00";
    private int ingressoMeiaValor = 12;
    private int ingressoInteiroValor = 24;
    private int escolhaIngressosDeEntrada1 = 0;
    private int escolhaQuantidadeIngressos = 0;
    private int valor;
    private String ingressoVIPMeia = "[3] - Meia Entrada VIP";
    private String ingressoVIPInteira = "[4] - Entrada Inteira VIP";
    
    
    public Ingresso(String ingressoMeia, String ingressoInteiro,int ingressoMeiaValor,int ingressoInteiroValor, 
    int escolhaIngressosDeEntrada1, int escolhaQuantidadeIngressos, int valor, String ingressoVIPMeia, String ingressoVIPInteira){
        this.ingressoMeia = ingressoMeia;
        this.ingressoInteiro = ingressoInteiro;
        this.ingressoMeiaValor = ingressoMeiaValor;
        this.ingressoInteiroValor = ingressoInteiroValor;
        this.escolhaIngressosDeEntrada1 = escolhaIngressosDeEntrada1;
        this.escolhaQuantidadeIngressos = escolhaQuantidadeIngressos;
        this.valor = valor;
        this.ingressoVIPMeia = ingressoVIPMeia;
        this.ingressoVIPInteira = ingressoVIPInteira;

    }
    
    

    //Métodos;
    public void acessoLanchonete(){
        System.out.println("Compre um ingresso VIP e tenha acesso a lanchonete do cinema 10!");
    }



    // get escolha do ingresso
    public int getEscolhaSeuIngresso(){
        return escolhaIngressosDeEntrada1;
    }
    // 
    public void setEscolhaSeuIngresso() {
        escolhaIngressosDeEntrada1 = scan.nextInt();
            if(escolhaIngressosDeEntrada1 == 1){
                System.out.println("Você selecionou o filme: ");
                fil.mostrarFilmeSelecionado1();
            } else if (escolhaIngressosDeEntrada1 == 2) {
                System.out.println("Você selecionou o filme: ");
                fil.mostrarFilmeSelecionado2();
            } else if (escolhaIngressosDeEntrada1 == 3) {
                System.out.println("Você selecionou o filme: ");
                fil.mostrarFilmeSelecionado3();
            } else if (escolhaIngressosDeEntrada1 == 4) {
                System.out.println("Você selecionou o filme: ");
                fil.mostrarFilmeSelecionado4();
            } else {
                System.out.println("Escolha uma das opções em cartaz e tente novamente.");    
            }
    }

    


    public void tipoIngresso(){
        System.out.println(ingressoMeia = "[1] - Meia Entrada R$12,00");
        System.out.println(ingressoInteiro = "[2] - Entrada Inteira R$24,00");
        System.out.println(ingressoVIPMeia = "[3] - Meia Entrada VIP R$24,00");
        System.out.println(ingressoVIPInteira = "[4] - Entrada Inteira VIP R$48,00");
        System.out.println("Compre um ingresso VIP e tenha acesso a lanchonete do Cinema 10!");
             
    }


    /* // get 
    public int getPrecoIngressoMeia(int precoIngressoMeia){
        return precoIngressoMeia;
    }
    // set
    public void setPrecoIngressoMeia(){


    } */


    public void valorTotalIngressos(){
        int quantidadeIngressos = scan.nextInt(); 
        

    }
    



    

    

}
