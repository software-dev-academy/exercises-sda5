package exercises;

public class Address {
    String streetName;
    int streetNumber;
    public Address(String streetName, int streetNumber) {
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }
    public String toString() {
        return streetName + " " + streetNumber;
    }
}