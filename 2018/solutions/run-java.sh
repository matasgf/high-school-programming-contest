#!/bin/bash
# USAGE: ./run-java.sh prob01 2

if [ ! -f $1.java ]; then
    echo "File Not Found [$1.java]"
else
    javac $1.java
    echo "===== Program Output ====="
    java $1 < ../problems/$1.in$2
    rm $1.class
    echo "===== Expected Output ===="
    cat ../problems/$1.out$2
fi

