package bcmes.com.github.poc.methodfactory.simple;

public abstract class Iphone {
	public String assemble() {
		return "assemble";
	}
	public String certificates() {
		return "certificates";
	}
	public String pack() {
		return "certificates";
	}

	protected abstract Iphone getHardware();
}