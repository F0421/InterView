package com.company.def;

public class PriceDef {
    private static int applePrice = 800;
    private static int strawberryPrice = 1300;
    private static int mangoPrice = 2000;

    public static int getPrice(String fruit) {
        int price = 0;
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
