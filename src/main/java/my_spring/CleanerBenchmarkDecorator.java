package my_spring;

public class CleanerBenchmarkDecorator extends CleanerDecorator {

    public CleanerBenchmarkDecorator(Cleaner cleaner) {
        super(cleaner);
    }

    @Override
    public void clean() {
        long start = System.nanoTime();
        super.clean();
        long finish = System.nanoTime();
        System.out.println("Время работы: " + (finish - start));
    }
}
