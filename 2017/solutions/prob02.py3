import sys
 
lines = sys.stdin.readlines()
num_cases = int(lines[0])
 
case = 1
while case < num_cases + 1:
    daily_cost, shirt_cost, shirt_price, shirts_sold = lines[case].split()
    per_shirt_profit = float(shirt_price) - float(shirt_cost)
    daily_shirt_profit = per_shirt_profit * float(shirts_sold)
    daily_profit = daily_shirt_profit - float(daily_cost)
    print("%.2f" % daily_profit)
    case = case + 1

