
public class MainProgram {

    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);
        for(int i=0;i<3;i++){
            counter.printValue();
            counter.decrement();
        }
    }
}
