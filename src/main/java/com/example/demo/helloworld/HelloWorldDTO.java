package com.example.demo.helloworld;

public class HelloWorldDTO {

    private String greeting;
    private Long id;

    public HelloWorldDTO(String greeting, Long id) {
        this.greeting = greeting;
        this.id = id;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
