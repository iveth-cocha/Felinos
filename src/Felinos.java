public class Felinos {
    String tipo;
    double peso;

    public Felinos(){
    }
    //constructor
    public Felinos(String tipo, double peso) {
        this.tipo = tipo;
        this.peso=peso;
    }
    //seter y getter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
}
