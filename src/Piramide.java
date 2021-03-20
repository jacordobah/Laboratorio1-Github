import java.util.Scanner;
public class Piramide {

    static Scanner scan = new Scanner(System.in);
    Piramide(){
        piramide();
    }
    public void piramide() {
        int n = 0;
        System.out.println("Escribe un numero: ");
        n = scan.nextInt();
        for (int i = n; i > 0; i--) {
            for (int j=0; j<i; j++){
                System.out.print("#");
            }
            System.out.print(" "+i);
            System.out.println("");
        }
    }
}