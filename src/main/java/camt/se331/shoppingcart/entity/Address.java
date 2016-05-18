package camt.se331.shoppingcart.entity;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;

/**
 * Created by pan on 5/15/2016.
 */
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String houseNumber;
    private String village;
    private String villageNumber;
    private String subDistrict;
    private String district;
    private String province;
    private String postcode;

    @ManyToOne(fetch = FetchType.EAGER)
    User customer;

    public Address() {
    }

    public Address(String houseNumber, String village, String villageNumber, String subDistrict, String district, String postcode) {
        this.houseNumber = houseNumber;
        this.village = village;
        this.villageNumber = villageNumber;
        this.subDistrict = subDistrict;
        this.district = district;
        this.postcode = postcode;
    }

    public Address(String houseNumber, String village, String villageNumber, String subDistrict, String district, String province, String postcode) {
        this.houseNumber = houseNumber;
        this.village = village;
        this.villageNumber = villageNumber;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
    }

    public Address(String houseNumber, String village, String villageNumber, String subDistrict, String district, String province, String postcode, User user) {
        this.houseNumber = houseNumber;
        this.village = village;
        this.villageNumber = villageNumber;
        this.subDistrict = subDistrict;
        this.district = district;
        this.province = province;
        this.postcode = postcode;
        this.customer = user;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getVillageNumber() {
        return villageNumber;
    }

    public void setVillageNumber(String villageNumber) {
        this.villageNumber = villageNumber;
    }

    public String getSubDistrict() {
        return subDistrict;
    }

    public void setSubDistrict(String subDistrict) {
        this.subDistrict = subDistrict;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public User getUser() {
        return customer;
    }

    public void setUser(User user) {
        this.customer = user;
    }
}
