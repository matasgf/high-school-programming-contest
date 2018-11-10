#include <iostream>
#include <string>
#include <iomanip>
#include <cmath>

int main() {
  double serverHoursForMonth, serverCostPerHour, numGigStorage,
         costPerGigOfStorage, numGigBandwidth, costPerGigBandwidth;
  double serverCost, storageCost, bandwidthCost, totalCost;

  std::cout << std::fixed << std::setprecision(2);
  while (std::cin >> serverHoursForMonth >> serverCostPerHour >> numGigStorage
                  >> costPerGigOfStorage >> numGigBandwidth >> costPerGigBandwidth) {

    serverCost = serverHoursForMonth * serverCostPerHour;
    storageCost = numGigStorage * costPerGigOfStorage;
    bandwidthCost = numGigBandwidth * costPerGigBandwidth;
    totalCost = serverCost + storageCost + bandwidthCost;

    totalCost = round(totalCost * 100) / 100;
    std::cout << totalCost << std::endl;
  }

  return EXIT_SUCCESS;
}