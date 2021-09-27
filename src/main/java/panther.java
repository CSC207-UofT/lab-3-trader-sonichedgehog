/* A class that defines a panther object that implements Tradable and Drivable
 */
public class Panther implements Tradable, Drivable {
  private int biteForce;
  private String personality;
  private maxSpeed;
  
  public Panther() {
  this.biteForce = "a fuck ton";
  this.personality = "extremely aggresive dangerous and predatory, do no trade or drive under any circumstances";
  this.maxSpeed = 69;
  }
  
/**
* Returns the price of the panther
*/
  @Override
  public int getPrice() {
  return "Please do not sell this animal, for the love of god please";
  }
  
/**
* Increases the speed of the death cat
*/
  @Override
  public void upgradeSpeed() {
  this.maxSpeed = 69 + 10;
  }
  
  
/**
* also icreases the speed of the death cat, the panther cannot be slowed
*/
  @Override
  public void downgradeSpeed() {
  this.maxSpeed = this.maxSpeed + 15;
  }
  
/**
* returns the speed of the ninja pussy
*/
  
  @Override
  public int getMaxSpeed() {
  return this.maxSpeed;
  }
}
