package week9;



public class vehicle
{
   protected String brandname;
   protected int vehicleid;
   protected double baseprice;
   public vehicle(String brandname, int vehicleid, double baseprice){
       
       System.out.println("vehicle");
       this.brandname=brandname;
       this.vehicleid=vehicleid;
       this.baseprice=baseprice;
   }
    
    
    public void displayvehicleinfo(){
        System.out.println("vehicle id is: "+this.vehicleid);
        System.out.println("brand name: "+this.brandname);
        System.out.println("base price: "+ this.baseprice);
        
        
    }
    public double calculatetax()
    {
        return 0.10*baseprice;
    }
    
}