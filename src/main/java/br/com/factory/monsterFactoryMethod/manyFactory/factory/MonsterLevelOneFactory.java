package br.com.factory.monsterFactoryMethod.manyFactory.factory;

import br.com.factory.monsterFactoryMethod.manyFactory.services.LevelOne;
import br.com.factory.monsterFactoryMethod.manyFactory.services.Monster;

public class MonsterLevelOneFactory extends MonsterFactory {
    @Override
    public Monster createMonster() {
        return new LevelOne();
    }
}
