#!/bin/bash
# USAGE: ./run-cpp.sh prob01 2

if [ ! -f $1.cpp ]; then
    echo "File Not Found [$1.cpp]"
else
    echo "===== Program Output ====="
    c++ $1.cpp -o $1.bin
    INPUT=`./$1.bin < ../problems/$1.in$2`
    rm ./$1.bin
    echo $INPUT
    echo "===== Expected Output ===="
    OUTPUT=`cat ../problems/$1.out$2`
    echo $OUTPUT
    echo "===== STATUS ===="
    if [ "$OUTPUT" == "$INPUT" ]
    then
      echo "SUCCESS"
    else
      echo "FAILURE"
    fi
fi

