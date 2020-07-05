package ch07.part07.main1;

import javax.swing.*;

public class MemberView extends JFrame {

    public MemberView() {

        this.setSize(300, 300);

        MemberVo member1 = new MemberVo("a001", "강감찬");
        MemberVo member2 = new MemberVo("a002", "이순신");
        MemberVo member3 = new MemberVo("a003", "홍길동");

        TableGroup<MemberVo> tableGroup = new TableGroup<>(
                MemberVo.class
                , new MemberVo[]{member1, member2, member3}
                );

        this.add(tableGroup.getTablePanel());

        this.setVisible(true);

    }

    public static void main(String[] args) {
        new MemberView();
    }

}
