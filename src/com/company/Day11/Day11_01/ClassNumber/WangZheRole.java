package com.company.Day11.Day11_01.ClassNumber;

public class WangZheRole {
    FaShuSkill fs;

    public void setFaShuSkill(FaShuSkill fs) {
        this.fs = fs;
    }

    // 法术攻击
    public void faShuSkillAttack(){
        System.out.println("发动法术攻击");
        fs.faShuAttack();
        System.out.println("攻击完毕");
    }
}
