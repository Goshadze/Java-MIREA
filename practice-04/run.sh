#!/bin/bash
cd "$(dirname "$0")" || exit 1
out=$(mktemp -d) || exit 1
trap 'rm -rf "$out"' EXIT
PS3="Выберите часть: "
select part in "Геометрические фигуры" "Месяцы и високосный год"; do
    case $REPLY in
        1) main=geometry.Main ;;
        2) main=months.Main ;;
        *) continue ;;
    esac
    javac -encoding UTF-8 -d "$out" src/geometry/*.java src/months/*.java && java -cp "$out" "$main"
    exit $?
done
