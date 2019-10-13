# Hack 4 Good HSPC 2019

This repo contains sample inputs/outputs and sample solutions for the 2019 
Hack 4 Good High School Programming Competition.

**Please keep these files SECRET until they are 
[published to our public repo](http://github.com/matasgf/hspc) on 11/02/2019.**

# Sample Usage

Our automated scoring server provides input to the program via 
standard input (stdin) and reads output via standard output (stdout). 
Programs should NOT attempt to read from (or write to) data files.

**See below for Python and Javascript Usage.**
Refer to our [Team Practice Packet](https://github.com/matasgf/high-school-programming-contest/tree/master/2018/team-packet) 
for additional usage instructions for Python 3, Python 2, Java, C++, C.

## Python 3 Usage

View sample input

```
cat ../problems/prob01.in1
1 9 2 8 8
```

View sample output

```
cat ../problems/prob01.out1
1 2 8 9
```

Run program with sample input

```
cd 2019/solutions/
python prob01.py3 < ../problems/prob01.in1
1 2 8 9
```

Confirm the program output matches the sample output.


## Javascript Usage

View sample input

```
cat ../problems/prac02.in1
Mitchell coding
Danese testing
Larry debugging
```

View sample output

```
cat ../problems/prob01.out1
Mitchell is coding today!
Danese is testing today!
Larry is debugging today!
```

Run program with sample input

```
cd 2019/solutions/
node prac02.js < ../problems/prac02.in
Mitchell is coding today!
Danese is testing today!
Larry is debugging today!
```

Confirm the program output matches the sample output.
