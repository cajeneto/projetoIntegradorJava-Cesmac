public class Filme {



    MenuController control = new MenuController();
    


     //# PASSO 2
    //Crie uma classe Filme com o nome, diretor, descrição, gênero e duração do filme;
    String nomeDoFilme;
    String nomeDoDiretor;
    String nomeDescricao;
    String generoFilme;
    String  duracaoFilme;
    
    
    // métodos;
    public void nomeDoFilmeEscolhido(int d){
        
        if (d == 1) {
            System.out.println("Sean Boswell é um piloto de rua que desafia seu rival e bate o carro no fim da corrida. Ele decide se mudar para o Maceió para evitar a prisão em Coité do Noia, já que os rachas não são nada populares com as autoridades. Em Maceió, ele começa a aprender um excitante e perigoso estilo novo de competir nas ruas.");
            
        } else if (d == 2){
            System.out.println("A Trança do Rei Careca é um filme de aventura e fantasia dirigido por Bryce Zabel, com base no popular romance escrito por Lynette Eason. A história se passa no fictício reino de Barlia, onde a coroa foi roubada. Os irmãos Becket, Josh e Courtney, são escolhidos pelo Rei Careca para ajudar a recuperar a coroa.No caminho, eles enfrentam várias provações e obstáculos, como pântanos, terras selvagens e criaturas mágicas. Além disso, eles precisam resolver conflitos e unir a Barlia, que está dividida.Ao longo de sua jornada, os irmãos descobrem a verdade sobre a coroa e os responsáveis pelo roubo. Juntos, eles trabalham para superar as dificuldades e derrotar os inimigos, eventualmente recuperando a coroa e trazendo a unidade e a paz para o reino. A Trança do Rei Careca é uma história emocionante e envolvente que pode ser apreciada por todas as idades.");

        } else if (d == 3){
            System.out.println("A Volta dos Que Não Foram 2 é um filme brasileiro lançado em 2012. Escrito e dirigido por Beto Brant, o filme conta a história de sete adolescentes que desaparecem em meio a um triângulo amoroso complexo. O enredo se baseia na pergunta de quem será a escolhida no final.");

        } else if (d == 4){
            System.out.println("Os quatro cantos das sala redonda é um filme independente brasileiro lançado em 2015. O filme é uma obra de autor dirigida por Hector Babenco e protagonizada por Carla Marins e Ricardo Blat.");

        }
        
    } 


}
