public class Driver {
  public static void main(String[] args) {
  EldritchKnight Seth = new EldritchKnight("Seth", 1000000, 100000);
  EldritchKnight randomGuyNumber6 = new EldritchKnight("Tim");
  System.out.println(Seth.specialAttack(randomGuyNumber6));
  System.out.println(randomGuyNumber6.getHP());
  System.out.println(randomGuyNumber6.getmaxHP());

}

}
