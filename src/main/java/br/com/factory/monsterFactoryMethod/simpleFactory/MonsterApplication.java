package br.com.factory.monsterFactoryMethod.simpleFactory;

import br.com.factory.monsterFactoryMethod.simpleFactory.factory.MonsterFactory;
import br.com.factory.monsterFactoryMethod.simpleFactory.services.monster.Monster;

public class MonsterApplication {
	
	public static void main(String[] args) {

		MonsterFactory monsterfactory = new MonsterFactory();

		Monster monster = monsterfactory.factoryMonster("three");

		System.out.println(monster.getLevel());
		System.out.println(monster.life());

	}
}
