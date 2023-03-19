//variable arguments VarArgs

public class Demo4 {
    private String num;

    //    public int sum (int a, int b) {
//        return (a+b);
//    }
//    public int sum(int x, int y, int z) {
//        return (x + y + z);
//    }
    public static void sum(float f, int... num)
    {
        int total = 0;
//        for (x=0; x<num.length; x++) {
//            total = total + num[x];
        for (int y: num)
        {
            total = total + y;
        }
        System.out.println("number of arguments: " + num.length);
        System.out.println(total+ f);
    }

    public static void main(String[] args) {
        sum((float) 0.12,2,4,5,6,7,2);
    }
}
