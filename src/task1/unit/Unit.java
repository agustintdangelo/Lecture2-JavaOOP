package task1.unit;

import java.util.Objects;

public abstract class Unit {
	private static final int DAMAGE = 20;
	protected int health;
	protected int stamina;
	protected int unitId;
	protected boolean isAlive;
	protected String side;

	public Unit(int unitId) {
		this.health = 100;
		this.stamina = 100;
		this.unitId = unitId;
		this.isAlive = true;
	}

	public int getUnitId() {
		return unitId;
	}

	public void setUnitId(int soldierId) {
		this.unitId = soldierId;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getStamina() {
		return stamina;
	}

	public void setStamina(int stamina) {
		this.stamina = stamina;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public void attack(Unit enemyUnit) {
		if (enemyUnit.health > 0) {
			enemyUnit.health -= DAMAGE;
			this.stamina -= 10;
			System.out.println("The unit and does " + DAMAGE + " damage to the enemy number: " + enemyUnit.getUnitId());
			if (enemyUnit.health <= 0) {
				System.out.println("An enemy has been defeated!");
				enemyUnit.setHealth(0);
				enemyUnit.setAlive(false);
			}
			System.out.println("The health of the enemy unit number " + enemyUnit.getUnitId() + " now is: "
					+ enemyUnit.getHealth());
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("---------------------------------------------------------------");
			System.out.println("The enemy unit " + enemyUnit.unitId + " is dead so you can't attack it.");
		}
	}

	public void run() {
		if (this.stamina > 0) {
			this.stamina -= 20;
			System.out.println("The unit " + this.getUnitId() + " runs and the stamina goes down by 20 points.");
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("The unit " + this.getUnitId() + " doesn't have enough stamina");
			System.out.println("---------------------------------------------------------------");
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(health, isAlive, side, stamina, unitId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Unit other = (Unit) obj;
		return health == other.health && isAlive == other.isAlive && Objects.equals(side, other.side)
				&& stamina == other.stamina && unitId == other.unitId;
	}

	@Override
	public String toString() {
		return "Unit [health=" + health + ", stamina=" + stamina + ", unitId=" + unitId + ", isAlive=" + isAlive
				+ ", side=" + side + "]";
	}
}
