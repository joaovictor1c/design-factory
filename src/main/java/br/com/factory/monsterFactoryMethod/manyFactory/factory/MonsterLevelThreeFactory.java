package br.com.factory.monsterFactoryMethod.manyFactory.factory;

import br.com.factory.monsterFactoryMethod.manyFactory.services.LevelThree;
import br.com.factory.monsterFactoryMethod.manyFactory.services.Monster;

public class MonsterLevelThreeFactory  extends MonsterFactory {

    @Override
    public Monster createMonster() {
        return new LevelThree();
    }
}
