/**
 */
package prototype5.tests;

import java.util.List;

import junit.textui.TestRunner;

import prototype5.Edge;
import prototype5.Prototype5Factory;
import prototype5.Vertex;
import prototype5.VizObject;
import prototype5.impl.EdgeImpl;
import prototype5.impl.VertexImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Edge</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EdgeTest extends AbstractMeshComponentTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeTest.class);
	}

	/**
	 * Constructs a new Edge test case with the given name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EdgeTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Edge getFixture() {
		return (Edge) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createEdge());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	public void checkVertices() {

		// Create the edge
		Edge edge = new EdgeImpl();

		// The edge should initially have length 0
		assertEquals(0, edge.getLength());

		// Try adding a non-vertex. It should be put in the Default category
		edge.addEntity(new TestObject());
		assertEquals(0, edge.getEntitiesByCategory("Default").size());

		// Create some vertices
		Vertex vertex1 = new VertexImpl(0, 0, 0);
		Vertex vertex2 = new VertexImpl(1, 1, 1);
		Vertex vertex3 = new VertexImpl(2, 2, 2);

		// Add all three vertices to the edge.
		edge.addEntity(vertex1);
		edge.addEntity(vertex2);
		edge.addEntity(vertex3);

		// Check the Vertices category to ensure that the edge accepted the
		// first two vertices and isgnored the third
		List<VizObject> vertices = edge.getEntitiesByCategory("Vertices");
		assertTrue(vertices.contains(vertex1));
		assertTrue(vertices.contains(vertex2));
		assertFalse(vertices.contains(vertex3));
		assertEquals(2, vertices.size());

		// Check that the edge has the correct length
		assertTrue(Double.compare(1.73, edge.getLength()) <= .1d);

		// Replace the second vertex with the third
		edge.removeEntity(vertex2);
		edge.addEntity(vertex3);

		// Check the Vertices category to ensure that the last vertex was
		// replaced
		vertices = edge.getEntitiesByCategory("Vertices");
		assertTrue(vertices.contains(vertex1));
		assertFalse(vertices.contains(vertex2));
		assertTrue(vertices.contains(vertex3));

		// Check that the edge's length has been updated
		assertTrue(Double.compare(3.46, edge.getLength()) <= .1d);
	}

} // EdgeTest
