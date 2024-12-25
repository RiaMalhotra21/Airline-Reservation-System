package Domestic;                        // user- defined package
import International.*;

import java.util.InputMismatchException;
import java.util.Scanner;                //pre-defined package

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
abstract class Airways {                      // abstract class

    public abstract void msg();
    static{
        System.out.println("Welcome TO The Domestic Airport!");   // static block in abstract class
    }
    static class Source{                // static nested class with static method
        static void sourceList(){
            System.out.println("Our Available flight sources are: ");
            System.out.println("Delhi \tMumbai \tGoa");
        }

    }
    static class Des{               // static nested class with static method
        static void destinationList(){
            System.out.println("please choose your destination: ");
            System.out.println("Delhi \tMumbai \tGoa");
        }
    }

    void timeHrs(String source, String des) {
        String flighthrs;
        String boarding, arrival;
        if (source.equalsIgnoreCase("Delhi") && des.equalsIgnoreCase("Goa")) {             //using equalsIgnoreCase() method
            flighthrs = "2 Hrs";
            boarding = "10:15 am";
            arrival = "10:40 am";
            System.out.println("Total flight hours: " + flighthrs);
            System.out.println("Boarding time: " + boarding);
            System.out.println("Arrival time: " + arrival);
        }
        else if (source.equalsIgnoreCase("Delhi") && des.equalsIgnoreCase("Mumbai")) {
            flighthrs = "2 hrs 11 min";
            boarding = "11:15 am";
            arrival = "11:40 am";
            System.out.println("Total flight hours: " + flighthrs);
            System.out.println("Boarding time: " + boarding);
            System.out.println("Arrival time: " + arrival);
        }
        else if (source.equalsIgnoreCase("Goa") && des.equalsIgnoreCase("Delhi")) {
            flighthrs = "2 Hrs";
            boarding = "1:15 pm";
            arrival = "1:40 pm";
            System.out.println("Total flight hours: " + flighthrs);
            System.out.println("Boarding time: " + boarding);
            System.out.println("Arrival time: " + arrival);
        }
        else if (source.equalsIgnoreCase("Goa") && des.equalsIgnoreCase("Mumbai")) {
            flighthrs = "2 Hrs";
            boarding = "1:15 pm";
            arrival = "1:40 pm";
            System.out.println("Total flight hours: " + flighthrs);
            System.out.println("Boarding time: " + boarding);
            System.out.println("Arrival time: " + arrival);
        }
        else if (source.equalsIgnoreCase("Mumbai") && des.equalsIgnoreCase("Delhi")) {
            flighthrs = "2 hrs 11 min";
            boarding = "11:15 am";
            arrival = "11:40 am";
            System.out.println("Total flight hours: " + flighthrs);
            System.out.println("Boarding time: " + boarding);
            System.out.println("Arrival time: " + arrival);
        }
        else if (source.equalsIgnoreCase("Mumbai") && des.equalsIgnoreCase("Goa")) {
            flighthrs = "2 Hrs";
            boarding = "1:15 pm";
            arrival = "1:40 pm";
            System.out.println("Total flight hours: " + flighthrs);
            System.out.println("Boarding time: " + boarding);
            System.out.println("Arrival time: " + arrival);
        }
        else {
            System.out.println("Flights not available.");
        }
    }


    double totalFair(String source, String des, int choice) {
        if ((source.equals("Delhi") || source.equals("Goa")) && (des.equals("Goa") || des.equals("Delhi"))) {
            if (choice == 1)
                return 5000.00;
            if (choice == 2)
                return 4835.00;
            if (choice == 3)
                return 4995.00;
        }
        else if ((source.equals("Delhi") || source.equals("Mumbai")) && (des.equals("Mumbai") || des.equals("Delhi"))) {
            if (choice == 1)
                return 5000.00;
            if (choice == 2)
                return 4835.00;
            if (choice == 3)
                return 4995.00;
        }
        else if ((source.equals("Mumbai") || source.equals("Goa")) && (des.equals("Goa") || des.equals("Mumbai"))) {
            if (choice == 1)
                return 5000.00;
            if (choice == 2)
                return 4835.00;
            if (choice == 3)
                return 4995.00;
        }
        return 0;
    }

