package lab2_Problem3;

abstract class Starship {

  protected int destructionLevel;

  public Starship() {
    this.destructionLevel = 0;
  }

  public boolean isDestroyed() {
    return destructionLevel >= 100;
  }

  public int getDestructionLevel() {
    return destructionLevel;
  }

  public void attack(int damage) {
    if (!isDestroyed()) {
      destructionLevel += damage;
      if (destructionLevel > 100) {
        destructionLevel = 100;
      }
      System.out.println(
          this.getClass().getSimpleName() + " attacked! Destruction level: " + destructionLevel);
    } else {
      System.out.println(this.getClass().getSimpleName() + " is already destroyed!");
    }
  }
}
