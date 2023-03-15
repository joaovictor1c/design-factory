package br.com.factory.monsterAbstractFactory.simpleFactory;

import br.com.factory.monsterAbstractFactory.simpleFactory.factory.MonsterFactory;
import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.AbstractEquipmentMonster;
import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.EquipmentAbstractFactory;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.Monster;

public class MonsterApplication {
	
	public static void main(String[] args) {

		AbstractEquipmentMonster equipmentAbstractFactory = new EquipmentAbstractFactory("ChainMail", "Axe");

		MonsterFactory monsterfactory = new MonsterFactory(equipmentAbstractFactory);

		Monster monster = monsterfactory.factoryMonster("three");

		System.out.println(monster.getLevel());

		System.out.println(monster.life());

		System.out.println(monster.getFullEquipment());

	}
}
