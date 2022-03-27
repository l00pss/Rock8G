package rockDI.context.concretes;

import org.reflections.Reflections;
import org.reflections.scanners.*;
import org.reflections.util.ClasspathHelper;

import java.util.Set;
import java.util.regex.Pattern;

public class BaseReflection {

    private volatile static Reflections reflections;


    private BaseReflection(){};

    public static Reflections getReflections() {
        if(reflections==null){
            synchronized (BaseReflection.class) {
                if (reflections == null) {
                    reflections = new Reflections(ClasspathHelper.forJavaClassPath(),new TypeAnnotationsScanner(),new SubTypesScanner(),new FieldAnnotationsScanner());
                }
            }
        }
        return reflections;
    }


    public static Set<String> getRockXmlPaths() {
        reflections = new Reflections(ClasspathHelper.forJavaClassPath(), Scanners.Resources);
        return reflections.getResources(Pattern.compile(".*rock\\.xml"));
    }
}
