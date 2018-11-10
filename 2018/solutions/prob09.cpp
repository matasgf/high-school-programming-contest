#include <iostream>
#include <string>
#include <cmath>

enum NumberType {
  NEITHER = 0,
  BOTH,
  PERFECT_SQUARE,
  PERFECT_CUBE
};

const std::string NUMBER_TYPES_MAP[] {
  "NEITHER",
  "BOTH",
  "PERFECT SQUARE",
  "PERFECT CUBE"
};

bool isPerfectSquare(double number);
bool isPerfectCube(double number);

int main() {
  double input;
  bool isPerfSquare, isPerfCube;
  enum NumberType type = NEITHER;

  while (std::cin >> input) {
    isPerfSquare = isPerfectSquare(input);
    isPerfCube = isPerfectCube(input);

    if (isPerfSquare && isPerfCube) {
      type = BOTH;
    } else if (isPerfSquare) {
      type = PERFECT_SQUARE;
    } else if (isPerfCube) {
      type = PERFECT_CUBE;
    } else {
      type = NEITHER;
    }

    std::cout << NUMBER_TYPES_MAP[type] << std::endl;
  }

  return EXIT_SUCCESS;
}

bool isPerfectSquare(double number)
{
  double squareRoot = sqrt(number);
  return ((squareRoot - floor(squareRoot)) == 0);
}

bool isPerfectCube(double number)
{
  double cubeRoot = cbrt(number);
  return ((cubeRoot - floor(cubeRoot)) == 0);
}