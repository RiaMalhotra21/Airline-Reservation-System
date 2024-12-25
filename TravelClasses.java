package International;

import java.util.InputMismatchException;

interface InternationalAirways {      //using interfaces
    void availableFlights();
    void boardingPass(String travelClass,String fname,String lname,int age,String Source,String des,int flight);
    static void internationalSourceList(){         // using static keyword in interface
        System.out.println("Available flight sources are:");
        System.out.println("New York \tIndia \tLondon \tDubai");
    }
    static void internationalDestinationList(){
        System.out.println("Available flight sources are:");
        System.out.println("New York \tIndia \tLondon \tDubai");
    }
}


interface Aircrew {
    default void crewMembers(){
        System.out.println("These are the list of our Air crew members for making your journey safer... ");
        System.out.println("1. Pilot");
        System.out.println("2. Co-pilot");
        System.out.println("3. Second class pilot");
        System.out.println("4. lead Cabin crew members");
    }
    void availableFlights();
}
public class TravelClasses implements InternationalAirways,Aircrew {     //achieving multiple inheritance with the help of interfaces
    public void availableFlights() {
        System.out.println("Available International flights are:");
        System.out.println("enter 1 for Emirates EK 68");
        System.out.println("enter 2 for IceLandair GBP 430 ");
        System.out.println("enter 3 for British Airways B0113 ");
    }



    public void boardingPass(String travelClass,String fname,String lname,int age,String Source,String des,int flight){
        try{
            switch(flight) {
                case 1:
                    if (travelClass.equalsIgnoreCase("First")) {
                        if (Source.equalsIgnoreCase("DUBAI")&& des.equalsIgnoreCase("INDIA")) {
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("EK68\t 03DEC");
                            System.out.println("FROM\t DUBAI//DXB");
                            System.out.println("TO\t INDIA");
                            System.out.println("----------------------------------------------");
                            System.out.println("FIRST");
                            System.out.println("DUBAI                 EK68 ");
                            System.out.println("\n");
                            System.out.println("GATE\t BOARDING AT GATEC CLOSES AT\t SEAT ");
                            System.out.println("A6\t 1000\t 1020\t 2F");
                            System.out.println("-----------------------------------------------");
                            System.out.println("THE EMIRATES FIRST CLASS LOUNGE A");
                        }
                    }
                    if (travelClass.equalsIgnoreCase("Business")){
                        if(Source.equalsIgnoreCase("DUBAI")&& des.equalsIgnoreCase("INDIA")){
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("EK68\t 03DEC");
                            System.out.println("FROM\t DUBAI//DXB");
                            System.out.println("TO\t INDIA/IN");
                            System.out.println("----------------------------------------------");
                            System.out.println("BUSINESS");
                            System.out.println("DUBAI                 EK68 ");
                            System.out.println("\n");
                            System.out.println("GATE\t BOARDING AT GATEC CLOSES AT\t SEAT ");
                            System.out.println("A6\t 1000\t 1020\t 2F");
                            System.out.println("-----------------------------------------------");
                        }
                        if(Source.equalsIgnoreCase("INDIA")&& des.equalsIgnoreCase("DUBAI")){
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("EK68\t 03DEC");
                            System.out.println("TO\t INDIA/IN");
                            System.out.println("FROM\t DUBAI//DXB");
                            System.out.println("----------------------------------------------");
                            System.out.println("BUSINESS");
                            System.out.println("DUBAI                 EK68 ");
                            System.out.println("\n");
                            System.out.println("GATE\t BOARDING AT GATEC CLOSES AT\t SEAT ");
                            System.out.println("A6\t 1000\t 1020\t 2F");
                            System.out.println("-----------------------------------------------");

                        }


                    }
                    if (travelClass.equalsIgnoreCase("Economy")) {
                        if(Source.equalsIgnoreCase("DUBAI")&& des.equalsIgnoreCase("INDIA")){
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("EK68\t 03DEC");
                            System.out.println("FROM\t DUBAI//DXB");
                            System.out.println("TO\t INDIA/IN");
                            System.out.println("----------------------------------------------");
                            System.out.println("ECONOMY");
                            System.out.println("DUBAI                 EK68 ");
                            System.out.println("\n");
                            System.out.println("GATE\t BOARDING AT GATEC CLOSES AT\t SEAT ");
                            System.out.println("A6\t 1000\t 1020\t 2F");
                            System.out.println("-----------------------------------------------");

                        }
                    }

                    break;
                case 2:
                    if(travelClass.equalsIgnoreCase("First")){
                        if(Source.equalsIgnoreCase("NEWYORK")&& des.equalsIgnoreCase("DUBAI")){
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("GBP 430\t 03DEC");
                            System.out.println("FROM\t New York City/JFK");
                            System.out.println("TO\t DUBAI//DXB");
                            System.out.println("----------------------------------------------");
                            System.out.println("FIRST");
                            System.out.println("DUBAI                 EK68 ");
                            System.out.println("\n");
                            System.out.println("GATE\t BOARDING AT GATEC CLOSES AT\t SEAT ");
                            System.out.println("A6\t 1000\t 1020\t 2F");
                            System.out.println("-----------------------------------------------");
                            System.out.println("THE ICELANDAIR FIRST CLASS LOUNGE A");

                        }
                    }
                    if (travelClass.equalsIgnoreCase("Business")){
                        if (Source.equalsIgnoreCase("NewYork")&& des.equalsIgnoreCase("LONDON")) {
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("LONDON\t 03DEC");
                            System.out.println("FROM\t NEW YORK/JFK");
                            System.out.println("TO\t LONDON/LHR");
                            System.out.println("----------------------------------------------");
                            System.out.println("BUSINESS CLASS");
                            System.out.println("FLIGHT                 GBP 430 ");
                            System.out.println("\n");
                            System.out.println("GATE\t GATE CLOSES\t SEAT ");
                            System.out.println("09\t 1910\t 09");
                            System.out.println("-----------------------------------------------");
                            System.out.println("THE BUSINESS CLASS LOUNGE B");
                        }
                    }
                    break;
                case 3:
                    if(travelClass.equalsIgnoreCase("First")){
                        if (Source.equalsIgnoreCase("Newyork")&& des.equalsIgnoreCase("LONDON")) {
                            System.out.println("BOARDING PASS");
                            System.out.println( lname.toUpperCase()+"/"+ fname.toUpperCase());
                            System.out.println("LONDON\t 03DEC");
                            System.out.println("FROM\t NEW YORK/JFK");
                            System.out.println("TO\t LONDON/LHR");
                            System.out.println("----------------------------------------------");
                            System.out.println("FIRST");
                            System.out.println("FLIGHT                 BO113 ");
                            System.out.println("\n");
                            System.out.println("GATE\t GATE CLOSES\t SEAT ");
                            System.out.println("09\t 1910\t 09");
                            System.out.println("-----------------------------------------------");
                            System.out.println("THE FIRST CLASS LOUNGE A");
                        }
                    }
                    break;
                default:
                    System.out.println("Invalid flight option. Please enter a valid flight option.");
            }
        }catch(InputMismatchException e){
            System.out.println("Invalid input. Kindly enter the valid input.");
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }







