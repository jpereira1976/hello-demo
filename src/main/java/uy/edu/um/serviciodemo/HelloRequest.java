package uy.edu.um.serviciodemo;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.Data;

import java.util.List;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = HelloRequest.class, name = "hello"),
        @JsonSubTypes.Type(value = ExtraHelloRequest.class, name = "extra")
})
@Data
public class HelloRequest {
    String firstName;
    String lastName;
    List<String> friends;
    SayHello sayHello;

    public String sayHello() {
        return String.format("%s %s ", firstName, lastName);
    }
}
