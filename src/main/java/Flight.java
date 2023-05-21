import java.util.ArrayList;
import java.util.Date;

public class Flight {
    private Pilot pilot;
    private ArrayList<CabinCrewMember> cabinCrewMembers;
    private ArrayList<Passenger> passengers;
    private Plane plane;
    private String flightNumber;
    private String destination;
    private String depatureAirport;
    private Date depatureTime;

    public Flight(Pilot pilot, ArrayList<CabinCrewMember> cabinCrewMembers, Plane plane, String flightNumber, String destination, String depatureAirport, Date depatureTime ){
        this.pilot= pilot;
        this.cabinCrewMembers = cabinCrewMembers;
        this.plane = plane;
        this.flightNumber = flightNumber;
        this.destination= destination;
        this.depatureAirport= depatureAirport;
        this.depatureTime= depatureTime;
        this.passengers = new ArrayList<>();
    }

    public Plane getPlane() {
        return plane;
    }
    public void bookAPassenger(Passenger passenger){
      if (thereIsRemainingSeats()==true) {
        this.passengers.add(passenger);
      }
    }

    public Date getDepatureTime() {
        depatureTime = new Date();
        return depatureTime;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public ArrayList<Passenger> getPassengers() {
        return passengers;
    }


    public int numberOfAvailabelSeats(){
        int availableSeats = this.plane.getCapacity() - this.passengers.size();
        return availableSeats;
    }
    public boolean thereIsRemainingSeats(){
        if(this.plane.getCapacity() - this.passengers.size() > 0){
            return true;
        }
        return false;
    }

}
