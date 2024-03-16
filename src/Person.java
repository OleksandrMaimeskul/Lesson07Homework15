package src;

public class Person {
    public String personInfo(String name, String surname, String city, long phoneNumber) {
        String str = "Call citizen" + " " + name + " " + surname + " " + "from city: " + city
                + " " + "with phone number: " + phoneNumber;
        return str;
    }
}

