package avitepa.foundation.bank.bankservices.Repository.entities;

import javax.persistence.*;

@Entity
@Table(name = "address")
public class Address {
    @GeneratedValue
    private Long id;

    private String houuseNo;

    private String streetName;

    private String city;

    private String state;

    private String country;

    @OneToOne(mappedBy = "address")
    private Customer customer;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
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
