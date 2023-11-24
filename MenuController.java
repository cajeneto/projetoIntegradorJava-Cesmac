import java.util.Scanner;

public class MenuController {
    //# PASSO 1
    //selecionarFilme;
    //compraIngresso;
    //resumoDeCompra;
        Scanner scan = new Scanner(System.in);
        FilmesDisponiveis filmesDisponiveisController = new FilmesDisponiveis();


    public void selecionarFilme(String[] arrayFilmes){
        //System.out.println(arrayFilmes);
    }

    public void selecionarCompraIngresso(int controllerCompraIngresso){
        System.out.println("Quantos ingressos deseja?");
        filmesDisponiveisController.escolhaFilmeNum = scan.nextInt();
    }
    
    public void resumoCompraIngresso(String resumoTotalIngresso){
        System.out.println("Resumo da compra:");
        System.out.println("Filme: " + filmesDisponiveisController.escolhaFilmeNum);
        System.out.println("Quantidade de ingressos: " + filmesDisponiveisController);
        System.out.println("Total: " + resumoTotalIngresso);
    }
    

    //# PASSO 2
    //Crie uma classe Filme com o nome, diretor, descrição, gênero e duração do filme;
public class Filme {

    String nomeDoFilme;
    String nomeDoDiretor;
    String nomeDescricao;
    String generoFilme;
    int    duracaoFilme;
    
}

    //# PASSO 3
    //Crie uma classe Ingresso contendo o filme, tipo de ingresso e o horário da seção.

public class IngressoFilme {
    Filme filme;
    String tipoDeIngresso;
    String horarioDaSeccao;


}

public void selecionarFilme(String string, String string2, String string3, String string4) {
}

    //# PASSO 4
    //Integre todo o sistema com o uso das classes criadas usando corretamente o encapsulamento.


}
