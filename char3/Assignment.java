// 由于有包名，运行时需要：
// java char3.Assignment
// 并且需要在该包的上级目录运行该命令
package char3;

class Number {
    int i;
}

public class Assignment {
    public static void main(String[] args) {
        Number n1 = new Number();
        Number n2 = new Number();
        n1.i = 9;
        n2.i = 47;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1 = n2;         
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
        n1.i = 27;
        System.out.println("1: n1.i: " + n1.i + ", n2.i: " + n2.i);
    }
}

/* 
    不运行程序，猜想输出结果：
    1: n1.i: 9, n2.i 47
    1: n1.i: 47, n2.i 47
    1: n1.i: 27, n2.i 27
*/