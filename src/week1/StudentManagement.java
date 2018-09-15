package week1;

public class StudentManagement {
    
    // TODO: khai báo thuộc tính students là array chứa các đối tượng thuộc lớp Student (max. 100)

    public boolean sameGroup(Student s1, Student s2) {
        // TODO:
        
        return s1.getGroup().equals(s2.getGroup()) ;
    }

    void studentsByGroup() {
        // TODO:
        
    }

    void removeStudent(String id) {
        // TODO:
    }
    private Student[] studens = new Student[100];

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        // TODO:
        Student a = new Student("NGuyen Dinh Thinh", "17021045", "thinhnguyenxc@gmail.com");
        Student b = new Student("Nguyen Van A", "17021046", "A@gmail.com");
        Student c = new Student("Nguyen Van B", "17021046", "B@gmail.com");
        c.setGroup("INT22042");
        StudentManagement test = new StudentManagement();
        if(test.sameGroup(a, b)) System.out.println("a va b cung lop");
        else System.out.println("a va b khac lop");
        
    }
    
}
