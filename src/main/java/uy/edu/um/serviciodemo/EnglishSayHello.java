package uy.edu.um.serviciodemo;

public class EnglishSayHello implements SayHello {

    @Override
    public String sayHello(String name) {
        return String.format("Hello %s!!!", name);
    }
}
