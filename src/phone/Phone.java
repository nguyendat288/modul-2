package phone;

public class Phone {
    private String sdt;
    private String group;
    private  String name;
    private String gender;
    private String address;
    private int birth;
    private String email;

    public Phone() {
    }

    public Phone(String sdt, String group, String name, String gender, String address, int birth, String email) {
        this.sdt = sdt;
        this.group = group;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birth = birth;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "sdt=" + sdt +
                ", group='" + group + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", bird=" + birth +
                ", email='" + email + '\'' +
                '}';
    }

    public String ghi(){
        return sdt +"," + group+","+name+","+gender+","+address+","+birth+","+email;
}
    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getBird() {
        return birth;
    }

    public void setBird(int bird) {
        this.birth = birth;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
