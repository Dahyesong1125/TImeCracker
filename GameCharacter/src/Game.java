import characters.*;

import java.util.ArrayList;
import java.util.List;

public class Game {
    public static void main(String[] args) {
        List<Knight> knights = new ArrayList<>();
        List<Archer> archers = new ArrayList<>();
        List<Shuttle> shuttles = new ArrayList<>();
        List<Griffin> griffins = new ArrayList<>();

        // 16명의 기사와 궁수, 4명의 셔틀, 5명의 그리핀 창조
        for (int i = 1; i <= 16; i++) {
            knights.add(new Knight("Knight" + i, 0, 0));
            archers.add(new Archer("Archer" + i, 0, 0));
        }
        for (int i = 1; i <= 4; i++) {
            shuttles.add(new Shuttle("Shuttle" + i, 0, 0));
        }
        for (int i = 1; i <= 5; i++) {
            griffins.add(new Griffin("Griffin" + i, 0, 0));
        }

        // 기사와 궁수를 셔틀에 태우기
        for (int i = 0; i < 16; i++) {
            shuttles.get(i % 4).board(knights.get(i));
            shuttles.get(i % 4).board(archers.get(i));
        }

        // 모든 문자를 지정된 위치로 이동
        for (Shuttle shuttle : shuttles) {
            shuttle.moveTo(10, 10);
        }
        for (Griffin griffin : griffins) {
            griffin.moveTo(10, 10);
        }

        // 셔틀에서 모든 캐릭터 하차
        for (Shuttle shuttle : shuttles) {
            shuttle.disembarkAll();
        }

        // 공격 수행
        Knight knight = knights.get(0);
        Archer archer = archers.get(0);
        Griffin griffin = griffins.get(0);

        knight.attack(knights.get(1));
        knight.attack(archers.get(1));
        knight.attack(griffins.get(0));
        knight.attack(shuttles.get(0));

        archer.attack(archers.get(1));
        archer.attack(knights.get(1));
        archer.attack(griffins.get(0));
        archer.attack(shuttles.get(0));

        griffin.attack(griffins.get(1));
        griffin.attack(archers.get(1));
        griffin.attack(knights.get(1));
        griffin.attack(shuttles.get(0));
    }
}
