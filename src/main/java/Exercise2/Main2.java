package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.CheckIfFlightExists("Warsaw", "New York");
        flightDatabase.getFlightsFromCity("Warsaw");
        flightDatabase.getFlightToCity("New York");
        ArrayList<String> cities = flightDatabase.getCities();
        System.out.println(cities);
        Flight cheapestFlight = flightDatabase.getCheapestFlight();
        System.out.println("Cheapest flight: "+cheapestFlight.flightFromTo());
    }
}
class Flight{
    String departure;
    String arrival;
    int price;

    public Flight(String departure, String arrival, int price) {
        this.departure = departure;
        this.arrival = arrival;
        this.price = price;
    }
    public String flightFromTo(){

        return "Flight from"+this.departure +" to "+this.arrival + " coast "+this.price;
    }
}
class FlightDatabase{
    ArrayList<Flight> flights =new ArrayList<Flight>();

    public FlightDatabase(){
        this.flights.add(new Flight("Warsaw", "New York", 3089));
        this.flights.add(new Flight("Berlin", "Tokyo", 7699));
        this.flights.add(new Flight("Praga", "Mexico City", 5698));
        this.flights.add(new Flight("Paris", "London", 666));
        this.flights.add(new Flight("Warsaw", "Liverpool", 356));
        this.flights.add(new Flight("Moscow", "New York", 3215));
        this.flights.add(new Flight("Porto", "Madrid", 254));
        this.flights.add(new Flight("Londyn", "Warsaw", 426));

    }
    public void CheckIfFlightExists(String start, String end){
        boolean notExists= true;
        for (int i =0; i<this.flights.size();i++){
            Flight flight= this.flights.get(i);
            if (start.equals(flight.departure)&&end.equals(flight.arrival)){
                System.out.println("Flight exists!!");
                notExists= false;
                break;
            }
        }
        if (notExists){
            System.out.println("Flight with given params not exists");
        }
    }
    public void getFlightsFromCity(String city){
        boolean cityExists= true;
        for (int i =0; i<flights.size();i++){
            Flight flight=this.flights.get(i);
            if (city.equals(flight.departure)){
                System.out.println(flight.flightFromTo());
          cityExists = false;
            }
        }
        if (cityExists){
            System.out.println("Flight not found!!!");
        }
    }
    public  void getFlightToCity(String toCity){
        boolean toCityExists = true;
        for (int i =0; i<flights.size();i++){
            Flight flight= this.flights.get(i);
            if (toCity.equals(flight.arrival)){
                System.out.println(flight.flightFromTo());
                toCityExists =false;
            }
        }
        if (toCityExists){
            System.out.println("Flight not found!!");
        }
    }
    public ArrayList<String> getCities(){
        ArrayList<String> cities =new ArrayList<>();
        for (Flight flight : this.flights){
            if (!cities.contains(flight.departure)){
                cities.add(flight.departure);
            }
            if (!cities.contains(flight.arrival)){
                cities.add((flight.arrival));
            }
        }

        return cities;
    }
    public Flight getCheapestFlight(){
        Flight cheapestFlight = null;
        for (Flight flight : this.flights){
            if (cheapestFlight == null || flight.price< cheapestFlight.price){
                cheapestFlight=flight;
            }
        }
        return cheapestFlight;
    }
    public Flight getCheapedFlightFromCity(){
        Flight cheapedFlightFromCity = null;

    }



}
