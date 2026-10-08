#!/bin/bash
cd "$(dirname "$0")"
out=$(mktemp -d)
trap 'rm -rf "$out"' EXIT
PS3="Выберите part: "
select part in "part 1" "part 2"; do
    case $part in
        "part 1") main=app.Main ;;
        "part 2") main=app.TestCar ;;
        *) continue ;;
    esac
    javac -d "$out" "$part"/src/vehicles/*.java "$part"/src/app/*.java && java -cp "$out" "$main"
    break
done
