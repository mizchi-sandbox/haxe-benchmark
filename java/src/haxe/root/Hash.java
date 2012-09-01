package haxe.root;
import haxe.root.*;
@SuppressWarnings(value={"rawtypes", "unchecked"})
public  class Hash<T> extends haxe.lang.HxObject
{
	public    Hash()
	{
		super();
		haxe.root.Hash.__hx_ctor(this);
	}
	
	
	public static  <T1> void __hx_ctor(haxe.root.Hash<T1> __temp_me3)
	{
		__temp_me3.cachedIndex = -1;
	}
	
	
	public static   java.lang.Object __hx_createEmpty()
	{
		return new haxe.root.Hash<java.lang.Object>(haxe.lang.EmptyObject.EMPTY);
	}
	
	
	public static   java.lang.Object __hx_create(haxe.root.Array arr)
	{
		return new haxe.root.Hash<java.lang.Object>();
	}
	
	
	public    Hash(haxe.lang.EmptyObject empty)
	{
		super();
	}
	
	
	@Override public   java.lang.String toString()
	{
		haxe.root.StringBuf s = new haxe.root.StringBuf();
		s.add("{");
		java.lang.Object it = this.keys();
		{
			java.lang.Object __temp_iterator13 = it;
			while (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(__temp_iterator13, "hasNext", null)))
			{
				java.lang.String i = haxe.lang.Runtime.toString(haxe.lang.Runtime.callField(__temp_iterator13, "next", null));
				s.add(i);
				s.add(" => ");
				s.add(haxe.lang.Runtime.toString(this.get(i)));
				if (haxe.lang.Runtime.toBool(haxe.lang.Runtime.callField(it, "hasNext", null))) 
				{
					s.add(", ");
				}
				
			}
			
		}
		
