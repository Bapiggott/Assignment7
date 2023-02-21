package Sort;

public class Demo <T extends Number> {
    T t;

    public T getT() (
        return t;
    )

public static void main(String [] args){
    Demo<Float> demo = new Demo<>();
    Demo<Integer> demo2 = new Demo<>();
   // Demo<String> demo3 = new Demo<>();
    //Demo<Demo<Integer>> demo4 = new Demo<>();
}
}
