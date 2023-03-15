package br.com.factory.monsterAbstractFactory.simpleFactory.services;

import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.AbstractEquipmentMonster;

public class LevelTwo extends Monster {

    public LevelTwo(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    public String getLevel() {
        return "LevelTwo";
    }
}
