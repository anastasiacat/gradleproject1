import org.testng.annotations.Test;
import ru.netology.CashbackHackService;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    @Test
    public void Check1000Amount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void Check999Amount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void Check1001Amount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void Check2000Amount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(2500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    public void Check600Amount() {
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(600);
        int expected = 400;
        assertEquals(actual, expected);
    }
}
