package com.codedotorg;

public class City implements Comparable<City> {
    
    /** The name of a City */
    private String name;

    /**
     * Constructor for the City class.
     *
     * @param name The name of the city.
     */
    public City(String name) {
        this.name = name;
    }

    /**
     * Gets the name of the city.
     * @return String The name of the city.
     */
    public String getName() {
        return name;
    }

}

@Override
public int compareTo(City otherCity) {
    // Compare city names lexicographically
    return this.name.compareTo(otherCity.name);
}
import java.util.Arrays;

public class CitySorter {
    public static void main(String[] args) {
        City[] cities = {
            new City("New York"),
            new City("Los Angeles"),
            new City("Chicago"),
            new City("Seattle")
        };

        Arrays.sort(cities);

        System.out.println("Cities in alphabetical order:");
        for (City city : cities) {
            System.out.println(city.getName());
        }
    }
}
