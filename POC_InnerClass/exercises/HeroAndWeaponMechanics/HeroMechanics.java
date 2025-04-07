package HeroAndWeaponMechanics;

public class HeroMechanics {
    public static void main(String[] args) {
        Hero hero =  new Hero(20);
        Hero.Weapon weapon = hero.new Weapon();

        weapon.shoot();
        weapon.shoot();
        weapon.shoot();


        System.out.println(hero.getAmmunition());
    }
}
