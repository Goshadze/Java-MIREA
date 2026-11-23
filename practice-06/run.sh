#!/bin/bash
cd "$(dirname "$0")" || exit 1
out=$(mktemp -d) || exit 1
trap 'rm -rf "$out"' EXIT
javac -encoding UTF-8 -d "$out" src/queue/*.java src/prototype/*.java || exit 1

# Выбор задания: можно передать цифрой (./run.sh 2),
# а без параметра покажется меню.
choice=$1
if [ -z "$choice" ]; then
    echo "Какое задание запустить?"
    echo "1 - Стек из двух очередей (задачи 1-2)"
    echo "2 - Prototype, клонирование фигур (вариант 5)"
    printf "Выбор: "
    read -r choice
fi

case $choice in
    1) java -cp "$out" queue.Main ;;
    2) java -cp "$out" prototype.PrototypeMain ;;
    *) echo "Нужно ввести 1 или 2"; exit 1 ;;
esac
