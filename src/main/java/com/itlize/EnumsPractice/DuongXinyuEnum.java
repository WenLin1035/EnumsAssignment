package com.itlize.EnumsPractice;

public enum DuongXinyuEnum {
    Xinyu("Hey, my name is Xinyu!"), Duong("Hey, my name is Duong!");
    String word;
    DuongXinyuEnum(String m){
        word = m;
    }
    String getCatchPhrase(){
        return word;
    }

    public boolean isDuong() {
        if((this.name()).equals("Duong")){
            return true;
        }
        return false;
    }

    public boolean isXinyu() {
        if((this.name()).equals("Xinyu")){
            return true;
        }
        return false;
    }
}
