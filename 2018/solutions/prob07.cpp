#include <iostream>
#include <string>

std::string encrypt(const std::string& note);

int main() {
  std::string line;

  while (std::cin >> line) {
    std::cout << encrypt(line) << std::endl;
  }

  return EXIT_SUCCESS;
}

std::string encrypt(const std::string& note)
{
  std::string encrypted(note);
  size_t noteLength = encrypted.size();

  for (size_t i = 0; i < noteLength; i++) {
    encrypted[i] = (char) ((25 - ('Z' - encrypted[i]) + 3) % 26) + 'A';
  }

  return encrypted;
}