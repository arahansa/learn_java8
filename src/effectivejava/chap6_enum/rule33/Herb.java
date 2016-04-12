package effectivejava.chap6_enum.rule33;

import java.util.Set;

public class Herb {
	enum Type {
		ANNUAL, PERENNIAL, BIENNIAL
	}

	final String name;
	final Type type;

	public Herb(String name, Type type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name;
	}
	
	public static void main(String[] args) {
		Herb[] garden = { new Herb("Basil", Type.ANNUAL),
				new Herb("Carroway", Type.BIENNIAL),
				new Herb("Dill", Type.ANNUAL),
				new Herb("Lavendar", Type.PERENNIAL),
				new Herb("Parsley", Type.BIENNIAL),
				new Herb("Rosemary", Type.PERENNIAL) };
		
		Set<Herb>[] herbsByType = (Set<Herb>[])new Set[Herb.Type.values().length];
		
	}

}
