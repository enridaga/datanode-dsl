package datanode.ontology;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.jena.rdf.model.InfModel;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.rdf.model.Resource;
import org.apache.jena.rdf.model.StmtIterator;
import org.apache.jena.reasoner.Reasoner;
import org.apache.jena.reasoner.ReasonerRegistry;
import org.apache.jena.shared.PropertyNotFoundException;
import org.apache.jena.vocabulary.OWL;
import org.apache.jena.vocabulary.RDFS;

import datanode.dsl.DNGraph;

public class DN {
	private static final String NS = "http://purl.org/datanode/ns/";
	private Model mem;
	private InfModel ont;

	public String namespace() {
		return NS;
	}

	public DN() {
		mem = ModelFactory.createDefaultModel();
		mem.read(DN.class.getResourceAsStream("datanode.ttl"), null, "TTL");
		Reasoner reasoner = ReasonerRegistry.getOWLReasoner();
		ont = ModelFactory.createInfModel(reasoner, mem);
	}

	public Model memModel() {
		return mem;
	}

	private Map<String, Resource> resCache = new HashMap<String, Resource>();

	public Resource res(String localName) {
		if (!resCache.containsKey(localName)) {
			resCache.put(localName, ont.createResource(NS + localName));
		}
		return resCache.get(localName);
	}

	private String name(Resource n) {
		return n.getURI().substring(NS.length());
	}

	public String[] superProperties(String relation) {
		StmtIterator it = ont.listStatements(res(relation), RDFS.subPropertyOf, (Resource) null);
		List<String> s = new ArrayList<String>();
		while (it.hasNext()) {
			s.add(name(it.next().getObject().asResource()));
		}
		return s.toArray(new String[s.size()]);
	}

	public String[] directSuperProperties(String relation) {
		StmtIterator it = mem.listStatements(res(relation), RDFS.subPropertyOf, (Resource) null);
		List<String> s = new ArrayList<String>();
		while (it.hasNext()) {
			s.add(name(it.next().getObject().asResource()));
		}
		return s.toArray(new String[s.size()]);
	}

	public String[] subProperties(String relation) {
		StmtIterator it = ont.listStatements(null, RDFS.subPropertyOf, res(relation));
		List<String> s = new ArrayList<String>();
		while (it.hasNext()) {
			s.add(name(it.next().getSubject()));
		}
		return s.toArray(new String[s.size()]);
	}

	public String[] directSubProperties(String relation) {
		StmtIterator it = mem.listStatements(null, RDFS.subPropertyOf, res(relation));
		List<String> s = new ArrayList<String>();
		while (it.hasNext()) {
			s.add(name(it.next().getSubject()));
		}
		return s.toArray(new String[s.size()]);
	}

	public String[] noSubProperties() {
		List<String> prop = Arrays.asList(relations());
		StmtIterator it = ont.listStatements(null, RDFS.subPropertyOf, (Resource) null);
		while (it.hasNext()) {
			prop.remove(name((Resource) it.next().getObject()));
		}
		return prop.toArray(new String[prop.size()]);
	}

	public String[] relations() {
		StmtIterator it = ont.listStatements(null, RDFS.subPropertyOf, res(DNGraph.relatedWith));
		List<String> s = new ArrayList<String>();
		while (it.hasNext()) {
			s.add(name(it.next().getSubject()));
		}
		return s.toArray(new String[s.size()]);
	}

	public String[] noSuperProperties() {
		List<String> prop = Arrays.asList(relations());
		StmtIterator it = ont.listStatements(null, RDFS.subPropertyOf, (Resource) null);
		while (it.hasNext()) {
			prop.remove(name(it.next().getSubject()));
		}
		return prop.toArray(new String[prop.size()]);
	}

	public String[] inverseOf(String relation) {
		StmtIterator it = ont.listStatements(null, OWL.inverseOf, res(relation));
		List<String> s = new ArrayList<String>();
		while (it.hasNext()) {
			s.add(name(it.next().getSubject()));
		}
		return s.toArray(new String[s.size()]);
	}

	public String label(String relation) {
		try {
			return res(relation).getRequiredProperty(RDFS.label).getString();
		} catch (PropertyNotFoundException pe) {
			return "";
		}
	}

	public String comment(String relation) {
		try {
			return res(relation).getRequiredProperty(RDFS.comment).getString();
		} catch (PropertyNotFoundException pe) {
			return "";
		}
	}
}
