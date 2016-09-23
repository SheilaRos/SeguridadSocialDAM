package SeguridadSocial;


public class Persona {
    private String DNI;
    private String  NumSeguridadSocial;
    private String Nombre;
    private String Apellidos;
    private int Edad;
    private double salario;


    public Persona(String DNI, String numSeguridadSocial, String nombre, String apellidos, int edad, double salario) {
        this.DNI = DNI;
        this.NumSeguridadSocial = numSeguridadSocial;
        this.Nombre = nombre;
        this.Apellidos = apellidos;
        this.Edad = edad;
        this.salario = salario;
    }

    public String getDNI() {

        return DNI;
    }

    public void setDNI(String DNI) {

        this.DNI = DNI;
    }
//aksalkjlakdjlakjdlkajlk
    public String getNumSeguridadSocial() {

        return NumSeguridadSocial;
    }


    public void setNumSeguridadSocial(String numSeguridadSocial) {

        this.NumSeguridadSocial = numSeguridadSocial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {

        this.Nombre = nombre;
    }

    public String getApellidos() {

        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        this.Apellidos = apellidos;
    }

    public int getEdad() {

        return Edad;
    }

    public void setEdad(int edad) {

        this.Edad = edad;
    }

    public double getSalario() {

        return salario;
    }

    public void setSalario(double salario) {

        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Persona{" +
                "DNI='" + DNI + '\'' +
                ", NumSeguridadSocial='" + NumSeguridadSocial + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Apellidos='" + Apellidos + '\'' +
                ", Edad=" + Edad +
                ", salario=" + salario +
                '}';
    }
}
