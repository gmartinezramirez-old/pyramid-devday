package com.devday.pokemon;

import au.com.dius.pact.consumer.Pact;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.model.RequestResponsePact;

import java.util.HashMap;

public class APIContractTests {

    /*
    @Pact(consumer = "test_consumer")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        Map<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");

        return builder
                .given("test GET")
                .uponReceiving("GET REQUEST")
                .path("/pact")
                .method("GET")
                .willRespondWith()
                .status(200)
                .headers(headers)
                .body("{\"condition\": true, \"name\": \"tom\"}");
    }
    */

}
