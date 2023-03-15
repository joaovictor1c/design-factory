package br.com.factory.monsterFactoryMethod.manyFactory;

import br.com.factory.monsterFactoryMethod.manyFactory.factory.MonsterFactory;
import br.com.factory.monsterFactoryMethod.manyFactory.factory.MonsterLevelOneFactory;
import br.com.factory.monsterFactoryMethod.manyFactory.factory.MonsterLevelTwoFactory;
import br.com.factory.monsterFactoryMethod.manyFactory.services.Monster;

public class MonsterApplication {
	
	public static void main(String[] args) {

		MonsterFactory monsterfactory = new MonsterLevelOneFactory();

		Monster monster = monsterfactory.createMonster();

		System.out.println(monster.getLevel());

		System.out.println(monster.life());

	}
}
