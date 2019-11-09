#!/bin/bash
# USAGE: ./run-java.sh prob01 2

if [ ! -f $1.java ]; then
    echo "File Not Found [$1.java]"
else
    echo "===== Program Output ====="
    javac $1.java
    INPUT=`java $1 < ../problems/$1.in$2`
    rm $1.class
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

