import java.util.Scanner;

public class MenuController {

    //atributosController
    String infoNome;
    int escolhaDoFilme;
    String[] filmesDoCinema = {"[1] Velozes e Furiosos, desafio em Maceió." , "[2] A trança do Rei Careca.", "[3] A volta dos que não foram 2.", "[4] Os quatro cantos das sala redonda."};
    String[] horariosDisponiveis = {"14:20", "16:30","17:30","19:40","20:40"};
    int escolhaFilmeNum;
    int escolhaIngresso;
    int somaInteira;
    int somaMeia;
    int quantidadeIngressos;
    int valorInteira = 24;
    int valorMeia = 12;




    //# PASSO 1
    //selecionarFilme;
    //compraIngresso;
    //resumoDeCompra;
        Scanner scan = new Scanner(System.in);
        //FilmesDisponiveis filmesDisponiveisController = new FilmesDisponiveis();

        //MÉTODO PARA SELECIONAR O FILME;
    public void selecionarFilme(int selectFilmes){
        System.out.println("Selecione o filme que deseja assistir");
        System.out.println(filmesDoCinema[0]);
        System.out.println(filmesDoCinema[1]);
        System.out.println(filmesDoCinema[2]);
        System.out.println(filmesDoCinema[3]);
        escolhaDoFilme = scan.nextInt();
    }


        // MÉTODO PARA COMPRA DE INGRESSOS;
    public void selecionarCompraIngresso(int controllerCompraIngresso){
        System.out.println("Escolha o horário disponível para o filme que você escolheu.");
        //escolhaFilmeNum = scan.nextInt();
            //decisão escolha do horário.
            if (escolhaDoFilme == 1) {
                    System.out.println("Para o filme "+filmesDoCinema[0]+", temos os seguintes horários disponíveis:\n"+horariosDisponiveis[0]);
                    System.out.println("O valor para meia entrada custa R$"+valorMeia+"\nO valor para entrada inteira custa R$"+valorInteira);
                    System.out.println("Selecione a opção de ingresso:\n[ 1 ] - Meia Entrada\n[ 2 ] - Ingresso Inteiro");
                    escolhaIngresso = scan.nextInt();
                        if(escolhaIngresso == 1){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaMeia = quantidadeIngressos*valorMeia;
                            System.out.println("Total: R$"+somaMeia);
                        } else if(escolhaIngresso == 2){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaInteira = quantidadeIngressos*valorInteira;
                            System.out.println("Total: R$"+somaInteira);
                        } //fim da compra de ingressos

            } else if(escolhaDoFilme == 2){
                    System.out.println("Para o filme "+filmesDoCinema[1]+", temos os seguintes horários disponíveis:\n"+horariosDisponiveis[2]);
                    System.out.println("O valor para meia entrada custa R$"+valorMeia+"\nO valor para entrada inteira custa R$"+valorInteira);
                    System.out.println("Selecione a opção de ingresso:\n[ 1 ] - Meia Entrada\n[ 2 ] - Ingresso Inteiro");
                    escolhaIngresso = scan.nextInt();
                        if(escolhaIngresso == 1){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaMeia = quantidadeIngressos*valorMeia;
                            System.out.println("Total: R$"+somaMeia);
                        } else if(escolhaIngresso == 2){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaInteira = quantidadeIngressos*valorInteira;
                            System.out.println("Total: R$"+somaInteira);
                        } //fim da compra de ingressos

            } else if(escolhaDoFilme == 3){
                    System.out.println("Para o filme "+filmesDoCinema[2]+", temos os seguintes horários disponíveis:\n"+horariosDisponiveis[1]+" e "+horariosDisponiveis[4]);
                    System.out.println("O valor para meia entrada custa R$"+valorMeia+"\nO valor para entrada inteira custa R$"+valorInteira);
                    System.out.println("Selecione a opção de ingresso:\n[ 1 ] - Meia Entrada\n[ 2 ] - Ingresso Inteiro");
                    escolhaIngresso = scan.nextInt();
                        if(escolhaIngresso == 1){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaMeia = quantidadeIngressos*valorMeia;
                            System.out.println("Total: R$"+somaMeia);
                        } else if(escolhaIngresso == 2){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaInteira = quantidadeIngressos*valorInteira;
                            System.out.println("Total: R$"+somaInteira);
                        } //fim da compra de ingressos

            }  else if(escolhaDoFilme == 4){
                    System.out.println("Para o filme "+filmesDoCinema[3]+", temos os seguintes horários disponíveis:\n"+horariosDisponiveis[0]+", "+horariosDisponiveis[2]+" e "+horariosDisponiveis[3]);
                    System.out.println("O valor para meia entrada custa R$"+valorMeia+"\nO valor para entrada inteira custa R$"+valorInteira);
                    System.out.println("Selecione a opção de ingresso:\n[ 1 ] - Meia Entrada\n[ 2 ] - Ingresso Inteiro");
                    escolhaIngresso = scan.nextInt();
                        if(escolhaIngresso == 1){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaMeia = quantidadeIngressos*valorMeia;
                            System.out.println("Total: R$"+somaMeia);
                        } else if(escolhaIngresso == 2){
                            System.out.println("Quantos ingressos você deseja?");
                            quantidadeIngressos = scan.nextInt();
                            somaInteira = quantidadeIngressos*valorInteira;
                            System.out.println("Total: R$"+somaInteira);

                        } //fim da compra de ingressos

            } else if (escolhaDoFilme != 1 || escolhaDoFilme != 2 || escolhaDoFilme != 3 || escolhaDoFilme != 4){
                System.out.println("Escolha somente uma das opções informadas acima.");
            }
          

    }
    




        // MÉTODO PARA RESUMO DE COMPRA;
    public void resumoCompraIngresso(String resumoTotalIngresso){
        System.out.println("Resumo da compra:");
        System.out.println("Filme escolhido: ");
               if (escolhaDoFilme == 1) {
                    System.out.println(filmesDoCinema[0]);
                } else if (escolhaDoFilme == 2) {
                    System.out.println(filmesDoCinema[1]);
                } else if (escolhaDoFilme == 3) {
                    System.out.println(filmesDoCinema[2]);
                } else if (escolhaDoFilme == 4) {
                    System.out.println(filmesDoCinema[3]);
                }
                
        System.out.println("Quantidade de ingressos: "+quantidadeIngressos);
        int resultTotal = (escolhaIngresso == 1 || escolhaIngresso == 2) ? somaInteira : somaMeia;
        System.out.println("Total: " + resultTotal);
    }
    

    
    



}
