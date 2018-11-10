#include <iostream>
#include <sstream>
#include <iomanip>
#include <cmath>

int main() {
  double divisor, result;
  int score;
  std::string line, number;

  while (std::getline(std::cin, line)) {
    std::stringstream lineStream(line);
    result = 0;
    divisor = 0;

    while (lineStream >> number) {
      score = stoi(number);
      if (score < 0)
        continue;

      result += (double) score;
      divisor++;
    }

    if (divisor == 0) {
      std::cout << result << std::endl;
      continue;
    }

    result = round((result / divisor) * 10000) / 10000;

    std::cout << result << std::endl;
  }

  return 0;
}