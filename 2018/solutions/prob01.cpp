#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

#define KILOGRAM_CONVERSION 2.2

int main() {
  double liters, density_kg_l, mass_kg, mass_lb;

  while (std::cin >> liters >> density_kg_l) {
    mass_kg = liters * density_kg_l;
    mass_lb = mass_kg * KILOGRAM_CONVERSION;
    mass_lb = round(mass_lb * 100) / 100;
    std::cout << std::fixed << std::setprecision(2);
    std::cout << mass_lb << std::endl;
  }

  return EXIT_SUCCESS;
}
