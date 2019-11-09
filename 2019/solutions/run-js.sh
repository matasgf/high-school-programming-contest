#!/bin/bash
# USAGE: ./run-js.sh prob01 2

if [ ! -f $1.js ]; then
    echo "File Not Found [$1.js]"
else
    echo "===== Program Output ====="
    OUTPUT="$(node $1.js < ../problems/$1.in$2)"
    echo "${OUTPUT}"


    echo "===== Expected Output ===="
    INPUT="$(cat ../problems/$1.out$2)"
    echo "${INPUT}"
    echo "===== STATUS ===="
    #diff < ( echo "${INPUT}" ) < ( echo "${OUTPUT}" )
    if [ "$OUTPUT" == "$INPUT" ]
    then
      echo "SUCCESS"
    else
      echo "FAILURE"
    fi
fi

