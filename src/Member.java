import java.util.HashSet;

public class Member {
    private int memberId;
    private String memberName;

    public Member(int memberId, String memberName){
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId(){
        return memberId;
    }
    public void setMemberId(int memberID){
        this.memberId = memberId;
    }
    public String getMemberName(){
        return memberName;
    }
    public void setMemberNAme(String memberName){
        this.memberName = memberName;
    }

    @Override
    public String toString(){  //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는" + memberId + "입니다";
    }
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<String>();

        set.add("1. 홍길동");
        set.add("2. 홍길동");
        set.add("3. 홍길동");
        set.add("1. 홍길동");

        System.out.println(set);
    }

    //id를 기준으로 중복 객체인지 검사  => Member 클래스에 -> equals(), hashCode()를 overriding 해야 함.
    @Override
    public int hashCode(){
        return ((Integer ) memberId).hashCode();
    }
    @Override
    public boolean equals(Object obj){
        if(memberId == ((Member)obj).memberId){
            return true;
        }else {
            return false;
        }
    }
}