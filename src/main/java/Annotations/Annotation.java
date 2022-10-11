package Annotations;

import java.util.ArrayList;
import java.util.List;

public class Annotation {

    @Deprecated(since = "4.5", forRemoval = false)
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Object obj:list)
        {
            System.out.println(obj);
        }
    }

}
class  MyGeneric<T>{
    T obj;
    void add(T obj){
        this.obj = obj;
    }
    T getObj(){
        return obj;
    }
}

class GenericClassTester{
    public static void main(String[] args) {
        MyGeneric<String> myGeneric = new MyGeneric<>();
        myGeneric.add("Test String");

        MyGeneric<Integer> myGenericInt = new MyGeneric<>();
        myGenericInt.add(1);
    }
}



