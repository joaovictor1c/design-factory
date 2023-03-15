package br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.Leather;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Bow;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Weapon;

public class LightEquipmentAbstractFactory implements AbstractEquipmentMonster{
    @Override
    public Armor getArmor() {
        return new Leather();
    }

    @Override
    public Weapon getWeapon() {
        return new Bow();
    }
}
