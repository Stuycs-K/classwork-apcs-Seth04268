//what an EldritchKnight should be, as opposed to what the dnd version is
public class EldritchKnight extends Adventurer {
  //Abstract methods are meant to be implemented in child classes.
private int eldritchEnergy, eldritchEnergyMax;
/*
  all adventurers must have a custom special
  consumable resource (mana/rage/money/witts etc)
*/
public EldritchKnight(String name, int HP, int eldritchEnergyMax) {
  super(name, HP);
  this.eldritchEnergy = eldritchEnergyMax;
  this.eldritchEnergyMax = eldritchEnergyMax;
}
public EldritchKnight(String name) {
  //original numbers were 2000 and 3000
  super(name, 12 + (int) (Math.random() * 4));
  this.eldritchEnergy = 20;
  this.eldritchEnergyMax = 20;

}
public EldritchKnight() {
  //original numbers were 2000 and 3000
  super("Seth", 12 + (int) (Math.random() * 4));
  this.eldritchEnergy = 20;
  this.eldritchEnergyMax = 20;

}

//give it a short name (fewer than 13 characters)
public String getSpecialName() {
  return "eldritch energy";
}
//accessor methods
public int getSpecial() {
  return this.eldritchEnergy;
}
public void setSpecial(int n) {
this.eldritchEnergy = n;
}
public int getSpecialMax() {
return eldritchEnergyMax;
}

/*
  all adventurers must have a way to attack enemies and
  support their allys
*/
//hurt or hinder the target adventurer
public String attack(Adventurer other) {
  int returnNumber = (int) (4 + Math.random() * 2);
  other.applyDamage(returnNumber);
  return (getName() + " has attacked " + other.getName() + " dealing " + returnNumber + " points of damage");
}

//heall or buff the target adventurer
public String support(Adventurer other) {
  int returnNumber = (other.getHP() + (int) (Math.random() * other.getmaxHP()) + (int) (.2 * other.getmaxHP()));
  other.setHP(returnNumber);
  return (getName() + " has healed " + other.getName() + "for " + returnNumber + " points of hp");

}

//heal or buff self
public String support() {
  int returnNumber = getHP() + (int) (4 + Math.random() * 4);
  setHP(returnNumber);
  return (getName() + " has healed " + "themselves " + "for " + returnNumber + " points of hp");

}

//hurt or hinder the target adventurer, consume some special resource
public String specialAttack(Adventurer other) {
  if (getSpecial() >= 10) {
int returnNumber = 8;
setSpecial(getSpecial() - 10);
other.applyDamage(returnNumber);
return getName() + " uses Domain Of The Elder Gods dealing " + returnNumber + " points of damage " + other.getName() + " has " + other.getHP() + " health points left";
}
else {
  return getName() + " only has " + getSpecial() + " use a normal attack instead.";
}
}
}
