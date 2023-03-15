package br.com.factory.monsterAbstractFactory.simpleFactory.factory.abstractFactory;

import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.Armor;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.ChainMail;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.armor.Leather;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Axe;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Bow;
import br.com.factory.monsterAbstractFactory.simpleFactory.services.weapon.Weapon;

public class EquipmentAbstractFactory implements AbstractEquipmentMonster {

    private Armor armor;

    private Weapon weapon;

    private final String weaponName;

    private final String armorName;

    public EquipmentAbstractFactory(String armorName, String weaponName) {
        this.armorName = armorName;
        this.weaponName = weaponName;
    }

    @Override
    public Armor getArmor() {
        if (armorName.equals("ChainMail")) {
            return new ChainMail();
        }
        return new Leather();
    }

    @Override
    public Weapon getWeapon() {
        if (weaponName.equals("Axe")) {
            return new Axe();
        }
        return new Bow();
    }
}
