package br.com.factory.monsterAbstractFactory.manyFactory.factory;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;
import br.com.factory.monsterAbstractFactory.manyFactory.services.LevelThree;
import br.com.factory.monsterAbstractFactory.manyFactory.services.Monster;

public class MonsterLevelThreeFactory  extends MonsterFactory {

    public MonsterLevelThreeFactory(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    @Override
    public Monster createMonster() {
        return new LevelThree(equipmentMonster);
    }
}
