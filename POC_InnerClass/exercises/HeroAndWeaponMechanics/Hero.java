package HeroAndWeaponMechanics;

public class Hero {
    private int ammunition;

    public Hero(int ammunition) {
        this.ammunition = ammunition;
    }

    public int getAmmunition() {
        return ammunition;
    }

    public class Weapon {
        public void shoot(){
            ammunition--;
        }
    }
}
