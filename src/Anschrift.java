public class Anschrift {

    private String strasse;
    private String hausnummer;
    private int postleitzahl;
    private String stadt;

    public Anschrift(String strasse, String hausnummer, int postleitzahl, String stadt){
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        this.stadt = stadt;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

    public String getHausnummer() {
        return hausnummer;
    }

    public void setHausnummer(String hausnummer) {
        this.hausnummer = hausnummer;
    }

    public int getPostleitzahl() {
        return postleitzahl;
    }

    public void setPostleitzahl(int postleitzahl) {
        this.postleitzahl = postleitzahl;
    }

    public String getStadt() {
        return stadt;
    }

    public void setStadt(String stadt) {
        this.stadt = stadt;
    }

    @Override
    public String toString() {
        String text = "Meine Adresse lautet: "+this.strasse+" "+this.hausnummer+" "+this.postleitzahl+" "+this.stadt;
        return text;
    }
}
