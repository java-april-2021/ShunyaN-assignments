public class StringManipulatorTest {
    public static void main(String[] args) {
        StringManipulator manipulator = new StringManipulator();

        String str = manipulator.trimAndConcat(" Hello  ","  World ");
        System.out.println(str);

        char letter = 'i';
        Integer a = manipulator.getIndexOrNull("Coding", letter);
        Integer b = manipulator.getIndexOrNull("Hello World", letter);
        Integer c = manipulator.getIndexOrNull("Hi", letter);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        String word = "Hello";
        String subString = "llo";
        String notSubString = "world";
        Integer x = manipulator.getIndexOrNull(word, subString);
        Integer y = manipulator.getIndexOrNull(word, notSubString);
        System.out.println(x);
        System.out.println(y);

        String word2 = manipulator.concatSubstring("Hello", 1, 2, "world");
        System.out.println(word2);
    }
}