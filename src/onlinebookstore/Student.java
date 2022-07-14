
package onlinebookstore;

public class Student extends Person {
    
    // fields
    private String id;
    private String institution;

    // parameterized constructor
    // concept of polymorphism
    public Student(String id, String institution) {
        this.id = id;
        this.institution = institution;
    }
    
    // paramterized constructor
    // concept of polymorphism
    public Student(String name, String phoneNumber, char gender, String id, String institution) {
        super(name, phoneNumber, gender);
        this.id = id;
        this.institution = institution;
    }
    
    // getter for id
    public String getId() {
        return id;
    }
    
    // setter for id
    public void setId(String id) {
        this.id = id;
    }
    
    // getter for institution
    public String getInstitution() {
        return institution;
    }
    
    // setter for institution
    public void setInstitution(String institution) {
        this.institution = institution;
    }
    
    // toString()
    @Override
    public String toString() {
        return "Student [id=" + id + ", institution=" + institution + "]";
    }
    
    
}
