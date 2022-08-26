import java.lang.reflect.InaccessibleObjectException;

import javax.print.attribute.HashPrintJobAttributeSet;

public class maxPQ{

    private Integer[] heap;
    private int n;

    public maxPQ(int capacity){
        heap = new Integer[capacity + 1];
        n = 0;
    }
    public boolean isEmpty(){
        return n == 0;
    }
    public int size(){
        return n;
    }

    public void insert(int inp){
        if(n==heap.length -1){
            resize(2*heap.length);
        }
        n++;
        heap[n] = inp;
        bottomUpReHeapify(n);
    }

    private void bottomUpReHeapify(int k){
        while(k>1 && heap[k/2] < heap[k]){
            int temp = heap[k];
            heap[k] = heap[k/2];
            heap[k/2] = temp;
            k=k/2;
        }
    }
    private void resize(int capacity){
        Integer[] temp = new Integer[capacity];
        for(int i=0;i<heap.length;i++){
            temp[i] = heap[i];
        }
        heap = temp;
    }
    
    public void printMaxHeap(){
        for(int i=0;i<=n;i++){
            System.out.print(heap[i] + " ");
        }
    }

    public int deleteMaxInMaxHeap(){
         int max = heap[1];
         swap(1, n);
         n--;
         bottomUpReHeapify(1);
         heap[n+1] = null;
         if(n>0 && (n==(heap.length - 1)/4)){
            resize(heap.length/2);
         }
         return max;

    }
    public void swap(int a, int b){
        int temp = heap[a];
        heap[a] = heap[b];
        heap[b] = temp;
    }

    public void topDownReHeapify(int k){
        while(2*k <= n){
            int j=2*k;
            if(j<n && heap[j] < heap[j+1]){
                j++;
            }
            if(heap[k] >= heap[j]){
                break;
            }
            swap(k, j);
            k=j;
        }
    }
    public static void main(String[] args) {
        maxPQ pq = new maxPQ(3);
        // System.out.println(pq.size());
        // System.out.println(pq.isEmpty());
        pq.insert(4);
        pq.insert(5);
        pq.insert(2);
        pq.insert(6);
        pq.insert(1);
        pq.insert(3);
        // System.out.println(pq.size());
        // pq.printMaxHeap();
        pq.deleteMaxInMaxHeap();
        System.out.println();
        System.out.print(pq.size());
        System.out.println();
        pq.printMaxHeap();
    }
}
