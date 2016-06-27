package datanode.ontology;

import java.util.Arrays;

import org.apache.jena.rdf.model.Model;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DNTest {
	private static final Logger l = LoggerFactory.getLogger(DNTest.class);
	
	@Test
	public void test0() {
		Model m = new DN().memModel();
		l.error("{}", m.size());
	}

	@Test
	public void test1() {
		String[] m = new DN().relations();
		l.error("{}", Arrays.asList(m));
	}

}
