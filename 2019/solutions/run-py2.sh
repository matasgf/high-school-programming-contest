#!/bin/bash
# USAGE: ./run-py2.sh prob01 2

if [ ! -f $1.py2 ]; then
    echo "File Not Found [$1.py2]"
else
    echo "===== Program Output ====="
    INPUT=`python2 $1.py2 < ../problems/$1.in$2`
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

