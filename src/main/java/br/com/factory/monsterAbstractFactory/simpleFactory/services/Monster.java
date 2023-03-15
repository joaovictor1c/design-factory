package br.com.factory.monsterAbstractFactory.simpleFactory.services;

import br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory.AbstractEquipmentMonster;

public abstract class Monster {

    AbstractEquipmentMonster equipmentMonster;

    public Monster(AbstractEquipmentMonster equipmentMonster) {
        this.equipmentMonster = equipmentMonster;
    }

    public String life() {
        return "life";
    }

    public abstract String getLevel();

    public String getFullEquipment() {
        return String.format("Weapon is %s and Armor is %s",
                equipmentMonster.getWeapon().defineWeapon(),
                equipmentMonster.getArmor().defineArmor());
    }
}
