import java.util.ArrayList;

public class FlightManager extends CabinCrewMember{

    private Flight flight;

    public FlightManager(String name, Rank rank, Flight flight) {
        super(name, rank);
        this.flight = flight;
    }

    public Flight getFlightInfo() {
        return flight;
    }

    public int getPassengerNumber(){
        return this.getFlightInfo().getPassengers().size();
    }

    public double weightReserveForEachPassenger(){
        double reservedBagWeight = this.flight.getPlane().getWeight() * 0.5 / this.flight.getPlane().getCapacity();
        return reservedBagWeight;
    }
    public double calculateTotalWeightOfBags(){
        return weightReserveForEachPassenger()*getPassengerNumber();
    }
//    public double passengerBagsWeight( ){
////        int totalBags = 0;
//////        eachBagWeight = this.weightReserveForEachPassenger();
////        ArrayList<Passenger> passengers = this.flight.getPassengers();
////        for (Passenger passenger : passengers){
////            totalBags += passenger.getNumberOfBags();
////        }
////        return totalBags;
//    return  this.flight.getPassengers().size() * this.weightReserveForEachPassenger();
//    }

//    Q:  this.flight.getPassengers().size() is 0;
    public double remainingBagWeight(){
        return (this.getFlightInfo().getPlane().getWeight()*0.5 -calculateTotalWeightOfBags() );
    }

}
