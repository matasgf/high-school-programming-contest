import sys

'''
Given the boat’s volume (V) in cubic feet, the boat’s weight in pounds, and 
the boat’s desired positive buoyancy percentage (B), determine if the boat’s 
actual buoyancy is same or greater than the desired buoyancy. If so, return 
the string “safe” if same or greater, else return the string “heavy”.
'''
for line in sys.stdin:
    # Read all integers into array keyed by integer value
    volume, weight, buoyancy = line.split()

    # Constant
    water_weight = 62.4

    # Force types
    volume = int(volume)
    weight = int(weight)
    buoyancy = float(buoyancy)

    # Calculate Supported Weight
    supported = volume * buoyancy * water_weight

    # Determine if safe or too heavy
    if supported > weight:
        print('safe')
    else:
        print('heavy')

    # Repeat for each input line
