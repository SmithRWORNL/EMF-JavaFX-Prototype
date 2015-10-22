/**
 */
package prototype5.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

import junit.textui.TestRunner;

import prototype5.AbstractMeshComponent;
import prototype5.Prototype5Factory;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Abstract Mesh Component</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link prototype5.AbstractMeshComponent#getEntitiesByCategory(java.lang.String)
 * <em>Get Entities By Category</em>}</li>
 * <li>{@link prototype5.AbstractMeshComponent#getProperty(java.lang.String)
 * <em>Get Property</em>}</li>
 * <li>
 * {@link prototype5.AbstractMeshComponent#setProperty(java.lang.String, java.lang.String)
 * <em>Set Property</em>}</li>
 * <li>{@link prototype5.AbstractMeshComponent#addEntity(prototype5.VizObject)
 * <em>Add Entity</em>}</li>
 * <li>
 * {@link prototype5.AbstractMeshComponent#removeEntity(prototype5.VizObject)
 * <em>Remove Entity</em>}</li>
 * <li>
 * {@link prototype5.AbstractMeshComponent#addEntityByCategory(prototype5.VizObject, java.lang.String)
 * <em>Add Entity By Category</em>}</li>
 * <li>
 * {@link prototype5.AbstractMeshComponent#update(org.eclipse.emf.common.notify.Notification)
 * <em>Update</em>}</li>
 * <li>{@link prototype5.AbstractMeshComponent#register(prototype5.VizObject)
 * <em>Register</em>}</li>
 * <li>{@link prototype5.AbstractMeshComponent#unregister(prototype5.VizObject)
 * <em>Unregister</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AbstractMeshComponentTest extends VizObjectTest {

	/**
	 * The entities for the component
	 */
	List<VizObject> entities;

	/**
	 * The controller's model
	 */
	TestMeshComponent component;

	/**
	 * Initialize the controller before each test.
	 */
	@Before
	public void beforeEachTest() {
		entities = new ArrayList<VizObject>();
		component = new TestMeshComponent(entities);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractMeshComponentTest.class);
	}

	/**
	 * Constructs a new Abstract Mesh Component test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractMeshComponentTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Abstract Mesh Component test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected AbstractMeshComponent getFixture() {
		return (AbstractMeshComponent) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createAbstractMeshComponent());
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
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#getEntitiesByCategory(java.lang.String)
	 * <em>Get Entities By Category</em>}' operation. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#getEntitiesByCategory(java.lang.String)
	 * @generated
	 */
	public void testGetEntitiesByCategory__String() {

	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#getProperty(java.lang.String)
	 * <em>Get Property</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#getProperty(java.lang.String)
	 * @generated
	 */
	public void testGetProperty__String() {
		// An empty property should return null
		assertNull(component.getProperty("empty"));

		// Set a property and test that its value is correct
		component.setProperty("test property", "test value");
		assertTrue("test value".equals("test property"));

		// Set a new value to the previous property and test that the value is
		// changed
		component.setProperty("test property", "new value");
		assertTrue("new value".equals("test property"));
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#setProperty(java.lang.String, java.lang.String)
	 * <em>Set Property</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#setProperty(java.lang.String,
	 *      java.lang.String)
	 * @generated
	 */
	public void testSetProperty__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#addEntity(prototype5.VizObject)
	 * <em>Add Entity</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#addEntity(prototype5.VizObject)
	 * @generated
	 */
	public void testAddEntity__VizObject() {
		// Check that the map of entities is empty
		assertEquals(0, component.getEntities().size());

		// Create a new VizObject with id 2
		TestObject object = new TestObject();
		object.setId(2);

		// Add the object as a child
		component.addEntity(object);

		// Check that the controller was notified
		assertTrue(component.isUpdated());

		// Check that the controller now has a map with one entity with id 2.
		assertEquals(1, component.getEntities().size());
		assertEquals(2,
				component.getEntities().get(0).getValue().get(0).getId());

		// Add a second entity
		component.addEntity((TestObject) object.clone());

		// Check that the controller was notified
		assertTrue(component.isUpdated());

		// Check that there are two entities
		assertEquals(2, component.getEntities().size());

		// Remove one of the entities
		component.removeEntity(object);

		// Check that the controller was notified
		assertTrue(component.isUpdated());

		// Check that there is only one entity
		assertEquals(1, component.getEntities().size());
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#removeEntity(prototype5.VizObject)
	 * <em>Remove Entity</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#removeEntity(prototype5.VizObject)
	 * @generated
	 */
	public void testRemoveEntity__VizObject() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#addEntityByCategory(prototype5.VizObject, java.lang.String)
	 * <em>Add Entity By Category</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#addEntityByCategory(prototype5.VizObject,
	 *      java.lang.String)
	 * @generated
	 */
	public void testAddEntityByCategory__VizObject_String() {

		// Create an edge entity
		TestObject edge = new TestObject();
		edge.setName("edge");
		component.addEntityByCategory(edge, "Edges");

		// Check that the controller was notified
		assertTrue(component.isUpdated());

		// Create a vertex entity
		TestObject vertex1 = new TestObject();
		vertex1.setName("vertex1");
		component.addEntityByCategory(vertex1, "Vertices");

		// Create another vertex entity
		TestObject vertex2 = new TestObject();
		vertex2.setName("vertex2");
		component.addEntityByCategory(vertex2, "Vertices");

		// Check that there are three entities, 1 edge, and 2 vertices
		assertEquals(3, component.getEntities().size());
		assertEquals(1, component.getEntitiesByCategory("Edges"));
		assertEquals(2, component.getEntitiesByCategory("Vertices"));

		// Check that the edge is in the Edges category
		assertTrue("edge".equals(
				component.getEntitiesByCategory("Edges").get(0).getName()));

		// Create a list of all the names in the Vertices category
		ArrayList<String> vertexNames = new ArrayList<String>();
		for (VizObject object : component.getEntitiesByCategory("Vertices")) {
			vertexNames.add(object.getName());
		}

		// Check that the two vertices were in the right category
		assertTrue(vertexNames.contains("vertex1"));
		assertTrue(vertexNames.contains("vertex2"));
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#update(org.eclipse.emf.common.notify.Notification)
	 * <em>Update</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see prototype5.AbstractMeshComponent#update(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	public void testUpdate__Notification() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#register(prototype5.VizObject)
	 * <em>Register</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see prototype5.AbstractMeshComponent#register(prototype5.VizObject)
	 * @generated NOT
	 */
	public void testRegister__VizObject() {

		// Create and register an object
		TestObject object = new TestObject();
		component.register(object);

		// Set the object's id. This should trigger an update.
		object.setId(2);

		// Check that the component got the update.
		assertTrue(component.isUpdated());

		// Unregister the object
		component.unregister(object);

		// Set the object's id, triggering an update.
		object.setId(3);

		// The component should not have received the update.
		assertFalse(component.isUpdated());
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractMeshComponent#unregister(prototype5.VizObject)
	 * <em>Unregister</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractMeshComponent#unregister(prototype5.VizObject)
	 * @generated
	 */
	public void testUnregister__VizObject() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} // AbstractMeshComponentTest
