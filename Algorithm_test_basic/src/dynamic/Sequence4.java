package dynamic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Sequence4 {

	public static void main(String[] args) throws Exception{
		//#11053번 가장 긴 증가하는 수열
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int dp[] = new int[n];
		int result = 0;

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			for(int j=0; j<i; j++) {
				if(arr[i]>arr[j]) {
					dp[i] = Math.max(dp[j] + 1, dp[i]);
					result = Math.max(dp[i], result);
				}
			}
		}
		
		sb.append(result + "\n");
		
		int value = result;
		Stack<Integer> stack = new Stack<>();

		for(int i=n; i>=1; i--) {
			if(value ==dp[i]) {
				stack.push(arr[i]);
				value--;
			}
		}
		
		while(!stack.isEmpty()) {
			sb.append(stack.pop() + " ");
		}
		
		bw.write(sb.toString());
		
	}

}
