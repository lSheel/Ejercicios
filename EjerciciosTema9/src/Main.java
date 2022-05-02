public class Main {
    public static void main(String[] args) {

        Credito credito = new Credito("Luis", 22, "55883884", 777777);
        Trabajador trabajor = new Trabajador("Jose", 28, "55883884", 6734343);

        System.out.println("Datos de la persona: " + credito.getNombre() + " edad: " + credito.getEdad()
                + " telefono: " + credito.getTelefono() + " credito: $" + credito.getCredito());

        System.out.println("Datos de la persona: " + trabajor.getNombre() + " edad: " + trabajor.getEdad()
                + " telefono: " + trabajor.getTelefono() + " salario: $" + trabajor.getSalario());

    }
}