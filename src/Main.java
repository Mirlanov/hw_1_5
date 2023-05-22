public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(50);
        boss.setProtection("Physical");
        System.out.println("boss health: " + boss.getHealth() + " boss damage: " + boss.getHealth() + " boss protection: " + boss.getProtection());
    }
}




