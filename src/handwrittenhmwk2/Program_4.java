package handwrittenhmwk2;
/**
 * Write a Java programme using the following steps.
 * 4.1 Declare two instance and two static variables.
 * 4.2 Declare one instance method.
 * 4.3 Declare one static method.
 * 4.4 Call all four instance and static variables into both instance and static methods inside the print statement.
 * 4.5 Declare the Main method.
 * 4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program_4 {
    //Declare twe instance and two static variables
    //instance variable
    String name ="Prime";
    String surname = "Testing";

    //static variable
    static boolean a = true;
    static boolean b = false;

    // Declare instance method
    public void instanceMethod(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(Program_4.a);
        System.out.println(Program_4.b);
    }
    //Declare one static method
    public static void staticMethod(){
        Program_4 program4 =new Program_4();
        System.out.println(program4.name);
        System.out.println(program4.surname);
        System.out.println(a);
        System.out.println(b);
    }
    //Declare main method
    public static void main(String[] args) {
        Program_4 program4 =new Program_4();
        program4.instanceMethod();
        staticMethod();
    }
}
