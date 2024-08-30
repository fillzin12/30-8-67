public class Student {
    public int point;
    public string name;
    public string major;


    public Student(String name, String major, int point) {
        this.name = name;
        this.major = major;
        this.point = point;
    }

    public void setName(String name) {
        return name;
    }

    public void setName(String name) {
        this.nanme = name;
    }
    
    public void setName(String major) {
        return major;
    }

    public void setName(String major) {
        this.major = major;
    }

    public void setName(String point) {
        return point;
    }

    public void setName(String point) {
        if (point > 0) {
            this.point = point;
        }
    }
    
    public void displayinfo() {
        System.out.println("Student Name: "+name);
        System.out.println("Student major: "+major);
        System.out.println("Student point: "+point);
    }
}