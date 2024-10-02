public class ParcoursZigzag extends Parcours {


    public ParcoursZigzag(TableauEntier t) {
        super(t);
    }

    @Override
    public void suivant() {
        if (ligneCour % 2 == 0){ // si ligne pair on va de gauche à droite
            if (colonneCour != this.tab.getLargeur()-1)  // si on est pas à la fin de la ligne
                this.colonneCour++; // on regarde element suivant sur la ligne
            else //sinon on change de ligne
                ligneCour++;
        } else { // si num ligne est impair on va de droite à gauche
            if (this.colonneCour != 0) // si on est pas à la fin de la ligne dans le sens droite vers gauche
                this.colonneCour--; // on regarde element suivant sur la ligne cad precedent par rapport sens classiaque
            else
                ligneCour++; // si on est à la fin de la ligne il faut changer de ligne
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
