/**
 */
package prototype5.tests;

import java.util.ArrayList;
import java.util.List;

import junit.textui.TestRunner;
import prototype5.Edge;
import prototype5.Face;
import prototype5.JavaFXMeshComponent;
import prototype5.Prototype5Factory;
import prototype5.Vertex;
import prototype5.VizObject;
import prototype5.impl.EdgeAndVertexFaceImpl;
import prototype5.impl.EdgeImpl;
import prototype5.impl.JavaFXMeshComponentImpl;
import prototype5.impl.VertexImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Java FX Mesh Component</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class JavaFXMeshComponentTest extends AbstractMeshComponentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaFXMeshComponentTest.class);
	}

	/**
	 * Constructs a new Java FX Mesh Component test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFXMeshComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java FX Mesh Component test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected JavaFXMeshComponent getFixture() {
		return (JavaFXMeshComponent)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createJavaFXMeshComponent());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}
	
	/**
	 * Test the creation of a JavaFXMeshComponent.
	 */
	public void checkConstruction(){
		
		// Create the vertices and edges for the first face.
		Vertex v1 = new VertexImpl(0, 0, 0);
		Vertex v2 = new VertexImpl(1, 0, 0);
		Vertex v3 = new VertexImpl(2, 0, 0);
		Edge e1 = new EdgeImpl(v1, v2);
		Edge e2 = new EdgeImpl(v2, v3);
		Edge e3 = new EdgeImpl(v3, v1);

		// Create the first face
		ArrayList<VizObject> edges = new ArrayList<VizObject>();
		edges.add(e1);
		edges.add(e2);
		edges.add(e3);
		Face face = new EdgeAndVertexFaceImpl(edges);

		// Create the vertices and edges for the second face
		Vertex v4 = new VertexImpl(3, 0, 0);
		Vertex v5 = new VertexImpl(4, 0, 0);
		Vertex v6 = new VertexImpl(5, 0, 0);
		Vertex v7 = new VertexImpl(6, 0, 0);
		Edge e4 = new EdgeImpl(v4, v5);
		Edge e5 = new EdgeImpl(v5, v6);
		Edge e6 = new EdgeImpl(v6, v7);
		Edge e7 = new EdgeImpl(v7, v4);

		// Create the second face
		ArrayList<VizObject> edges2 = new ArrayList<VizObject>();
		edges.add(e4);
		edges.add(e5);
		edges.add(e6);
		edges.add(e7);
		Face face2 = new EdgeAndVertexFaceImpl(edges2);

		// Create the component
		ArrayList<VizObject> faces = new ArrayList<VizObject>();
		JavaFXMeshComponent component = new JavaFXMeshComponentImpl(faces);
		
		//Check that the component contains both faces
		List<VizObject> componentFaces = component.getEntitiesByCategory("Faces");
		assertTrue(componentFaces.contains(face));
		assertEquals(2, componentFaces.size());
		
		//Check that the component has a list of every unique vertex
		List<VizObject> componentVertices = component.getEntitiesByCategory("Vertices");
		assertTrue(componentVertices.contains(v1));
		assertEquals(7, componentVertices.size());
		
	}

} //JavaFXMeshComponentTest
