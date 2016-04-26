package etc.reflection;

import java.lang.reflect.Constructor;

public class ReflectionTest {

	public static void main(String[] args) throws Exception {
		String param = "etc.reflection.TargetImpl";
		Target target = createObject(param);
		target.print();
	}

	static Target createObject(String classname) throws Exception {
		Class<?> clz = Class.forName(classname);
		Constructor<?>[] cons = clz.getConstructors();
		for (Constructor<?> con : cons) {
			Class<?>[] params = con.getParameterTypes();
			if (params.length == 1 && params[0].isAssignableFrom(int.class)) {
				return (Target) con.newInstance(1);
			}
		}
		throw new Exception();
	}
}
