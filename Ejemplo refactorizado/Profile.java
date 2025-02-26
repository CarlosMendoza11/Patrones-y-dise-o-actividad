public class Profile {
    private String firstName;
    private String secondName;
    private String city;
    private String street;
    private String house;
    private String apartment;

    public Profile(String firstName, String secondName, String city, String street, String house, String apartment) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.city = city;
        this.street = street;
        this.house = house;
        this.apartment = apartment;
    }

    public String getFullName() {
        return secondName + " " + firstName;
    }

    public String getAddressString() {
        return city + " " + street + " " + house + " " + apartment;
    }
}
