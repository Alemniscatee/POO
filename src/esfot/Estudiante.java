package esfot;

public class Estudiante extends Persona {
    private double promedio;

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        if (promedio>=0 || promedio <=20)
        this.promedio = promedio;
        else System.out.println("Valor incorrecto");
    }

    public void infoProm (){
        System.out.println("Promedio "+ this.promedio);
    }
}
