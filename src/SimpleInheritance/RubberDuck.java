package SimpleInheritance;

public class RubberDuck extends Duck{

    // Переопределяем ненужные методы, чтобы утра могла только плавать
    @Override
    public void quack(){

    }

    @Override
    public void fly(){

    }
}
