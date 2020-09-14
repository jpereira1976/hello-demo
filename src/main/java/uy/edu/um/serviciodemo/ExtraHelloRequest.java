package uy.edu.um.serviciodemo;

import lombok.Data;

@Data
public class ExtraHelloRequest extends HelloRequest {
    String extra;

    @Override
    public String sayHello() {
        return super.sayHello() + " extra!!!";
    }
}
