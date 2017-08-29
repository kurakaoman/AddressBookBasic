package step1A;

/**
 * Created by Szpak on 25.08.2017.
 */
public class Parameters {
    private String name;
    private String surname;
    private String country;
    private String postalCode;
    private String city;
    private String street;
    private String phoneNumber;

    public Parameters(String name, String surname, String country, String postal_Code, String city, String street, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.postalCode = postal_Code;
        this.city = city;
        this.street = street;
        this.phoneNumber = phoneNumber;
        System.out.println("melduje się new Parameter !");
    }

    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
    public String getCountry(){
        return country;
    }
    public String getPostalCode(){
        return postalCode;
    }
    public String getCity(){
        return city;
    }
    public String getStreet(){
        return street;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
}
