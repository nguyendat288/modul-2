package day21;

import java.util.ArrayList;
import java.util.List;

public class DataMgr {
    List<Category> categories;
    List<Product> products;
    private static DataMgr instance=null;
    public static DataMgr getInstance() {
        if (instance == null) {
            instance = new DataMgr();
        }
        return instance;
    }
    private DataMgr(){
        categories=new ArrayList<>();
        products=new ArrayList<>();
        System.out.println("DataMgr");
    }
}
