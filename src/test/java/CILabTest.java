import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    public void detectCapitalUseTest1()
    {
       myString.setString("Alignment");
       assertTrue(myString.detectCapitalUse());

    }
    @Test
    public void detectCapitalUseTest2()
    {
        myString.setString("PhDs");
        assertFalse(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUseTest3 ()
    {
        myString.setString("homeworks");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUserTest4 ()
    {
        myString.setString("BALTIMORE");
        assertTrue(myString.detectCapitalUse());
    }

    @Test
    public void detectCapitalUserTest5 ()
    {
        myString.setString("ironMan");
        assertFalse(myString.detectCapitalUse());
    }


}
