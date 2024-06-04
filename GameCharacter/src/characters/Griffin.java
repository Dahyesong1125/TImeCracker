package characters;

public class Griffin extends Character {
    public Griffin(String name, int x, int y) {
        super(name, x, y);
    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
        System.out.println(name + "가 날아서 이동합니다.");
    }

    @Override
    public void attack(Character target) {
        if (target instanceof Griffin || target instanceof Shuttle) {
            System.out.printf("%s를 공격할 수 없습니다. (공중 유닛)\n", target.name);
        } else {
            System.out.printf("%s가 %s에게 번개를 내리칩니다.\n", name, target.name);
        }
    }
}
