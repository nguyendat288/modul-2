package test1;

public class SanPham {
    private int id;
    private String name;
    private int price;
    private int soluong;
    private String mota;

    public SanPham(int id, String name, int price, int soluong, String mota) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.soluong = soluong;
        this.mota = mota;
    }
public  String ghi(){
        return id+","+name+","+price+","+soluong+","+mota;
}
    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", soluong=" + soluong +
                ", mota='" + mota + '\'' +
                '}';
    }

    public SanPham() {
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
