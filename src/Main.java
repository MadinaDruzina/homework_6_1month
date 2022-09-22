public class Main {


    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setHit(50);
        boss.weapon.setNameOfWeapon("KNIFE");
        System.out.println(boss.getHealth() + " " + boss.getHit() + " " + boss.weapon.getNameOfWeapon());

    }
}
