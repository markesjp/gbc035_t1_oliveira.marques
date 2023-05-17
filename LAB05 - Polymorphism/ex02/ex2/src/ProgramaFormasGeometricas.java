public class ProgramaFormasGeometricas {
    public static void main(String[] args) {
        FormaGeometrica[] formas = new FormaGeometrica[4];
        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(4, 6);
        formas[2] = new Cubo(3);
        formas[3] = new Esfera(2);

        for (FormaGeometrica forma : formas) {
            System.out.println(forma);
            System.out.println("Área: " + forma.obterArea());
            if (forma instanceof FormaTridimensional) {
                System.out.println("Volume: " + ((FormaTridimensional) forma).obterVolume());
            }
        }
    }
}