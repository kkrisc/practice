package kc.practice.trees;

import java.util.ArrayList;
import java.util.List;

public class Heap {
	private List<Integer> heapList = new ArrayList<Integer>();
	
	public static void main(String ags[])
	{
		
	}
	
	private void heapify(int i, List<Integer> heap)
	{
		if(i<=heap.size()/2)
		{
			if(heap.get(i) < heap.get(2*i))
			{
				swap(i, 2*1,heap);
			}
			if(i<heap.size()/2 && heap.get(i) < heap.get(2*i+1))
			{
				swap(i,2*i+1,heap);
			}
			heapify(++i, heap);
		}
	}

	private void swap(int i, int j, List<Integer> heap) {
		
		
	}
}