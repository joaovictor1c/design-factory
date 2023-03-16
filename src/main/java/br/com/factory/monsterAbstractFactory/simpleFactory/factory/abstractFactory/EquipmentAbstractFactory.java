package br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.Helmet;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.Shield;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Axe;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Hammer;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Weapon;

public class EquipmentAbstractFactory implements AbstractEquipmentMonster {

    private final String weaponName;

    private final String armorName;

    public EquipmentAbstractFactory(String armorName, String weaponName) {
        this.armorName = armorName;
        this.weaponName = weaponName;
    }

    @Override
    public Armor getArmor() {
        if (armorName.equals("Helmet")) {
            return new Helmet();
        }
        return new Shield();
    }

    @Override
    public Weapon getWeapon() {
        if (weaponName.equals("Axe")) {
            return new Axe();
        }
        return new Hammer();
    }
}
