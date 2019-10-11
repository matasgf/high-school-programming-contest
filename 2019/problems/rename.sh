#!/bin/sh
# first argument    - basename of files to be moved
# second arguments  - basename of destination files
if [ $# -ne 2 ]; then
    echo "Two arguments required."
    exit;
fi

for i in $1.*; do
    if [ -e "$i" ]; then
        mv "$i" "$2.${i##*.}"
        echo "$i to $2.${i##*.}";
    fi
done

