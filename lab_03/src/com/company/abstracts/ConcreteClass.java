package com.company.abstracts;

public class ConcreteClass extends AbstractClass {
    public ConcreteClass(String name, String type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType() {
        return this.type + " from concrete class";
    }
}
