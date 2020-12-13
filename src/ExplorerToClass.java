import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ExplorerToClass {
    public static void outClassInfo(Class yourClass) {
        System.out.println("Class: " + yourClass.getName());
        outClassParents(yourClass);
        outClassConstructors(yourClass);
        outClassFields(yourClass);
        outClassMethods(yourClass);
    }

    private static void outClassMethods(Class yourClass) {
        System.out.println("---METHODS---");
        Method[] methods = yourClass.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }

    private static void outClassFields(Class yourClass) {
        System.out.println("---FIELDS---");
        Field[] fields = yourClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }
    }

    private static void outClassConstructors(Class yourClass) {
        System.out.println("---CONSTRUCTORS---");
        Constructor[] constructors = yourClass.getDeclaredConstructors();
        for (Constructor constructor : constructors) {
            System.out.print(constructor);
            System.out.println();
        }
    }

    private static void outClassParents(Class yourClass) {
        Class parent = yourClass.getSuperclass();
        if (parent != null) {
            System.out.println("Subclass: " + parent.getSimpleName());
            outClassParents(parent);
        }
    }
}
