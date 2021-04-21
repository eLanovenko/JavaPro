package homeWork2b;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        TextContainer container = new TextContainer();
        Class<?> cls = container.getClass();
        if(cls.isAnnotationPresent(SaveToFile.class)){
            SaveToFile saveToFile = cls.getAnnotation(SaveToFile.class);
            String path = saveToFile.path();
            Method [] methods = cls.getDeclaredMethods();
            for(Method m:methods){
                if(m.isAnnotationPresent(Saver.class)){
                    try {
                        m.invoke(container,path);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    } catch (InvocationTargetException e) {
                        e.printStackTrace();
                    }
                } System.out.println("Done!");
            }
        }
    }
}
