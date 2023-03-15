package br.com.factory.monsterAbstractFactory.simpleFactory.services;

import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.AbstractEquipmentMonster;

public class LevelOne extends Monster {

    public LevelOne(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    public String getLevel() {
        return "levelOne";
    }
}
