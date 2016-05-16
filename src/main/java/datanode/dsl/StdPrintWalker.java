package datanode.dsl;

public class StdPrintWalker implements Walker {

	@Override
	public void to(String to) {
		System.out.print(to + "\n");
	}
	
	@Override
	public void from(String from) {
		System.out.print(from + " > ");
	}
	
	@Override
	public void encounter(String from, String arc, String to) {
		//
	}
	
	@Override
	public void arc(String arc) {
		System.out.print(arc + " > ");
	}
}
