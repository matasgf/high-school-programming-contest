#!/bin/bash
# USAGE: ./run-py2.sh prob01 2

if [ ! -f $1.py2 ]; then
    echo "File Not Found [$1.py2]"
else
    echo "===== Program Output ====="
    python2 $1.py2 < ../problems/$1.in$2
    echo "===== Expected Output ===="
    cat ../problems/$1.out$2
fi

