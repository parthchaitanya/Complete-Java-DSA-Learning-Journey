class TEST {
    static int marks;
    void set_marks (int marks) {
        this.marks = marks;   //Line 1
    }
}
public class Q9 {

    public static void main(String[] args) {
        TEST t = new TEST();
        t.set_marks(98);             //Line2
        System.out.println(TEST.marks);    //Line3
    }
}

// line 3 mei error isliye nhi aaya kyu ki pehli class mei static defined hae
// Line 1 mei pehla marks class ka hae or dusra (int marks) hae