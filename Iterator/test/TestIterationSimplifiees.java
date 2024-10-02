import org.junit.jupiter.api.Test;

public class TestIterationSimplifiees {

    int[][] tableauDeuxDimensions = new int[3][3];
    int num = 1;
    TableauEntier tab = new TableauEntier(tableauDeuxDimensions);
    ParcoursLigne it = tab.iterateurLigne();
    ParcoursZigzag itZig = tab.iterateurZigzag();
    ParcoursColonne itCol= tab.iterateurColonne();
    Integer[] s = {0,0,0,0,0,0,0,0,0};

    @Test
// à fair un jour
    public void testIterationSimplifiees(){

        for (Integer n : tab){


        }


}


}
