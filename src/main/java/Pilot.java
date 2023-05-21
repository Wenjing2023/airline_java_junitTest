public class Pilot extends CabinCrewMember{

    private String licenceNumber;

    public Pilot(String name, Rank rank, String licenceNumber){
        super(name, rank);
        this.licenceNumber = licenceNumber;
    }

    public String getLicenceNumber() {
        return licenceNumber;
    }
    public String canFlyPlane(){
        return "Off we go!";
    }

}
