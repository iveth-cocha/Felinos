public class Domestico extends Felinos{

    private String color;
    private String tamanio;
    private String name;

    public Domestico(String tipo,double peso, String color, String tamanio, String name) {
        super(tipo, peso);
        this.color=color;
        this.tamanio=tamanio;
        this.name=name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
