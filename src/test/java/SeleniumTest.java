import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    @Before
    public void settup(){
        Selenium.setup();
    }
    @Test
    public void searchByKeywordTest() {
    Selenium.searchByKeywort("Baranauskas");
    }
    @After
    public void close(){
        Selenium.close();
    }
}