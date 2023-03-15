package br.com.factory.monsterAbstractFactory.manyFactory.services;

import br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory.AbstractEquipmentMonster;

public abstract class Monster {

    AbstractEquipmentMonster equipmentMonster;

    public Monster(AbstractEquipmentMonster equipmentMonster) {
        this.equipmentMonster = equipmentMonster;
    }

    public String life() {
        return "Life";
    }

    public String getFullEquipment() {
        return String.format("Weapon is %s and Armor is %s", equipmentMonster.getWeapon().defineWeapon(), equipmentMonster.getArmor().defineArmor());
    }

    public abstract String getLevel();
}
