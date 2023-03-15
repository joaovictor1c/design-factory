package br.com.factory.monsterAbstractFactory.simpleFactory.services;

import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.AbstractEquipmentMonster;

public class LevelThree extends Monster {

    public LevelThree(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    public String getLevel() {
        return "levelThree";
    }
}
