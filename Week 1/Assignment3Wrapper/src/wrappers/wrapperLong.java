package wrappers;

public class wrapperLong {

	public static void main(String[] args) {
		/*
		Long L1 = 777L;
		Long L2 = 777L;
		Long L3 = new Long(777);
		
		
		Float L1=777.777f;
		Float L2=777.777f;
		Float L3= new Float(777.777f);
		*/
		Double L1=777.777d;
		Double L2=777.777d;
		Double L3= new Double(777.777d);
		
		System.out.println("L1==L2 : " + (L1 == L2));
		System.out.println("L1==L3 : " + (L1 == L3));

		System.out.println("(L1.equals(L2)) : " + (L1.equals(L2)));
		System.out.println("(L1.equals(L3)) : " + (L1.equals(L3)));

		System.out.println(System.identityHashCode(L1));
		System.out.println(System.identityHashCode(L2));
		System.out.println(System.identityHashCode(L3));

		L2++;
		System.out.println(System.identityHashCode(L2));

		// autoboxing
		/*
		long x = L2;
		x=888L;
		
		float x = L2;
		x=888.888f;
		*/
		
		double x =L2;
		x=888.88888d;
		L2=x;
		System.out.println("L2 = " +L2);
		
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);

	}

}
