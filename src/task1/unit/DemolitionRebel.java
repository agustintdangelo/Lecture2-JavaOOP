package task1.unit;

public class DemolitionRebel extends Unit {

	private static final int DAMAGE = 70;

	public DemolitionRebel(int unitId) {
		super(unitId);
		this.side = "Alliance";
	}

	@Override
	public void attack(Unit enemyUnit) {
		if (enemyUnit.getHealth() > 0) {
			enemyUnit.setHealth(enemyUnit.getHealth() - DAMAGE);
			this.stamina -= 40;
			System.out.println("The unit does " + DAMAGE + " damage to the enemy number: " + enemyUnit.getUnitId());
			if (enemyUnit.getHealth() <= 0) {
				enemyUnit.setHealth(0);
				System.out.println("An enemy has been defeated!");
			}
			System.out.println("The health of the enemy unit number " + enemyUnit.getUnitId() + " now is: "
					+ enemyUnit.getHealth());
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("The enemy unit " + enemyUnit.getUnitId() + " is dead so you can't attack it.");
		}

	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "DemolitionRebel [health=" + health + ", stamina=" + stamina + ", unitId=" + unitId + ", isAlive="
				+ isAlive + ", side=" + side + "]";
	}

}
