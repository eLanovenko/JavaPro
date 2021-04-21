package homework2a;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args)  {
        AnnotationClass test = new AnnotationClass();
        Class<?> cls = test.getClass();

        System.out.println(cls);
        Method[] methods = cls.getDeclaredMethods();
            for (Method myMethod : methods) {

                if (myMethod.isAnnotationPresent(MyAnnotation.class)) {
                    MyAnnotation param = myMethod.getAnnotation(MyAnnotation.class);
                    int a = param.a();
                    int b = param.b();
                    System.out.println(a);
                    System.out.println(b);
                    try {
                        System.out.println("Method " +myMethod.getName()+" = "+ myMethod.invoke(null, a, b));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
