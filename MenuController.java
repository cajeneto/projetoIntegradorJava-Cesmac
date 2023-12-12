import java.util.Scanner;

public class MenuController {
    
    
    
    Scanner scan = new Scanner(System.in);
    Filme filme = new Filme(null, null, null, null, null);
    Ingresso ingresso = new Ingresso(null, null, 0, 0, 0, 0, 0, null,null);
    IngressoVip vip = new IngressoVip(null, null, 0, 0, 0, 0, 0, null, null);
    
    //Atributos;
    String infoNome;
    private int filmeSelecionado;
    private String sessao;
    int escolhaTipoDeEntrada;
    
    
    
    public MenuController(String infoNome, int filmeSelecionado, String sessao){
        this.infoNome = infoNome;
        this.filmeSelecionado = filmeSelecionado;
        this.sessao = sessao;
    }
    
    

    //Métodos
    public void menuInicial() {
        System.out.println("Olá, seja bem vindo ao Cinema 10!\n");
        System.out.println("Escolha um dos filmes em cartaz no cinema 10!");
        filme.mostrarFilmes();
        ingresso.setEscolhaSeuIngresso();
    }

    public void tipoIngresso(){
        System.out.println("Qual o tipo de ingresso que você deseja?");
        ingresso.tipoIngresso();
        int recebeTipoIngresso = scan.nextInt();
        if (recebeTipoIngresso == 1) {


            System.out.println("Você selecionou a opção de Ingresso: Meia Entrada."); 
            System.out.println("Quantos ingressos você deseja?");
            int quantidadeIngressos = scan.nextInt();
            int resultadoValorIngresso = quantidadeIngressos*12;
            System.out.println("Total compra de Ingressos: R$"+resultadoValorIngresso+",00");



        }   else if (recebeTipoIngresso == 2) {

        System.out.println("\nVocê selecionou a opção de Ingresso: Entrada Inteira.");   
        System.out.println("Quantos ingressos você deseja?");
        int quantidadeIngressos = scan.nextInt();
        int resultadoValorIngresso = quantidadeIngressos*24;
        System.out.println("Total compra de Ingressos: R$"+resultadoValorIngresso+",00");
        
        
        }   else if (recebeTipoIngresso == 3) {

        System.out.println("\nVocê selecionou a opção de Ingresso: Meia Entrada VIP.");
        System.out.println("Quantos ingressos você deseja?");
        int quantidadeIngressos = scan.nextInt();
        int resultadoValorIngresso = quantidadeIngressos*24;
        System.out.println("Total compra de Ingressos: R$"+resultadoValorIngresso+",00");
        vip.acessoLanchonete();



        }   else if (recebeTipoIngresso == 4) {
        System.out.println("\nVocê selecionou a opção de Ingresso: Entrada Inteira VIP."); 
        System.out.println("Quantos ingressos você deseja?");
        int quantidadeIngressos = scan.nextInt();
        int resultadoValorIngresso = quantidadeIngressos*48;
        System.out.println("Total compra de Ingressos: R$"+resultadoValorIngresso+",00"); 
        vip.acessoLanchonete();
        }  
        
    }

   



}



