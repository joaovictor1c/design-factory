package br.com.factory.monsterAbstractFactory.manyFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.manyFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.manyFactory.services.weapon.Weapon;

public interface AbstractEquipmentMonster {

    Armor getArmor();

    Weapon getWeapon();
}
