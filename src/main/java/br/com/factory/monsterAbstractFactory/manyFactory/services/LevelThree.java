package br.com.factory.monsterAbstractFactory.manyFactory.services;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;

public class LevelThree extends Monster {

    public LevelThree(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    public String getLevel() {
        return "levelThree";
    }
}
