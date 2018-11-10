#include <iostream>

unsigned int countOnes(unsigned int number);

int main() {
  unsigned int number;
  while (std::cin >> number) {
    std::cout << countOnes(number) << std::endl;
  }
  return 0;
}

unsigned int countOnes(unsigned int number)
{
  unsigned int oneCounter = 0;

  while (number) {
    oneCounter += number & 1;
    number >>= 1;
  }

  return oneCounter;
}