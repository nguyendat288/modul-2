package Test;

public class SinhVien {
    private int id;
    private String name;
    private int age;
    private String gender;
    private String address;
    private double mark;

    public SinhVien() {
    }

    public SinhVien(int id, String name, int age, String gender, String address, double mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", mark=" + mark +
                '}';
    }
public String ghi(){
        return id+","+name+","+age+","+gender+","+address+","+mark;
}
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }
}
