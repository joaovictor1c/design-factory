package br.com.factory.monsterAbstractFactory.manyFactory.factory;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;
import br.com.factory.monsterAbstractFactory.manyFactory.services.LevelTwo;
import br.com.factory.monsterAbstractFactory.manyFactory.services.Monster;

public class MonsterLevelTwoFactory extends MonsterFactory {

    public MonsterLevelTwoFactory(AbstractEquipmentMonster equipmentMonster) {
        super(equipmentMonster);
    }

    @Override
    public Monster createMonster() {
        return new LevelTwo(equipmentMonster);
    }
}