    final void discount(double fair, String passengerOccupation ){    //final method
        int dis;
        if (passengerOccupation.equalsIgnoreCase("Student")){
          dis=20;
          System.out.println("Your actual fair : "+ fair);

          fair=(dis/100.0)*fair;  //floating point division

          System.out.println("Congratulations...Our flight offers 20% discount to students.");
          System.out.println("fair after discount : "+ fair);
        }
        else{
            System.out.println("Your total fair is : "+ fair);
        }
    }

}

class SeatAllocation{
    private final String name;             //private access-modifier
    private final String seatNo;
    public SeatAllocation(String name,String seatNo){
        this.name=name;
        this.seatNo=seatNo;
    }
    public void showSeatNo(){
        System.out.println("Name : " + name + "\n"  + seatNo);
    }
}


class Rules{
     Rules(){                 //default constructor
        System.out.println("A passenger on board of an aircraft must comply with the following:");
        System.out.println("1. Follow the orders of the captain or orders given by other members\n of the crew on behalf of the captain");
        System.out.println(" , with regard to flight and passenger safety on board of an aircraft\n, safety of the equipment,services,");
        System.out.println(" related to the clauses of the air transportation agreement.");
        System.out.println("2. Take an appropriate seat indicated on the boarding pass; \nwith the view of ensuring the flight safety");
        System.out.println("– take a seat according to the instruction of a member of the aircrew");
        System.out.println("3. Place hand luggage into specially assigned lockers;");
        System.out.println("4. Fasten seat belts on the sign “Fasten the seat belts” and leave them fastened until the sign switches off.");
    }
}
class Indigo extends Airways{
    String fname="No name",lname,source="NONE",des="NONE";        // instance variable
    int age;
    public Indigo(String fname, String lname, int age, String source, String des){         //parameterized constructor
        this.fname=fname;                                                  // Application of this keyword
        this.lname= lname;
        this.age=age;
        this.source=source;
        this.des=des;
    }

    Rules rules=new Rules();            // Aggregation

    @Override
    public void msg() {
        System.out.println("hh");
    }

    void timeHrs(String source, String des){
        super.timeHrs(source,des);                     // using super to invoke parent class method.
    }

    static {
        System.out.println("Welcome To The Indigo Airlines....");    //static block
    }
}
class SpiceJet extends Airways{
    String fname="No name",lname="",source="Delhi",des="Goa";        // instance variable
    int age;
    public SpiceJet(String fname,String lname,int age,String source,String des){
        this.fname=fname;                                                  // Application of this keyword
        this.lname=lname;                                                // Application of this keyword
        this.age=age;
        this.source=source;
        this.des=des;
    }
    Rules rules=new Rules();            // Aggregation

    void timeHrs(String source, String des){
            super.timeHrs(source,des);                     // using super to invoke parent class method.
    }

    static {
        System.out.println("Welcome TO The Spice Jet Airlines....");
    }


    public void msg() {                                             // method overriding
        System.out.println("Thank you for filling out the form....");
    }
}

class AirIndia extends Airways{
    String fname="No name",lname,source,des;        // instance variable
    int age;
    public AirIndia(String fname,String lname,int age,String source,String des){
        this.fname=fname;                                                  // Application of this keyword
        this.lname=lname;
        this.age=age;
        this.source=source;
        this.des=des;

    }
    Rules rules=new Rules();            // Aggregation

    void timeHrs(String source, String des){
        super.timeHrs(source,des);
    }

    static{
        System.out.println("Welcome TO The AirIndia Airlines....");
    }

    public void msg() {
        System.out.println("Thank you for filling out the form....");
    }
}
class NoFlightException extends Exception{                // Custom exception
    public NoFlightException(String str){
        super(str);
    }
}

