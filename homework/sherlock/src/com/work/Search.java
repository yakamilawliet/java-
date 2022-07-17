package com.work;

import java.util.Scanner;
public class Search {
    public static void main(String[] args) {
        Lost[] LostArray = new Lost[4];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i < LostArray.length;i++) {
            LostArray[i] = new Lost();
            System.out.println("请输入失物信息");
            LostArray[i].name = sc.nextLine();
            LostArray[i].place = sc.nextLine();
            LostArray[i].year = sc.nextInt();
            LostArray[i].month = sc.nextInt();
            LostArray[i].day = sc.nextInt();
        }
        String keyword = sc.nextLine();
        Solution test = new Solution();
        test.sortLost(LostArray);
        Lost[] result = new Lost[4];
        result = test.selectByKeyword(LostArray,keyword);
        for(int i = 0;i < LostArray.length;i++)
        {
            System.out.println(LostArray[i].name);
            System.out.println(LostArray[i].place);
            System.out.println(LostArray[i].year);
            System.out.println(LostArray[i].month);
            System.out.println(LostArray[i].day);
        }
        for(int i = 0;i < result.length;i++)
        {   if (result[i] == null)
            {
            break;
            }
            System.out.println(result[i].name);
            System.out.println(result[i].place);
            System.out.println(result[i].year);
            System.out.println(result[i].month);
            System.out.println(result[i].day);
        }
    }

}


