package com.company;

import com.company.def.Questions;
import com.company.func.TestUtil;

import java.util.*;

public class Main {
    private static final Random rand = new Random();

    public static void main(String[] args) {
        System.out.println("题目：\n");
        for (int index = 1; index < 5; index++) {
            System.out.println("Q" + (index + 1) + "：" + Questions.getTitle(index));
        }

        Scanner scan = new Scanner(System.in);
        System.out.println("请选择模式：\n");
        System.out.println("自定义水果重量请输入'M'\n");
        System.out.println("自动生成测试用例请输入'A'\n");
        String type = scan.next();
        switch (type) {
            case "M":
                System.out.println("请输入苹果斤重：\n");
                int appleNum = scan.nextInt();
                System.out.println("请输入草莓斤重：\n");
                int strawberryNum = scan.nextInt();
                System.out.println("请输入芒果斤重：\n");
                int mangoNum = scan.nextInt();
                TestUtil.testAll(appleNum, strawberryNum, mangoNum);
                break;
            case "A":
                System.out.println("请输入生成测试用例数量：\n");
                int n = scan.nextInt();
                AutoTest(n);
                break;
            default:
                break;
        }
    }


    private static void AutoTest(int n) {
        for (int i = 0; i < n; i++) {
            int appleNum = rand.nextInt(10);
            int strawberryNum = rand.nextInt(10);
            int mangoNum = rand.nextInt(10);
            System.out.println(
                    "测试用例" + (i + 1) + ":\n" + "苹果:" + appleNum +
                            "斤，草莓：" + strawberryNum + "斤，芒果：" + mangoNum + "斤\n");
            TestUtil.testAll(appleNum, strawberryNum, mangoNum);
        }
    }

}


