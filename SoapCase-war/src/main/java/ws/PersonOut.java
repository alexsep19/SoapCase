package ws;

import java.util.Date;

public class PersonOut {

    public String getCIN() {
        return CIN;
    }

    public void setCIN(String CIN) {
        this.CIN = CIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    private String CIN;
    private String name;
    private String firstName;
    private Date birthDate;

    //very important to JAXB
    public PersonOut() {

    }

    public PersonOut(String cIN, String name, String firstName, Date birthDate) {
        super();
        CIN = cIN;
        this.name = name;
        this.firstName = firstName;
        this.birthDate = birthDate;
    }

}
