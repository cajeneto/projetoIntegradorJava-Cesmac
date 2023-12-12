public class IngressoVip extends Ingresso {

    private int ingressoVIPMeiaValor = 24;
    private int ingressoVIPInteiraValor = 48;


    public IngressoVip(String ingressoMeia, String ingressoInteiro, int ingressoMeiaValor, int ingressoInteiroValor,
        int escolhaIngressosDeEntrada1, int escolhaQuantidadeIngressos, int valor, String ingressoVIPMeia, String ingressoVIPInteira) {

        super(ingressoMeia, ingressoInteiro, ingressoMeiaValor, ingressoInteiroValor, escolhaIngressosDeEntrada1,
        escolhaQuantidadeIngressos, valor, ingressoVIPMeia, ingressoVIPInteira);
        this.ingressoVIPMeiaValor = ingressoVIPMeiaValor;
        this.ingressoVIPInteiraValor = ingressoVIPInteiraValor;

    
    }


        
    
        @Override
        public void acessoLanchonete() {
            System.out.println("Lanchonete do cinema liberada!");
        }


}
