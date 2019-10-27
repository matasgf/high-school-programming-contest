#!/bin/bash
# USAGE: ./run-c.sh prob01 2

if [ ! -f $1.c ]; then
    echo "File Not Found [$1.c]"
else
    echo "===== Program Output ====="
    cc $1.c -o $1.binc
    INPUT=`./$1.binc < ../problems/$1.in$2`
    rm ./$1.binc
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

