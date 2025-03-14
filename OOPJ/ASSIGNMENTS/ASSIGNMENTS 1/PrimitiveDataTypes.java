class PrimitiveDataTypes {
    // Instance variables (default values)
    byte defaultByte;
    short defaultShort;
    int defaultInt;
    long defaultLong;
    float defaultFloat;
    double defaultDouble;
    char defaultChar;
    boolean defaultBoolean;

    void printDefaultValues() {
        System.out.println("Default Values:");
        System.out.println("byte: " + defaultByte);
        System.out.println("short: " + defaultShort);
        System.out.println("int: " + defaultInt);
        System.out.println("long: " + defaultLong);
        System.out.println("float: " + defaultFloat);
        System.out.println("double: " + defaultDouble);
        System.out.println("char: [" + defaultChar + "]");
        System.out.println("boolean: " + defaultBoolean);
    }

    void printAssignedValues() {
        // Local variables (explicitly assigned values)
        byte assignedByte = 10;
        short assignedShort = 100;
        int assignedInt = 1000;
        long assignedLong = 10000L;
        float assignedFloat = 10.5f;
        double assignedDouble = 20.99;
        char assignedChar = 'A';
        boolean assignedBoolean = true;

        System.out.println("\nAssigned Values:");
        System.out.println("byte: " + assignedByte);
        System.out.println("short: " + assignedShort);
        System.out.println("int: " + assignedInt);
        System.out.println("long: " + assignedLong);
        System.out.println("float: " + assignedFloat);
        System.out.println("double: " + assignedDouble);
        System.out.println("char: " + assignedChar);
        System.out.println("boolean: " + assignedBoolean);
    }

    public static void main(String[] args) {
        PrimitiveDataTypes obj = new PrimitiveDataTypes();
        obj.printDefaultValues();
        obj.printAssignedValues();
    }
}
