#include <iostream>
#include <unordered_map>
#include <cstdint>

std::unordered_map<int, uint64_t> memo;
uint64_t trib(int n);

int main() {
  int input;

  while (std::cin >> input) {
    if (input == -1)
      break;

    std::cout << trib(input) << std::endl;
  }

  // Debugging to quickly gauge where overflows will occur. To get a precise
  // indication for signed 64bit int, uncomment below
//  std::cout << std::endl << std::endl;
//  for (int i = 0; i <= 100; i++) {
//    uint64_t res = trib(i);
////    if (res > INT64_MAX)
////      break;
//    std::cout << i << ": " << res << std::endl;
//  }

  return EXIT_SUCCESS;
}

// Very fast
uint64_t trib(int n)
{
  std::unordered_map<int, uint64_t>::const_iterator memoitr;

  if (n == 2)
    return 2;

  if (n < 2)
    return 1;

  memoitr = memo.find(n - 1);
  if (memoitr == memo.end()) {
    memo[n - 1] = trib(n - 1);
  }

  memoitr = memo.find(n - 2);
  if (memoitr == memo.end()) {
    memo[n - 2] = trib(n - 2);
  }

  memoitr = memo.find(n - 3);
  if (memoitr == memo.end()) {
    memo[n - 3] = trib(n - 3);
  }

  return memo[n - 1] + memo[n - 2] + memo[n - 3];
}

// Very slow
//uint64_t trib(int n)
//{
//  if (n == 2)
//    return 2;
//
//  if (n < 2)
//    return 1;
//
//  return trib(n - 1) + trib(n - 2) + trib(n - 3);
//}