public class MemModel {
    public static void main(String[] args) {
        // p1 本身在栈里面，是一个地址
        // 而它指向的Person 对象是堆里面的一个对象
        Person p1 = new Person();        
        p1.id = 111;
        new MemModel().changeId(p1);
        System.out.println(p1.id);

        // 基本类型都在栈里面
        int n1 = 333;
        // 只能改变新的栈里面的n1，对最后打印的n1没有影响
        new MemModel().changeNum(n1);
        System.out.println(n1);
    }

    public void changeId(Person p) {
        p.id = 222;
    }

    public void changeNum(int n) {
        n = 666;
    }
}

class Person {
    int id;
}

// 思考一下，输出应该是什么？
// 每个变量、对象是存在于堆还是栈？
// 由于 p1 在堆里面，传输的 p1 只是个指针一样的东西
// 于是， changeId 就改变了这个指针指向的对象

