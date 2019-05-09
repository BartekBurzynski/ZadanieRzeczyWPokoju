public class ThingTest {
    public static void main(String[] args) {

        Thing thing1 = new Thing("poduszka", 20, "kwadrat");

        Thing thing2 = new Thing("komputer",30,"prostokat");

        System.out.println(thing1.name );
        System.out.println(thing1.length );
        System.out.println(thing1.shape );
        System.out.println(thing2.name );
        System.out.println(thing2.length );
        System.out.println(thing2.shape );

    }}
