package haxe;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Int64
{
	public static   long make(int high, int low)
	{
		return ((long) (( ( ((long) (high) ) << 32 ) | ((long) (low) ) )) );
	}
	
	
	public static   long ofInt(int x)
	{
		return ((long) (x) );
	}
	
	
	public static   long ofInt32(int x)
	{
		return ((long) (x) );
	}
	
	
	public static   int toInt(long x)
	{
		return ((int) (x) );
	}
	
	
	public static   int getLow(long x)
	{
		return ((int) (( ((long) (x) ) & -1 )) );
	}
	
	
	public static   int getHigh(long x)
	{
		return ((int) (( ((long) (x) ) >>> 32 )) );
	}
	
	
	public static   long add(long a, long b)
	{
		return ((long) (( ((long) (a) ) + ((long) (b) ) )) );
	}
	
	
	public static   long sub(long a, long b)
	{
		return ((long) (( ((long) (a) ) - ((long) (b) ) )) );
	}
	
	
	public static   long mul(long a, long b)
	{
		return ((long) (( ((long) (a) ) * ((long) (b) ) )) );
	}
	
	
	public static   java.lang.Object divMod(long modulus, long divisor)
	{
		long q = ( ((long) (modulus) ) / ((long) (divisor) ) );
		long m = ((long) (( ((long) (modulus) ) % ((long) (divisor) ) )) );
		return new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"modulus", "quotient"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{m, q}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array(new java.lang.Object[]{}));
	}
	
	
	public static   long div(long a, long b)
	{
		return ( ((long) (a) ) / ((long) (b) ) );
	}
	
	
	public static   long mod(long a, long b)
	{
		return ((long) (( ((long) (a) ) % ((long) (b) ) )) );
	}
	
	
	public static   long shl(long a, int b)
	{
		return ((long) (( ((long) (a) ) << b )) );
	}
	
	
	public static   long shr(long a, int b)
	{
		return ((long) (( ((long) (a) ) >> b )) );
	}
	
	
	public static   long ushr(long a, int b)
	{
		return ((long) (( ((long) (a) ) >>> b )) );
	}
	
	
	public static   long and(long a, long b)
	{
		return ((long) (( ((long) (a) ) & ((long) (b) ) )) );
	}
	
	
	public static   long or(long a, long b)
	{
		return ((long) (( ((long) (a) ) | ((long) (b) ) )) );
	}
	
	
	public static   long xor(long a, long b)
	{
		return ((long) (( ((long) (a) ) ^ ((long) (b) ) )) );
	}
	
	
	public static   long neg(long a)
	{
		return ((long) ( ~ (((long) (a) )) ) );
	}
	
	
	public static   boolean isNeg(long a)
	{
		return ( ((long) (a) ) < 0 );
	}
	
	
	public static   boolean isZero(long a)
	{
		return ( ((long) (a) ) == 0 );
	}
	
	
	public static   int compare(long a, long b)
	{
		return ((int) (( ((long) (a) ) - ((long) (b) ) )) );
	}
	
	
	public static   int ucompare(long a, long b)
	{
		if (( ((long) (a) ) < 0 )) 
		{
			return ( (( ((long) (b) ) < 0 )) ? (((int) (( ((long) ( ~ (((long) (a) )) ) ) - ((long) ( ~ (((long) (b) )) ) ) )) )) : (1) );
		}
		
		return ( (( ((long) (b) ) < 0 )) ? (-1) : (((int) (( ((long) (a) ) - ((long) (b) ) )) )) );
	}
	
	
	public static   java.lang.String toStr(long a)
	{
		return ( a + "" );
	}
	
	
}


