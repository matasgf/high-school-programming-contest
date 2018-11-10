#include <iostream>
#include <string>
#include <vector>

int main() {
  bool valid = true;
  std::string line;
  std::vector<std::string> words;
  size_t wordsLength, halfWordsLength;

  while (std::cin >> line) {
    words.push_back(line);
  }

  wordsLength = words.size() - 1;
  halfWordsLength = wordsLength / 2;
  for (size_t i = 0; i <= halfWordsLength; i++) {
    for (size_t j = 0; j <= halfWordsLength; j++) {
      if (words[i][j] != words[j][i])
        valid = false;

      if (words[i][j] != words[wordsLength - i][wordsLength - j])
        valid = false;

      if (words[i][j] != words[wordsLength - j][wordsLength - i])
        valid = false;
    }
  }

  std::cout << ((valid) ? "TRUE" : "FALSE") << std::endl;

  return EXIT_SUCCESS;
}