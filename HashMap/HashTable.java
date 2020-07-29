import java.util.*;
 public class HashTable<K,V> extends GenericLinkedList{

	class HTpair{

		K key;
		V value;

		HTpair(K key,V value){
			this.key = key;
			this.value = value;
		}

		public boolean equals(Object other){
		HTpair op = (HTpair)other;
		return this.key.equals(op.key); 
	}


	public String toString(){
		return "{"+this.key+"-"+this.value+"}";
	}

 }
	 GenericLinkedList<HTpair>[] bucketArray;
	private int size;

	public static final int DEFAULT_CAPACITY = 10;

	public HashTable(){
		this(DEFAULT_CAPACITY);
	}

	public HashTable(int capacity){
		this.bucketArray = (GenericLinkedList<HTpair>[])new GenericLinkedList[capacity];
		this.size = 0 ;
	}

	public void put(K key,V value)throws Exception{
		int bi = hashFunction(key);// best index - bi
		GenericLinkedList<HTpair> bucket =  this.bucketArray[bi];

		HTpair pta = new HTpair(key,value); // pair to be added
		if(bucket == null){
			bucket = new GenericLinkedList<HTpair>();
			bucket.insertAtLast(pta);
			this.bucketArray[bi] = bucket;
			this.size++;
		}else{

			int findAt = bucket.findElement(pta);

			if(findAt == -1){
				bucket.insertAtLast(pta);
				this.size++;
			}else{
				HTpair pair = bucket.getAt(findAt);
				pair.value = value;
			}

		}

			// double lamda = (this.size * 1.0)/this.bucketArray.length;

			// if(lamda > 2){
			// 	this.rehash();
			// }

	}

	private void rehash()throws Exception{

		GenericLinkedList<HTpair>[] oba  = this.bucketArray; // oba - old bucket Array
		this.bucketArray = (GenericLinkedList<HTpair>[])new GenericLinkedList[2*oba.length];
		this.size = 0 ;

			for(GenericLinkedList<HTpair> ob : oba){

				while(ob !=null && !ob.isEmpty()){

					HTpair pair = ob.deleteAtBeg();
					this.put(pair.key , pair.value);
				
				}
			}

	}	

	public V get(K key)throws Exception{

		int bi  = hashFunction(key);

		GenericLinkedList<HTpair> bucket = this.bucketArray[bi];

		HTpair ptf = new HTpair(key,null);// ptf - pair to find

		if(bucket == null){
			return null;

		}else{

			int findAt = bucket.findElement(ptf);

			if(findAt == -1){
				return null;
			}else{

				HTpair pair = bucket.getAt(findAt);
				return pair.value;
			}
			

		}

	}

	public V remove(K key)throws Exception{

		int bi  = hashFunction(key); // bi - basically best index for check

		GenericLinkedList<HTpair> bucket = this.bucketArray[bi];

		HTpair ptf = new HTpair(key,null); // ptf - pair to find

		if(bucket == null){
			return null;

		}else{

			int findAt = bucket.findElement(ptf);

			if(findAt == -1){
				return null;
			}else{

				HTpair pair = bucket.getAt(findAt);
				bucket.deleteAt(findAt);
				this.size--;

				return pair.value;
			}
			

		}

	}


	public void display(){
		for(GenericLinkedList<HTpair> bucket : this.bucketArray){
			if(bucket != null && !bucket.isEmpty()){
				bucket.display();
				System.out.println("*************************************");
			}else{
				System.out.println("NULL");
				System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			}

			
		}

		
	}

	private int hashFunction(K key){
		int hashcode = key.hashCode();
		Math.abs(hashcode);
		int bi = hashcode % this.bucketArray.length;
		return bi;
	
	}

	
		
}