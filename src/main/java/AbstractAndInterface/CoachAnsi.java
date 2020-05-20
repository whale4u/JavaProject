package AbstractAndInterface;


abstract class Coach {
    public abstract void defend();
    public abstract void attack();
}

//CoachAnsi继承抽象类Coach必须要实现后者所有方法，否则只能也成为一个抽象类
public class CoachAnsi extends Coach {
    @Override
    public void defend() {
        System.out.println("防守赢得冠军");
    }

    @Override
    public void attack() {
        System.out.println("控球是把双刃剑");
    }

    public static void main(String[] args) {
        Coach Ansi = new CoachAnsi();
        Ansi.attack();
        Ansi.defend();
    }
}