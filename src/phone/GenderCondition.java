package phone;

public class GenderCondition extends Exception{
    @Override
    public String getMessage(){
        return "Phải là nam hoặc nu";
    }
}
