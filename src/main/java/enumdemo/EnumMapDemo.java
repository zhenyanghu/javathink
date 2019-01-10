package enumdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EnumMapDemo {

	public static void main(String[] args) {
		List<Clothes> list = new ArrayList<>();
        list.add(new Clothes("C001",Color.BLUE));
        list.add(new Clothes("C002",Color.YELLOW));
        list.add(new Clothes("C003",Color.RED));
        list.add(new Clothes("C004",Color.GREEN));
        list.add(new Clothes("C005",Color.BLUE));
        list.add(new Clothes("C006",Color.BLUE));
        list.add(new Clothes("C007",Color.RED));
        list.add(new Clothes("C008",Color.YELLOW));
        list.add(new Clothes("C009",Color.YELLOW));
        list.add(new Clothes("C010",Color.GREEN));
        Map<Color, Integer> map = new HashMap<>();
//        Map<Color, Integer> map = new EnumMap<>(Color.class);
        for (Clothes c : list) {
        	if (map.containsKey(c.getColor())) {
        		map.put(c.getColor(), map.get(c.getColor()) + 1);
        	} else {
        		map.put(c.getColor(), 1);
        	}
        }
        System.out.println(map);
	}
}

class Clothes {
	private String name;
	private Color color;
	
	public Clothes(String name, Color color) {
		this.name = name;
		this.color = color;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}

