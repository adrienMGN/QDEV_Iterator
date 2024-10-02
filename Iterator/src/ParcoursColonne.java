public class ParcoursColonne extends Parcours {


    public ParcoursColonne(TableauEntier t) {
        super(t);
    }

    @Override
    public void suivant() {
        // parcours par colonne
        // si on a pas parcouru la dernière ligne de la colonne
        if (this.tab.getHauteur() -1 != ligneCour) {
            ligneCour++; // on peut descendre / parcourir la colonne du tableau
        } else { // sinon on revient à la première ligne
            ligneCour =0; // retour ligne
            if (colonneCour != this.tab.getLargeur() -1) // changement colonne si pas dernière colonne
                colonneCour++; // changement colonne
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
