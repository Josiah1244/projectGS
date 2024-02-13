public class Address {
    private int num;
    private int zip;
    private String streetName;
    private String city;
    private String state;
    
    public Address(int num, int zip, String streetName, String city, String state) {
        this.num = num;
        this.zip = zip;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    public int getZip() {
        return zip;
    }
    public void setZip(int zip) {
        this.zip = zip;
    }
    public String getStreetName() {
        return streetName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    @Override
    public String toString() {
        return  num + " " + streetName + " " + city + ", " + state + " " + zip;
    }
}
