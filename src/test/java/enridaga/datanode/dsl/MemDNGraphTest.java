package enridaga.datanode.dsl;

import org.junit.Assert;
import org.junit.Test;

import datanode.dsl.DNGraph;
import datanode.dsl.MemDNGraph;
import datanode.dsl.StdPrintWalker;

public class MemDNGraphTest {

	@Test
	public void test0(){
		DNGraph g = new MemDNGraph().node("pippo")
		.cleanedFrom().adjacentTo().node("pluto");
		g.accept(new StdPrintWalker());
		Assert.assertTrue(g.nodesCount() == 2);
		Assert.assertTrue(g.arcsCount() == 2);
	}
	

	@Test
	public void test1(){
		DNGraph g = new MemDNGraph().node("mickey")
		.cleanedFrom().adjacentTo().node("goofie")
		.refactoredFrom().node("donald").combinedIn().node("minnie");
		g.node("mickey").combinedIn().node("minnie");
		g.accept(new StdPrintWalker());
		Assert.assertTrue(g.nodesCount() == 4);
		Assert.assertTrue(g.arcsCount() == 5);
	}
}
