public class TypePromotion {
    public static void main(String[] args) {

        byte byteVar = 5;

        // byteVar = byteVar * 10; //it will give error
        // error: incompatible types: possible lossy conversion from int to byte
        // because it is considering as a expressin and taking byteVar as a int (int is bigger then byte) that's why it is giving error.
        // System.out.println(byteVar);

        byteVar =(byte) (byteVar * 10); // We can use type casting for this
        System.out.println(byteVar);


        int a = 10;
        float b = 10.3f;
        double c = 23;
        long d = 35;

        // int ans = a + b + c + d; //This line will give error
        //error : Type mismatch: cannot convert from double to int
        //because this is considering as a expression and all sum is stored in double because the size of double is largest datatype then other data type that we are using here, so it is storing sum in double.

        double ans = a + b + c + d;
        System.out.println(ans);

        int $ = 23;
        System.out.println($);
    }
}