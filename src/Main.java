import strategy.MallardDuck;
import strategy.QryackDuck;
import strategy.RedheadDuck;

public class Main {

    /*
    План занятия
    1) Проблемы наследования
    2) Паттерн Стратегия
     */

    /*
    Наследование часто имеет побочные эффекты, поэтому необходимо использовать паттерны проектирования для
    реализации грамотной - гибкой архитектуры приложения.

    Стратегия - паттерн, который предназначен для инкапсуляции алгоритмов.

    Нужно искать изменяемые участки кода и выносить их в интерфейсы это повысит гибкость архитектуры(см. пакеты simpleinheritance
    и interfaceinheritance)

    Приложение для учета уток. Утки разные и могут появиться еще позже
    Проблема
    Система продолжает расширяться - появляются все новые и новые разновидности уток, необходимо обеспечить гибкую архитектуру для
    учета новых уток, чтобы их можно было безболезненно добавлять
     */

    public static void main(String[] args) {
        RedheadDuck redheadDuck = new RedheadDuck();
        redheadDuck.performQuack();
        redheadDuck.performFly();

        MallardDuck mallardDuck = new MallardDuck();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        QryackDuck qryackDuck = new QryackDuck();
        qryackDuck.performFly();
        qryackDuck.performQuack();
    }
}
