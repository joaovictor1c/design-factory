package br.com.factory.monsterFactoryMethod.manyFactory.factory;

import br.com.factory.monsterFactoryMethod.manyFactory.services.LevelTwo;
import br.com.factory.monsterFactoryMethod.manyFactory.services.Monster;

public class MonsterLevelTwoFactory extends MonsterFactory {

    @Override
    public Monster createMonster() {
        return new LevelTwo();
    }
}
