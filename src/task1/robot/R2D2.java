package task1.robot;

import task1.unit.Unit;

public final class R2D2 {
	int battery, fuel;
	
	private final int batteryCharge = 100; 								//final attribute
	private final static String phrase = "Beep Bloop Blop Bleep Boop";	//final static attribute
	static int FLAMETHROWER_DAMAGE;										//static attribute

	static {
		FLAMETHROWER_DAMAGE = 15;										//static block
	}

	public R2D2() {
		this.battery = 100;
		this.fuel = 100;
	}

	public void chargeBattery() {
		if(battery<100) {
			this.battery = batteryCharge;
			System.out.println("Charging...");
			System.out.println("Charging...");
			System.out.println("The battery is fully charged.");
			System.out.println("---------------------------------------------------------------");
		}else {
			System.out.println("The battery is fully charged.");
			System.out.println("---------------------------------------------------------------");
		}
	}
	
	public static void talk() {
		//static method
		System.out.println(phrase);
		System.out.println("---------------------------------------------------------------");
	}

	public final void useFlamethrower(Unit enemyUnit) {
		//final method
		if (enemyUnit.getHealth() > 0) {
			enemyUnit.setHealth(enemyUnit.getHealth() - FLAMETHROWER_DAMAGE);
			this.fuel -= 25;
			this.battery -= 25;
			System.out.println("R2D2 uses flamethrower and does " + FLAMETHROWER_DAMAGE + " damage to the enemy number: "
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
			System.out.println("---------------------------------------------------------------");
			System.out.println("The enemy unit " + enemyUnit.getUnitId() + " is dead so you can't attack it.");
		}
	}
	
}
