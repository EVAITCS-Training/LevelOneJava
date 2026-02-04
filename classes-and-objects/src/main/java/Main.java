import abstraction.BaseStat;
import methods.MethodExample;

public class Main {
    static void main() {
        Student student = new Student("Computer Science", "f4b6g5ds4fg65sdf673242fvdsf", "Matthew Martin", (byte)33);
        // This way of Assignment is a Bad Practice
        student.setFullName(student.getFullName().substring(8));
        System.out.println(student.getFullName());
        student.equals(student);
        // While you can
//        BaseStat baseStat = new BaseStat() {
//        };

        MethodExample methodExample = new MethodExample();
        methodExample.methodExample3();
        methodExample.methodExample4();
        MethodExample.methodExample4();
    }

    public static void proceedCombat(
            BaseStat attacker,
            BaseStat defender
    ) {
        if(attacker.getDex() > defender.getDex()) {
            attacker.attack(defender);
        }
    }
}
