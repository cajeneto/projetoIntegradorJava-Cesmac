import java.util.Scanner;

public class Cinema10 {
        
        public static void main(String[] args) {

              Scanner scan = new Scanner(System.in);

              FilmesDisponiveis seuNome = new FilmesDisponiveis();
              /* FilmesDisponiveis filmesDisponiveis = new FilmesDisponiveis();
              FilmesDisponiveis escolhaFilme = new FilmesDisponiveis();
              FilmesDisponiveis qntIngressos = new FilmesDisponiveis();
              FilmesDisponiveis escolhaIngressoInteira = new FilmesDisponiveis(); */



              // campo do MenuController
                MenuController controll = new MenuController();
                
                controll.selecionarFilme("[1] Velozes e Furiosos, desafio em Maceió.", "[2] A trança do Rei Careca,", "[3] A volta dos que não foram 2,", "[4] As Branquelas,");





                // mensagem de boas vindas.
              System.out.println("Olá, seja bem-vindo ao Cinema 10!\nPor favor, informe seu nome...");
              System.out.println();
              seuNome.infoNome = scan.nextLine(); //armazena nome
              

              /* // apresentação dos filmes disponíveis.
              System.out.println(seuNome.infoNome+", esses são os filmes disponíveis para hoje.");
              System.out.println(filmesDisponiveis.filmesEmCartaz[0]+" nos horário de: "+filmesDisponiveis.horariosDisponiveis[2]+" e "+filmesDisponiveis.horariosDisponiveis[4]);
              System.out.println(filmesDisponiveis.filmesEmCartaz[1]+" nos horário de: "+filmesDisponiveis.horariosDisponiveis[0]+" e "+filmesDisponiveis.horariosDisponiveis[2]);
              System.out.println(filmesDisponiveis.filmesEmCartaz[2]+" nos horário de: "+filmesDisponiveis.horariosDisponiveis[0]+" e "+filmesDisponiveis.horariosDisponiveis[3]);
              System.out.println(filmesDisponiveis.filmesEmCartaz[3]+" nos horário de: "+filmesDisponiveis.horariosDisponiveis[1]+" e "+filmesDisponiveis.horariosDisponiveis[2]);

              // estrutura de decisão sobre qual filme escolher.
              System.out.println(seuNome.infoNome+", qual filme e o horário que deseja assistir?");
              escolhaFilme.escolhaFilmeNum = scan.nextInt();//armazena o filme escolhido. */

              // bloco se escolha do filme for número 1.
              /* if(escolhaFilme.escolhaFilmeNum == 1){
                System.out.println(seuNome.infoNome+", boa escolha!");
                System.out.println("O ingresso inteiro custa: "+"R$"+escolhaFilme.valorInteira+",00" +"\n"+"A meia entrada custa: "+"R$"+escolhaFilme.valorMeia+",00");
                
                // escolhe meia entrada ou inteira.
                System.out.println("Qual o ingresso você deseja?\n[1] - Entrada Inteira\n[2] - Meia entrada");
                escolhaIngressoInteira.escolhaIngresso = scan.nextInt();
                        if(escolhaIngressoInteira.escolhaIngresso == 1){
                                //solicita a quantidade de ingressos.
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                // informa o preço total da compra.
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorInteira);
                                // mensagem de agradecimento e fim do código.
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();

                        } else if (escolhaIngressoInteira.escolhaIngresso == 2){
                                System.out.println("Informe a quantidade de ingressos:\n");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                System.out.println("O valor total foi de: \n");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorMeia);
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();
                        } */

                
                // bloco se escolha do filme for número 2.
             /*  } else if (escolhaFilme.escolhaFilmeNum == 2){
                System.out.println(seuNome.infoNome+", boa escolha!");
                System.out.println("O ingresso inteiro custa: "+"R$"+escolhaFilme.valorInteira+",00" +"\n"+"A meia entrada custa: "+"R$"+escolhaFilme.valorMeia+",00");
                
                        // escolhe meia entrada ou inteira.
                        System.out.println("Qual o ingresso você deseja?\n[1] - Entrada Inteira\n[2] - Meia entrada");
                        escolhaIngressoInteira.escolhaIngresso = scan.nextInt();
                        if(escolhaIngressoInteira.escolhaIngresso == 1){
                                //solicita a quantidade de ingressos.
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                // informa o preço total da compra.
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorInteira);
                                // mensagem de agradecimento e fim do código.
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();

                        } else if (escolhaIngressoInteira.escolhaIngresso == 2){
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorMeia);
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();
                        }
 */

                // bloco se escolha do filme for número 3.
              /* } else if (escolhaFilme.escolhaFilmeNum == 3){
                System.out.println(seuNome.infoNome+", boa escolha!");
                System.out.println("O ingresso inteiro custa: "+"R$"+escolhaFilme.valorInteira+",00" +"\n"+"A meia entrada custa: "+"R$"+escolhaFilme.valorMeia+",00");

                        // escolhe meia entrada ou inteira.
                        System.out.println("Qual o ingresso você deseja?\n[1] - Entrada Inteira\n[2] - Meia entrada");
                        escolhaIngressoInteira.escolhaIngresso = scan.nextInt();
                        if(escolhaIngressoInteira.escolhaIngresso == 1){
                                //solicita a quantidade de ingressos.
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                // informa o preço total da compra.
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorInteira);
                                
                                // mensagem de agradecimento e fim do código.
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();

                        } else if (escolhaIngressoInteira.escolhaIngresso == 2){
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorMeia);
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();
                        }

              } else if (escolhaFilme.escolhaFilmeNum == 4){
                System.out.println(seuNome.infoNome+", boa escolha!");
                System.out.println("O ingresso inteiro custa: "+"R$"+escolhaFilme.valorInteira+",00" +"\n"+"A meia entrada custa: "+"R$"+escolhaFilme.valorMeia+",00");

                        // escolhe meia entrada ou inteira.
                        System.out.println("Qual o ingresso você deseja?\n[1] - Entrada Inteira\n[2] - Meia entrada");
                        escolhaIngressoInteira.escolhaIngresso = scan.nextInt();
                        if(escolhaIngressoInteira.escolhaIngresso == 1){
                                //solicita a quantidade de ingressos.
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                // informa o preço total da compra.
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorInteira);

                                // mensagem de agradecimento e fim do código.
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();

                        } else if (escolhaIngressoInteira.escolhaIngresso == 2){
                                System.out.println("Informe a quantidade de ingressos:");
                                qntIngressos.quantidadeIngressos = scan.nextInt();
                                System.out.println("O valor total foi de:");
                                System.out.println(qntIngressos.quantidadeIngressos*=qntIngressos.valorMeia);
                                System.out.println("Obrigado por escolher o Cinema 10!\nTenha um ótimo filme!");
                                scan.close();
                        } */
                        
                        
                /* } else if((escolhaIngressoInteira.escolhaIngresso !=1) || (escolhaIngressoInteira.escolhaIngresso != 2) || (escolhaIngressoInteira.escolhaIngresso != 3) || (escolhaIngressoInteira.escolhaIngresso != 4)){
                        
                        System.out.println("Escolha somente uma das opções informadas acima.");

                } */
        }
        
}




