package br.com.factory.monsterAbstractFactory.manyFactory.factory;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;
import br.com.factory.monsterAbstractFactory.manyFactory.services.Monster;

public abstract class MonsterFactory {

    AbstractEquipmentMonster equipmentMonster;

    public MonsterFactory(AbstractEquipmentMonster equipmentMonster) {
        this.equipmentMonster = equipmentMonster;
    }

    public Monster factoryMonster() {

        return createMonster();
    }

    public abstract Monster createMonster();
}
