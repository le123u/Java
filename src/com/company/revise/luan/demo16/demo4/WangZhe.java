package com.company.revise.luan.demo16.demo4;

public class WangZhe {
        private FaShuSkill faShuSkill;

    public FaShuSkill getFaShuSkill() {
        return faShuSkill;
    }

    public void setFaShuSkill(FaShuSkill faShuSkill) {
        this.faShuSkill = faShuSkill;
    }

    public void faShuSkillAttack(){
        System.out.println("开始发送法术攻击");
        faShuSkill.faShuAttack();
        System.out.println("技能释放完毕");
    }
}
