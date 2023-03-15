package br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Weapon;

public interface AbstractEquipmentMonster {

    Armor getArmor();

    Weapon getWeapon();
}
