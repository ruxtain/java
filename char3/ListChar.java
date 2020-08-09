public class ListChar {
    public static void main(String[] args) {
        // 打印字符
        for (char c=0; c<128; c++) {
            if(c!=26) // ANSI CLEAR SCREEN
                System.out.println(
                    "Char #" + (int)c + ": " + c
                );
        }
    }
}
