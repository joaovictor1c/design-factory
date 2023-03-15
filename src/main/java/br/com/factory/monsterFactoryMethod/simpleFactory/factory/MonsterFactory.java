package br.com.factory.monsterFactoryMethod.simpleFactory.factory;

import br.com.factory.monsterFactoryMethod.simpleFactory.services.monster.LevelOne;
import br.com.factory.monsterFactoryMethod.simpleFactory.services.monster.LevelThree;
import br.com.factory.monsterFactoryMethod.simpleFactory.services.monster.LevelTwo;
import br.com.factory.monsterFactoryMethod.simpleFactory.services.monster.Monster;

public class MonsterFactory {

    public Monster factoryMonster(String level) {

        return switch (level) {
            case "two" -> new LevelTwo();
            case "three" -> new LevelThree();
            default -> new LevelOne();
        };

    }

}
