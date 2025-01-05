public class TypeCasting {
    public static void main(String[] args) {
        // float floatVal = 3.14f;
        // int intVa1 = floatVal;  //Can not convert float to int
        // System.out.println(intVal);

        //we can do it forcefully by type casting.
        float floatVal = 3.14f;
        int intVal = (int) floatVal;
        System.out.println(intVal);

    }
}
