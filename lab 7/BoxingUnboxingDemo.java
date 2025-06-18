public class BoxingUnboxingDemo {
    public static void main(String[] args) {
        // Autoboxing - converting primitive types to corresponding wrapper objects
        Byte byteObj = 100;
        Short shortObj = 1000;
        Integer intObj = 10000;
        Long longObj = 100000L;
        Float floatObj = 12.34F;
        Double doubleObj = 1234.56;
        Character charObj = 'A';
        Boolean boolObj = true;
        
        // Unboxing - converting wrapper objects to corresponding primitive types
        byte byteVal = byteObj;
        short shortVal = shortObj;
        int intVal = intObj;
        long longVal = longObj;
        float floatVal = floatObj;
        double doubleVal = doubleObj;
        char charVal = charObj;
        boolean boolVal = boolObj;

        // Displaying autoboxed values
        System.out.println("Autoboxed values:");
        System.out.println("Byte: " + byteObj);
        System.out.println("Short: " + shortObj);
        System.out.println("Integer: " + intObj);
        System.out.println("Long: " + longObj);
        System.out.println("Float: " + floatObj);
        System.out.println("Double: " + doubleObj);
        System.out.println("Character: " + charObj);
        System.out.println("Boolean: " + boolObj);

        // Displaying unboxed values
        System.out.println("\nUnboxed values:");
        System.out.println("byte: " + byteVal);
        System.out.println("short: " + shortVal);
        System.out.println("int: " + intVal);
        System.out.println("long: " + longVal);
        System.out.println("float: " + floatVal);
        System.out.println("double: " + doubleVal);
        System.out.println("char: " + charVal);
        System.out.println("boolean: " + boolVal);
    }
}
