package ListeS�n�f�Yapmak;

import java.util.Arrays;

public class MyList<T> {
	
	T[] array;
	
	@SuppressWarnings("unchecked")
	public MyList() {
		this.array = (T[]) new Object[10];
	}

	@SuppressWarnings("unchecked")
	public MyList(int capacity) {
		this.array = (T[]) new Object[capacity];
	}
	
	// Dizideki eleman say�s�
	public int size() {
		int len = 0;
		for (T i : this.array) {
			if (i != null) {
				len++;
			}
		}
		return len;
	}
	
	// Dizinin kapasitesi
	public int getCapacity() {
		return this.array.length;
	}
	
	// Diziye eleman ekleme
	public void add(T data) {
		
		// Last item bo� de�ilse !
		if (this.array[this.array.length - 1 ] != null) {
			this.array = Arrays.copyOf(this.array, this.array.length * 2);
		}
		
		for (int i = 0; i < this.array.length; i++) {
			if (this.array[i] == null) {
				this.array[i] = data;
				break;
			}
		}
		
		
	}
	
	// Dizinin indeksinden eleman getirme
	public T get(int index) {
		if(index >= 0 && index < this.array.length) {
			
			return this.array[index];
		}
		return null;
	}
	
	// Dizinin indeksinden eleman silme 
	public void remove(int index) {
		if(index >= 0 && index < this.array.length) {

			for (int i = index; i < this.array.length-1; i++) {
				this.array[i] = this.array[i+1];
			}
			
		} else {			
			return;
		}
	}
	
	// Dizinin indeksindeki eleman� de�i�tirme
	public void set(int index, T data) {
		
		if(index >= 0 && index < this.array.length) {

			this.array[index] = data;
			
		} else {			
			return;
		}
	}
	
	// Dizinin elemanlar�n� yazd�ran metot
	public String toString() {
		T[] newArrayForPrint = Arrays.copyOfRange(this.array, 0, this.size());
		return Arrays.toString(newArrayForPrint);
	}
	
	// Verilen eleman�n dizideki yeri
	public int indexOf(T data) {
		for (int i = 0; i<this.array.length; i++) {
			if (this.array[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	// Verilen de�erin listedeki son indeksini s�yler.
	public int lastIndexOf(T data) {
		for (int i = this.array.length - 1; i >= 0; i--) {
			if (this.array[i] == data) {
				return i;
			}
		}
		return -1;
	}
	
	// Listenin bo� olup olmad���n� kontrol eder.
	public boolean isEmpty() {
		if (this.size() == 0) {
			return true;
		}
		return false;
	}
	
	public T[] toArray() {
		
		return Arrays.copyOfRange(this.array, 0, this.array.length);
	}
	
	@SuppressWarnings("unchecked")
	public void clear() {
		this.array = (T[]) new Object[this.array.length];
	}
	
	// Alt liste olu�turur
	public MyList<T> subList(int start, int finish) {
		MyList<T> newArray = new MyList<>();
		newArray.array =(T[]) Arrays.copyOfRange(array, start, finish+1); 
		return newArray;
	}
	
	// Girilen eleman listede var m� diye kontrol eder.
	public boolean contains(T data) {
		for (T i : this.array) {
			if (i == data)
				return true;
		}
		return false;
	}
	
}
