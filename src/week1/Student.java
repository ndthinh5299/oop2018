package week1;

public class Student {

    // TODO: khai báo các thuộc tính cho Student
    private String Name;
    private String Id;
    private String Group;
    private String Email;
    
    
    
    
    // TODO: khai báo các phương thức getter, setter cho Student
    public String getName(){
        return Name;
    }
    public void setName(String Name_){
        Name = Name_;
    }
    public String getId(){
        
    }
    public void setId(String Id_){
        Id = Id_;
    }
    public String getGroup(){
        return Group;
    }
    public String setGroup(String Group_){
        Group = Group_;
    }
    public String getEmail(){
        return Email;
    }
    public String setEmail(String Email_){
        Email = Email_;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
    }

    String getInfo() {
        // TODO:
        return null; // xóa dòng này sau khi cài đặt
    }
}
