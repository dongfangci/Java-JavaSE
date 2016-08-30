package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	/*
	 * 第K大的数（也可求中位数）
	 * 利用最小堆
	 * 
	 * 第K小的数（转化为第n-k+1 大的数）
	 */
	public static int topK(int[] a,int k){
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>(); 
		for(int i = 0; i < k; i++){
			minHeap.offer(a[i]);
		}
		
		for(int i = k;i < a.length;i++){
			if(a[i] > minHeap.peek()){
				minHeap.poll();
				minHeap.offer(a[i]);
			}
		}
		return minHeap.peek();			
	}
	
	
	/*
	 * 最小的K个数
	 *1. 利用最小堆，存储所有元素，然后poll（deleteMin） k次即可，简单易行
	 *2. 利用最大堆，堆里存储最小的k个数，下面实现这个
	 */
	
	public static PriorityQueue<Integer> minK(int[]a,int k){
		//实现最大堆
		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(10,new MyComparator()); 
		for(int i = 0; i < k; i++){
			maxHeap.offer(a[i]);
		}
		
		for(int i = k;i < a.length;i++){
			if(a[i] < maxHeap.peek()){
				maxHeap.poll();
				maxHeap.offer(a[i]);
			}
		}
		return maxHeap;
		
	}
	public static void main(String[] args) {
		int[] a =  {4,3,5,6,1,2,7,8,9};
		int res = topK(a,3);
		System.out.println(res);
		System.out.println(minK(a,5));
	}

}
class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		return o2-o1;
	}
	
}