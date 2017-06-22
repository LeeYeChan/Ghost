import java.util.ArrayList;

/**
  * newMap.java - a class that demonstrates the use of Map
  * comments.
  * 2017.06.23 - GBC world
  * @author LeeYeChan
  */

public class newMap<K, V>{

	/**
	  * set the value of keys and value
	  * use ArrayList
	  */
	
	private K key;
	private V valul;
	private ArrayList<K> arr_key = new ArrayList<>();
	private ArrayList<V> arr_value = new ArrayList<>();

	/**
	  * put key and value to the MAP
	  * @param key
	  * @param value
	  * at first, search if there is key in arraylist
	  * then, add
	  */

	public void put(K key, V value){ //put method
		int index;

		if(constainsKey(key)){
			index = arr_key.indexOf(key);
			arr_key.set(index,key);
			arr_value.set(index,value);
		}else{
			arr_key.add(key);
			arr_value.add(value);
		}
	}

	/**
	  * mothod that get value from the key
	  * @param key
	  */

	public V get(K key){
		V temp;
		int index;

		if(constainsKey(key)){
			index = arr_key.indexOf(key);
			temp = arr_value.get(index);
			return temp;
		}
		return null;
	}

	/**
	  * mothod that confirm if there is key in arrayList 
	  * @param key
	  * @return true false
	  */
	public boolean constainsKey(K key){
		if(arr_key.contains(key))
			return true;
		else
			return false;
		
	}

	/**
	  * mothed that confirm if there is value in arrayList
	  * @param value
	  * @return boolean
	  */
	public boolean constainsValue(V value){
		if(arr_value.contains(key))
			return true;
		else
			return false;
	}
	/**
	  * return all keys
	  */

	public ArrayList<K> getKey(){
		return arr_key;
	}
	
	/**
	  * return all values
	  */

	public ArrayList<V> getValue(){
		return arr_value;
	}

	/**  
	  * remove all keys and values
	 */ 

	public void clear(){
		arr_key.clear();
		arr_value.clear();
	}
}
