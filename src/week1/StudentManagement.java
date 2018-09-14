package week1;

public class StudentManagement {
    
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        return false; // xóa dòng này sau khi cài đặt
    }

    void studentsByGroup() {
        // TODO:
    }

    void removeStudent(String id) {
        // TODO:
    }

    public static void main(String[] args) {
        // TODO:
        Student a = new Student();
        a.setName("NGuyen Dinh Thinh");
        a.setId("17021045");
        a.setGroup("K62-ie5");
        a.setEmail("thinhnguyenxc99@gmail.com");
        System.out.println("Ten cu sinh vien la: " + a.getName());
        a.getInfo();
        
        
        
        
        
        
    }
    
}
