package my_spring;

public class CleanerBenchmarkDecorator extends CleanerDecorator {

    public CleanerBenchmarkDecorator(Cleaner cleaner) {
        super(cleaner);
    }

    public void init() {
        System.out.println("отсчет пошел");
    }

    @Override
    public void clean() {
        long start = System.nanoTime();
        super.clean();
        long finish = System.nanoTime();
        System.out.println("Время работы: " + (finish - start));
    }
}
