package com.company.revise.luan.demo16.demo4;

public class Test {
    public static void main(String[] args) {
        WangZhe wangZhe = new WangZhe();


       wangZhe.setFaShuSkill( new FaShuSkill() {
           @Override
           public void faShuAttack() {
               System.out.println("发射爱心");
           }
       });

       wangZhe.faShuSkillAttack();
        wangZhe.setFaShuSkill( new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("烤羊肉串");
            }
        });

        wangZhe.faShuSkillAttack();



    }
}
