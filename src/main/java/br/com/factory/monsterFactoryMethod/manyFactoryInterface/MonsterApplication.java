package br.com.factory.monsterFactoryMethod.manyFactoryInterface;

import br.com.factory.monsterFactoryMethod.manyFactoryInterface.factory.MonsterFactory;
import br.com.factory.monsterFactoryMethod.manyFactoryInterface.factory.MonsterLevelOneFactory;
import br.com.factory.monsterFactoryMethod.manyFactoryInterface.factory.MonsterLevelTwoFactory;
import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.Monster;

public class MonsterApplication {
	
	public static void main(String[] args) {

		MonsterFactory monsterfactory = new MonsterLevelOneFactory();

		Monster monster = monsterfactory.createMonster();

		System.out.println(monster.getLevel());

	}
}
