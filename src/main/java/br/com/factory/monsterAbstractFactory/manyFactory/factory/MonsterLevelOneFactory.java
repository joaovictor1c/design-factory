package br.com.factory.monsterAbstractFactory.manyFactory.factory;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;
import br.com.factory.monsterAbstractFactory.manyFactory.services.LevelOne;
import br.com.factory.monsterAbstractFactory.manyFactory.services.Monster;

public class MonsterLevelOneFactory extends MonsterFactory {

    public MonsterLevelOneFactory(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    @Override
    public Monster createMonster() {
        return new LevelOne(equipmentMonster);
    }
}
