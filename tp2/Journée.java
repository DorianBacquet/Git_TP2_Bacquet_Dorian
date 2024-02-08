public class Journée {
    private int epreuveMatin;
    private int epreuveApresMidi;
    private int epreuveSoiree;

    public Journée(int epreuveMatin, int epreuveApresMidi, int epreuveSoiree, Auteur auteur){
        this.epreuveMatin = epreuveMatin * auteur.getQualitéDrame();
        this.epreuveApresMidi = epreuveApresMidi * auteur.getQualitéComédie();
        this.epreuveSoiree = epreuveSoiree * auteur.getQualitéTragédie();
    }

    public int sommeScore(int epreuveMatin, int epreuveApresMidi, int epreuveSoiree) {
        return epreuveMatin + epreuveApresMidi + epreuveSoiree;
    }

    public int getScoreMatin(){
        return this.epreuveMatin;
    }

    public int getScoreApresMidi(){
        return this.epreuveApresMidi;
    }

    public int getScoreSoiree(){
        return this.epreuveSoiree;
    }
}