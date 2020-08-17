package com.company.revise.Day09.demo03;

public class WangZheRole {

    private FaShuSkill faShuSkill;

    public FaShuSkill getFaShuSkill() {
        return faShuSkill;
    }

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }

    public void faShuSkillAttack(){
        System.out.println("开始发送法术攻击");
        faShuSkill.faShuSkillAttact();
        System.out.println("技能释放完毕");
    }
}
