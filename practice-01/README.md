# Практическая работа №1

Знакомство с IntelliJ IDEA. Синтаксис Java, типы данных и арифметические выражения,
структуры выбора и циклы. Знакомство с ООП.

## Задания

- **BMI (пример из теории)** — `src/ComputeAndInterpretBMI.java`
  Считает и интерпретирует индекс массы тела по весу (кг) и росту (см).

- **Задача №1** — `src/YuanToRoubles.java`
  Конвертирует сумму из китайских юаней в рубли по курсу 11.91.

- **Задача №2** — `src/YuanToRoublesWithEnding.java`
  То же самое + структура выбора для правильного окончания слова «юань»
  в зависимости от последней цифры суммы.

- **ООП: Car** — `src/Car.java`, `src/Main.java`
  Класс `Car` с полями `model`, `license`, `color`, `year`, тремя конструкторами
  (полный, по умолчанию, частичный), геттерами/сеттерами, `toString()` и методом
  `getAge()`. `Main.java` демонстрирует создание объектов всеми конструкторами.

## Запуск

```fish
cd src
javac *.java
java ComputeAndInterpretBMI
java YuanToRoubles
java YuanToRoublesWithEnding
java Main
```
