/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phonepackage;

public class Package {
    private Phone Brand;
    private String Name,wifi_free;
    private double Service_price;
    private Integer call_free,sms_free,mms_free,Limit_3g;
   
    
    
public void addPackage(Phone a,String b,double c,Integer d,Integer e,Integer f,String g,int h){
    Brand = a;
    Name = b;
    Service_price =c;
    call_free = d;
    sms_free = e;
    mms_free = f;
    wifi_free = g;
    Limit_3g = h;
    
}
public String getName(){
    return Name ;
}
public double getService(){
    return Service_price ;
}

 
    
    
    
    
}

    

