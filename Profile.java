public class Profile {
  String name = "OOO";
  int age = 0;
  
  public static void main(String[] args) { 
    Profile proflie=new Profile();
    proflie.setName("Min");
    profile.setAge(20);
    profile.printName();
    profile.printAge();
    }
    
  public void setName(String str) {
    name = str;
    }
    
  public void setAge(int value) {
    age = value;
    }
    
  public void printNmae() {
    System.out.println("My name is " + name); 
    }
    
  public void printAge() {
    System.out.println("My age is " + age);
    }
  }