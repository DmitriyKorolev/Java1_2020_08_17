public class Variables {

    public static void main(String[] args) {

        int a = 5;
        // Integer a = 5;
        String hw = "Hello, World!";
        char t = '3';
        long b = 5_000_000_000L;

        float c = 0.5f;
        double d = 0.5;

        var v = 11L;
        System.out.println(((Object)v).getClass().getSimpleName());

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(hw);
        System.out.println(t);


    }
}
