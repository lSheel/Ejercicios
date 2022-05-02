public class Trabajador extends Persona {
    private float salario;
    public Trabajador(String nombre, int edad, String telefono, float salario) {
        super(nombre, edad, telefono);
        this.salario = salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
