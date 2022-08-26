import java.security.DrbgParameters.Capability;
import java.util.Hashtable;

public class HashTable {

    // Modular hash function
    // Use remaider of key % size to save the number,
    // at index = remainder of the above
    
    // Hash Table :
    // It is generalized form of array.
    // It stores data in form of key-value pair.
    // converts key to index using hash function.
    // Operations : put(key, value), get(key), remove(key).
    // Average running time is O(1).

    // Collision resolution technique (Separate chain):
    // Collision - When 2 values to be store at same index.
    // Along with hash table, Linked list is also used for 
    // every inex which encounters collision.

    // HashTable terminologies : 
    // HashNodes Buckets --> Array of hashnodes.
    // numOfBuckets --> length of Buckets.
    // HashNode --> Head, Chains.
    // Index --> Key % Size.

    private HashNode[] buckets;
    private int numOfBuckets;
    private int size;

    public HashTable(){
        this(10);
    }

    public HashTable(int capacity){
        this.numOfBuckets = capacity;
        this.buckets = new HashNode[numOfBuckets];
        this.size = 0;
    }

    

    private class HashNode {
        private Integer key;
        private String value;
        private HashNode next;

        public HashNode(Integer key, String value){
            this.key = key;
            this.value = value;
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int getBucketIndex(Integer key){
         return key % numOfBuckets; // numOfBuckets = buckets.length
    }

    public void put(Integer key, String value){
        if(key == null || value == null){
            throw new IllegalArgumentException("Invalid key or value");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                head.value = value;
                return;
            }
            head = head.next;
        }
        size++;
        head = buckets[bucketIndex];
        HashNode node = new HashNode(key, value);
        node.next = head;
        buckets[bucketIndex] = node;
    }

    // public int getBucketIndex(Integer key){
    //     return key % buckets.length;
    // } // This method is already created above.

    public String get(Integer key){    
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        while(head != null){
            if(head.key.equals(key)){
                return head.value;
            }
            head = head.next;
        }
        return null;
    }

    public String remove(Integer key){
        if(key == null){
            throw new IllegalArgumentException("Key is null !!!");
        }
        int bucketIndex = getBucketIndex(key);
        HashNode head = buckets[bucketIndex];
        HashNode previous = null;
        while(head != null){
            if(head.key.equals(key)){
                break;
            }
            previous = head;
            head = head.next;
        }
        if(head==null){
            return null;
        }
        size--;
        if(previous != null){
            previous.next = head.next;
        }
        else{
            buckets[bucketIndex] = head.next;
        }
        return head.value;
    }

    // All the above methods have a time complexity of O(1).

    public static void main(String[] args) {
        HashTable ht  = new HashTable(10);
        ht.put(105, "Tom");
        ht.put(21, "sana");
        ht.put(21, "mary");
        ht.put(31, "sam");
        ht.put(37, "yash");


        System.out.println(ht.size());
        ht.get(21);
        System.out.println(ht.get(21));
        System.out.println(ht.get(37));
        ht.remove(37);
        System.out.println(ht.size());
        System.out.println(ht.get(37));

    }
}
