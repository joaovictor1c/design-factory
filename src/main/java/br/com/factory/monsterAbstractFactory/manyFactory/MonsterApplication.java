package br.com.factory.monsterAbstractFactory.manyFactory;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.MonsterFactory;
import br.com.factory.monsterAbstractFactory.manyFactory.factory.MonsterLevelOneFactory;
import br.com.factory.monsterAbstractFactory.manyFactory.factory.MonsterLevelTwoFactory;
import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.HeavyEquipmentAbstractFactory;
import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.LightEquipmentAbstractFactory;
import br.com.factory.monsterAbstractFactory.manyFactory.services.Monster;

public class MonsterApplication {
	
	public static void main(String[] args) {


		HeavyEquipmentAbstractFactory heavyEquipmentAbstractFactory = new HeavyEquipmentAbstractFactory();

		LightEquipmentAbstractFactory lightEquipmentAbstractFactory = new LightEquipmentAbstractFactory();

		MonsterFactory monsterfactory = new MonsterLevelOneFactory(lightEquipmentAbstractFactory);

		Monster monster = monsterfactory.createMonster();

		System.out.println(monster.getLevel());

		System.out.println(monster.life());

		System.out.println(monster.getFullEquipment());

	}
}
