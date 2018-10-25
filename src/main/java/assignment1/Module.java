package assignment1;

//@author 15332286

public class Module {

//Create Arraylist of students
    private String moduleName;
    private String id; //could be a string, i.e. CT417
    
    //list of students
    //list of courses associated

    public Module(String moduleName, String id) {
        this.moduleName = moduleName;
        this.id = id;
    }
    
    public String getName() {
        return moduleName;
    }
    public String getID() {
        return id;
    }
}
