package IntroductionJavaGenerics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyListTest {
    private MyList<Integer> mylist = new MyList<>();
    
    @Test
    void checkMethodsOfClassMyList () {
        assertTrue(mylist.isEmpty());

        mylist.add(1);
        assertFalse(mylist.isEmpty());
        assertEquals(1, mylist.get(0));
        assertEquals("[1]", mylist.toString());

        mylist.add(null);
        assertNull(mylist.get(1));        

        mylist.remove(0);
        mylist.remove(0);
        assertEquals("[]", mylist.toString());
    }
}
