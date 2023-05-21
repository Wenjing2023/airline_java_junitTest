import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PilotTest {
    Pilot pilot;

    @Before
    public void setUp(){
        pilot = new Pilot("Keith", Rank.CAPTAIN, "E630001");
    }

    @Test
    public void hasName(){
        assertEquals("Keith", pilot.getName());
    }
    @Test
    public void hasLicenceNumber(){
        assertEquals("E630001",pilot.getLicenceNumber());
    }
    @Test
    public void canFlyPlane(){
        assertEquals("Off we go!", pilot.canFlyPlane());
    }
    @Test
    public void canSayHi(){
        assertEquals("Dear passengers", pilot.sendMsg());
    }
}
