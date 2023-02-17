package creditsolutions;

//Implementing the Client Class

public class Client {

//Declaring the attributes in the Client class

    private int idNumber;

    private String firstName; //to declare a string it should be done using a upper case 'S'

    private String lastName;

    private int age;

    private Card Card;

//Declaring the methods in the class

//DEFAULT CONSTRUCTOR

    public Client () {

        idNumber = 0;

        firstName = "";

        lastName = "";

        age = 0;

        Card = new Card();

    }

//PRIMARY CONSTRUCTOR

    public Client (int idNumber, String firstName, String lastName, int age, Card Card) {

        this.idNumber = idNumber;

        this.firstName = firstName;

        this.lastName = lastName;

        this.age = age;

        this.Card = Card;

    }

//COPY CONSTRUCTOR

    public Client (Client obj) {

        idNumber = obj.idNumber;

        firstName = obj.firstName;

        lastName = obj.lastName;

        age = obj.age;

        Card = obj.Card;

    }

//Generating Getters & Setters

    public int getIdNumber() {

        return idNumber;

    }

    public void setIdNumber(int idNumber) {

        this.idNumber = idNumber;

    }

    public String getFirstName() {

        return firstName;

    }

    public void setFirstName(String firstName) {

        this.firstName = firstName;

    }

    public String getLastName() {

        return lastName;

    }

    public void setLastName(String lastName) {

        this.lastName = lastName;

    }

    public int getAge() {

        return age;

    }

    public void setAge(int age) {

        this.age = age;

    }

    public Card getCard() {

        return Card;

    }

    public void setCard(Card card) {

        this.Card = card;

    }

//Implementing toString method

    @Override

    public String toString() {

        return "Client ID Number=> " + idNumber + "\nFirst Name=> " + firstName + "\nLast Name=> " + lastName

                + "\nAge=> " + age;

    }

//Generating display method

    void display () {

        System.out.println(toString());

    }

}