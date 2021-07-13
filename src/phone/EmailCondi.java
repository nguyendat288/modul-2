package phone;

import CaseStudy.EmailCondition;

public class EmailCondi extends Exception{
    @Override
    public String getMessage(){
        return "Sai định dạng";
    }
    public static boolean checkEmail(String email){
        String str1="^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
        if(email.matches(str1)){
            return true;
        }else return false;
    }

    public static boolean checkEmail1(String email){
        for (Phone sdt : QLDT.list) {
            if (sdt.getEmail().equals(email))
                return true;
        }
        return false;
    }
    public static String getEmail() {
        while (true) {
            try {
                System.out.print("Enter the email: ");
                String email = QLDT.sc.next();
                if(checkEmail(email)==true){
                    if(checkEmail1(email)==false){
                        return email;
                    }else throw new InterruptedException();

                }else {
                    throw new EmailCondition();
                }
            } catch (EmailCondition e) {
                System.out.println(e.getMessage());
            }
            catch (InterruptedException e){
                System.out.println("Đã tồn tại !!!");
            }
        }
    }
}
