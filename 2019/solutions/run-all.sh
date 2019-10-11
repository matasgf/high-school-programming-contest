#!/bin/sh
# USAGE: ./run-all.sh prob01 2

echo "C (.c)"
./run-c.sh $1 $2
echo ""

echo "CPP (.cpp)"
./run-cpp.sh $1 $2
echo ""

echo "JAVA (.java)"
./run-java.sh $1 $2
echo ""

echo "PYTHON 2 (.py2)"
./run-py2.sh $1 $2
echo ""

echo "PYTHON 3 (.py3)"
./run-py3.sh $1 $2
echo ""

