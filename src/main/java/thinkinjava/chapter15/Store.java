package thinkinjava.chapter15;

import net.mindview.util.Generator;

import java.util.ArrayList;
import java.util.Random;

class Product {
	
	private static int counter = 1;
	private final int id = counter++;//不可改变的变量必须赋值，可以初始化的时候复制，也可以在构造器里面赋值
	private String description;
	private double price;
	
	public Product(String descr, double price) {
		this.description = descr;
		this.price = price;
	}
	
	public String toString() {
		return id + " : " + description + " , price: $" + price;
	}
	
	public void priceChange(double change) {
		this.price += change;
	}
	
	public static Generator<Product> generator = new Generator<Product>() {
		private Random random = new Random(47);
		@Override
		public Product next() {
			return new Product("Test", Math.round(random.nextDouble() * 1000.0) + 0.99);
		}
	};
		
}

class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

class Aisle extends ArrayList<Shelf> {
	public Aisle(int nShelves, int nProducts) {
		for (int i = 0; i < nShelves; i++)
			add(new Shelf(nProducts));
	}
}

class CheckoutStand {}

class Office {}


public class Store extends ArrayList<Aisle> {
	
	private ArrayList<CheckoutStand> checkouts = new ArrayList<CheckoutStand>();
	private Office office = new Office();
	
	public Store(int nAisles, int nShelves, int nProducts) {
		for (int i = 0; i < nAisles; i++)
			add(new Aisle(nShelves, nProducts));
	}
	
	public String toString() {
		StringBuffer sBuffer = new StringBuffer();
		for (Aisle a : this) {
			for (Shelf s : a) {
				for (Product p : s) {
					sBuffer.append(p);
					sBuffer.append("\n");
				}
			}
		}
		return sBuffer.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(new Store(14, 5, 10));
	}
}

