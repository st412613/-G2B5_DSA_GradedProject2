package com.gl.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Queue;

public class Support {
	public Queue<Integer> sortQueue(Queue<Integer> q) {
		ArrayList<Integer> temp = new ArrayList<>();
		while (q.isEmpty() == false) {
			temp.add(q.peek());
			q.poll();
		}
		Collections.sort(temp);
		for (int i = 0; i < temp.size(); i++) {
			q.add(temp.get(i));
		}
		return q;
	}

}
