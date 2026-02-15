import java.util.*; 
class Solution { 
public int mostFrequentEven(int[] nums) { 
HashMap<Integer, Integer> freq = new HashMap<>(); 
for (int x : nums) { 
if (x % 2 == 0) { 
freq.put(x, freq.getOrDefault(x, 0) + 1); 
} 
} 
int bestVal = -1; 
int bestFreq = 0; 
for (Map.Entry<Integer, Integer> e : freq.entrySet()) { 
int val = e.getKey(); 
int f = e.getValue(); 
if (f > bestFreq || (f == bestFreq && (bestVal == -1 || val < bestVal))) { 
bestFreq = f; 
bestVal = val; 
} 
} 
return bestVal; 
} 
}
