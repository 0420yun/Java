public class RefernceStaticVariable {
  String name;
  public RefernceStaticVariable() {}
  public RefernceStaticVariable(String name) {
    this.name = name;
  }
  
  public static void main(String args[]) {
    RefernceStaticVariable reference = new RefernceStaticVariable();
    reference.checkName();
  }
  
  public void checkName() {
    RefernceStaticVariable reference1 = new RefernceStaticVariable("Sangmin");
    System.out.println(reference1.name);
    RefernceStaticVariable reference2 = new RefernceStaticVariable("Sunghoon");
    System.out.println(reference1.name);
  }
}