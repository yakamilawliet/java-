package com.work;


public class Solution {
    public void sortLost(Lost[] LostArray) {
        for(int i = 1;i < LostArray.length;i++)
            for(int j = 0;j < LostArray.length-i;j++)
            {
                if (LostArray[j].year<LostArray[j+1].year)
                {
                    Lost temp = new Lost();
                    temp = LostArray[j+1];
                    LostArray[j+1] = LostArray[j];
                    LostArray[j] = temp;
                }
                if (LostArray[j].year==LostArray[j+1].year&&LostArray[j].month<LostArray[j+1].month)
                {
                    Lost temp = new Lost();
                    temp = LostArray[j+1];
                    LostArray[j+1] = LostArray[j];
                    LostArray[j] = temp;
                }
                if (LostArray[j].year==LostArray[j+1].year&&LostArray[j].month==LostArray[j+1].month&&LostArray[j].day<LostArray[j+1].day)
                {

                    Lost temp = new Lost();
                    temp = LostArray[j+1];
                    LostArray[j+1] = LostArray[j];
                    LostArray[j] = temp;
                }
            }
    }

    public Lost[] selectByKeyword(Lost[] LostArray, String keyword) {
        Lost[] jihe = new Lost[4];
        for(int i = 0;i < LostArray.length;i++)
        {
            if (LostArray[i].place.equals(keyword))
            {
                jihe[i] = LostArray[i];
            }
        }
        return jihe;
    }
}
