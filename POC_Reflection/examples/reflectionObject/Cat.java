package reflectionObject;

import reflectionObject.reflecton.OnCreated;

public class Cat implements Animal{

    @OnCreated
    public void setup(){
        System.out.println("setup");
    }
    @OnCreated //in case private method
    private void setup2(){
        System.out.println("setup2");
    }
    public void afterConstructor(){
        System.out.println("afterConstructor()");
    }
    @Override
    public void speak() {
        System.out.println("Miau");
    }
}
