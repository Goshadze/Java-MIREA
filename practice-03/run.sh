#!/bin/bash
cd "$(dirname "$0")" || exit 1
out=$(mktemp -d) || exit 1
trap 'rm -rf "$out"' EXIT
PS3="Выберите часть: "
select option in "Автомобили" "Велосипеды"; do
    case $REPLY in
        1) part="part 1"; main=app.TestCar ;;
        2) part="part 2"; main=bikeproject.BikeDriver ;;
        *) continue ;;
    esac
    javac -encoding UTF-8 -d "$out" "$part"/src/*/*.java && java -cp "$out" "$main"
    exit $?
done
