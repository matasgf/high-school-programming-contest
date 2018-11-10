#include <iostream>
#include <string>

std::string foldword(const std::string &line);

int main() {
  std::string word;

  while (std::cin >> word) {
    std::cout << foldword(word) << std::endl;
  }

  return EXIT_SUCCESS;
}

std::string foldword(const std::string &line)
{
  bool state = true;
  size_t lineLength = line.size();
  size_t k = 0, i = 0, j = lineLength - 1;
  std::string reordered(lineLength, '\0');

  while (i <= j) {
    if (state) {
      reordered[k] = line[i++];
    } else {
      reordered[k] = line[j--];
    }

    k++;
    state = !state;
  }

  return reordered;
}