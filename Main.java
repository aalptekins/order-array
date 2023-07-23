import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] intArr = new int[5];
		Random rn = new Random();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArr.length; i++) {
			intArr[i] = rn.nextInt(10);
		}

		System.out.println(Arrays.toString(intArr));

		while (!isSorted(intArr)) {
			System.out.println("Yerlerini degistirmek istediginiz index'leri giriniz:\n");
			int index1 = sc.nextInt();
			int index2 = sc.nextInt();
			
			int[] newArr = new int[intArr.length];
			newArr = swap(intArr,index1,index2);
			
			System.out.println("Siralanmis array : "+Arrays.toString(newArr));

		}
		System.out.println("Tebrikler. Arrayi basariyla siraladiniz!");
	}

	private static int[] swap(int[] intArr, int index1, int index2) {
		
		int temp = intArr[index1] ;
		intArr[index1]= intArr[index2];
		intArr[index2]=temp;
		
		return intArr;
	}

	private static boolean isSorted(int[] intArr) {

		for (int i = 0; i < intArr.length-1; i++) {
			if (intArr[i] > intArr[i + 1])
				return false;
		}
		return true;
	}
}