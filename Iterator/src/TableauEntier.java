import java.util.Iterator;

public class TableauEntier implements Iterable<Integer> {
    int [][] tab;

    public TableauEntier(int [][] t){
        this.tab = t;
    }

    public int valeurA(int l, int c){
        return this.tab[l][c];
    }

    public int getLargeur(){
        return this.tab[0].length;
    }

    public int getHauteur(){
        return this.tab.length;
    }

    public ParcoursLigne iterateurLigne(){
      return new ParcoursLigne(this);
    };

    public ParcoursZigzag iterateurZigzag(){
        return new ParcoursZigzag(this);
    }

    public ParcoursColonne iterateurColonne(){
        return new ParcoursColonne(this);
    }

    @Override
    public Iterator<Integer> iterator() {
        return iterateurZigzag();
    }
}
