package br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.ChainMail;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Axe;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Weapon;

public class HeavyEquipmentAbstractFactory implements AbstractEquipmentMonster {
    @Override
    public Armor getArmor() {
        return new ChainMail();
    }

    @Override
    public Weapon getWeapon() {
        return new Axe();
    }
}
