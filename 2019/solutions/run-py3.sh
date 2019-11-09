#!/bin/bash
# USAGE: ./run-py3.sh prob01 2

if [ ! -f $1.py3 ]; then
    echo "File Not Found [$1.py3]"
else
    echo "===== Program Output ====="
    INPUT=`python3 $1.py3 < ../problems/$1.in$2`
    echo "$INPUT"
    echo "===== Expected Output ===="
    OUTPUT=`cat ../problems/$1.out$2`
    echo "$OUTPUT"
    echo "===== STATUS ===="
    if [ "$OUTPUT" == "$INPUT" ]
    then
      echo "SUCCESS"
    else
      echo "FAILURE"
    fi
fi

