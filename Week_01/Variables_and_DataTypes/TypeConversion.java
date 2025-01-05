public class TypeConversion {
    public static void main(String[] args) {
        int intVal = 20;
        float floatVal = intVal;
        System.out.println(floatVal);

        // byte -> short -> int -> float -> long -> double

        byte byteVal = 24;
        int intVal2 = byteVal;  // some byte of data can loss 
        System.out.println(intVal2);
    }
}
