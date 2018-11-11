#include <iostream>
#include <string>
#include <vector>

int main() {
  bool valid = true;
  std::string line, full;
  size_t i, j;

  while (std::cin >> line) {
    full.append(line);
  }

  for (i = full.size() - 1, j = 0; i > 0; i--, j++) {
    if (full[i] != full[j])
      valid = false;
  }

  std::cout << ((valid) ? "TRUE" : "FALSE") << std::endl;

  return EXIT_SUCCESS;
}