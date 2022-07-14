
package onlinebookstore;

public class Person {
    
    // fields
    private String name;
    private String phoneNumber;
    private char gender;
    
    // default constructor
    // concept of polymorphism
    public Person() {
    }
    
    // parameterized constructor
    // concept of polymorphism
    public Person(String name, String phoneNumber, char gender) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
    }
    
    // getter for name
    public String getName() {
        return name;
    }
    
    // setter for name
    public void setName(String name) {
        this.name = name;
    }
    
    // getter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    // setter for phoneNumber
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    // getter for gender
    public char getGender() {
        return gender;
    }
    
    // setter for gender
    public void setGender(char gender) {
        this.gender = gender;
    }

    // toString()
    @Override
    public String toString() {
        return "Person [gender=" + gender + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
    }
    
    
}
