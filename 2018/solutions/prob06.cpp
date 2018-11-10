#include <iostream>
#include <string>

int checkdigit(const std::string &number);
char digitOrX(int digit);

int main() {
  std::string number;

  while (std::cin >> number) {
    std::cout << number << digitOrX(checkdigit(number)) << std::endl;
  }

  return EXIT_SUCCESS;
}


int checkdigit(const std::string &number)
{
  int sum = 0;
  for (int i = 0; i < 9; i++) {
    sum += (number[i] - '0') * (i + 1);
  }

  return sum % 11;
}

char digitOrX(int digit)
{
  if (digit == 10)
    return 'X';
  return (char) digit + '0';
}