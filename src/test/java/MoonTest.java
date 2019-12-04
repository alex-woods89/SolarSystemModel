import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MoonTest {

    private Moon moon1;

    @Before
    public void before() {
         moon1 = new Moon("The Moon", 100);
    }

    @Test
    public void canGetName(){
        assertEquals("The Moon", moon1.getName());
    }

    @Test
    public void canGetMass(){
        assertEquals(100, moon1.getMass());
    }


}
