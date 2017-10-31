package com.my.project.proxy.stat;

/**
 * Created by jarry on 2017/10/30.
 */
public class TeacherCang implements Girl {

    //苍老师的啪的条件
    public void papapa(int length) {
        if (length > 15) {
            System.out.println("我就喜欢和这么长的人玩耍");
        } else {
            System.out.println("等你长大了在来吧");
        }
    }

    public void smoke() {
        System.out.println("事后一根烟快乐似神仙");
    }
}