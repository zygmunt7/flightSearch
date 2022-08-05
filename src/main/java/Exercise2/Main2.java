package Exercise2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        FlightDatabase flightDatabase = new FlightDatabase();
        flightDatabase.CheckIfFlightExists("Warsaw", "New York");
        flightDatabase.getFlightsFromCity("Warsaw");
    }
}
class Flight{
    String departure;
    String arrival;

    public Flight(String departure, String arrival) {
        this.departure = departure;
        this.arrival = arrival;
    }
    public String flightFromTo(){

        return (this.departure+" to "+this.arrival);
    }
}
class FlightDatabase{
    ArrayList<Flight> flights =new ArrayList<Flight>();

    public FlightDatabase(){
        this.flights.add(new Flight("Warsaw", "New York"));
        this.flights.add(new Flight("Berlin", "Tokyo"));
        this.flights.add(new Flight("Praga", "Mexico City"));
        this.flights.add(new Flight("Paris", "London"));
        this.flights.add(new Flight("Warsaw", "Liverpool"));
        this.flights.add(new Flight("Moscow", "Pekin"));
        this.flights.add(new Flight("Porto", "Madrid"));
        this.flights.add(new Flight("Londyn", "Warsaw"));

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
          //      return;
            }
        }
    }




}
