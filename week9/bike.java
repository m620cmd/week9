package week9;

 public class bike extends vehicle
{
  private int enginecapacity;
  public bike(String brandname, int vehicleid, double baseprice, int cc, String color){
    
    super(brandname, vehicleid, baseprice);
    this.enginecapacity=enginecapacity;
    
    
      
      
      
  }
  public double calculatefinalprice(){
      return super.baseprice + super.calculatetax();
      
  }
  public void displaybikeinfo()
  {
      super.displayvehicleinfo();
      double finalprice=this.calculatefinalprice();
      System.out.println("engine capacity is "+this.enginecapacity+"cc");
      System.out.println("the final price of the car is "+finalprice);
      
  }
    
}