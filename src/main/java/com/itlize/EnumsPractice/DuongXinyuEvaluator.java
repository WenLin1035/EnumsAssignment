package com.itlize.EnumsPractice;

import static com.itlize.EnumsPractice.DuongXinyuEnum.Duong;
import static com.itlize.EnumsPractice.DuongXinyuEnum.Xinyu;

public class DuongXinyuEvaluator {
    String name;
    public DuongXinyuEvaluator(String input) {
        name = input;
    }

    public boolean isDuong() {
        if(name.equals(Duong.name())){
            return true;
        }
        return false;
    }

    public boolean isXinyu() {
        if(name.equals(Xinyu.name())){
            return true;
        }
        return false;
    }
}
