class boxing {
    public static void main(String args[]) {
        Integer b = 10; // Autoboxing
        b += 15;
        int c = b; // Unboxing
        System.out.println("Autoboxed value: " + b);
        System.out.println("Unboxed value: " + c);
    }
}