
package dataClass;

public class Courses implements java.io.Serializable{
    
    public String name;
    public String id;
    public String year;
    public String sem;
    
    public Courses(String name, String id, String year, String sem){
        this.name = name;
        this.id = id;
        this.year = year;
        this.sem = sem;
    }
    
}
