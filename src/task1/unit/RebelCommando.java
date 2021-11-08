package task1.unit;

public class RebelCommando extends Unit {

	public RebelCommando(int unitId) {
		super(unitId);
		this.health = 125;
		this.stamina = 125;
		this.side = "Alliance";
	}

	public void run() {
		if (this.stamina > 0) {
			this.stamina -= 10;
			System.out.println("The unit " + this.getUnitId() + " runs and the stamina goes down by 10 points.");
			System.out.println("---------------------------------------------------------------");
		} else {
			System.out.println("The unit " + this.getUnitId() + " doesn't have enough stamina");
			System.out.println("---------------------------------------------------------------");
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
		return "RebelCommando [health=" + health + ", stamina=" + stamina + ", unitId=" + unitId + ", isAlive="
				+ isAlive + ", side=" + side + "]";
	}

}
