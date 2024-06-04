package characters;

import java.util.ArrayList;
import java.util.List;

public class Shuttle extends Character {
    private List<Character> passengers;

    public Shuttle(String name, int x, int y) {
        super(name, x, y);
        this.passengers = new ArrayList<>();
    }

    @Override
    public void moveTo(int x, int y) {
        super.moveTo(x, y);
        System.out.println(name + "가 날아서 이동합니다.");
    }

    public void board(Character character) {
        if (passengers.size() < 8) {
            passengers.add(character);
            System.out.printf("%s가 %s에 탑승합니다.\n", character.name, name);
        } else {
            System.out.println("셔틀이 가득 찼습니다.");
        }
    }

    public void disembarkAll() {
        for (Character passenger : passengers) {
            System.out.printf("%s가 %s에서 내립니다.\n", passenger.name, name);
        }
        passengers.clear();
    }

    @Override
    public void attack(Character target) {
        // Shuttle cannot attack
    }
}
