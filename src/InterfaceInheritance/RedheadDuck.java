package InterfaceInheritance;

public class RedheadDuck extends Duck implements Flyable, Quackable{    // Подключаем нужные нам интерфейсы
    @Override
    public void fly() {
        System.out.println("fly");
    }

    @Override
    public void quack() {
        System.out.println("quack");
    }
}
