public class Main {
    public static void main(String[] args) {

        Persona persona =  new Persona(22, "Luis", "5566447744");
        System.out.println("Mi nombre es " + persona.getNombre() + " Tengo " + persona.getEdad() +
                "años y mi numero es: " + persona.getTelefono());
        persona.setEdad(25);
        persona.setNombre("Jose");
        persona.setTelefono("7986889898");
        System.out.println("Mi nombre es " + persona.getNombre() + " Tengo " + persona.getEdad() +
                "años y mi numero es: " + persona.getTelefono());

    }
}