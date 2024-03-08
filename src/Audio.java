public class Audio {
    public String titolo;
    public int volume;
    public int durata;


    public Audio(String titolo, int durata, int volume) {
        this.titolo = titolo;
        this.durata = durata;
        this.volume = volume;
    }


    public int abbassaVolume() {
        if (volume > 0) {
            volume--;

        }

        return volume;


    }


    public int alzaVolume() {
        return volume++;
    }

    public void play() {
        System.out.println("Riproduzione audio: " + titolo);
        for (int i = 0; i < durata; i++) {
            String puntiEsclamativi = "!".repeat(volume);
            System.out.println(titolo + " " + puntiEsclamativi);
        }

    }
}