class Main{
    static void mySql() throws SQLException {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:330/Flight","root","Ria123");
        Statement stmt=con.createStatement();
        //CREATE TABLE QUERY
        //String q = "CREATE TABLE Airline (FLIGHT_NAME varchar(30) NOT NULL, SOURCE_NAME varchar(30) NOT NULL, DESTINATION varchar(20) not null, TOTAL_FAIR integer(8))";
        //stmt.execute(q);
        System.out.println("query successfully executed.");
        //INSERT QUERY
        String q1="insert into Airline values('Spicejet','Goa','Mumbai',5120)";
        stmt.execute(q1);
        String q8="insert into Airline values('Indigo','Goa','Delhi',5000)";
        stmt.execute(q8);
        String q9="insert into Airline values('Indigo','Goa','Mumbai',4429)";
        stmt.execute(q9);
        //Query for DISPLAYING Table Content
        String q2="Select * from Airline";
        ResultSet rs=stmt.executeQuery(q2);   //executeQuery() used for Result Set
        while(rs.next()) {
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
        }
        //UPDATE Query
        String q3="UPDATE Airline SET FLIGHT_NAME = 'Air India',SOURCE_NAME = 'Mumbai' WHERE TOTAL_FAIR=5000;";
        stmt.execute(q3);
        System.out.println("UPDATED TABLE: ");
        String q4="Select * from Airline";
        ResultSet rs1=stmt.executeQuery(q4);   //executeQuery() used for Result Set
        while(rs1.next()) {
            System.out.println(rs1.getString(1) + " " + rs1.getString(2) + " " + rs1.getString(3) + " " + rs1.getInt(4));
        }
        //Query for deletion Operation
        String q5="DELETE FROM Airline WHERE TOTAL_FAIR=4429;";
        stmt.execute(q5);
        System.out.println("Table after deletion: ");
        String q6="Select * from Airline";
        ResultSet rs2=stmt.executeQuery(q6);   //executeQuery() used for Result Set
        while(rs2.next()) {
            System.out.println(rs2.getString(1) + " " + rs2.getString(2) + " " + rs2.getString(3) + " " + rs2.getInt(4));
        }
        con.close();
    }
    public static void main(String[] args) throws NoFlightException {
        int seatNo = 1;
        Scanner input = new Scanner(System.in);                        //using scanner class
        try {
            System.out.println("Sql Queries: ");
            Main.mySql();
            System.out.println("------------------------------------------------------------------");
            System.out.println("Choose Airways:");
            System.out.println("Enter 1 for Domestic");
            System.out.println("Enter 2 for International");
            int airwayChoice = input.nextInt();
            switch (airwayChoice) {
                case 1:
                    System.out.println("Which Airline you want to choose:");
                    System.out.println("enter 1 for IndiGo ");
                    System.out.println("enter 2 for SpiceJet ");
                    System.out.println("enter 3 for AirIndia ");
                    int choice = input.nextInt();

                    switch (choice) {                                          //switch case
                        case 1 -> {
                            System.out.println("Kindly fill out the details below for seat reservation...");
                            System.out.println("Total no. of passengers: ");
                            int noOfPassenger = input.nextInt();

                            for (int i = 1; i <= noOfPassenger; i++) {      // for loop for scanning each passenger details.
                                System.out.println("enter details of passenger " + i);
                                System.out.println("Passenger first name: ");
                                String fname = input.next();
                                System.out.println("Passenger last name: ");
                                String lname = input.next();
                                System.out.println("Passenger age: ");
                                int age = input.nextInt();
                                System.out.println("Passenger Occupation: ");
                                String passOccupation = input.next();
                                Airways.Source.sourceList();                     // invoking static method (Classname.staticmethod)
                                System.out.println("Enter source: ");
                                String source = input.next();

                                Airways.Des.destinationList();
                                System.out.println("Enter destination: ");
                                String des = input.next();
                                Airways Indigo=new Airways(){    //Anonymous inner class
                                    @Override
                                    public void msg() {
                                        System.out.println("Thank you for filling out the Application form...");
                                    }
                                };
                                Indigo.msg();
                                Airways p1 = new Indigo(fname, lname, age, source, des);       //upcasting

                                double fair = p1.totalFair(source, des, choice);
                                p1.discount(fair, passOccupation);
                                p1.timeHrs(source, des);

                                // Allocate a seat to the passenger
                                String seatNumber = "Seat No.: " + seatNo;
                                SeatAllocation seat = new SeatAllocation(fname + " " + lname, seatNumber);
                                seat.showSeatNo();
                                seatNo++;

                            }
                        }
                        case 2 -> {

                            System.out.println("Kindly fill out the details below for seat reservation...");
                            System.out.println("Total no. of passengers: ");
                            int noOfPassenger = input.nextInt();

                            for (int i = 1; i <= noOfPassenger; i++) {
                                System.out.println("enter details of passenger " + i);
                                System.out.println("Passenger first name: ");
                                String fname = input.next();
                                System.out.println("Passenger last name: ");
                                String lname = input.next();
                                System.out.println("Passenger age: ");
                                int age = input.nextInt();
                                System.out.println("Passenger Occupation: ");
                                String passOccupation = input.next();

                                Airways.Source.sourceList();                    // invoking static method (Classname.staticmethod)
                                System.out.println("Enter source: ");
                                String source = input.next();

                                Airways.Des.destinationList();
                                System.out.println("Enter destination: ");
                                String des = input.next();

                                Airways p1 = new SpiceJet(fname, lname, age, source, des);       //upcasting

                                p1.msg();

                                double fair = p1.totalFair(source, des, choice);
                                p1.discount(fair, passOccupation);
                                p1.timeHrs(source, des);

                                // Allocate a seat to the passenger
                                String seatNumber = "Seat No.: " + seatNo;
                                SeatAllocation seat = new SeatAllocation(fname + " " + lname, seatNumber);
                                seat.showSeatNo();
                                seatNo++;
                            }
                        }
                        case 3 -> {
                            System.out.println("Kindly fill out the details below for seat reservation...");
                            System.out.println("Total no. of passengers: ");
                            int noOfPassenger = input.nextInt();

                            for (int i = 1; i <= noOfPassenger; i++) {
                                System.out.println("enter details of passenger " + i);
                                System.out.println("Passenger first name: ");
                                String fname = input.next();
                                System.out.println("Passenger last name: ");
                                String lname = input.next();
                                System.out.println("Passenger age: ");
                                int age = input.nextInt();
                                System.out.println("Passenger Occupation: ");
                                String passOccupation = input.next();

                                Airways.Source.sourceList();                   // invoking static method (Classname.staticmethod)
                                System.out.println("Enter source: ");
                                String source = input.next();

                                Airways.Des.destinationList();
                                System.out.println("Enter destination: ");
                                String des = input.next();

                                Airways p1 = new AirIndia(fname, lname, age, source, des);       //upcasting

                                p1.msg();

                                double fair = p1.totalFair(source, des, choice);
                                p1.discount(fair, passOccupation);
                                p1.timeHrs(source, des);

                                // Allocate a seat to the passenger
                                String seatNumber = "Seat No.: " + seatNo;
                                SeatAllocation seat = new SeatAllocation(fname + " " + lname, seatNumber);
                                seat.showSeatNo();
                                seatNo++;

                            }
                        }
                        default -> throw new NoFlightException("No flights available at this moment!!!");
                    }
                    break;
                case 2:
                    TravelClasses s1 = new TravelClasses();

                    System.out.println("Kindly fill out the details below for seat reservation...");
                    System.out.println("Which Airline you want to choose:");
                    s1.availableFlights();

                    int flight = input.nextInt();
                    System.out.println("write the name of the type of class you prefer for your flight:");
                    System.out.println("1.First");
                    System.out.println("2.Business");
                    System.out.println("3.Economy");
                    String travelClass = input.next();

                    System.out.println("Passenger first name: ");
                    String fname = input.next();

                    System.out.println("Passenger last name: ");
                    String lname = input.next();

                    System.out.println("enter age of passenger");
                    int age = input.nextInt();

                    System.out.println("Choose flight source:");
                    System.out.println("international Source List: NewYork \tIndia \tLondon \tDubai");
                    System.out.println("enter source: ");
                    String Source = input.next();

                    System.out.println("choose destination: ");
                    System.out.println("international Destination List: NewYork \tIndia \tLondon \tDubai");
                    System.out.println("enter Destination: ");
                    String des = input.next();

                    s1.boardingPass(travelClass, fname, lname, age, Source, des, flight);

                    break;
                default:
                    throw new NoFlightException("No flights available at this moment!!!");

            }

        }catch (NoFlightException e){
            System.out.println("invalid choice");
        }catch(InputMismatchException e){
            System.out.println(e);
        }catch(SQLException e){
            System.out.println(e);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}


