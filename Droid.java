public class Droid{

    int batteryLevel;
    String name;
    
    public Droid(String droidName){
      name = droidName;
      batteryLevel = 100;
  
    }
  
    public String toString(){
      return "Hello, i'm the droid: " + name;
    }
  
    public void performTask(String task){
      System.out.println(name + " is performing task: " + task);
      batteryLevel -= 10;
    }
  
  
  
    public static void main(String[] args){
      Droid Codey = new Droid("Codey");
      Codey.performTask("Dancing");
      System.out.println(Codey);
    }
  }