public class OOPS {
    public static void main(String[] args) {
        Pen p1 = new Pen(); 
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.setColor("Yellow");
        System.out.println(p1.color);


        BankAccount myAcc = new BankAccount();
        myAcc.username = " ParthChaitanya";
        myAcc.password = "abcdefghi";
    }

}


class BankAccount {
    public String username;
    private String password;
    public void setPassword(String pwd) {
        password = pwd;
    }
}
class Pen {
    String color;
    int tip;
    void setColor(String newColor) {
        color = newColor;
    }
    void setTip(int newTip) {
        tip = newTip;
    }
}
class Student {
    String name;
    int age;
    float cgpa;

    void calPercentage(int phy, int chem, int math) {
        float percentage = (phy + chem + math) / 3;
    }
}

