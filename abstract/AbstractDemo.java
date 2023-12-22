

public class AbstractDemo {
    public static void main(String[] args) {
        Student s1=new Student();
        Teacher t1=new Teacher();

        Member[] m1=new Member[4];
        m1[0]=new Student();
        m1[1]=new Student();
        m1[2]=new Teacher();
        m1[3]=new Teacher();

        for(Member m:m1){
            m.welcomeMessage();
        }
    }
}
