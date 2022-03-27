package rockDI.context.concretes;

import rockDI.annotation.Injection;
import rockDI.annotation.Node;
import rockDI.annotation.RockField;

import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Set;

public final class AnnotatedContext extends AbstractRockContext {

    public AnnotatedContext() {}


    @Override
    protected void findAllClassTypes() {
        super.types = reflections.getTypesAnnotatedWith(RockField.class);

        for (Class<?> type:super.types){
            if(!type.isInterface()){
                try {
                    super.instancesPoolWithType.putIfAbsent(type,type.getConstructor().newInstance());
                } catch (InstantiationException | NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }



    @Override
    protected void injectAllInstances() {
        for (Class<?> type:super.types){
            Arrays.stream(type.getDeclaredFields()).forEach((field)->{
                if(field.isAnnotationPresent(Injection.class)){
                    try {
                        //Burani metod icine alib recursive elemek lazimdi Cunki new Consumer isdeyerekTipi deyil instanceni isdiyir
                        field.setAccessible(true);
                        field.set(super.instancesPoolWithType.get(type),super.instancesPoolWithType.get(field.getType()));
                        field.setAccessible(false);
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            });
        }
    }

}
