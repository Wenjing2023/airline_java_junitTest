import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class PassengerTest {
    private Passenger passenger1;
    private Passenger passenger2;
    private Passenger passenger3;
    private Passenger passenger4;

    private Flight flight;
    Date departureTime;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;

    @Before
    public void setUp(){
        departureTime = new Date();
        passenger1 = new Passenger("Dani",1);
        passenger2 = new Passenger("Wenjing",1);
        passenger3 = new Passenger("Tere",1);
        passenger4 = new Passenger("Pepe",1);
        flight = new Flight(pilot,cabinCrewMembers,Plane.E63,"E63","Edinburgh","CodeClan", departureTime);
        this.flight.bookAPassenger(passenger1);
        this.flight.bookAPassenger(passenger2);
        this.flight.bookAPassenger(passenger3);
        this.flight.bookAPassenger(passenger4);
    }

    @Test
    public void canTestPassengerSize(){
        assertEquals(4, this.flight.getPassengers().size());
    }
    @Test
    public void canAssignFlight(){
        passenger1.assignFlight(flight);
        assertEquals("E63", passenger1.getFlight().getFlightNumber());

    }


    @Test
    public void canNotDoubleBook(){
        passenger1.assignFlight(flight);
        passenger2.assignFlight(flight);
        passenger3.assignFlight(flight);
        passenger4.assignFlight(flight);
        assertEquals(true,passenger1.noDuplicateNumber(passenger1.getSeatNumber()));
        assertEquals(true,passenger2.noDuplicateNumber(passenger2.getSeatNumber()));
        assertEquals(true,passenger3.noDuplicateNumber(passenger3.getSeatNumber()));
        assertEquals(true,passenger4.noDuplicateNumber(passenger4.getSeatNumber()));
    }
}

