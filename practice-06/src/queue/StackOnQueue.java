package queue;

import java.util.LinkedList;
import java.util.Queue;

// Стек из двух очередей FIFO (задача №1).
// В q1 элементы лежат в порядке стека: первым стоит элемент с вершины.
// Поэтому pop, top и empty просто берут первый элемент q1.
public class StackOnQueue {

    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    // Кладём новый элемент в q2, затем перегоняем в q2 всю q1.
    // Теперь новый элемент стоит первым, то есть на вершине стека.
    // Осталось поменять очереди местами.
    public void push(int x) {
        q2.add(x);
        while (!q1.isEmpty()) {
            q2.add(q1.poll());
        }
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
    }

    // Убираем первый элемент q1 и возвращаем его.
    public int pop() {
        return q1.poll();
    }

    // Просто смотрим первый элемент q1, не убирая его.
    public int top() {
        return q1.peek();
    }

    public boolean empty() {
        return q1.isEmpty();
    }

    // Строка со всеми элементами сверху вниз.
    // Каждый элемент убираем из очереди и сразу возвращаем обратно,
    // так очередь остаётся на месте.
    public String toString() {
        String result = "";
        int size = q1.size();
        for (int i = 0; i < size; i++) {
            int x = q1.poll();
            result = result + x + " ";
            q1.add(x);
        }
        return result;
    }
}
