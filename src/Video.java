public class Video extends Audio {
public int luminosità;
public Video (String titolo, int durata, int volume, int luminosità) {
    super(titolo, durata, volume) ;
    this.luminosità = luminosità;

}

public int abbassaLuminosità () {
    if (luminosità>0) {
        luminosità--;
    }
    return luminosità;
}

    public int alzaLuminosità () {
    return luminosità++;
    }


    public void play() {
        System.out.println("Riproduzione video: " + titolo);
        for (int i = 0; i < durata; i++) {
            String puntiEsclamativi = "!".repeat(volume);
            String Asterischi= "*".repeat(luminosità);
            System.out.println(titolo + " " + puntiEsclamativi + Asterischi);
        }

    }


}
