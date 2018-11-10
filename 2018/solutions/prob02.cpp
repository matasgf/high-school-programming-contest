#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

#define NUM_FILES 6

int main() {
  double mb, conversion;
  int counter = 1;
  double mbSum = 0;

  std::cout << std::fixed << std::setprecision(1);
  while (std::cin >> mb) {
    mbSum += mb;
    counter++;

    if (counter % NUM_FILES == 0) {
      conversion = round((mbSum / 1024) * 2) / 2;
      std::cout << conversion << std::endl;
      mbSum = 0;
      counter = 1;
    }
  }

  return EXIT_SUCCESS;
}