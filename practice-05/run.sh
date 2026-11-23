#!/bin/bash
cd "$(dirname "$0")" || exit 1
out=$(mktemp -d) || exit 1
trap 'rm -rf "$out"' EXIT
javac -encoding UTF-8 -d "$out" src/generics/*.java src/genericstack/*.java src/mystack/*.java || exit 1

choice=$1
if [ -z "$choice" ]; then
    echo "Какое задание запустить?"
    echo "1 - Алгоритмы: повторы, поиск, максимум (задание 1)"
    echo "2 - GenericStack: массив и наследование (задание 2)"
    echo "3 - MyStack: композиция, наследование, клон (часть 2)"
    printf "Выбор: "
    read -r choice
fi

case $choice in
    1) java -cp "$out" generics.Main ;;
    2) java -cp "$out" genericstack.Main ;;
    3) java -cp "$out" mystack.Main ;;
    *) echo "Нужно ввести 1, 2 или 3"; exit 1 ;;
esac
