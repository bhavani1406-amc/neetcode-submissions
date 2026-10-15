class Solution {
    public class Pair<K, V> {
    private final K key;
    private final V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }
    public K getKey() { return key; }
    public V getValue() { return value; }
}
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int ele:nums){
            if(map.containsKey(ele)){
                int freq = map.get(ele);
                map.put(ele,freq+1);
            }
            else{
                map.put(ele,1);
            }
        } 
        PriorityQueue<Integer>heap = new PriorityQueue<>((a,b)->map.get(a)-map.get(b));
        for(int key : map.keySet()){
            heap.add(key);
            if(heap.size()>k) heap.poll();
        }
        int [] res = new int[k];
        for(int i = 0;i<k;i++) res[i] = heap.poll();
        return res;
        
    }
}
