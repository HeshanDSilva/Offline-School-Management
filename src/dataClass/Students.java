package dataClass;

public class Students implements java.io.Serializable{
    public String name;
    public String id;
    public String email;
    public String town;
    
    public Students(String name, String id, String email, String town){
        this.name = name;
        this.id = id;
        this.email = email;
        this.town = town;
    }
    
}
