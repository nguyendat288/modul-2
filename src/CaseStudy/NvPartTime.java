package CaseStudy;

public class NvPartTime extends NhanVien{
    private int timework;

    public NvPartTime() {
    }

    public NvPartTime(int timework) {
        this.timework = timework;
    }

    public NvPartTime(int id, String name, int age, String gender, String phone, String email, boolean status, int salary, int timework) {
        super(id, name, age, gender, phone, email, status, salary);
        this.timework = timework;
    }

    public int getTimework() {
        return timework;
    }

    public void setTimework(int timework) {
        this.timework = timework;
    }

    @Override
    public String toString() {
        return "NvPartTime{" +
                "timework=" + timework +super.toString()+
                '}';
    }

    @Override
    public int doanhThu(){
        return this.getSalary()*this.timework;
    }
}
