public class Arithmetics {
    int first;
    double second;

    public Arithmetics(){
        first = 2;
        second  = 3.14;
    }
    public double product() {
        return (first * second);
    }
    public void multiParameter(String ... names) {
        for (String name : names)  {
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        Arithmetics a1 = new Arithmetics();
        //a1.product();
        System.out.println(a1.product());

        Arithmetics a2 = new Arithmetics();
        a2.multiParameter("Oscar", "Muthomi", "Gatheru", "Who dis");

    }
}
