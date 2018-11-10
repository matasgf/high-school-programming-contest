#include <iostream>
#include <string>
#include <unordered_map>

int main() {
  bool hasDuplicateWords = false;
  std::string word;
  std::unordered_map<std::string, int> dictionary;
  std::unordered_map<std::string, int>::const_iterator dictionaryIterator;

  while (std::getline(std::cin, word, ' ')) {
    dictionaryIterator = dictionary.find(word);
    if (dictionaryIterator != dictionary.cend()) {
      hasDuplicateWords = true;
      break;
    }

    dictionary.emplace(word, 1);
  }

  std::cout << ((hasDuplicateWords) ? "TRUE" : "FALSE") << std::endl;

  return EXIT_SUCCESS;
}