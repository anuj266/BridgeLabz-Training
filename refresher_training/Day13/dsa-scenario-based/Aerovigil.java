import java.util.*;
class FlightUtil{
    HashMap<String,Integer> map=new HashMap<>();
    HashMap<String,Integer> fuelMap=new HashMap<>();
    FlightUtil() {
        map.put("SpiceJet", 396);
        map.put("Vistara", 615);
        map.put("IndiGo", 230);
        map.put("Air Arabia", 130);
        fuelMap.put("SpiceJet", 200000);
        fuelMap.put("Vistara", 300000);
        fuelMap.put("IndiGo", 250000);
        fuelMap.put("Air Arabia", 150000);
    }
    
    Set<String> names=new HashSet<>(Arrays.asList("SpiceJet", "Vistara", "IndiGo","Air Arabia"));
    
    public boolean validateFlightNumber(String flightNumber){
        return flightNumber.matches("^FL-[1-9]\\d{3}$");
    }

    public boolean validFlightName(String flightName){
        return names.contains(flightName);
    }

    public boolean validPassengerCount(int passengerCount, String flightName){
        int count=map.get(flightName);
        return passengerCount<=count;
    }

    public double calculateFuelToFillTank(String flightName, double currentFuelLevel){
        int limit=fuelMap.get(flightName);
        if(currentFuelLevel<0 || currentFuelLevel>limit) return -1;
        return limit-currentFuelLevel;
    }

}
public class Aerovigil{

    public static void main(String[] args) {
        String flight="FL-5678:Air Asia:120:60000";
        String[] details=flight.split(":");
        FlightUtil f=new FlightUtil();
        if(f.validateFlightNumber(details[0])&& f.validFlightName(details[1])&& f.validPassengerCount(Integer.parseInt(details[2]), details[1])
           && f.calculateFuelToFillTank(details[1], Double.parseDouble(details[3])) > -1){
            System.out.println("Valid Flight");
           }else{
            System.out.println("Invalid Flight");
           }
    }
}
    
