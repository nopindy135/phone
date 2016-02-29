package Phonepackage;


public class Main {
    
    public static void main(String[] args) {
        
        Phone IPhone = new Phone();
        IPhone.addphone("iphone", "4s");
        Package Mini = new Package();
        Mini.addPackage(IPhone, Mini.getName(), 275.00, 150, 100, 20, null, 150);
        
        
        
        Customer KANIN = new Customer();
        KANIN.addname("kanin");
        System.out.println("รุ่น"+IPhone.getbrand());
        System.out.println("เเพคเก็จ"+Mini.getName());
        System.out.println("ชื่อ"+KANIN.getname());
        
        

        
        
    }
    
}
