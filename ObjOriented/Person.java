package ObjOriented;

public class Person {
    public String firstName;
    public String lastName;
    public int myAge;
    public String myCity;

    public Person(String firstName, String lastName, int myAge, String myCity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.myAge = myAge;
        this.myCity = myCity;
    }

    public void wyswietlWynik(){
        System.out.println(firstName + " " + lastName + " " + myAge + " " + myCity);
    }
}
