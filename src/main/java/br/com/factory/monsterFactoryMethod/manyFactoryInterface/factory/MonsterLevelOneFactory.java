package br.com.factory.monsterFactoryMethod.manyFactoryInterface.factory;

import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.LevelOne;
import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.Monster;

public class MonsterLevelOneFactory implements MonsterFactory {
    @Override
    public Monster createMonster() {
        return new LevelOne();
    }
}
