public class test {
    public static void main(String[] args) {
        int day = 6;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
            default:
                System.out.println("It is good");

                //Max value
                int a = 12, b = 24, c = 50, d = 66;
                int max = b;

                if (a > max) ;
                max = a;
                if (c > max) ;
                max = c;
                if (d > max) ;
                max = d;
                System.out.println("max is " + max);
                //Triangle
        }
        int side1 = 12;
        int side2 = 24;
        int side3 = 33;

        if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) ;
        System.out.println("Triangle");
    }
}
