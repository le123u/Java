package com.company.Day11.Day11_01.ClassNumber;

public class WangZheTest {
    public static void main(String[] args) {
        WangZheRole role = new WangZheRole();

        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("安其拉的羊肉串");
            }
        });

        // 法术攻击
        role.faShuSkillAttack();

        // 更换技能
        role.setFaShuSkill(new FaShuSkill() {
            @Override
            public void faShuAttack() {
                System.out.println("大乔叫你回家");
            }
        });
        // 法术攻击
        role.faShuSkillAttack();
    }
}
