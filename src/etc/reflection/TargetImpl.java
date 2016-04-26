package etc.reflection;

public class TargetImpl implements Target {

	int num;

	public TargetImpl(int i) {
		this.num = i;
	}

	@Override
	public void print() {
		System.out.println("Hello " + num);
	}

}
