package org.example.e122;

public class E122Variables {
        String nameOfCountry;
        String capital;
        long populationSize;
        void displayCountryInfo(){
            System.out.println("The capital of "+nameOfCountry+" is "+capital+" and population is "+populationSize);
        }

    public static void main(String[] args) {
        E122Variables country1 = new E122Variables();
        country1.nameOfCountry = "USA";
        country1.capital = "Washington DC";
        country1.populationSize = 330000000;
        country1.displayCountryInfo();

        E122Variables country2 = new E122Variables();
        country2.nameOfCountry = "Kazakhstan";
        country2.capital = "Astana";
        country2.populationSize = 18500000;
        country2.displayCountryInfo();
    }
}

