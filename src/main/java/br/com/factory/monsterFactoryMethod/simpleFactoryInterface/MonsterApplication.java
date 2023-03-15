package br.com.factory.monsterFactoryMethod.simpleFactoryInterface;

import br.com.factory.monsterFactoryMethod.simpleFactoryInterface.factory.MonsterFactory;
import br.com.factory.monsterFactoryMethod.simpleFactoryInterface.services.Monster;

public class MonsterApplication {
	
	public static void main(String[] args) {

		MonsterFactory monsterfactory = new MonsterFactory();

		Monster monster = monsterfactory.factoryMonster("x");

		System.out.println(monster.getLevel());

	}
}
