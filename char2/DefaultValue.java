public class DefaultValue {
    public static void main(String[] args) {
        boolean b;
        // System.out.println(b); b没有赋值，不能通过编译
        // 可以说主类型的默认值已经失去意义，因为你必须初始化
        b = false;
        System.out.println(b ? "true" : "false");
        // 但是如果你是定义在类里面的属性，那么初始化这个类之后，默认值是有意义的。
        /* 
            boolean false
            char '\u0000' (null)
            byte (byte)0
            short (short)0
            int 0
            long 0L
            float 0.0f
            double 0.0d
        */
    }
}
