package com.company.neibulei.NeiBuLei03;

public class Reception {
    // 定义接待员类：

    // 属性：接⼝Filter
    Filter f;
    // 提供基本的构造⽅法和

    public Reception() {
    }

    public Reception(Filter f) {
        this.f = f;
    }
// get⽅法，set⽅法

    public Filter getF() {
        return f;
    }

    public void setF(Filter f) {
        this.f = f;
    }

    // 成员⽅法：接待⽤⼾⽅法，
    // 设置⽤⼾类型。
    public void recept(User u) {
        if (u.getUserType() != null)
            return;
        if (f != null) {
            f.filterUser(u);
            return;
        } else {
            u.setUserType("A");
        }
    }
}
