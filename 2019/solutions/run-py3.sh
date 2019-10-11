#!/bin/bash
# USAGE: ./run-py3.sh prob01 2

if [ ! -f $1.py3 ]; then
    echo "File Not Found [$1.py3]"
else
    echo "===== Program Output ====="
    python3 $1.py3 < ../problems/$1.in$2
    echo "===== Expected Output ===="
    cat ../problems/$1.out$2
fi

