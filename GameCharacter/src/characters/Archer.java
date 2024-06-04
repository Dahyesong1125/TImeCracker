package characters;

public class Archer extends Character {
    public Archer(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
        System.out.println(name + "가 걸어서 이동합니다.");
    }

    @Override
    public void attack(Character target) {
        System.out.printf("%s가 %s를 화살로 공격합니다.\n", name, target.name);
    }
}
