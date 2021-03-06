
import java.util.*;
public class TestUtil {
    public static void main(String[] args) {


        ArrayList arrayList=new ArrayList();
        LinkedList linkedList=new LinkedList();
        MyPoint myPoint1 = new MyPoint(1, 2);

        System.out.println("Estimated time for add(Object element) method of java.itil.ArrayList");
        long startTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            arrayList.add(myPoint1);
        }
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        System.out.println("Estimated time for add(Object element) method of java.itil.LinkedList, add at end");
        long startTime1 = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(myPoint1);
        }
        long estimatedTime1 = System.nanoTime() - startTime1;
        System.out.println(estimatedTime1);


        System.out.println("Estimated time for remove(int) method of java.itil.LinkedList");

        long startTime2 = System.nanoTime();
            linkedList.remove(5000);

        long estimatedTime2 = System.nanoTime() - startTime2;
        System.out.println(estimatedTime2);


        System.out.println("Estimated time for remove(int) method of java.itil.ArrayList");

        long startTime3 = System.nanoTime();
      arrayList .remove(5000);

        long estimatedTime3 = System.nanoTime() - startTime3;
        System.out.println(estimatedTime3);


        System.out.println("Estimated time for add(int, obj) method of java.itil.LinkedList");

        long startTime4 = System.nanoTime();
        linkedList.add(5000, myPoint1);

        long estimatedTime4= System.nanoTime() - startTime4;
        System.out.println(estimatedTime4);


        System.out.println("Estimated time for add(int,obj method of java.itil.ArrayList");

        long startTime5 = System.nanoTime();
        arrayList .add(5000,myPoint1);
        long estimatedTime5 = System.nanoTime() - startTime5;
        System.out.println(estimatedTime5);


    }
}
