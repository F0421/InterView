package com.company.def;

public class PriceDef {
    private static double applePrice = 800;
    private static double strawberryPrice = 1300;
    private static double mangoPrice = 2000;

    public static double getPrice(String fruit) {
        double price = 0;
        switch (fruit) {
            case "apple":
                price = applePrice;
                break;
            case "strawberry":
                price = strawberryPrice;
                break;
            case "mango":
                price = mangoPrice;
                break;
            default:
                break;
        }
        return price;
    }
}
