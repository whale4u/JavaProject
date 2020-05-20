package AbstractAndInterface;


interface CoachMan {
    // 隐式的public
    void defend();
    void attack();
}

interface Man {
    void fight();
}


public class CoachManAnsi implements CoachMan, Man{

    @Override
    public void defend() {
        System.out.println("防守赢得冠军");
    }

    @Override
    public void attack() {
        System.out.println("控球是把双刃剑");
    }

    @Override
    public void fight() {
        System.out.println("只要一息尚存，就应该战斗到最后");
    }

    public static void main(String[] args) {
        CoachManAnsi Ansi = new CoachManAnsi();
        Ansi.attack();
        Ansi.defend();
        Ansi.fight();
    }
}
