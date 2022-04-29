public class Main {
    public static void main(String[] args){
        int numeroif = 0;
        int numeroWhile = 0;
        String estacion = "Primavera";
        if (numeroif == 0){
            System.out.println("El numero es 0");
        } else if (numeroif > 0) {
            System.out.println("El numero es positivo");
        }
        else{
            System.out.println("El numero es negativo");
        }

        while (numeroWhile<3){
            System.out.println(numeroWhile);
            numeroWhile++;
        }

        do{
            System.out.println(numeroWhile);
            numeroWhile++;
        }while (numeroWhile<4);

        for (int i = 0; i <=3; i++){
            System.out.println(i);
        }

        switch (estacion){
            case "Primavera":
                System.out.println("Estamos en Primavera");
                break;
            case "Verano":
                System.out.println("Estamos en Verano");
                break;
            case "Otoño":
                System.out.println("Estamos en Otoño");
                break;
            case "Invierno":
                System.out.println("Estamos en Invierno");
                break;
            default:
                System.out.println("Escriba bien la estacion del año");

        }
    }
}
