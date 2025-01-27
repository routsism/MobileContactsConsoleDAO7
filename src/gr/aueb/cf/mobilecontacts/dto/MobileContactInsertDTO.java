package gr.aueb.cf.mobilecontacts.dto;

import gr.aueb.cf.mobilecontacts.model.MobileContact;

public class MobileContactInsertDTO {
    private String firstname;
    private  String lastname;
    private String phoneNumber;

    public MobileContactInsertDTO() {

    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
