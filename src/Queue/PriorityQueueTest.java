package Queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityQueueTest {
	/*
	 * ��K�������Ҳ������λ����
	 * ������С��
	 * 
	 * ��KС������ת��Ϊ��n-k+1 �������
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
	 * ��С��K����
	 *1. ������С�ѣ��洢����Ԫ�أ�Ȼ��poll��deleteMin�� k�μ��ɣ�������
	 *2. �������ѣ�����洢��С��k����������ʵ�����
	 */
	
	public static PriorityQueue<Integer> minK(int[]a,int k){
		//ʵ������
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