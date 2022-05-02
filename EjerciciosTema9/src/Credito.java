public class Credito extends Persona{
    private float credito;
    public Credito(String nombre, int edad, String telefono, float credito) {
        super(nombre, edad, telefono);
        this.credito = credito;
    }

    public float getCredito() {
        return credito;
    }

    public void setCredito(float credito) {
        this.credito = credito;
    }
}
