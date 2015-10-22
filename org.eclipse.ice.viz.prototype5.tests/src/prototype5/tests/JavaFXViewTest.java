/**
 */
package prototype5.tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javafx.scene.shape.Sphere;
import javafx.scene.shape.TriangleMesh;
import junit.textui.TestRunner;
import prototype5.Edge;
import prototype5.Face;
import prototype5.JavaFXMeshComponent;
import prototype5.JavaFXView;
import prototype5.MeshType;
import prototype5.Prototype5Factory;
import prototype5.Vertex;
import prototype5.VizObject;
import prototype5.impl.EdgeAndVertexFaceImpl;
import prototype5.impl.EdgeImpl;
import prototype5.impl.JavaFXMeshComponentImpl;
import prototype5.impl.JavaFXViewImpl;
import prototype5.impl.VertexImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Java FX View</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class JavaFXViewTest extends AbstractViewTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaFXViewTest.class);
	}

	/**
	 * Constructs a new Java FX View test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaFXViewTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java FX View test case. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected JavaFXView getFixture() {
		return (JavaFXView) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createJavaFXView());
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

	/**
	 * Test the view's ability to create a representation of a model.
	 */
	public void checkRepresentation() {

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

		// Create the component and view
		ArrayList<VizObject> faces = new ArrayList<VizObject>();
		JavaFXMeshComponent component = new JavaFXMeshComponentImpl(faces);
		JavaFXView view = new JavaFXViewImpl(component);

		// Get the model's representation
		Object mesh = (Object) view.getRepresentation();

		// Check that the representation is a TriangleMesh
		assertTrue(mesh instanceof TriangleMesh);

		// Create a properties map with a radius property of 2.
		Map<String, Object> properties = new HashMap<String, Object>();
		properties.put("radius", "2");

		// Create a component and view from these properties
		JavaFXMeshComponent customComponent = new JavaFXMeshComponentImpl(
				properties, MeshType.CUSTOM_PART);
		JavaFXView customView = new JavaFXViewImpl(customComponent);

		// Get the representation and check that it is a sphere.
		Object sphere = customView.getRepresentation();
		assertTrue(sphere instanceof Sphere);

	}

} // JavaFXViewTest
