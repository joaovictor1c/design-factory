package br.com.factory.monsterFactoryMethod.simpleFactoryInterface.factory;

import br.com.factory.monsterFactoryMethod.simpleFactoryInterface.services.LevelOne;
import br.com.factory.monsterFactoryMethod.simpleFactoryInterface.services.LevelThree;
import br.com.factory.monsterFactoryMethod.simpleFactoryInterface.services.LevelTwo;
import br.com.factory.monsterFactoryMethod.simpleFactoryInterface.services.Monster;

public class MonsterFactory {

    public Monster factoryMonster(String level) {

        return switch (level) {
            case "two" -> new LevelTwo();
            case "three" -> new LevelThree();
            default -> new LevelOne();
        };

    }

}
