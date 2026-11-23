package queue;

// Тестовый класс для стека из двух очередей (задача №2).
public class Main {
    public static void main(String[] args) {

        // 1. Создаём новый экземпляр стека.
        StackOnQueue stack = new StackOnQueue();
        System.out.println("Стек создан, пустой? " + stack.empty());

        // 2. Добавляем в стек два значения.
        stack.push(10);
        stack.push(20);
        System.out.println("Добавили 10 и 20. Все элементы: " + stack);

        // 3. Выводим элемент с вершины без удаления.
        System.out.println("Вершина (без удаления): " + stack.top());

        // 4. Выводим элемент с вершины и удаляем его.
        System.out.println("Вершина (удаляем): " + stack.pop());

        // 5. Проверяем стек на пустоту.
        System.out.println("Стек пустой? " + stack.empty());

        // 6. Выводим информацию обо всех элементах стека.
        System.out.println("Остались элементы: " + stack);
    }
}
