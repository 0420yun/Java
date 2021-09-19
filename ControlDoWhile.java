public class ControlDoWhile {
  public static void main(String args[]) {
    ControlDoWhile control = new ControlDoWhile();
    control.dowhile();
  }
  public void dowhile() {
    ControlSwitch control = new ControlSwitch();
    int loop = 0;
    do {
      loop++;
      control.switchCalender(loop);
    } while(loop < 12);
  }
}