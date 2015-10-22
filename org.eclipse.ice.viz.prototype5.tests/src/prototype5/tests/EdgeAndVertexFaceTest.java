/**
 */
package prototype5.tests;

import java.util.ArrayList;
import java.util.List;

import junit.textui.TestRunner;
import prototype5.Edge;
import prototype5.EdgeAndVertexFace;
import prototype5.Prototype5Factory;
import prototype5.Vertex;
import prototype5.VizObject;
import prototype5.impl.EdgeAndVertexFaceImpl;
import prototype5.impl.EdgeImpl;
import prototype5.impl.VertexImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Edge And Vertex Face</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EdgeAndVertexFaceTest extends FaceTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EdgeAndVertexFaceTest.class);
	}

	/**
	 * Constructs a new Edge And Vertex Face test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EdgeAndVertexFaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Edge And Vertex Face test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EdgeAndVertexFace getFixture() {
		return (EdgeAndVertexFace) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createEdgeAndVertexFace());
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

	public void checkAddEntities() {

		// Create the face
		List<VizObject> entities = new ArrayList<VizObject>();
		EdgeAndVertexFace face = new EdgeAndVertexFaceImpl(entities);

		// The children should start out empty.
		assertEquals(0, face.getEntities().size());

		// The face should reject a non-Edge child
		face.addEntity(new TestObject());
		assertEquals(0, face.getEntities().size());

		// Create an edge and add it to the face
		Vertex vertex1 = new VertexImpl(0, 0, 0);
		Vertex vertex2 = new VertexImpl(1, 1, 1);
		Edge edge = new EdgeImpl(vertex1, vertex2);
		edge.addEntity(edge);

		// The Edges category should have one object, the edge
		assertTrue(face.getEntitiesByCategory("Edges").contains(edge));
		assertEquals(1, face.getEntitiesByCategory("Edges").size());

		// The Vertices category should have two objects, the vertices
		List<VizObject> vertices = face.getEntitiesByCategory("Vertices");
		assertTrue(vertices.contains(vertex1));
		assertTrue(vertices.contains(vertex2));
		assertEquals(2, vertices.size());

		// Add a clone of the edge to the face
		Edge edge2 = (Edge) edge.clone();
		face.addEntity(edge2);

		// Check that there are now two edges and four vertices in the map.
		assertEquals(2, face.getEntitiesByCategory("Edges"));
		assertEquals(4, face.getEntitiesByCategory("Vertices"));

	}

} // EdgeAndVertexFaceTest
