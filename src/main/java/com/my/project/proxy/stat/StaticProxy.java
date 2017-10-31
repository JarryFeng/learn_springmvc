package com.my.project.proxy.stat;

import javax.sound.midi.Soundbank;

/**
 * Created by jarry on 2017/10/30.
 */
public class StaticProxy {

    private Girl girl;

    public StaticProxy(Girl girl) {
        this.girl = girl;
    }

    public void meeting(int length, int money){
        if(money < 100){
            System.out.println("100块都不给,你还行找我们苍老师玩？");
            return ;
        }
        girl.papapa(length);
    }
}
