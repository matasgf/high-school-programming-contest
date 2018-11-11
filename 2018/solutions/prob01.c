#include <stdio.h>

int main(int argc, char **argv)
{
    double liters, density_kg_l;
    double mass_kg, mass_lb;

    while (scanf("%lf %lf", &liters, &density_kg_l) == 2) {
        mass_kg = liters * density_kg_l;
        mass_lb = mass_kg * 2.2;
        printf("%.2f\n", mass_lb);
    }
    return 0;
}
