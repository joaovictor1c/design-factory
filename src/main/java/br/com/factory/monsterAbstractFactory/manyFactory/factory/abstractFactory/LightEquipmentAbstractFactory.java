package br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.Shield;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Hammer;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Weapon;

public class LightEquipmentAbstractFactory implements AbstractEquipmentMonster{
    @Override
    public Armor getArmor() {
        return new Shield();
    }

    @Override
    public Weapon getWeapon() {
        return new Hammer();
    }
}
