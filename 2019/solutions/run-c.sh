#!/bin/bash
# USAGE: ./run-c.sh prob01 2

if [ ! -f $1.c ]; then
    echo "File Not Found [$1.c]"
else
    cc $1.c -o $1.binc
    echo "===== Program Output ====="
    ./$1.binc < ../problems/$1.in$2
    rm ./$1.binc
    echo "===== Expected Output ===="
    cat ../problems/$1.out$2
fi

