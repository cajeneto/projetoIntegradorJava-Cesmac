public class Filme {



    MenuController control = new MenuController();
    
    
    
    //# PASSO 2
    //Crie uma classe Filme com o nome, diretor, descrição, gênero e duração do filme;
    String nomeDoFilme; // feito
    String nomeDoDiretor; // em produção
    String nomeDescricao; // feito
    String generoFilme; // em produção
    String  duracaoFilme; // em produção
    
    
    // métodos;
    public void descricaoDoFilme(int d, int nomeFilme){
        
        if (d == 1) {
            //informa nome do filme
            // = control.escolhaDoFilme;
                if (nomeFilme ==1){//"14:20", "16:30","17:30","19:40","20:40"
                    System.out.println("Você escolheu" +control.filmesDoCinema[0]+", no horário de 14:20h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 2){
                    System.out.println("Você escolheu" +control.filmesDoCinema[1]+", no horário de 17:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 3){
                    System.out.println("Você escolheu" +control.filmesDoCinema[2]+", no horário de 16:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 4){
                    System.out.println("Você escolheu" +control.filmesDoCinema[3]+", no horário de 19:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                }
            
            //informa descrição
            System.out.println("Diretor: Demetrius Rinchester");
            System.out.println("Duração: 2:30h");
            System.out.println("Gênero: Comédia");
            System.out.println("Descrição do Filme: ");
            System.out.println("Sean Boswell é um piloto de rua que desafia seu rival e bate o carro no fim da corrida. Ele decide se mudar para o Maceió para evitar a prisão em Coité do Noia, já que os rachas não são nada populares com as autoridades. Em Maceió, ele começa a aprender um excitante e perigoso estilo novo de competir nas ruas.");
            
        } else if (d == 2){
            //informa nome do filme
            // = control.escolhaDoFilme;
                if (nomeFilme ==1){//"14:20", "16:30","17:30","19:40","20:40"
                    System.out.println("Você escolheu" +control.filmesDoCinema[0]+", no horário de 14:20h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 2){
                    System.out.println("Você escolheu" +control.filmesDoCinema[1]+", no horário de 17:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 3){
                    System.out.println("Você escolheu" +control.filmesDoCinema[2]+", no horário de 16:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 4){
                    System.out.println("Você escolheu" +control.filmesDoCinema[3]+", no horário de 19:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                }


            //informa descrição
            System.out.println("Diretor: Alexandre O Grande");
            System.out.println("Duração: 3:30h");
            System.out.println("Gênero: Comédia");
            System.out.println("A Trança do Rei Careca é um filme de aventura e fantasia dirigido por Alexandre O Grande, com base no popular romance escrito por Lynette Eason. A história se passa no fictício reino de Barlia, onde a coroa foi roubada. Os irmãos Becket, Josh e Courtney, são escolhidos pelo Rei Careca para ajudar a recuperar a coroa.No caminho, eles enfrentam várias provações e obstáculos, como pântanos, terras selvagens e criaturas mágicas. Além disso, eles precisam resolver conflitos e unir a Barlia, que está dividida.Ao longo de sua jornada, os irmãos descobrem a verdade sobre a coroa e os responsáveis pelo roubo. Juntos, eles trabalham para superar as dificuldades e derrotar os inimigos, eventualmente recuperando a coroa e trazendo a unidade e a paz para o reino. A Trança do Rei Careca é uma história emocionante e envolvente que pode ser apreciada por todas as idades.");

        } else if (d == 3){
            //informa nome do filme
            // = control.escolhaDoFilme;
                if (nomeFilme ==1){//"14:20", "16:30","17:30","19:40","20:40"
                    System.out.println("Você escolheu" +control.filmesDoCinema[0]+", no horário de 14:20h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 2){
                    System.out.println("Você escolheu" +control.filmesDoCinema[1]+", no horário de 17:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 3){
                    System.out.println("Você escolheu" +control.filmesDoCinema[2]+", no horário de 16:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 4){
                    System.out.println("Você escolheu" +control.filmesDoCinema[3]+", no horário de 19:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                }


            //informa descrição
            System.out.println("Diretor: Faraó Terceiro");
            System.out.println("Duração: 1:46h");
            System.out.println("Gênero: Comédia");
            System.out.println("A Volta dos Que Não Foram 2 é um filme brasileiro lançado em 2012. Escrito e dirigido por Faraó Terceiro, o filme conta a história de sete adolescentes que desaparecem em meio a um triângulo amoroso complexo. O enredo se baseia na pergunta de quem será a escolhida no final.");

        } else if (d == 4){
            //informa nome do filme
            // = control.escolhaDoFilme;
                if (nomeFilme ==1){//"14:20", "16:30","17:30","19:40","20:40"
                    System.out.println("Você escolheu" +control.filmesDoCinema[0]+", no horário de 14:20h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 2){
                    System.out.println("Você escolheu" +control.filmesDoCinema[1]+", no horário de 17:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 3){
                    System.out.println("Você escolheu" +control.filmesDoCinema[2]+", no horário de 16:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                } else if (nomeFilme == 4){
                    System.out.println("Você escolheu" +control.filmesDoCinema[3]+", no horário de 19:30h");
                    System.out.println("Tenha um bom filme! O Cinema 10 agradece a sua preferência.");
                }


            //informa descrição
            System.out.println("Diretor: Donald Trump");
            System.out.println("Duração: 3:12h");
            System.out.println("Gênero: Comédia");
            System.out.println("Os quatro cantos das sala redonda é um filme independente brasileiro lançado em 2015. O filme é uma obra de autor dirigida por Donald Trump e protagonizada por Carla Marins e Ricardo Blat.");

        }
        
    } 


}
