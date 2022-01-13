public class ProfilePrint {
  byte age;
  String name;
  boolean isMarried;
  
  public static void main(String[] args) {
    ProfilePrint profile=new ProfilePrint();
    byte age = 20;
    String name = "Yun";
    boolean isMarried = false;
    
    profile.setAge(age);
    profile.setName(name);
    profile.setMarried(isMarried);
    
    System.out.println("My age is " + profile.getAge());
    System.out.println("My name is " + profile.getName());
    System.out.println("Married is " + profile.isMarried());
    }
    
  public void setAge(byte paramAge) {
    age = paramAge;
    }
    
  public byte getAge() {
    return age;
    }
    
  public void setName(String paramName) {
    name = paramName;
    }
    
  public String getName() {
    return name;
    }
    
  public void setMarried(boolean paramIsMarried) {
    isMarried = paramIsMarried;
    }
    
  public boolean isMarried() {
    return isMarried;
    }
  }