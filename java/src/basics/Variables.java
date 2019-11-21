package basics;

import java.util.ArrayList;
import java.util.Collection;

public class Variables {

    public static void main(String[] args) {
        Collection<Object> objects = new ArrayList<>();

        Integer valueInt = 99;
        Long valueLong = 99L;
        Double valueDouble = 99.0;
        Float valueFloat = 99f;

        objects.add(valueInt);
        objects.add(valueLong);
        objects.add(valueDouble);
        objects.add(valueFloat);

        objects.forEach( o -> printVariableInfo(o));
    }

    private static void printVariableInfo(Object o){
        System.out.println(String.format("Value: %s, meta: %s", o.toString(), o.getClass()));
    }

}
