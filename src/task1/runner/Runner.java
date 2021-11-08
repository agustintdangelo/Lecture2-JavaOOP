package task1.runner;

import java.util.ArrayList;
import java.util.List;

import task1.spaceArmy.Alliance;
import task1.spaceArmy.Empire;
import task1.unit.DemolitionRebel;
import task1.unit.DemolitionTrooper;
import task1.unit.Leader;
import task1.unit.RebelCommando;
import task1.unit.RebelTrooper;
import task1.unit.StormCommando;
import task1.unit.Stormtrooper;
import task1.unit.Unit;

public class Runner {
	public static void main(String[] args) {
		Unit soldierE1 = new Stormtrooper(1);
		Unit soldierE2 = new StormCommando(2);
		Unit soldierE3 = new DemolitionTrooper(3);
		List<Unit> unitsE = new ArrayList<>();
		unitsE.add(soldierE1);
		unitsE.add(soldierE2);
		unitsE.add(soldierE3);

		Leader darthVader = new Leader("Darth Vader", 400, 0, "Empire");

		Empire empire = new Empire(darthVader, unitsE, "Tatooine");

		Unit soldierR1 = new RebelTrooper(1);
		Unit soldierR2 = new RebelCommando(2);
		Unit soldierR3 = new DemolitionRebel(3);
		List<Unit> unitsR = new ArrayList<>();
		Leader lukeSkywalker = new Leader("Luke Skywalker", 600, 0, "Alliance");

		unitsR.add(soldierR1);
		unitsR.add(soldierR2);
		unitsR.add(soldierR3);

		Alliance alliance = new Alliance(lukeSkywalker, unitsR, "Tatooine");
		
		
		System.out.println("      ________________.  ___     .______\r\n"
				+ "     /                | /   \\    |   _  \\\r\n"
				+ "    |   (-----|  |----`/  ^  \\   |  |_)  |\r\n"
				+ "     \\   \\    |  |    /  /_\\  \\  |      /\r\n"
				+ ".-----)   |   |  |   /  _____  \\ |  |\\  \\-------.\r\n"
				+ "|________/    |__|  /__/     \\__\\| _| `.________|\r\n"
				+ " ____    __    ____  ___     .______    ________.\r\n"
				+ " \\   \\  /  \\  /   / /   \\    |   _  \\  /        |\r\n"
				+ "  \\   \\/    \\/   / /  ^  \\   |  |_)  ||   (-----`\r\n"
				+ "   \\            / /  /_\\  \\  |      /  \\   \\\r\n"
				+ "    \\    /\\    / /  _____  \\ |  |\\  \\---)   |\r\n"
				+ "     \\__/  \\__/ /__/     \\__\\|__| `._______/");
		System.out.println("---------------------------------------------------------------");

		System.out.println(empire); //use of toString
		System.out.println(alliance);
		
		System.out.println("---------------------------------------------------------------");
		alliance.attackEnemyUnitsWithUnits(empire);
		empire.travelToAnotherPlanet("Death Star");
		alliance.allUnitsRun();
		Unit soldierE4 = new Stormtrooper(4);
		empire.addUnit(soldierE4);

		lukeSkywalker.attack(soldierE3);
		lukeSkywalker.forceAttack(darthVader);
	
		
		System.out.println(lukeSkywalker.equals(darthVader)); //use of equals
		System.out.println(lukeSkywalker.hashCode());//use of hashcode
	}
}
