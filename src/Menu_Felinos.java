import java.util.ArrayList;
import java.util.Scanner;

public class Menu_Felinos {
    public static void main(String[] args) {
        //arreglo para almacenar la inofrmacion de los felinos domesticos y salvajes
        ArrayList<Salvaje>felino1=new ArrayList<Salvaje>();
        ArrayList<Domestico>felino2=new ArrayList<Domestico>();

        //las instancias se inicializan en cero, puesto que el ingreso de info es por teclado
        //la informacion se almacena en arreglos por ente las intancias se añaden dentro del arreglo creado
        felino1.add(new Salvaje("",0.0, " "));
        felino1.add(new Salvaje("",0.0, " "));
        felino1.add(new Salvaje("",0.0, " "));

        felino2.add(new Domestico("",0.0, " "," "," "));
        felino2.add(new Domestico("",0.0, " "," "," "));


        //variables de ingreso por teclado
        String tipo, habitad, color, tamanio, name;
        double peso;
        int opc, a=0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("\n\t *** MENU *** \n");
            System.out.println("1 Ingresar felinos");
            System.out.println("2 Mostrar Felinos ");
            System.out.println("3. Salir");
            System.out.print("Opcion:");
            opc = sc.nextInt();
            sc.nextLine();
            switch (opc){
                case 1:
                    int j=1, k=1;
                    a = 1;
                    System.out.println(" > Felinos Salvajes ");
                    for (Salvaje Salvaje : felino1){
                        System.out.println("\nFelino salvaje # " + (j));
                        System.out.print("Tipo: ");
                        tipo = sc.next();
                        Salvaje.setTipo(tipo);
                        System.out.print("Peso en kg: ");
                        peso = sc.nextDouble();
                        Salvaje.setPeso(peso);
                        System.out.print("Habitad: ");
                        habitad = sc.next();
                        Salvaje.setHabitad(habitad);
                        System.out.println(".... .... .... .... ....");
                        j++;
                    }
                    System.out.println("  > Felinos domésticos");
                    for (Domestico Domestico : felino2){
                        System.out.println("\nFelino doméstico # " + (k) );
                        System.out.print("Tipo: ");
                        tipo = sc.next();
                        Domestico.setTipo(tipo);
                        System.out.print("Peso en kg: ");
                        peso = sc.nextDouble();
                        Domestico.setPeso(peso);
                        System.out.print("Tamaño: ");
                        tamanio= sc.next();
                        Domestico.setTamanio(tamanio);
                        System.out.print("Color: ");
                        color=sc.next();
                        Domestico.setColor(color);
                        System.out.print("Nombre: ");
                        name= sc.next();
                        Domestico.setName(name);
                        k++;
                    }
                    break;
                case 2:
                    if (a == 1){
                        System.out.println("--- Felinos Salvajes ---");
                        for (int i=0; i<felino1.size(); i++){
                            System.out.println("// Felino Salvaje # " +(i+1)+" //\n");
                            System.out.println("Tipo: " + felino1.get(i).getTipo());
                            System.out.println("Peso en kg: "+felino1.get(i).getPeso());
                            System.out.println("Habitad: " + felino1.get(i).getHabitad());

                        }

                        int h=1;
                        System.out.println("--- Felinos Domesticos---");
                        for (Domestico f : felino2){
                            System.out.println("//Felino Domestico # "+h+" //\n");
                            System.out.println("Nombre: " + f.getTipo());
                            System.out.println("Peso en kg: "+f.getPeso());
                            System.out.println("Color: " + f.getColor());
                            System.out.println("Tamaño: " + f.getTamanio());
                            System.out.println("Nombre : " + f.getName());
                            h++;
                        }
                    }
                    else {
                        System.out.println("\nNo se encuentran registros\n");
                    }
                    break;
                case 3:{
                    System.out.println("\n\t\t Gracias por usar");
                    break;
                }
                default: {
                    System.out.println("\nOpcion incorrecta\n");
                }
            }

        }while (opc !=3 );


    }

}

