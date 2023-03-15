public class EjemploCoche {
    public static void main(String[] args) {
        // Métodos estáticos
        Coche.llamar112(); // Pertenecen a la clase

        // Instanciar objeto (crear el objeto a partir de una clase)
        Coche miCoche = new Coche();

        // Asignar valores a los atributos
        miCoche.marca = "Fiat";
        miCoche.modelo = "Punto";
        miCoche.color = "Celeste";
        miCoche.combustible = "Gasolina";
        miCoche.cilindrada = 1400;
        miCoche.potencia = 130;
        miCoche.maxRpm = 6000;
        miCoche.capacidadDeposito = 40;

        System.out.println("miCoche.rpm = " + miCoche.rpm);
        miCoche.Arrancar();
        System.out.println("miCoche.rpm = " + miCoche.rpm);
        miCoche.consumo(500);
        System.out.println("miCoche.consumo(500) = " + miCoche.consumo(500));
    }
}
