#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

#define KILOGRAM_CONVERSION 2.2

int main() {
  double litersPerContainer, containerWeight, conversion;

  while (std::cin >> litersPerContainer >> containerWeight) {
    conversion = ((litersPerContainer * containerWeight) * KILOGRAM_CONVERSION);
    conversion = round(conversion * 100) / 100;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << conversion << std::endl;
  }

  return EXIT_SUCCESS;
}