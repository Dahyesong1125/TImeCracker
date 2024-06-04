package characters;

public abstract class Character {
    String name;
    int x, y;

    public Character(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.printf("%s가 (%d, %d)로 이동합니다.\n", name, x, y);
    }

    public abstract void attack(Character target);
}
