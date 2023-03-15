public class CalcularFigura {
    public static void main(String[] args) {
        FiguraGeometrica cuadrado = new FiguraGeometrica("Cuadrado", 4, 9);

        System.out.println("cuadrado.calcularPerimetro() = " + cuadrado.calcularPerimetro());
        System.out.println("cuadrado.calcularSuperficie() = " + cuadrado.calcularSuperficie());
        System.out.println("cuadrado.info() = " + cuadrado.info());
        System.out.println("----------------");
        
        FiguraGeometrica triangulo = new FiguraGeometrica("Triángulo", 3, 10);

        System.out.println("triangulo.calcularPerimetro() = " + triangulo.calcularPerimetro());
        System.out.println("triangulo.calcularSuperficie() = " + triangulo.calcularSuperficie());
        System.out.println("triangulo.info() = " + triangulo.info());

        String [] cajita = new String[5];
    }
}
