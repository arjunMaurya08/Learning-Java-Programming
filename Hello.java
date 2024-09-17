public class Hello {

    public static void name(){
        System.out.println("Arjun");
        System.out.println("Karan");
    }

    public static void main(String[] args){
        int a = 100;
        int b = 200;
        int c = a+b;

        System.out.println(c+a);

        if (c == 300){
            System.out.println("The value is 300.");
            System.out.println("Congo...");

        }else{
            System.out.println("The value is not 300.");
            System.out.println("Please try again!");
        }

        float d = 10;
        System.out.println(d);

        if (d == 10.0){
            System.out.println("Yes!");
        }

        int[] array = new int[5];
        array[0] = 10;
        array[1] = 20;
        array[2] = 30;
        array[3] = 40;
        array[4] = 50;
        System.out.println(array[2]);


    }

}
