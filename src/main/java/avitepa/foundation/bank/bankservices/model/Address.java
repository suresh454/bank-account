package avitepa.foundation.bank.bankservices.model;

public class Address {

    private long addressId;

    private String houuseNo;

    private String streetName;

    private String city;

    private String state;

    private String country;

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public String getHouuseNo() {
        return houuseNo;
    }

    public void setHouuseNo(String houuseNo) {
        this.houuseNo = houuseNo;
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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
