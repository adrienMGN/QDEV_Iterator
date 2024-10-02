import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestsParcours {

    int[][] tableauDeuxDimensions = new int[3][3];
    int num = 1;
    TableauEntier tab = new TableauEntier(tableauDeuxDimensions);
    ParcoursLigne it = tab.iterateurLigne();
    ParcoursZigzag itZig = tab.iterateurZigzag();
    ParcoursColonne itCol= tab.iterateurColonne();
    Integer[] s = {0,0,0,0,0,0,0,0,0};

    @BeforeEach
    public void beforeEach(){
        for (int i = 0; i < tableauDeuxDimensions.length; i++) {
            for (int j = 0; j < tableauDeuxDimensions[i].length; j++) {
                tableauDeuxDimensions[i][j] = num;
                num++;
            }
        }


    }

    @Test
    public void testParcoursLigne(){
        Integer [] res = {1,2,3,4,5,6,7,8,9};
        int j = 0;
        while (it.hasNext()){
            Integer el = it.next();
            s[j] += el;
            j++;
        }
        for (int i =0; i<s.length; i++){
            assertEquals(res[i], s[i]);
        }

    }


    @Test
    public void testParcoursZigag(){
        Integer [] res = {1,2,3,6,5,4,7,8,9};
        int j = 0;
        while (itZig.hasNext()){
            Integer el = itZig.next();
            s[j] += el;
            j++;
        }
        for (int i =0; i<s.length; i++){
            assertEquals(res[i], s[i]);
        }

    }

    @Test
    public void testParcoursColonnes(){
        Integer [] res = {1,4,7,2,5,8,3,6,9};
        int j = 0;
        while (itCol.hasNext()){
            Integer el = itCol.next();
            s[j] += el;
            j++;
        }
        for (int i =0; i<s.length; i++){
            assertEquals(res[i], s[i]);
        }
    }



}
