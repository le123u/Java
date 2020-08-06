package com.company.ceshi.Test06;

public class WangZheRole {

    // 接口作为成员变量
    private FaShuSkill faShuSkill;

    public FaShuSkill getFaShuSkill() {
        return faShuSkill;
    }

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }

    //发送法术攻击方法
    public void faShuSkillAttack(){
        System.out.println("开始发送法术攻击");
        faShuSkill.faShuAttack();
        System.out.println("攻击结束");
    }
}
