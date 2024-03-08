import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Audio traccia1 = new Audio("Highway to hell", 4, 5);
         Video filmato = new Video("Italian spiderman", 7, 6, 8  );
         Immagine foto = new Immagine("immagine.img",5);
        System.out.println("inserisci un numero da 1 a 5( 4 e 5 non ancora disponibili)");
        int elemento = scanner.nextInt();
        scanner.nextLine();
        switch (elemento) {
            case 1: traccia1.alzaVolume();
                    traccia1.play();

            break;
            case 2:  filmato.abbassaVolume();
                     filmato.alzaLuminosità();
                     filmato.play();
            break;
            case 3:   foto.alzaLuminosità();
                      foto.show();
            break;
            default:
                System.out.print("Elemento non trovato");
        }







    }







}