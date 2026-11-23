package prototype;

// Паттерн Prototype (вариант №5).
// Общий контракт: любая фигура умеет создавать свою копию.
interface Shape extends Cloneable {
    Shape clone();
}
