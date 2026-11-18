#!/bin/bash
cd "$(dirname "$0")" || exit 1
out=$(mktemp -d) || exit 1
trap 'rm -rf "$out"' EXIT
javac -encoding UTF-8 -d "$out" src/stack/*.java && java -cp "$out" stack.Main
