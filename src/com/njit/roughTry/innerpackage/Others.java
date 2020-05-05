package com.njit.roughTry.innerpackage;

public class Others {
    private Father father;

    public Others(){
        father = new Father();
    }

    public Father getFather() {
        return father;
    }

    public void setFather(Father father) {
        this.father = father;
    }

    public static void main(String[] args) {
        Father father = new Others().getFather();
        //同包一般类，除了private其他都行
    }
}
