package br.com.factory.monsterFactoryMethod.manyFactoryInterface.factory;

import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.LevelTwo;
import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.Monster;

public class MonsterLevelTwoFactory implements MonsterFactory {

    @Override
    public Monster createMonster() {
        return new LevelTwo();
    }
}
