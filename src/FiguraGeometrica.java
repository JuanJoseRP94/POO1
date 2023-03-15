public class FiguraGeometrica {
    // Atributos para una figura regular(lados y angulos iguales)
    // ... num lados, longitud, nombre...
    String nombre;
    int numeroLados;
    int longitud;

    //Método Constructor
    public FiguraGeometrica(String nombre, int numeroLados, int longitud){
        this.nombre = nombre;
        this.numeroLados = numeroLados;
        this.longitud = longitud;
    }

    // Métodos
    public int calcularPerimetro(){
        if (numeroLados>0){
            return this.numeroLados * this.longitud;
        } else {
            return (int) (2 * Math.PI * longitud);
        }
    }

    public int calcularSuperficie(){
        if (numeroLados == 4) {
            return longitud * longitud;
        } else if (numeroLados == 3) {
            return (int) (longitud * longitud * Math.sqrt(3) / 4);
        } else {
            return -1; // No se puede calcular la superficie de otras figuras
        }
    }
    public String info(){
        return "Nombre: " + nombre + "\nNúmero de lados:" + numeroLados + "\nLongitud: " + longitud;
    }

    //Calcula el perímetro
    //Calcula la superficie
    // info sobre la figura geometrica (representación de los atributos)

    // Método constructor (parámetros para modificar para sacar la figura geometrica)
}
