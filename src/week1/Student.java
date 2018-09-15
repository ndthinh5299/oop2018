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
        return Id;
    }
    public void setId(String Id_){
        Id = Id_;
    }
    public String getGroup(){
        return Group;
    }
    public void setGroup(String Group_){
        Group = Group_;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email_){
        Email = Email_;
    }
    /**
     * Constructor 1
     */
    Student() {
        // TODO:
        Name = "Student";
        Id = "000";
        Group = "INT22041";
        Email = "uet@vnu.edu.vn";
        
    }

    /**
     * Constructor 2
     * @param n
     * @param sid
     * @param em
     */
    Student(String n, String sid, String em) {
        // TODO:
        Name = n;
        Id = sid;
        Email = em;
        Group = "INT22041";
    }

    /**
     * Constructor 3
     * @param s
     */
    Student(Student s) {
        // TODO:
        Name = s.Name;
        Id = s.Id;
        Group = s.Group;
        Email = s.Email;
    }

    String getInfo() {
        // TODO:
        
        return "Ten: "+Name + "\n" + "MSSV: " + Id + "\n" + "Lop: " + Group + "\n" + "Email: " + Email; // xóa dòng này sau khi cài đặt
    }
    
    
    
}