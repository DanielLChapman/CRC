import java.util.*;

public class crc {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//Edit to whatever your initial stream is, last 4 bits are for the extended bits.
		//So my stream was 10101011, then since im using a divisor of 5, it is extended 4 bits.
		int[] a = {1,0,1,0,1,0,1,1,0,0,0,0};
		System.out.println("Inputer is.");
		for(int x = 0; x < a.length; x++){
			System.out.print(a[x]);
		}
		int[] d = new int[5];
		System.out.print("\n");
		System.out.println("Please enter your 5 bit divisor, left most bit first, 1 bit at a time.");
		for(int x = 0; x < 5; x++) {
		d[x] = scan.nextInt();
		}
		for (int x = 0; x < 8; x++) {
			if (a[x] == 1) {
				for (int q=0; q < 5; q++) {
					a[q+x] = a[q+x] ^ d[q];
				}
			} else if ( a[x] == 0) {
				
			}
		
		}
		for(int x = 0; x < 12; x++) {
		System.out.print(a[x]);
		}
	}
}
