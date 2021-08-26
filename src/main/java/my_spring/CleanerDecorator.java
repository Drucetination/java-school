package my_spring;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class CleanerDecorator implements Cleaner {
    private Cleaner wrappee;

    @Override
    public void clean() {
        wrappee.clean();
    }
}
