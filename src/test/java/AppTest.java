import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {
    App app = new App();
    @Test
    public void addMeTest(){
        assertEquals(12, app.addMe(11,1));
    }
}
