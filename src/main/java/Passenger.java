import java.util.HashSet;
import java.util.Random;
public class Passenger {
    private String name;
    private int numberOfBags;
    private Flight flight;
    private Integer seatNumber;
    private HashSet<Integer> seatNumbers;

    public  Passenger(String name, int numberOfBags){
        this.name = name;
        this.numberOfBags = numberOfBags;
//        this.eachBagWeight = eachBagWeight;
        this.flight = null;
        this.seatNumber = null;
        this.seatNumbers = new HashSet<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfBags() {
        return numberOfBags;
    }

    public void setNumberOfBags(int numberOfBags) {
        this.numberOfBags = numberOfBags;
    }


    public void assignFlight(Flight flight) {

        this.flight = flight;
        int size = this.getFlight().getPassengers().size();
        Random random = new Random();
        while (seatNumbers.size()<size){
        this.seatNumber = random.nextInt(size);
        if(!this.seatNumbers.contains(seatNumber)){
            seatNumbers.add(seatNumber);
        }
        }
    }

    public Integer getSeatNumber() {
        return seatNumber;
    }

    public boolean noDuplicateNumber (int seatNumber){
        this.assignFlight(flight);
        if (!this.seatNumbers.add(seatNumber)){
            return true;
        }
        return false;

   }


    public Flight getFlight() {
        return flight;
    }



}
