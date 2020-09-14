package uy.edu.um.serviciodemo;


import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        include = JsonTypeInfo.As.PROPERTY,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = EnglishSayHello.class, name = "english"),
        @JsonSubTypes.Type(value = SpanishSayHello.class, name = "spanish")
})
public interface SayHello {

    String sayHello(String name);

}
