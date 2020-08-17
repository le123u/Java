package com.company.revise.Day09.demo03;

public class Test {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();

        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuSkillAttact() {
                System.out.println("发射爱心");
            }

    });

        role.faShuSkillAttack();

        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuSkillAttact() {
                System.out.println("发射烤羊肉串");
            }
        });

        role.faShuSkillAttack();
    }
}
