public class ParcoursLigne extends Parcours {


    public ParcoursLigne(TableauEntier t) {
        super(t);
    }

    @Override
    public void suivant() {
        if (this.colonneCour == this.tab.getLargeur() -1) {
            this.colonneCour = 0; // retour début ligne
            this.ligneCour++; // début ligne suivante
        } else {

            this.colonneCour++; // sinon on regarde element suivant sur la ligne
        }
    }

    /**
     * public Integer suivant(){
     * ligneCour++;
     * colonneCour++;
     * return this.tab.valeurA(ligneCour,colonneCour);
     * <p>
     * }
     */



}
