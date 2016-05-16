package datanode.dsl;

public interface Walker {
	public void encounter(String from, String arc, String to);
	public void from(String from);
	public void arc(String arc);
	public void to(String to);
}
