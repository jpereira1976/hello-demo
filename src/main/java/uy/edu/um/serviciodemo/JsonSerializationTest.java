package uy.edu.um.serviciodemo;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class JsonSerializationTest {

    public static void main(String[] args) throws Exception {
        ExtraHelloRequest extraHelloRequest = new ExtraHelloRequest();
        extraHelloRequest.setExtra("valor extra!!!");
        extraHelloRequest.setFirstName("Julio");
        extraHelloRequest.setLastName("Perez");
        extraHelloRequest.setFriends(Arrays.asList(new String[] {"Juan", "Luis", "Alejandra"}));
        extraHelloRequest.setSayHello(new SpanishSayHello());

        ObjectMapper mapper = new ObjectMapper();
        String json = mapper.writeValueAsString(extraHelloRequest);
        System.out.println(json);

        HelloRequest request = mapper.readValue(json, HelloRequest.class);

        System.out.println(request);
    }
}
