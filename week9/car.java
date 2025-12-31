package week9;

public class car extends vehicle
{
    
     private int doors;
   private String fueltype;
   //constructor
   public car(String brandname, int vehicleid, double baseprice, int door, String fueltype){
       
       super(brandname, vehicleid, baseprice);
       this.doors=doors;
       this.fueltype=fueltype;
       
   }
   
    public double calculatefinalprice(){
        return super.baseprice +super.calculatetax() +0.05 * super.baseprice;
    }
    public void displaycardetails(){
       super.displayvehicleinfo();
       
       double finalprice= this.calculatefinalprice();
       System.out.println("number of door: "+this.doors);
       
       System.out.println("fueltype: "+this.fueltype);
       System.out.println("the final price of the car is "+ finalprice);
       
       
       
       
       
       
       
           
           
       
    }
}