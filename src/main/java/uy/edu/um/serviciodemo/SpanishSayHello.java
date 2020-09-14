package uy.edu.um.serviciodemo;

public class SpanishSayHello implements SayHello {
    @Override
    public String sayHello(String name) {
        return String.format("Hola %s!!!", name);
    }
}
