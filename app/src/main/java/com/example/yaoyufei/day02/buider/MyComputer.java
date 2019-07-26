package com.example.yaoyufei.day02.buider;

public class MyComputer {
    private String name;
    private String color;
    private float price;

    //内部类
    public static class Buider {

        MyComputer myComputer;

        public Buider() {
            myComputer = new MyComputer();
        }

        public Buider color(String color){
            myComputer.setColor(color);
            return this;
        }

        public Buider name(String name){
            myComputer.setName(name);
            return this;
        }
        public Buider price(float price){
            myComputer.setPrice(price);
            return this;
        }

        public MyComputer buid() {
            return myComputer;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public MyComputer() {
        super();
    }

    @Override
    public String toString() {
        return "MyComputer{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}