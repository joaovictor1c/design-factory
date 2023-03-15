package br.com.factory.monsterFactoryMethod.manyFactory.factory;

import br.com.factory.monsterFactoryMethod.manyFactory.services.Monster;

public abstract class MonsterFactory {

    public Monster factoryMonster() {
        return createMonster();
    }

    public abstract Monster createMonster();
}
