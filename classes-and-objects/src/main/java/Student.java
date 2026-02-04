
// Intro to Data Classes
// classes that hold state data
public class Student {

    //Access Modifers
    // Public, Private, Protected, Default(Package-Private)
    //Public is made available to every class in the program
    //Private restrict access to the class itself
    //Protected gives access to the same Package and subclasses
    //Default the same package can access but subclasses cannot
    // to meet encapsulation pillar

    private String major;
    private String studentId;
    private String fullName;
    private byte age;

    public Student() {

    }

    public Student(String major, String studentId, String fullName, byte age) {
        this.major = major;
        this.age = age;
        this.studentId = studentId;
        this.fullName = fullName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }
}