		s.add("}");
		return s.toString();
	}
	
	
	public   java.lang.Object iterator()
	{
		haxe.root.Array<haxe.root.Hash> _g1 = new haxe.root.Array<haxe.root.Hash>(new haxe.root.Hash[]{((haxe.root.Hash) (this) )});
		haxe.root.Array<java.lang.Object> i = new haxe.root.Array(new java.lang.Object[]{0});
		haxe.root.Array<java.lang.Object> len = new haxe.root.Array(new java.lang.Object[]{this.nBuckets});
		java.lang.Object __temp_stmt48 = null;
		{
			haxe.lang.Function __temp_odecl46 = new haxe.root.Fun_1f2c5e17<T>(i, len, _g1);
			haxe.lang.Function __temp_odecl47 = new haxe.root.Fun_ba6354f1<T>(_g1, i);
			__temp_stmt48 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"hasNext", "next"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{__temp_odecl46, __temp_odecl47}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array(new java.lang.Object[]{}));
		}
		
		return __temp_stmt48;
	}
	
	
	public   java.lang.Object keys()
	{
		haxe.root.Array<haxe.root.Hash> _g1 = new haxe.root.Array<haxe.root.Hash>(new haxe.root.Hash[]{((haxe.root.Hash) (this) )});
		haxe.root.Array<java.lang.Object> i = new haxe.root.Array(new java.lang.Object[]{0});
		haxe.root.Array<java.lang.Object> len = new haxe.root.Array(new java.lang.Object[]{this.nBuckets});
		java.lang.Object __temp_stmt51 = null;
		{
			haxe.lang.Function __temp_odecl49 = new haxe.root.Fun_3ff0e6f1<T>(i, len, _g1);
			haxe.lang.Function __temp_odecl50 = new haxe.root.Fun_dea16036<T>(_g1, i);
			__temp_stmt51 = new haxe.lang.DynamicObject(new haxe.root.Array<java.lang.String>(new java.lang.String[]{"hasNext", "next"}), new haxe.root.Array<java.lang.Object>(new java.lang.Object[]{__temp_odecl49, __temp_odecl50}), new haxe.root.Array<java.lang.String>(new java.lang.String[]{}), new haxe.root.Array(new java.lang.Object[]{}));
		}
		
		return __temp_stmt51;
	}
	
	
	public   boolean remove(java.lang.String key)
	{
		int idx = -1;
		if ( ! ((( haxe.lang.Runtime.valEq(this.cachedKey, key) && ( (idx = this.cachedIndex) != -1 ) ))) ) 
		{
			idx = this.lookup(key);
		}
		
		if (( idx == -1 )) 
		{
			return false;
		}
		 else 
		{
			if (haxe.lang.Runtime.valEq(this.cachedKey, key)) 
			{
				this.cachedIndex = -1;
			}
			
			this.hashes[idx] = 0;
			this._keys[idx] = null;
			this.vals[idx] = null;
			 -- this.size;
			return true;
		}
		
	}
	
	
	public   boolean exists(java.lang.String key)
	{
		int idx = -1;
		if (( haxe.lang.Runtime.valEq(this.cachedKey, key) && ( (idx = this.cachedIndex) != -1 ) )) 
		{
			return true;
		}
		
		idx = this.lookup(key);
		if (( idx != -1 )) 
		{
			this.cachedKey = key;
			this.cachedIndex = idx;
			return true;
		}
		
		return false;
	}
	
	
	public   T getDefault(java.lang.String key, T def)
	{
		int idx = -1;
		if (( haxe.lang.Runtime.valEq(this.cachedKey, key) && ( (idx = this.cachedIndex) != -1 ) )) 
		{
			return this.vals[idx];
		}
		
		idx = this.lookup(key);
		if (( idx != -1 )) 
		{
			this.cachedKey = key;
			this.cachedIndex = idx;
			return this.vals[idx];
		}
		
		return def;
	}
	
	
	public   java.lang.Object get(java.lang.String key)
	{
		int idx = -1;
		if (( haxe.lang.Runtime.valEq(this.cachedKey, key) && ( (idx = this.cachedIndex) != -1 ) )) 
		{
			return this.vals[idx];
		}
		
		idx = this.lookup(key);
		if (( idx != -1 )) 
		{
			this.cachedKey = key;
			this.cachedIndex = idx;
			return this.vals[idx];
		}
		
		return null;
	}
	
	
	public   void resize(int newNBuckets)
	{
		int[] newHash = null;
		int j = 1;
		{
			{
				int x = newNBuckets;
				 -- x;
				x |= ( x >>> 1 );
				x |= ( x >>> 2 );
				x |= ( x >>> 4 );
				x |= ( x >>> 8 );
				x |= ( x >>> 16 );
				newNBuckets =  ++ x;
			}
			
			if (( newNBuckets < 4 )) 
			{
				newNBuckets = 4;
			}
			
			if (( this.size >= ( ( newNBuckets * 0.77 ) + 0.5 ) )) 
			{
				j = 0;
			}
			 else 
			{
				int nfSize = newNBuckets;
				newHash = new int[((int) (nfSize) )];
				if (( this.nBuckets < newNBuckets )) 
				{
					java.lang.String[] k = new java.lang.String[((int) (newNBuckets) )];
					if (( this._keys != null )) 
					{
						java.lang.System.arraycopy(this._keys, 0, k, 0, this.nBuckets);
					}
					
					this._keys = k;
					T[] v = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newNBuckets) )]) )) );
					if (( this.vals != null )) 
					{
						java.lang.System.arraycopy(this.vals, 0, v, 0, this.nBuckets);
					}
					
					this.vals = v;
				}
				
			}
			
		}
		
		if (( j != 0 )) 
		{
			this.cachedKey = null;
			this.cachedIndex = -1;
			j = -1;
			int nBuckets = this.nBuckets;
			java.lang.String[] _keys = this._keys;
			T[] vals = this.vals;
			int[] hashes = this.hashes;
			int newMask = ( newNBuckets - 1 );
			while ((  ++ j < nBuckets ))
			{
				int k = 0;
				if ( ! ((( (( (k = hashes[j]) & -2 )) == 0 ))) ) 
				{
					java.lang.String key = _keys[j];
					T val = vals[j];
					hashes[j] = 1;
					while (true)
					{
						int nProbes = 0;
						int i = ( k & newMask );
						while ( ! ((( newHash[i] == 0 ))) )
						{
							i = ( ( i +  ++ nProbes ) & newMask );
						}
						
						newHash[i] = k;
						if (( ( i < nBuckets ) &&  ! ((( (( (k = hashes[i]) & -2 )) == 0 )))  )) 
						{
							{
								java.lang.String tmp = _keys[i];
								_keys[i] = key;
								key = tmp;
							}
							
							{
								T tmp = vals[i];
								vals[i] = val;
								val = tmp;
							}
							
							hashes[i] = 1;
						}
						 else 
						{
							_keys[i] = key;
							vals[i] = val;
							break;
						}
						
					}
					
				}
				
			}
			
			if (( nBuckets > newNBuckets )) 
			{
				{
					java.lang.String[] k = new java.lang.String[((int) (newNBuckets) )];
					java.lang.System.arraycopy(_keys, 0, k, 0, newNBuckets);
					this._keys = k;
				}
				
				{
					T[] v = ((T[]) (((java.lang.Object) (new java.lang.Object[((int) (newNBuckets) )]) )) );
					java.lang.System.arraycopy(vals, 0, v, 0, newNBuckets);
					this.vals = v;
				}
				
			}
			
			this.hashes = newHash;
			this.nBuckets = newNBuckets;
			this.nOccupied = this.size;
			this.upperBound = ((int) (( ( newNBuckets * 0.77 ) + .5 )) );
		}
		
	}
	
	
	public   int lookup(java.lang.String key)
	{
		if (( this.nBuckets != 0 )) 
		{
			int[] hashes = this.hashes;
			java.lang.String[] keys = this._keys;
			int mask = ( this.nBuckets - 1 );
			int hash = 0;
			{
				int k = key.hashCode();
				k = ( ( k + 2127912214 ) + (( k << 12 )) );
				k = ( ( k ^ -949894596 ) ^ ( k >> 19 ) );
				k = ( ( k + 374761393 ) + (( k << 5 )) );
				k = ( ( k + -744332180 ) ^ ( k << 9 ) );
				k = ( ( k + -42973499 ) + (( k << 3 )) );
				k = ( ( k ^ -1252372727 ) ^ ( k >> 16 ) );
				int ret = k;
				if (( (( ret & -2 )) == 0 )) 
				{
					if (( ret == 0 )) 
					{
						ret = 2;
					}
					 else 
					{
						ret = -1;
					}
					
				}
				
				hash = ret;
			}
			
			int k = hash;
			int nProbes = 0;
			int i = ( k & mask );
			int last = i;
			int flag = 0;
			while ((  ! ((( (flag = hashes[i]) == 0 )))  && (( ( ( flag == 1 ) || ( flag != k ) ) ||  ! (haxe.lang.Runtime.valEq(keys[i], key))  )) ))
			{
				i = ( ( i +  ++ nProbes ) & mask );
			}
			
			return ( (( (( flag & -2 )) == 0 )) ? (-1) : (i) );
		}
		
		return -1;
	}
	
	
	public   void set(java.lang.String key, T value)
	{
		int x = 0;
		int k = 0;
		if (( this.nOccupied >= this.upperBound )) 
		{
			if (( this.nBuckets > ( this.size << 1 ) )) 
			{
				this.resize(( this.nBuckets - 1 ));
			}
			 else 
			{
				this.resize(( this.nBuckets + 2 ));
			}
			
		}
		
		int[] hashes = this.hashes;
		java.lang.String[] keys = this._keys;
		int[] hashes1 = hashes;
		{
			int mask = ( (( this.nBuckets == 0 )) ? (0) : (( this.nBuckets - 1 )) );
			int site = x = this.nBuckets;
			{
				int k1 = key.hashCode();
				k1 = ( ( k1 + 2127912214 ) + (( k1 << 12 )) );
				k1 = ( ( k1 ^ -949894596 ) ^ ( k1 >> 19 ) );
				k1 = ( ( k1 + 374761393 ) + (( k1 << 5 )) );
				k1 = ( ( k1 + -744332180 ) ^ ( k1 << 9 ) );
				k1 = ( ( k1 + -42973499 ) + (( k1 << 3 )) );
				k1 = ( ( k1 ^ -1252372727 ) ^ ( k1 >> 16 ) );
				int ret = k1;
				if (( (( ret & -2 )) == 0 )) 
				{
					if (( ret == 0 )) 
					{
						ret = 2;
					}
					 else 
					{
						ret = -1;
					}
					
				}
				
				k = ret;
			}
			
			int i = ( k & mask );
			int nProbes = 0;
			if (( (( hashes1[i] & -2 )) == 0 )) 
			{
				x = i;
			}
			 else 
			{
				int last = i;
				int flag = 0;
				while ( ! ((( ( (( (flag = hashes1[i]) & -2 )) == 0 ) || ( ( flag == k ) && haxe.lang.Runtime.valEq(this._keys[i], key) ) ))) )
				{
					i = ( ( i +  ++ nProbes ) & mask );
				}
				
				x = i;
			}
			
		}
		
		int flag = hashes1[x];
		if (( flag == 0 )) 
		{
			keys[x] = key;
			this.vals[x] = value;
			hashes1[x] = k;
			this.size++;
			this.nOccupied++;
		}
		 else 
		{
			if (( flag == 1 )) 
			{
				keys[x] = key;
				this.vals[x] = value;
				hashes1[x] = k;
				this.size++;
			}
			 else 
			{
				this.vals[x] = value;
			}
			
		}
		
		this.cachedIndex = x;
		this.cachedKey = key;
	}
	
	
	public  int cachedIndex;
	
	public  java.lang.String cachedKey;
	
	public  int upperBound;
	
	public  int nOccupied;
	
	public  int size;
	
	public  int nBuckets;
	
	public  T[] vals;
	
	public  java.lang.String[] _keys;
	
	public  int[] hashes;
	
	@Override public   double __hx_setField_f(java.lang.String field, double value, boolean handleProperties)
	{
		{
			boolean __temp_executeDef52 = true;
			switch (field.hashCode())
			{
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef52 = false;
						return this.nBuckets = ((int) (value) );
					}
					
					break;
				}
				
				
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef52 = false;
						return this.cachedIndex = ((int) (value) );
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef52 = false;
						return this.size = ((int) (value) );
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef52 = false;
						return this.upperBound = ((int) (value) );
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef52 = false;
						return this.nOccupied = ((int) (value) );
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef52) 
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
			boolean __temp_executeDef53 = true;
			switch (field.hashCode())
			{
				case -1224424900:
				{
					if (field.equals("hashes")) 
					{
						__temp_executeDef53 = false;
						return this.hashes = ((int[]) (value) );
					}
					
					break;
				}
				
				
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef53 = false;
						return this.cachedIndex = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 91023059:
				{
					if (field.equals("_keys")) 
					{
						__temp_executeDef53 = false;
						return this._keys = ((java.lang.String[]) (value) );
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						__temp_executeDef53 = false;
						return this.cachedKey = haxe.lang.Runtime.toString(value);
					}
					
					break;
				}
				
				
				case 3612018:
				{
					if (field.equals("vals")) 
					{
						__temp_executeDef53 = false;
						return this.vals = ((T[]) (value) );
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef53 = false;
						return this.upperBound = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef53 = false;
						return this.nBuckets = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef53 = false;
						return this.nOccupied = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef53 = false;
						return this.size = haxe.lang.Runtime.toInt(value);
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef53) 
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
			boolean __temp_executeDef54 = true;
			switch (field.hashCode())
			{
				case -1224424900:
				{
					if (field.equals("hashes")) 
					{
						__temp_executeDef54 = false;
						return this.hashes;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "toString");
					}
					
					break;
				}
				
				
				case 91023059:
				{
					if (field.equals("_keys")) 
					{
						__temp_executeDef54 = false;
						return this._keys;
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "iterator");
					}
					
					break;
				}
				
				
				case 3612018:
				{
					if (field.equals("vals")) 
					{
						__temp_executeDef54 = false;
						return this.vals;
					}
					
					break;
				}
				
				
				case 3288564:
				{
					if (field.equals("keys")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "keys");
					}
					
					break;
				}
				
				
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef54 = false;
						return this.nBuckets;
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "remove");
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef54 = false;
						return this.size;
					}
					
					break;
				}
				
				
				case -1289358244:
				{
					if (field.equals("exists")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "exists");
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef54 = false;
						return this.nOccupied;
					}
					
					break;
				}
				
				
				case -1713303029:
				{
					if (field.equals("getDefault")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "getDefault");
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef54 = false;
						return this.upperBound;
					}
					
					break;
				}
				
				
				case 102230:
				{
					if (field.equals("get")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "get");
					}
					
					break;
				}
				
				
				case -553141795:
				{
					if (field.equals("cachedKey")) 
					{
						__temp_executeDef54 = false;
						return this.cachedKey;
					}
					
					break;
				}
				
				
				case -934437708:
				{
					if (field.equals("resize")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "resize");
					}
					
					break;
				}
				
				
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef54 = false;
						return this.cachedIndex;
					}
					
					break;
				}
				
				
				case -1097094790:
				{
					if (field.equals("lookup")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "lookup");
					}
					
					break;
				}
				
				
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef54 = false;
						return new haxe.lang.Closure(this, "set");
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef54) 
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
			boolean __temp_executeDef55 = true;
			switch (field.hashCode())
			{
				case 325636987:
				{
					if (field.equals("nBuckets")) 
					{
						__temp_executeDef55 = false;
						return this.nBuckets;
					}
					
					break;
				}
				
				
				case 1005083856:
				{
					if (field.equals("cachedIndex")) 
					{
						__temp_executeDef55 = false;
						return this.cachedIndex;
					}
					
					break;
				}
				
				
				case 3530753:
				{
					if (field.equals("size")) 
					{
						__temp_executeDef55 = false;
						return this.size;
					}
					
					break;
				}
				
				
				case -1690761732:
				{
					if (field.equals("upperBound")) 
					{
						__temp_executeDef55 = false;
						return this.upperBound;
					}
					
					break;
				}
				
				
				case -394102484:
				{
					if (field.equals("nOccupied")) 
					{
						__temp_executeDef55 = false;
						return this.nOccupied;
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef55) 
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
			boolean __temp_executeDef56 = true;
			switch (field.hashCode())
			{
				case 113762:
				{
					if (field.equals("set")) 
					{
						__temp_executeDef56 = false;
						this.set(haxe.lang.Runtime.toString(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
						return null;
					}
					
					break;
				}
				
				
				case -1776922004:
				{
					if (field.equals("toString")) 
					{
						__temp_executeDef56 = false;
						return this.toString();
					}
					
					break;
				}
				
				
				case -1097094790:
				{
					if (field.equals("lookup")) 
					{
						__temp_executeDef56 = false;
						return this.lookup(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case 1182533742:
				{
					if (field.equals("iterator")) 
					{
						__temp_executeDef56 = false;
						return this.iterator();
					}
					
					break;
				}
				
				
				case -934437708:
				{
					if (field.equals("resize")) 
					{
						__temp_executeDef56 = false;
						this.resize(haxe.lang.Runtime.toInt(dynargs.__get(0)));
						return null;
					}
					
					break;
				}
				
				
				case 3288564:
				{
					if (field.equals("keys")) 
					{
						__temp_executeDef56 = false;
						return this.keys();
					}
					
					break;
				}
				
				
				case 102230:
				{
					if (field.equals("get")) 
					{
						__temp_executeDef56 = false;
						return this.get(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -934610812:
				{
					if (field.equals("remove")) 
					{
						__temp_executeDef56 = false;
						return this.remove(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
				case -1713303029:
				{
					if (field.equals("getDefault")) 
					{
						__temp_executeDef56 = false;
						return this.getDefault(haxe.lang.Runtime.toString(dynargs.__get(0)), ((T) (dynargs.__get(1)) ));
					}
					
					break;
				}
				
				
				case -1289358244:
				{
					if (field.equals("exists")) 
					{
						__temp_executeDef56 = false;
						return this.exists(haxe.lang.Runtime.toString(dynargs.__get(0)));
					}
					
					break;
				}
				
				
			}
			
			if (__temp_executeDef56) 
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
		baseArr.push("hashes");
		baseArr.push("_keys");
		baseArr.push("vals");
		baseArr.push("nBuckets");
		baseArr.push("size");
		baseArr.push("nOccupied");
		baseArr.push("upperBound");
		baseArr.push("cachedKey");
		baseArr.push("cachedIndex");
		{
			super.__hx_getFields(baseArr);
		}
		
	}
	
	
}


