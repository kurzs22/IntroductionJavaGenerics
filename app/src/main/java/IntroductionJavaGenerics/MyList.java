package IntroductionJavaGenerics;

import java.util.ArrayList;
import java.util.List;

public class MyList<T> {
    private List<T> items;

    public MyList() {
        this.items = new ArrayList<>();
    }

    public void add(T object) {
        this.items.add(object);
    }

    public T get(int index) {
        return this.items.get(index);
    }

    public T remove(int index) {
        return this.items.remove(index);
    }

    public boolean isEmpty() {
        return this.items.isEmpty();
    }

    public String toString() {
        String output = "[";
        for (int i = 0; i < items.size(); i++) {
            output += items.get(i).toString();
            if (i + 1 < items.size()) output += ",";
        }
        output += "]";
        return output;
    }
}
