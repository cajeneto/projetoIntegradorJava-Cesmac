import java.util.Scanner;

public class Cinema10 {
        
        public static void main(String[] args) {

              Scanner scan = new Scanner(System.in);
              
              // campo do MenuController
              MenuController menuController = new MenuController();
              
                // mensagem de boas vindas.
              System.out.println("Olá, seja bem-vindo ao Cinema 10!\nPor favor, informe seu nome...");
              menuController.infoNome = scan.nextLine(); //armazena nome do cliente
        
              // apresentação dos filmes disponíveis.
              //chamada do método selecionarFilme
              menuController.selecionarFilme(0);

              // chamada do método para comprar ingresso
              menuController.selecionarCompraIngresso(0);

              // chamada do método para informar o resumo da compra.
              menuController.resumoCompraIngresso(null);
              
              
                // campo do Filme;
                Filme filme = new Filme();
                
                int fil = menuController.escolhaDoFilme;

                //System.out.println("Descrição:");
                filme.descricaoDoFilme(fil, fil);
                
                




        }
        
}




