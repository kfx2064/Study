package ch09.part01.main1;

public class MemberVo extends DefaultVo {

    @Desc(name = "회원아이디")
    private String memberId;

    @Desc(name = "회원명")
    private String memberName;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }
}
