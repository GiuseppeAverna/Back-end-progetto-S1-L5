public class Main {
    public static void main(String[] args) {
         Audio traccia1 = new Audio("Highway to hell", 4, 5);
        traccia1.alzaVolume();
         traccia1.play();
         Video filmato = new Video("Italian spiderman", 7, 6, 8  );
         filmato.abbassaVolume();
         filmato.alzaLuminosità();
         filmato.play();
         Immagine foto = new Immagine("immagine.img",5);
         foto.alzaLuminosità();
         foto.show();




    }





}