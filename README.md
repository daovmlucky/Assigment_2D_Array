
## Solution

| 1 | 2 | 3 | 4 |
| 5 | 6 | 7 | 8 |
| 9 | 0 | 1 | 2 |
| 3 | 4 | 5 | 6 |

My solution is rotation in a layer-by-layer fashion,  different layers can be processed independently. I will group four-element at a time for rotation 
Ex: 
- The first rotation:
+ move 1 to 4's location
+ move 4 to 6's location
+ move 6 to 3's location
+ move 3 to 1's location
- The second rotation:
+ move 2 to 8's location
+ move 8 to 5's location
+ move 5 to 9's location
+ move 9 to 2's location
....

I will use the four-way swap from the outermost layers to the center array