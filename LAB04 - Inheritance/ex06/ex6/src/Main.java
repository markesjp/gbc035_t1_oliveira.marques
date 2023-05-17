public class Main {
    public static void main(String[] args) {
        // Instanciando um ingresso normal
        Ingresso ingressoNormal = new Normal(50.0);
        System.out.println("Ingresso normal:");
        ingressoNormal.escreveValor();
        System.out.println();

        // Instanciando um ingresso VIP
        VIP ingressoVIP = new VIP(100.0, 50.0);
        System.out.println("Ingresso VIP:");
        ingressoVIP.escreveValor();
        System.out.println("Valor do ingresso VIP: " + ingressoVIP.getValorVIP());
        System.out.println();

        // Instanciando um camarote inferior
        CamaroteInferior camaroteInferior = new CamaroteInferior(150.0,50.0, "Setor A");
        System.out.println("Camarote inferior:");
        camaroteInferior.escreveValor();
        System.out.println("Localização: " + camaroteInferior.getLocalizacao());
        System.out.println();

        // Instanciando um camarote superior
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200.0, 100.0, "Setor B", 100.0);
        System.out.println("Camarote superior:");
        camaroteSuperior.escreveValor();
        System.out.println("Valor do ingresso VIP: " + camaroteSuperior.getValorVIP());
        System.out.println("Localização: " + camaroteSuperior.getLocalizacao());
        System.out.println();
    }
}
