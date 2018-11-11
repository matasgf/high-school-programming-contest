#!/bin/bash
# USAGE: ./run-cpp.sh prob01 2

if [ ! -f $1.cpp ]; then
    echo "File Not Found [$1.cpp]"
else
    c++ $1.cpp -o $1.bin
    echo "===== Program Output ====="
    ./$1.bin < ../problems/$1.in$2
    rm ./$1.bin
    echo "===== Expected Output ===="
    cat ../problems/$1.out$2
fi

