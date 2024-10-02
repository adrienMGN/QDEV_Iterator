public class Main {
    public static void main(String[] args) {


        int[][] tableauDeuxDimensions = new int[4][3];
        int num = 1;

        for (int i = 0; i < tableauDeuxDimensions.length; i++) {
            for (int j = 0; j < tableauDeuxDimensions[i].length; j++) {
                tableauDeuxDimensions[i][j] = num;
                num++;
            }
        }

        TableauEntier tab = new TableauEntier(tableauDeuxDimensions);
        ParcoursLigne it = tab.iterateurLigne();
        ParcoursZigzag itZig = tab.iterateurZigzag();
        ParcoursColonne itCol= tab.iterateurColonne();

        System.out.println("\n   Parcours classique : \n");
        while (it.hasNext()) {
            System.out.println(it.next());

        }

        System.out.println(" \n Parcours en ZigZag \n");

        while (itZig.hasNext()) {
            System.out.println(itZig.next());

        }


        System.out.println(" \n Parcours par colonne :  \n");

        while (itCol.hasNext()) {
            System.out.println(itCol.next());

        }


        System.out.println("\n");
        for (Integer n : tab){
            System.out.println(n);
        }





    }
}