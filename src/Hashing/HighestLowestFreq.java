package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HighestLowestFreq {
	
	public static void main(String[] args) {
		int[] v = new int[] {1, 2, 3, 1, 1, 4};
		Map<Integer, Integer> frequencyMap = new HashMap<>();
        for(int i=0; i<v.length; i++) {
            int freq = frequencyMap.getOrDefault(v[i], 0);
            frequencyMap.put(v[i], ++freq);
        }

        // System.out.println(minFreq);
        // System.out.println(maxFreq);

        int minFreq = Integer.MAX_VALUE;
        int maxFreq = Integer.MIN_VALUE;
        
        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            minFreq = Math.min(minFreq, entry.getValue());
            maxFreq = Math.max(maxFreq, entry.getValue());
        }

        int minFreqElement = Integer.MAX_VALUE;
        int maxFreqElement = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry : frequencyMap.entrySet()) {
            if(entry.getValue() == minFreq) {
                minFreqElement = Math.min(entry.getKey(), minFreqElement);
            }

            if(entry.getValue() == maxFreq) {
                maxFreqElement = Math.min(entry.getKey(), maxFreqElement);
            }
        }
        
        System.out.println(minFreqElement);
        System.out.print(maxFreqElement);
	}

}
