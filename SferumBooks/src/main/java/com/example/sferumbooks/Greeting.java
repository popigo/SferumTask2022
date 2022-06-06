package com.example.sferumbooks;

public class Greeting {
    private long id = 0;
    private String name = "Учебник по математике 1 класс, 1 курс студентов СПО";
    private long price = 0;
    private long amount = 13;

    public Greeting(long id, String name) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getPrice() {
        return price;
    }

    public long getAmount() {
        return amount;
    }
}
