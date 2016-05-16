package datanode.dsl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.javatuples.Triplet;

public class MemDNGraph extends DNGraph {

	private Set<Triplet<String, String, String>> graph;
	private String from = null;
	private List<String> arcs = null;
	private String to = null;

	public MemDNGraph() {
		graph = new HashSet<Triplet<String, String, String>>();
		arcs = new ArrayList<String>();
	}

	@Override
	public void accept(Walker walker) {
		for (Triplet<String, String, String> t : graph) {
			walker.from(t.getValue0());
			walker.arc(t.getValue1());
			walker.to(t.getValue2());
			walker.encounter(t.getValue0(), t.getValue1(), t.getValue2());
		}
	}

	private void flush() {
		if (from == null || arcs.isEmpty() || to == null) {
			throw new RuntimeException("null: " + from + " " + null + " " + to);
		}
		for (String arc : arcs) {
			graph.add(new Triplet<String, String, String>(from, arc, to));
		}
		arcs.clear();
		from = to;
		to = null;
	}

	@Override
	public DNGraph node(String id) {
		if (from == null || arcs.isEmpty()) {
			from = id;
		} else if (to == null) {
			to = id;
			flush();
			from = id;
			to = null;
		}else{
			throw new RuntimeException("Invalid state!");
		}
		return this;
	}

	public DNGraph arc(String id) {
		if (from == null) {
			throw new RuntimeException("node is null");
		} else if (to != null) {
			from = to;
			to = null;
		}
		arcs.add(id);
		return this;
	}

	@Override
	public int arcsCount() {
		return graph.size();
	}

	@Override
	public int nodesCount() {
		Set<String> nn = new HashSet<String>();
		for (Triplet<String, String, String> s : graph) {
			nn.add(s.getValue0());
			nn.add(s.getValue2());
		}
		return nn.size();
	}
}
