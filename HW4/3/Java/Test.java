import java.util.List;
import java.util.Arrays;

interface TotOrd<A>{
	public Boolean lessOrEqual(A x, A y);
}

class Sort {
	static List <Integer> sort(TotOrd <Integer> ord, List <Integer> x){
		for(int i = 1; i < x.size(); i++){
			int j = i;
			while ((j > 0) && (x.get(j) <= x.get(j-1)) ) {
				swap(x, j, j-1);
				j = j - 1;
			}
		}
		return x;
	}

	public static <A> void swap(List<A> a, int i, int j) {
	A tmp = a.get(i);
	a.set(i, a.get(j));
	a.set(j, tmp);
	}
}

class IntSmaller implements TotOrd<Integer> {
	public	Boolean lessOrEqual(Integer x, Integer y) {
		return x <= y;
	}
	public static IntSmaller it = new IntSmaller();
}

class Test{
	public static void main(String[] args) {
		System.out.println(Sort.sort(IntSmaller.it, Arrays.asList(3, 5, 4)));

	}
}