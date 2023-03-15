package br.com.factory.monsterAbstractFactory.simpleFactory.factory;

import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.AbstractEquipmentMonster;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.LevelOne;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.LevelThree;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.LevelTwo;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.Monster;

public class MonsterFactory {

    AbstractEquipmentMonster equipmentMonster;

    public MonsterFactory(AbstractEquipmentMonster equipmentMonster) {
        this.equipmentMonster = equipmentMonster;
    }

    public Monster factoryMonster(String level) {

        return switch (level) {
            case "two" -> new LevelTwo(equipmentMonster);
            case "three" -> new LevelThree(equipmentMonster);
            default -> new LevelOne(equipmentMonster);
        };

    }

}
