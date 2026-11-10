package esfot;

public class Pasante extends Estudiante {
    double porcentajeBeca;

    public double getPorcentajeBeca() {
        return porcentajeBeca;
    }

    public void setPorcentajeBeca(double porcentajeBeca) {
        this.porcentajeBeca = porcentajeBeca;
    }

    public void becaInfo(){
    System.out.println("Porcentaje de beca: "+ this.porcentajeBeca);
}
}
