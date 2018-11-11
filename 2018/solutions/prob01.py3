import sys

for line in sys.stdin:
    liters, density_kg_l = line.split()
    weight_kg = float(liters) * float(density_kg_l)
    weight_lb = weight_kg * 2.2
    print("%.2f" % weight_lb)
