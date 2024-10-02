import java.util.Iterator;
//
public abstract class Parcours implements Iterator<Integer> {
    public TableauEntier tab;
    public int ligneCour;
    public int colonneCour;
    private int nbParcourus;

    public Parcours(TableauEntier t){
        this.tab = t;
        this.ligneCour = 0;
        this.colonneCour = 0;
        this.nbParcourus = 0;
    }

    public abstract void suivant();

    public boolean hasNext() {
        return (this.nbParcourus != this.tab.getLargeur()*this.tab.getHauteur());}

    public Integer next(){

        nbParcourus++;
        Integer val = this.tab.valeurA(ligneCour,colonneCour);
        this.suivant();
        return val;
    };
}
