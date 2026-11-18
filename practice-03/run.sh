#!/bin/bash
cd "$(dirname "$0")" || exit 1
out=$(mktemp -d) || exit 1
trap 'rm -rf "$out"' EXIT
PS3="Выберите part: "
select part in "part 1" "part 2"; do
    case $part in
        "part 1") main=app.TestCar ;;
        "part 2") main=bikeproject.BikeDriver ;;
        *) continue ;;
    esac
    javac -encoding UTF-8 -d "$out" "$part"/src/*/*.java && java -cp "$out" "$main"
    exit $?
done
