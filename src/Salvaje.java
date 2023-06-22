public class Salvaje extends Felinos {

     private String habitad;


    //constructor
    public Salvaje(String tipo ,double peso, String habitad) {
        super(tipo,peso  );
        this.habitad=habitad;
    }
    //set y get

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

}
