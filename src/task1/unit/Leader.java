package task1.unit;

import java.util.Objects;

public class Leader extends Unit {
	String name;
	int force;
	private static final int DAMAGE = 100;
	private static final int FORCE_DAMAGE = 500;

	public Leader(String name, int force, int unitId, String side) {
		super(unitId);
		this.name = name;
		this.health = 1000;
		this.stamina = 1000;
		this.force = force;
		this.side = side;
	}

	public void attack(Unit enemyUnit) {
		if (enemyUnit.getHealth() > 0) {
			enemyUnit.setHealth(enemyUnit.getHealth() - DAMAGE);
			this.stamina -= 50;
			System.out.println(this.name + " does " + DAMAGE + " damage to the enemy number: " + enemyUnit.getUnitId());
			if (enemyUnit.getHealth() <= 0) {
				System.out.println("An enemy has been defeated!");
				enemyUnit.setHealth(0);
				enemyUnit.setAlive(false);
			}
			System.out.println("The health of the enemy unit number " + enemyUnit.getUnitId() + " now is: "
					+ enemyUnit.getHealth());
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("The enemy unit " + enemyUnit.getUnitId() + " is dead so you can't attack it.");
			System.out.println("---------------------------------------------------------------");
		}
	}

	public void forceAttack(Unit enemyUnit) {
		if (enemyUnit.getHealth() > 0) {
			enemyUnit.setHealth(enemyUnit.getHealth() - FORCE_DAMAGE);
			this.force -= 50;
			System.out.println(this.name + " uses the Force and does " + FORCE_DAMAGE + " damage to the enemy number: "
					+ enemyUnit.getUnitId());
			if (enemyUnit.getHealth() <= 0) {
				System.out.println("An enemy has been defeated!");
				enemyUnit.setHealth(0);
				enemyUnit.setAlive(false);
			}
			System.out.println("The health of the enemy unit number " + enemyUnit.getUnitId() + " now is: "
					+ enemyUnit.getHealth());
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("The enemy unit " + enemyUnit.getUnitId() + " is dead so you can't attack it.");
			System.out.println("---------------------------------------------------------------");
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(force, name);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Leader other = (Leader) obj;
		return force == other.force && Objects.equals(name, other.name);
	}

	@Override
	public String toString() {
		return "Leader [name=" + name + ", force=" + force + ", health=" + health + ", stamina=" + stamina + ", unitId="
				+ unitId + ", isAlive=" + isAlive + ", side=" + side + "]";
	}

}
