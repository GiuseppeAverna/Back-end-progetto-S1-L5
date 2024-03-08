public class Immagine extends Video {
    public Immagine (String titolo, int luminosità) {
        super(titolo, 0 ,0, luminosità);
    }


    public void show() {
        System.out.println("Titolo " + titolo);
            String Asterischi= "*".repeat(luminosità);
            System.out.println(titolo + " "  + Asterischi);


    }
}
