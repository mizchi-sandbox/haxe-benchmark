package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public final class Array<T> extends haxe.lang.HxObject
{
		public Array(T[] _native)	{		this.__a = _native;		this.length = _native.length;	}public    Array()
	{
		super();
		haxe.root.Array.__hx_ctor(this);
	}
	
	
	public static  <T1> void __hx_ctor(haxe.root.Array<T1> __temp_me1)
	{
		__temp_me1.length = 0;
		__temp_me1.__a = ((T1[]) (((java.lang.Object) (new java.lang.Object[((int) (0) )]) )) );
	}
	
	
	public static  <X> haxe.root.Array<X> ofNative(X[] _native)
	{
					return new Array<X>(_native);	
	}
	
	
	public static  <Y> haxe.root.Array<Y> alloc(int size)
	{
					return new Array<Y>((Y[]) ((java.lang.Object)new java.lang.Object[size]));	
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Array<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Array<java.lang.Object>();
	}
	
	
	public    Array(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	public final   T __unsafe_set(int idx, T val)
	{
		return this.__a[idx] = val;
	}
	
	
	public final   T __unsafe_get(int idx)
	{
		return this.__a[idx];
	}
	
	
	public final   T __set(int idx, T v)
	{
		T[] __a = this.__a;
		if (( idx >= __a.length )) 
		{
			int newl = ( idx + 1 );
			T[] newArr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newl) )]) )) );
			if (( this.length > 0 )) 
			{
				java.lang.System.arraycopy(__a, 0, newArr, 0, this.length);
			}
			
			this.__a = __a = newArr;
			this.length = newl;
		}
		
		return __a[idx] = v;
	}
	
	
	public final   T __get(int idx)
	{
		T[] __a = this.__a;
		if (( ( idx >= __a.length ) || ( idx < 0 ) )) 
		{
			return null;
		}
		
		return __a[idx];
	}
	
	
	public final   java.lang.Object iterator()
	{
		haxe.root.Array<haxe.root.Array> _g = new haxe.root.Array<haxe.root.Array>(new haxe.root.Array[]{((haxe.root.Array) (this) )});
		haxe.root.Array<java.lang.Object> i = new haxe.root.Array(new java.lang.Object[]{0});
		haxe.root.Array<java.lang.Object> len = new haxe.root.Array(new java.lang.Object[]{this.length});
		java.lang.Object __temp_stmt34 = null;
		{
			haxe.lang.Function __temp_odecl32 = new haxe.root.Fun_209f3d11(i, len);
			haxe.lang.Function __temp_odecl33 = new haxe.root.Fun_72913325<T>(_g, i);
			__temp_stmt34 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"hasNext", "next"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{__temp_odecl32, __temp_odecl33}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array(new java.lang.Object[]{}));
		}
		
		return __temp_stmt34;
	}
	
	
	public final   haxe.root.Array<T> copy()
	{
		int len = this.length;
		T[] __a = this.__a;
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		java.lang.System.arraycopy(__a, 0, newarr, 0, len);
		return haxe.root.Array.ofNative(newarr);
	}
	
	
	public final   boolean remove(T x)
	{
		T[] __a = this.__a;
		int i = -1;
		int length = this.length;
		while ((  ++ i < length ))
		{
			if (haxe.lang.Runtime.eq(__a[i], x)) 
			{
				java.lang.System.arraycopy(__a, ( i + 1 ), __a, i, ( ( length - i ) - 1 ));
				__a[ -- this.length] = null;
				return true;
			}
			
		}
		
		return false;
	}
	
	
	public final   void insert(int pos, T x)
	{
		int l = this.length;
		if (( pos < 0 )) 
		{
			pos = ( l + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( pos >= l )) 
		{
			this.push(x);
			return ;
		}
		 else 
		{
			if (( pos == 0 )) 
			{
				this.unshift(x);
				return ;
			}
			
		}
		
		if (( l >= this.__a.length )) 
		{
			int newLen = ( (( this.length << 1 )) + 1 );
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newLen) )]) )) );
			java.lang.System.arraycopy(this.__a, 0, newarr, 0, pos);
			newarr[pos] = x;
			java.lang.System.arraycopy(this.__a, pos, newarr, ( pos + 1 ), ( l - pos ));
			this.__a = newarr;
			 ++ this.length;
		}
		 else 
		{
			T[] __a = this.__a;
			java.lang.System.arraycopy(__a, pos, __a, ( pos + 1 ), ( l - pos ));
			java.lang.System.arraycopy(__a, 0, __a, 0, pos);
			__a[pos] = x;
			 ++ this.length;
		}
		
	}
	
	
	public final   void unshift(T x)
	{
		T[] __a = this.__a;
		int length = this.length;
		if (( length >= __a.length )) 
		{
			int newLen = ( (( length << 1 )) + 1 );
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newLen) )]) )) );
			java.lang.System.arraycopy(__a, 0, newarr, 1, length);
			this.__a = newarr;
		}
		 else 
		{
			java.lang.System.arraycopy(__a, 0, __a, 1, length);
		}
		
		this.__a[0] = x;
		 ++ this.length;
	}
	
	
	@Override public   java.lang.String toString()
	{
		haxe.root.StringBuf ret = new haxe.root.StringBuf();
		T[] a = this.__a;
		ret.add("[");
		boolean first = true;
		{
			int _g1 = 0;
			int _g = this.length;
			while (( _g1 < _g ))
			{
				int i = _g1++;
				if (first) 
				{
					first = false;
				}
				 else 
				{
					ret.add(",");
				}
				
				ret.add(a[i]);
			}
			
		}
		
		ret.add("]");
		return ret.toString();
	}
	
	
	public final   void spliceVoid(int pos, int len)
	{
		if (( len < 0 )) 
		{
			return ;
		}
		
		if (( pos < 0 )) 
		{
			pos = ( this.length + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( pos > this.length )) 
		{
			pos = 0;
			len = 0;
		}
		 else 
		{
			if (( ( pos + len ) > this.length )) 
			{
				len = ( this.length - pos );
				if (( len < 0 )) 
				{
					len = 0;
				}
				
			}
			
		}
		
		T[] a = this.__a;
		int end = ( pos + len );
		java.lang.System.arraycopy(a, end, a, pos, ( this.length - end ));
		this.length -= len;
		while ((  -- len >= 0 ))
		{
			a[( this.length + len )] = null;
		}
		
	}
	
	
	public final   haxe.root.Array<T> splice(int pos, int len)
	{
		if (( len < 0 )) 
		{
			return new haxe.root.Array<T>();
		}
		
		if (( pos < 0 )) 
		{
			pos = ( this.length + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( pos > this.length )) 
		{
			pos = 0;
			len = 0;
		}
		 else 
		{
			if (( ( pos + len ) > this.length )) 
			{
				len = ( this.length - pos );
				if (( len < 0 )) 
				{
					len = 0;
				}
				
			}
			
		}
		
		T[] a = this.__a;
		T[] ret = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		java.lang.System.arraycopy(a, pos, ret, 0, len);
		haxe.root.Array<T> ret1 = haxe.root.Array.ofNative(ret);
		int end = ( pos + len );
		java.lang.System.arraycopy(a, end, a, pos, ( this.length - end ));
		this.length -= len;
		while ((  -- len >= 0 ))
		{
			a[( this.length + len )] = null;
		}
		
		return ret1;
	}
	
	
	public final   void quicksort(int lo, int hi, haxe.lang.Function f)
	{
		T[] buf = this.__a;
		int i = lo;
		int j = hi;
		T p = buf[( ( i + j ) >> 1 )];
		while (( i <= j ))
		{
			while (( ((int) (f.__hx_invoke2_f(0.0, 0.0, buf[i], p)) ) < 0 ))
			{
				i++;
			}
			
			while (( ((int) (f.__hx_invoke2_f(0.0, 0.0, buf[j], p)) ) > 0 ))
			{
				j--;
			}
			
			if (( i <= j )) 
			{
				T t = buf[i];
				buf[i++] = buf[j];
				buf[j--] = t;
			}
			
		}
		
		if (( lo < j )) 
		{
			this.quicksort(lo, j, f);
		}
		
		if (( i < hi )) 
		{
			this.quicksort(i, hi, f);
		}
		
	}
	
	
	public final   void sort(haxe.lang.Function f)
	{
		if (( this.length == 0 )) 
		{
			return ;
		}
		
		this.quicksort(0, ( this.length - 1 ), f);
	}
	
	
	public final   haxe.root.Array<T> slice(int pos, java.lang.Object end)
	{
		if (( pos < 0 )) 
		{
			pos = ( this.length + pos );
			if (( pos < 0 )) 
			{
				pos = 0;
			}
			
		}
		
		if (( end == null )) 
		{
			end = this.length;
		}
		 else 
		{
			if (( haxe.lang.Runtime.compare(end, 0) < 0 )) 
			{
				end = haxe.lang.Runtime.toInt(haxe.lang.Runtime.plus(this.length, end));
			}
			
		}
		
		if (( haxe.lang.Runtime.compare(end, this.length) > 0 )) 
		{
			end = this.length;
		}
		
		int len = ( haxe.lang.Runtime.toInt(end) - ((int) (pos) ) );
		if (( len < 0 )) 
		{
			return new haxe.root.Array<T>();
		}
		
		T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		java.lang.System.arraycopy(this.__a, pos, newarr, 0, len);
		return haxe.root.Array.ofNative(newarr);
	}
	
	
	public final   java.lang.Object shift()
	{
		int l = this.length;
		if (( l == 0 )) 
		{
			return null;
		}
		
		T[] a = this.__a;
		T x = a[0];
		l -= 1;
		java.lang.System.arraycopy(a, 1, a, 0, ( this.length - 1 ));
		a[l] = null;
		this.length = l;
		return x;
	}
	
	
	public final   void reverse()
	{
		int i = 0;
		int l = this.length;
		T[] a = this.__a;
		int half = ( l >> 1 );
		l -= 1;
		while (( i < half ))
		{
			T tmp = a[i];
			a[i] = a[( l - i )];
			a[( l - i )] = tmp;
			i += 1;
		}
		
	}
	
	
	public final   int push(T x)
	{
		int length = this.length;
		if (( length >= this.__a.length )) 
		{
			int newLen = ( (( length << 1 )) + 1 );
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newLen) )]) )) );
			java.lang.System.arraycopy(this.__a, 0, newarr, 0, this.__a.length);
			this.__a = newarr;
		}
		
		this.__a[length] = x;
		return this.length++;
	}
	
	
	public final   java.lang.Object pop()
	{
		T[] __a = this.__a;
		int length = this.length;
		if (( length > 0 )) 
		{
			T val = __a[ -- length];
			__a[length] = null;
			this.length = length;
			return val;
		}
		 else 
		{
			return null;
		}
		
	}
	
	
	public final   java.lang.String join(java.lang.String sep)
	{
		haxe.root.StringBuf buf = new haxe.root.StringBuf();
		int i = -1;
		boolean first = true;
		int length = this.length;
		while ((  ++ i < length ))
		{
			if (first) 
			{
				first = false;
			}
			 else 
			{
				buf.add(sep);
			}
			
			buf.add(this.__a[i]);
		}
		
		return buf.toString();
	}
	
	
	public final   void concatNative(T[] a)
	{
		T[] __a = this.__a;
		int length = this.length;
		int len = ( length + a.length );
		if (( __a.length >= len )) 
		{
			java.lang.System.arraycopy(a, 0, __a, length, length);
		}
		 else 
		{
			T[] newarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
			java.lang.System.arraycopy(__a, 0, newarr, 0, length);
			java.lang.System.arraycopy(a, 0, newarr, length, a.length);
			this.__a = newarr;
		}
		
		this.length = len;
	}
	
	
	public final   haxe.root.Array<T> concat(haxe.root.Array<T> a)
	{
		int length = this.length;
		int len = ( length + a.length );
		T[] retarr = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (len) )]) )) );
		java.lang.System.arraycopy(this.__a, 0, retarr, 0, length);
		java.lang.System.arraycopy(a.__a, 0, retarr, length, a.length);
		return haxe.root.Array.ofNative(retarr);
	}
	
	
	public  T[] __a;
	
	public  int length;
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef35 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef35 = false;
						return this.length = ((int) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef35) 
			{
				return super.__hx_setField_f(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_setField(java.lang.String field, java.lang.Object value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef36 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef36 = false;
						return this.length = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 94337:
				{
					if (field.equals("__a")) 
					{
						__temp_executeDef36 = false;
						return this.__a = ((T[]) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef36) 
			{
				return super.__hx_setField(field, value, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_getField(java.lang.String field, boolean throwErrors, boolean isCheck, boolean handleProperties)
	{
		{
			boolean __temp_executeDef37 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef37 = false;
						return this.length;
					}
					
					break;
				}
				
				
				case -537840087:
				{
					if (field.equals("__unsafe_set")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "__unsafe_set");
					}
					
					break;
				}
				
				
				case 94337:
				{
					if (field.equals("__a")) 
					{
						__temp_executeDef37 = false;
						return this.__a;
					}
					
					break;
				}
				
				
				case -537851619:
				{
					if (field.equals("__unsafe_get")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "__unsafe_get");
					}
					
					break;
				}
				
				
				case -1354795244:
				{
					if (field.equals("concat")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "concat");
					}
					
					break;
				}
				
				
				case 90678402:
				{
					if (field.equals("__set")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "__set");
					}
					
					break;
				}
				
				
				case -1238494133:
				{
					if (field.equals("concatNative")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "concatNative");
					}
					
					break;
				}
				
				
				case 90666870:
				{
					if (field.equals("__get")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "__get");
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "join");
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "iterator");
					}
					
					break;
				}
				
				
				case 111185:
				{
					if (field.equals("pop")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "pop");
					}
					
					break;
				}
				
				
				case 3059573:
				{
					if (field.equals("copy")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "copy");
					}
					
					break;
				}
				
				
				case 3452698:
				{
					if (field.equals("push")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "push");
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "remove");
					}
					
					break;
				}
				
				
				case 1099846370:
				{
					if (field.equals("reverse")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "reverse");
					}
					
					break;
				}
				
				
				case -1183792455:
				{
					if (field.equals("insert")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "insert");
					}
					
					break;
				}
				
				
				case 109407362:
				{
					if (field.equals("shift")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "shift");
					}
					
					break;
				}
				
				
				case -277637751:
				{
					if (field.equals("unshift")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "unshift");
					}
					
					break;
				}
				
				
				case 109526418:
				{
					if (field.equals("slice")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "slice");
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case 3536286:
				{
					if (field.equals("sort")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "sort");
					}
					
					break;
				}
				
				
				case -821858768:
				{
					if (field.equals("spliceVoid")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "spliceVoid");
					}
					
					break;
				}
				
				
				case 1301699851:
				{
					if (field.equals("quicksort")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "quicksort");
					}
					
					break;
				}
				
				
				case -895859076:
				{
					if (field.equals("splice")) 
					{
						__temp_executeDef37 = false;
						return new haxe.lang.Closure(this, "splice");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef37) 
			{
				return super.__hx_getField(field, throwErrors, isCheck, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   double __hx_getField_f(java.lang.String field, boolean throwErrors, boolean handleProperties)
	{
		{
			boolean __temp_executeDef38 = true;
			switch (field.hashCode())
			{
				case -1106363674:
				{
					if (field.equals("length")) 
					{
						__temp_executeDef38 = false;
						return this.length;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef38) 
			{
				return super.__hx_getField_f(field, throwErrors, handleProperties);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   java.lang.Object __hx_invokeField(java.lang.String field, haxe.root.Array dynargs)
	{
		{
			boolean __temp_executeDef39 = true;
			switch (field.hashCode())
			{
				case -1354795244:
				{
					if (field.equals("concat")) 
					{
						__temp_executeDef39 = false;
						return this.concat(((haxe.root.Array<T>) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case -537840087:
				{
					if (field.equals("__unsafe_set")) 
					{
						__temp_executeDef39 = false;
						return this.__unsafe_set(haxe.lang.Runtime.toInt(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -1238494133:
				{
					if (field.equals("concatNative")) 
					{
						__temp_executeDef39 = false;
						this.concatNative(((T[]) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case -537851619:
				{
					if (field.equals("__unsafe_get")) 
					{
						__temp_executeDef39 = false;
						return this.__unsafe_get(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 3267882:
				{
					if (field.equals("join")) 
					{
						__temp_executeDef39 = false;
						return this.join(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 90678402:
				{
					if (field.equals("__set")) 
					{
						__temp_executeDef39 = false;
						return this.__set(haxe.lang.Runtime.toInt(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case 111185:
				{
					if (field.equals("pop")) 
					{
						__temp_executeDef39 = false;
						return this.pop();
					}
					
					break;
				}
				
				
				case 90666870:
				{
					if (field.equals("__get")) 
					{
						__temp_executeDef39 = false;
						return this.__get(haxe.lang.Runtime.toInt(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 3452698:
				{
					if (field.equals("push")) 
					{
						__temp_executeDef39 = false;
						return this.push(((T) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef39 = false;
						return this.iterator();
					}
					
					break;
				}
				
				
				case 1099846370:
				{
					if (field.equals("reverse")) 
					{
						__temp_executeDef39 = false;
						this.reverse();
						return null;
					}
					
					break;
				}
				
				
				case 3059573:
				{
					if (field.equals("copy")) 
					{
						__temp_executeDef39 = false;
						return this.copy();
					}
					
					break;
				}
				
				
				case 109407362:
				{
					if (field.equals("shift")) 
					{
						__temp_executeDef39 = false;
						return this.shift();
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef39 = false;
						return this.remove(((T) (dynargs.__get(0)) ));
					}
					
					break;
				}
				
				
				case 109526418:
				{
					if (field.equals("slice")) 
					{
						__temp_executeDef39 = false;
						return this.slice(haxe.lang.Runtime.toInt(dynargs.__get(0)), dynargs.__get(1));
					}
					
					break;
				}
				
				
				case -1183792455:
				{
					if (field.equals("insert")) 
					{
						__temp_executeDef39 = false;
						this.insert(haxe.lang.Runtime.toInt(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
						return null;
					}
					
					break;
				}
				
				
				case 3536286:
				{
					if (field.equals("sort")) 
					{
						__temp_executeDef39 = false;
						this.sort(((haxe.lang.Function) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case -277637751:
				{
					if (field.equals("unshift")) 
					{
						__temp_executeDef39 = false;
						this.unshift(((T) (dynargs.__get(0)) ));
						return null;
					}
					
					break;
				}
				
				
				case 1301699851:
				{
					if (field.equals("quicksort")) 
					{
						__temp_executeDef39 = false;
						this.quicksort(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)), ((haxe.lang.Function) (dynargs.__get(2)) ));
						return null;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef39 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case -895859076:
				{
					if (field.equals("splice")) 
					{
						__temp_executeDef39 = false;
						return this.splice(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)));
					}
					
					break;
				}
				
				
				case -821858768:
				{
					if (field.equals("spliceVoid")) 
					{
						__temp_executeDef39 = false;
						this.spliceVoid(haxe.lang.Runtime.toInt(dynargs.__get(0)), haxe.lang.Runtime.toInt(dynargs.__get(1)));
						return null;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef39) 
			{
				return super.__hx_invokeField(field, dynargs);
			}
			 else 
			{
				throw null;
			}
			
		}
		
	}
	
	
	@Override public   void __hx_getFields(haxe.root.Array<java.lang.String> baseArr)
	{
		baseArr.push("length");
		baseArr.push("__a");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


