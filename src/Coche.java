public class Coche {
    // Atributos (características/estado/campos)
    String marca;
    String modelo;
    String color;
    String combustible;
    float potencia;
    float cilindrada;
    float rpm = 0;
    float maxRpm = 7000;
    final float maxVelocidad = 180;
    float capacidadDeposito;

    // métodos (comportamiento)
    public void Arrancar(){
        rpm = 800;
    }

    public void pararMotor(){
        rpm = 0;
    }

    public void acelerar(float aceleracion){ // aceleración en porcentaje 0...100%
        if(rpm > 0){
            rpm = 800 + (maxRpm-800) * aceleracion / 100;
        } else {
            System.out.println("Arranca el coche");
        }
    }
    public static void llamar112(){
        System.out.println("Llamando a Emergencias");
    }

    public float consumo(float distancia, float repostado){
        return repostado / distancia * 100;
    }
    public float consumo(float distancia){
        return this.capacidadDeposito/distancia * 100;
    }
}