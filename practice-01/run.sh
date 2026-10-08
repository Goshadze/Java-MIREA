#!/bin/bash
cd "$(dirname "$0")/src"
out=$(mktemp -d)
trap 'rm -rf "$out"' EXIT
PS3="Выберите программу: "
select item in "task 1 and 2: YuanToRoubles" "task 1 and 2: YuanToRoublesEnding" "task 3 and 4: Main"; do
    [ -n "$item" ] || continue
    dir=${item%%:*}
    main=${item##*: }
    javac -d "$out" "$dir"/*.java && java -cp "$out" "$main"
    break
done
