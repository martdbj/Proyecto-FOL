import java.util.Scanner;
public class Fol {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String uno = "Trivial";
        String dos = "Tolerable";
        String tres = "Moderable";
        String cuatro = "Importante";
        String cinco = "Intorelabe";

        System.out.println("Escriba la probabilidad de que ocurra el daño (Bajo, Medio, Alto)");
        String nombre = input.nextLine();

        System.out.println("Escriba las consecuencias (Ligeramente nocivo, Nocivo, Muy Nocivo)");
        String peligrosidad = input.nextLine();

        if (nombre.equals("Bajo") && peligrosidad.equals("Ligeramente nocivo")) {
            System.out.println(uno);
        } else if (nombre.equals("Medio") && peligrosidad.equals("Ligeramente nocivo")) {
            System.out.println(dos);
        }

    }
    
}