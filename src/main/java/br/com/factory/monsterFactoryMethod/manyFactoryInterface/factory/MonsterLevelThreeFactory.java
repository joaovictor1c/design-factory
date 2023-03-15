package br.com.factory.monsterFactoryMethod.manyFactoryInterface.factory;

import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.LevelThree;
import br.com.factory.monsterFactoryMethod.manyFactoryInterface.services.Monster;

public class MonsterLevelThreeFactory  implements MonsterFactory {

    @Override
    public Monster createMonster() {
        return new LevelThree();
    }
}
