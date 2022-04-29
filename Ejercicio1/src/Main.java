public class Main {
    public static void main(String[] args) {
        System.out.println("La suma de los numeros es: " + suma(6,7,3));

        Coche miCoche = new Coche();

        miCoche.agregarPuerta();

        System.out.println("Numero de puertas: " + miCoche.n_puertas);
    }

    public static int suma(int a, int b, int c){
        return a + b + c;
    }
}

