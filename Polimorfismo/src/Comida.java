public class Comida {
    private double peso;
/*POLIMORFISMO POR SOBRECARGA: uma classe sobrescreve as características de outra, alterando ou não os seus métodos ou atributos */
    public Comida(double peso){
        setPeso(peso);
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0) {
            this.peso = peso;
        }
    }
}
