package haxe;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Int32
{
	public static   int make(int a, int b)
	{
		return ((int) (( ( a << 16 ) | b )) );
	}
	
	
	public static   int ofInt(int x)
	{
		return ((int) (x) );
	}
	
	
	public static   int toInt(int x)
	{
		if (( (( ( ((int) (x) ) >> 30 ) & 1 )) != ( ((int) (x) ) >>> 31 ) )) 
		{
			throw haxe.lang.HaxeException.wrap(( "Overflow " + haxe.lang.Runtime.toString(x) ));
		}
		
		return ((int) (x) );
	}
	
	
	public static   int add(int a, int b)
	{
		return ((int) (( ((int) (a) ) + ((int) (b) ) )) );
	}
	
	
	public static   int sub(int a, int b)
	{
		return ((int) (( ((int) (a) ) - ((int) (b) ) )) );
	}
	
	
	public static   int mul(int a, int b)
	{
		return ((int) (( ((int) (a) ) * ((int) (b) ) )) );
	}
	
	
	public static   int div(int a, int b)
	{
		return ( ((int) (a) ) / ((int) (b) ) );
	}
	
	
	public static   int mod(int a, int b)
	{
		return ((int) (( ((int) (a) ) % ((int) (b) ) )) );
	}
	
	
	public static   int shl(int a, int b)
	{
		return ((int) (( ((int) (a) ) << b )) );
	}
	
	
	public static   int shr(int a, int b)
	{
		return ((int) (( ((int) (a) ) >> b )) );
	}
	
	
	public static   int ushr(int a, int b)
	{
		return ((int) (( ((int) (a) ) >>> b )) );
	}
	
	
	public static   int and(int a, int b)
	{
		return ((int) (( ((int) (a) ) & ((int) (b) ) )) );
	}
	
	
	public static   int or(int a, int b)
	{
		return ((int) (( ((int) (a) ) | ((int) (b) ) )) );
	}
	
	
	public static   int xor(int a, int b)
	{
		return ((int) (( ((int) (a) ) ^ ((int) (b) ) )) );
	}
	
	
	public static   int neg(int a)
	{
		return ((int) ( - (((int) (a) )) ) );
	}
	
	
	public static   int complement(int a)
	{
		return ((int) ( ~ (((int) (a) )) ) );
	}
	
	
	public static   int compare(int a, int b)
	{
		return ( ((int) (a) ) - ((int) (b) ) );
	}
	
	
	public static   boolean isNeg(int a)
	{
		return ( ((int) (a) ) < 0 );
	}
	
	
	public static   boolean isZero(int a)
	{
		return ( ((int) (a) ) == 0 );
	}
	
	
	public static   int ucompare(int a, int b)
	{
		if (( ((int) (a) ) < 0 )) 
		{
			return ( (( ((int) (b) ) < 0 )) ? (( ((int) ( ~ (((int) (b) )) ) ) - ((int) ( ~ (((int) (a) )) ) ) )) : (1) );
		}
		
		return ( (( ((int) (b) ) < 0 )) ? (-1) : (( ((int) (a) ) - ((int) (b) ) )) );
	}
	
	
	public static   int toNativeInt(int a)
	{
		return ((int) (a) );
	}
	
	
}


