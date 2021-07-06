package day21;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;

import java.util.ArrayList;
import java.util.List;

public final class Singleton {
    List<Category> categories;
    List<Product> products;
    private static volatile Singleton instance;
    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
    private Singleton(){
        categories=new ArrayList<>();
        products=new ArrayList<>();
        System.out.println("Singleton");
    }
}
