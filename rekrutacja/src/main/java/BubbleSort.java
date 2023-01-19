import java.util.List;

public class BubbleSort {
    public List<Comparable> sort(List<Comparable> input) {
        if (input == null) {
            throw new RuntimeException("Input cannot be null!!!");
        }
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < input.size() - 1; i++) {
                if (input.get(i) != null && input.get(i + 1) != null && input.get(i).compareTo(input.get(i + 1)) > 0) {
                    Comparable temp = input.get(i);
                    input.set(i, input.get(i + 1));
                    input.set(i + 1, temp);
                    swapped = true;
                } else if (input.get(i) == null && input.get(i + 1) != null) {
                    input.remove(i);
                    swapped = true;
                } else if (input.get(i) != null && input.get(i + 1) == null) {
                    input.remove(i + 1);
                    swapped = true;
                }
            }
        } while (swapped);
        return input;
    }
}
