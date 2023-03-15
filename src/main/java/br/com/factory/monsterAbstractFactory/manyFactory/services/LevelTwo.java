package br.com.factory.monsterAbstractFactory.manyFactory.services;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;

public class LevelTwo extends Monster {

    public LevelTwo(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    public String getLevel() {
        return "LevelTwo";
    }
}
