
package Phonepackage;

/**
 *
 * @author Boss
 */
public class Customer {
     private String name;
     private String Tel;
     private String use_pa;
     
     
       public void addname(String a){
         name = a;
     }
        public void addtel(String c){
         Tel = c;
     }
         public void adduse(String x){
         use_pa = x;
     }
     public void Newp( ){
         
         System.out.println("Max Plus");
       
     }
      public void Check_sim(){
          System.out.println("Ais");
     }
       public void Check_tel(){
           System.out.println("1234567890");
     }
      public void Check_bill(){
          System.out.println("899");
     }
      public void Check_internet(){
          System.out.println("none");
     }
       public void Check_phone(){
          System.out.println("Iphone");
     }
  public String getname(){
   return name;
  }
}
  