package com.company.Day12.Day12_01.redbag;

import com.company.Day12_01.redbag.utils.OpenMode;

import java.util.ArrayList;

public class NormalMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(final int totalMoney, final int totalCount) {
        ArrayList<Integer> list = new ArrayList<>();
        int avg = totalMoney / totalCount;
        int mod = totalMoney % totalCount;
        for (int i = 0; i < totalCount - 1; i++) {
            list.add(avg);

        }
        // 零头放在最后一个包中
        list.add(avg + mod);

        return list;
    }
}
