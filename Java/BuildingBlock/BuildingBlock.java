package JavaConcurrency;

import java.util.Vector;

public class BuildingBlock {
    public static Object getlast(Vector list){
        synchronized (list){
            int  lastIndex=list.size()-1;
            return list.get(lastIndex);
        }
    }
    public static void deletelast(Vector list){
        synchronized (list){
            int lastIndex=list.size()-1;
            list.remove(lastIndex);
        }
    }
    public static void doSomething(Vector list){
        synchronized (list){
            for(int i=0;i<list.size();i++){
                // do something
            }
        }
    }
}
