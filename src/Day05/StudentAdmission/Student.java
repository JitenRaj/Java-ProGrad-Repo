package Day05.StudentAdmission;

public class Student {
    private int age;
    private String name;
    private int rollNum ;


    public Student() {
    }

    public Student(int rollNum, String name, int age) {
        this.age = age;
        this.name = name;
        this.rollNum = rollNum;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 10)
            System.out.println("Admission can't be done. Age should be Atleast 10");
        else
            this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNum() {
        return rollNum;
    }

    public void setRollNum(int rollNum) {
        this.rollNum = rollNum;
    }
}
