/*
The get name method in the Animal.speak method is modified so when we then call super.speak() as part of our Bird.speak() method the getName() is overridden and changed.
*/
/*
    We are trying to create an animal object with b2 and give it the methods of the Bird class, however Animal does not have the methods of the bird class, so it returns and error.
    */
public class Driver {
  public static void main (String[] args) {
    Animal a1 = new Animal("Baaaaaaaa", 3000, "Gorlox The Destroyer");
    a1.speak();
    a1.getAge();
    Bird b1 = new Bird("Baaaaaaaa", 3000, "Gorlox The Destroyer2", 10000000000.0, "red");
    // Bird b2 = new Animal("Baaaaaaaa", 3000, "Gorlox The Destroyer3");
    Animal a2 = new Bird("Baaaaaaaa", 3000, "Gorlox The Destroyer2", 10000000000.0, "red");
  b1.speak();
  a2.speak();

  }
}
