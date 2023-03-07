package com.company.def;

import java.util.ArrayList;

public class Questions {
    private static String title1 = "有一家超市，出售苹果和草莓。其中苹果 8 元/斤，草莓 13 元/斤。\n" +
            "现在顾客 A 在超市购买了若干斤苹果和草莓，需要计算一共多少钱？\n" +
            "请编写函数，对于 A 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。\n";
    private static String title2 = "超市增加了一种水果芒果，其定价为 20 元/斤。\n" +
            "现在顾客 B 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？\n" +
            "请编写函数，对于 B 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。\n";
    private static String title3 = "超市做促销活动，草莓限时打 8 折。\n" +
            "现在顾客 C 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？\n" +
            "请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。\n";

    private static String title4 = "促销活动效果明显，超市继续加大促销力度，购物满 100 减 10 块。\n" +
            "现在顾客 D 在超市购买了若干斤苹果、 草莓和芒果，需计算一共需要多少钱？\n" +
            "请编写函数，对于 C 购买的水果斤数 (水果斤数为大于等于 0 的整数)，计算并返回所购买商品的总价。\n";

    public static String getTitle(int index) {
        String title = "";
        switch (index) {
            case 1:
                title = title1;
                break;
            case 2:
                title = title2;
                break;
            case 3:
                title = title3;
                break;
            case 4:
                title = title4;
                break;
            default:
                break;
        }
        return title;
    }
}
