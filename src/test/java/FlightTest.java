import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Date;

import static org.junit.Assert.assertEquals;

public class FlightTest {
    ArrayList<Passenger> passengers;
    Flight flight1;
    Flight flight2;
    Pilot pilot;
    ArrayList<CabinCrewMember> cabinCrewMembers;
    Passenger passenger1;
    Passenger passenger2;
    Passenger passenger3;
    Passenger passenger4;
    Passenger passenger5;
    Date departureTime;

    @Before
    public void setUp(){
        departureTime = new Date();
        flight1 = new Flight(pilot,cabinCrewMembers,Plane.BOEING747,"E63","Sevilla","Edinburgh", departureTime);
        flight2 = new Flight(pilot,cabinCrewMembers,Plane.E63,"E63","Edinburgh","CodeClan", departureTime);
        passenger1 = new Passenger("Wenjing",1);
        passenger2 = new Passenger("Dani", 2);
        passenger3 = new Passenger("Pepe", 1);
        passenger4 = new Passenger("Javier", 1);
        passenger5 = new Passenger("Tere", 1);
        passengers = new ArrayList<>();
    }
    @Test
    public void arrayListSatrts0(){
        assertEquals(0, flight1.getPassengers().size());
    }


    @Test
    public void ableToBookAPassengerAndReturnAvailabeSeats(){
        flight1.bookAPassenger(passenger1);
        flight1.bookAPassenger(passenger2);
        passenger1.assignFlight(flight1);
        passenger2.assignFlight(flight2);
        assertEquals(2, flight1.getPassengers().size());
        assertEquals(98, flight1.numberOfAvailabelSeats());
    }
    @Test
    public void notAbleToBookAPAssenger(){
        flight2.bookAPassenger(passenger1);
        flight2.bookAPassenger(passenger2);
        flight2.bookAPassenger(passenger3);
        flight2.bookAPassenger(passenger4);
        flight2.bookAPassenger(passenger5);
        passenger1.assignFlight(flight2);
        passenger2.assignFlight(flight2);
        passenger3.assignFlight(flight2);
        assertEquals(false,flight2.thereIsRemainingSeats());
    }



}
