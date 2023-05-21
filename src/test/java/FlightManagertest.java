import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightManagertest {
    FlightManager flightManger;
    Flight flight;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Date depatureTime;

    @Before
    public void setUp(){
        depatureTime = new Date();
        flight = new Flight(pilot,cabinCrewMembers,Plane.BOEING747,"E63","Sevilla","Edinburgh", depatureTime);
        flightManger = new FlightManager("Mar",Rank.FLIGHTMANAGER, flight);
        passenger1 = new Passenger("Wenjing", 5);
        passenger2 = new Passenger("Dani", 10);
        passenger3 = new Passenger("Pepe", 20);
        passenger4 = new Passenger("Tere", 50);
        flight.bookAPassenger(passenger1);
        flight.bookAPassenger(passenger2);
        flight.bookAPassenger(passenger2);
        flight.bookAPassenger(passenger4);
    }
    @Test
    public void hasFlightInfo(){
        assertEquals(flight, flightManger.getFlightInfo());
    }
    @Test
    public void calculateWeightReserveForEachPassenger(){
        assertEquals(500, flightManger.weightReserveForEachPassenger(), 0.1);
    }
    @Test
    public void passengersSize(){
        assertEquals(4, flightManger.getPassengerNumber());
    }

    @Test
    public void calculateTotalWeightOfBags(){
        assertEquals( 2000 ,flightManger.calculateTotalWeightOfBags(), 0.1);
    }

    @Test
    public void remainingWeightOfBags(){
        assertEquals(48000, this.flightManger.remainingBagWeight(), 0.1);
    }
}
