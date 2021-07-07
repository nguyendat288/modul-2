package CaseStudy;



public class NhanVien {
    //    Lớp nhân viên gồm tên, tuổi, giới tính, sđt, email,status, lương.
    private int id;
    private String name;
    private int age;
    private String gender;
    private String phone;
    private String email;
    private boolean status;
    private int salary;

    private int doanhThu;
    public NhanVien() {
    }

    public NhanVien(int id,String name, int age, String gender, String phone, String email,boolean status, int salary) {
        this.id=id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phone = phone;
        this.email = email;
        this.status=status;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "{ "+" id ="+ id+
                ",name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", phone=" + phone +
                ", email='" + email + '\'' +",status="+status+
                ", salary=" + salary +
                '}';
    }
public String ghi(){
        return id +","+name+","+age+","+gender+","+phone+","+email+","+status+","+salary;
}
    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int doanhThu(){
        return doanhThu;
    }
}
