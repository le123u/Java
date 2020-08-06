package com.company.ceshi.Test06;

public class Test_FaShuSkill {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();
        // 设置角色的法术技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {

                System.out.println("发射爱心");
            }
        });

        // 发动法术攻击
        role.faShuSkillAttack();

        // 更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("发射烤羊肉串");
            }
        });
        role.faShuSkillAttack();
    }
}
