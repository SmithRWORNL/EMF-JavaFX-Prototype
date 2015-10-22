/**
 */
package prototype5.tests;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.junit.Before;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import prototype5.AbstractController;
import prototype5.AbstractMeshComponent;
import prototype5.AbstractView;
import prototype5.Prototype5Factory;
import prototype5.Transformation;
import prototype5.VizObject;
import prototype5.impl.AbstractControllerImpl;
import prototype5.impl.AbstractMeshComponentImpl;
import prototype5.impl.AbstractViewImpl;
import prototype5.impl.TransformationImpl;
import prototype5.impl.VizObjectImpl;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Abstract Controller</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link prototype5.AbstractController#addEntity(prototype5.VizObject) <em>Add Entity</em>}</li>
 *   <li>{@link prototype5.AbstractController#dispose() <em>Dispose</em>}</li>
 *   <li>{@link prototype5.AbstractController#getEntities() <em>Get Entities</em>}</li>
 *   <li>{@link prototype5.AbstractController#getEntitiesByCategory(java.lang.String) <em>Get Entities By Category</em>}</li>
 *   <li>{@link prototype5.AbstractController#getPreviousTransformation() <em>Get Previous Transformation</em>}</li>
 *   <li>{@link prototype5.AbstractController#getProperty(java.lang.String) <em>Get Property</em>}</li>
 *   <li>{@link prototype5.AbstractController#getRepresentation() <em>Get Representation</em>}</li>
 *   <li>{@link prototype5.AbstractController#getRotation() <em>Get Rotation</em>}</li>
 *   <li>{@link prototype5.AbstractController#getScale() <em>Get Scale</em>}</li>
 *   <li>{@link prototype5.AbstractController#getSize() <em>Get Size</em>}</li>
 *   <li>{@link prototype5.AbstractController#getSkew() <em>Get Skew</em>}</li>
 *   <li>{@link prototype5.AbstractController#getTransformation() <em>Get Transformation</em>}</li>
 *   <li>{@link prototype5.AbstractController#getTranslation() <em>Get Translation</em>}</li>
 *   <li>{@link prototype5.AbstractController#removeEntity(prototype5.VizObject) <em>Remove Entity</em>}</li>
 *   <li>{@link prototype5.AbstractController#setProperty(java.lang.String, java.lang.String) <em>Set Property</em>}</li>
 *   <li>{@link prototype5.AbstractController#setRotation(double, double, double) <em>Set Rotation</em>}</li>
 *   <li>{@link prototype5.AbstractController#setScale(double, double, double) <em>Set Scale</em>}</li>
 *   <li>{@link prototype5.AbstractController#setSize(double) <em>Set Size</em>}</li>
 *   <li>{@link prototype5.AbstractController#setSkew(double, double, double) <em>Set Skew</em>}</li>
 *   <li>{@link prototype5.AbstractController#setTransformation(prototype5.Transformation) <em>Set Transformation</em>}</li>
 *   <li>{@link prototype5.AbstractController#setTranslation(double, double, double) <em>Set Translation</em>}</li>
 *   <li>{@link prototype5.AbstractController#addEntityByCategory(prototype5.VizObject, java.lang.String) <em>Add Entity By Category</em>}</li>
 *   <li>{@link prototype5.AbstractController#modelUpdate(org.eclipse.emf.common.notify.Notification) <em>Model Update</em>}</li>
 *   <li>{@link prototype5.AbstractController#viewUpdate(org.eclipse.emf.common.notify.Notification) <em>View Update</em>}</li>
 *   <li>{@link prototype5.AbstractController#refresh() <em>Refresh</em>}</li>
 *   <li>{@link prototype5.AbstractController#synched() <em>Synched</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class AbstractControllerTest extends TestCase {

	/**
	 * The entities for the component
	 */
	List<VizObject> entities;
	
	/**
	 * The controller's model
	 */
	TestMeshComponent component;
	
	/**
	 * The controller's view
	 */
	TestView view;
	
	/**
	 * The controller to test
	 */
	TestController controller;
	
	/**
	 * Initialize the controller before each test.
	 */
	@Before
	public void beforeEachTest(){
		entities = new ArrayList<VizObject>();
		component = new TestMeshComponent(entities);
		view = new TestView();
		controller = new TestController(component, view);
	}
	
	/**
	 * The fixture for this Abstract Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractController fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractControllerTest.class);
	}

	/**
	 * Constructs a new Abstract Controller test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractControllerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AbstractController fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract Controller test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AbstractController getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createAbstractController());
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
	 * Tests the '{@link prototype5.AbstractController#addEntity(prototype5.VizObject) <em>Add Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#addEntity(prototype5.VizObject)
	 * @generated NOT
	 */
	public void testAddEntity__VizObject() {		
		//Check that the map of entities is empty
		assertEquals(0, controller.getEntities().size());
		
		//Create a new VizObject with id 2
		TestObject object = new TestObject();
		object.setId(2);
		
		//Add the object as a child
		controller.addEntity(object);
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that the controller now has a map with one entity with id 2.
		assertEquals(1, controller.getEntities().size());
		assertEquals(2, controller.getEntities().get(0).getId());
		
		//Add a second entity
		controller.addEntity((TestObject) object.clone());
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that there are two entities
		assertEquals(2, controller.getEntities().size());
		
		//Remove one of the entities
		controller.removeEntity(object);
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that there is only one entity
		assertEquals(1, controller.getEntities().size());
		
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#dispose()
	 * @generated NOT
	 */
	public void testDispose() {
		
		//The controller should start off disposed
		assertFalse(controller.getDisposed().get());
		
		//Dispose the controller and check that it is set as disposed.
		controller.dispose();
		assertTrue(controller.getDisposed().get());
		
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getEntities() <em>Get Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getEntities()
	 * @generated NOT
	 */
	public void testGetEntities() {
		//Nothing to test
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getEntitiesByCategory(java.lang.String) <em>Get Entities By Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getEntitiesByCategory(java.lang.String)
	 * @generated NOT
	 */
	public void testGetEntitiesByCategory__String() {
		
		//Create an edge entity
		TestObject edge = new TestObject();
		edge.setName("edge");
		controller.addEntityByCategory(edge, "Edges");
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Create a vertex entity
		TestObject vertex1 = new TestObject();
		vertex1.setName("vertex1");
		controller.addEntityByCategory(vertex1, "Vertices");
		
		//Create another vertex entity
		TestObject vertex2 = new TestObject();
		vertex2.setName("vertex2");
		controller.addEntityByCategory(vertex2, "Vertices");
		
		//Check that there are three entities, 1 edge, and 2 vertices
		assertEquals(3, controller.getEntities().size());
		assertEquals(1, controller.getEntitiesByCategory("Edges"));
		assertEquals(2, controller.getEntitiesByCategory("Vertices"));
		
		//Check that the edge is in the Edges category 
		assertTrue("edge".equals(controller.getEntitiesByCategory("Edges").get(0).getName()));
		
		//Create a list of all the names in the Vertices category
		ArrayList<String> vertexNames = new ArrayList<String>();
		for(VizObject object : controller.getEntitiesByCategory("Vertices")){
			vertexNames.add(object.getName());
		}
		
		//Check that the two vertices were in the right category
		assertTrue(vertexNames.contains("vertex1"));
		assertTrue(vertexNames.contains("vertex2"));
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getPreviousTransformation() <em>Get Previous Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getPreviousTransformation()
	 * @generated NOT
	 */
	public void testGetPreviousTransformation() {
		// Get the previous transformation
		Transformation prev = controller.getPreviousTransformation();

		// Initially, the previous and current transformations should be
		// identical
		assertTrue(controller.getTransformation().equals(prev));

		// Change the transformation
		controller.getTransformation().setSize(5);

		// Check that the controller was notified
		assertTrue(controller.isUpdated());

		// Makes sure the previous transformation is different from the current
		// one
		assertFalse(controller.getTransformation()
				.equals(controller.getPreviousTransformation()));

		// Change the transformation a second time
		controller.getTransformation().setSize(10);

		// Make sure the previous transformation is different from the current
		// one
		assertFalse(controller.getTransformation()
				.equals(controller.getPreviousTransformation()));

		// Make sure that the previous transformation hasn't changed
		assertTrue(prev.equals(controller.getPreviousTransformation()));

		// Create a new transformation and set it as the controller's
		// transformation
		Transformation transform = new TransformationImpl();
		transform.setSize(20);
		controller.setTransformation(transform);

		// Check that the controller was notified
		assertTrue(controller.isUpdated());

		// Make sure that the previous transformation hasn't changed
		assertFalse(controller.getTransformation()
				.equals(controller.getPreviousTransformation()));

		// Make sure that the previous transformation hasn't changed
		assertTrue(prev.equals(controller.getPreviousTransformation()));

		// Synchronize the controller
		controller.synched();

		// Make sure the previous transformation has been updated.
		assertTrue(controller.getTransformation()
				.equals(controller.getPreviousTransformation()));

		// Assert the previous transformation has the correct size
		assertEquals(0, Double.compare(20,
				controller.getPreviousTransformation().getSize()));
		
		
		
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getProperty(java.lang.String)
	 * @generated NOT
	 */
	public void testGetProperty__String() {
		//An empty property should return null
		assertNull(controller.getProperty("empty"));
		
		//Set a property and test that its value is correct
		controller.setProperty("test property", "test value");
		assertTrue("test value".equals("test property"));
		
		//Set a new value to the previous property and test that the value is changed
		controller.setProperty("test property", "new value");
		assertTrue("new value".equals("test property"));
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getRepresentation() <em>Get Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getRepresentation()
	 * @generated NOT
	 */
	public void testGetRepresentation() {
		
		//Get the representation from the TestView
		Object representation = controller.getRepresentation();
		
		//The representation should be a TestObject
		assertTrue(representation instanceof TestObject);
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getRotation() <em>Get Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getRotation()
	 * @generated NOT
	 */
	public void testGetRotation() {
		
		//Get the controller's initial rotation
		List<Double> rotation = controller.getRotation();
		
		//Check that the rotation is initially 0
		assertEquals(0, Double.compare(rotation.get(0), 0));
		assertEquals(0, Double.compare(rotation.get(1), 0));
		assertEquals(0, Double.compare(rotation.get(2), 0));
		
		//Set the rotation to a new value
		controller.setRotation(1, 2, 3);
		rotation = controller.getRotation();
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that the rotation is set correctly
		assertEquals(1, Double.compare(rotation.get(0), 0));
		assertEquals(2, Double.compare(rotation.get(1), 0));
		assertEquals(3, Double.compare(rotation.get(2), 0));
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getScale() <em>Get Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getScale()
	 * @generated NOT
	 */
	public void testGetScale() {
		
		//Get the controller's initial scale
		List<Double> scale = controller.getScale();
		
		//Check that the scale is initially 0
		assertEquals(0, Double.compare(scale.get(0), 0));
		assertEquals(0, Double.compare(scale.get(1), 0));
		assertEquals(0, Double.compare(scale.get(2), 0));
		
		//Set the scale to a new value
		controller.setScale(1, 2, 3);
		scale = controller.getScale();
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that the scale is set correctly
		assertEquals(1, Double.compare(scale.get(0), 0));
		assertEquals(2, Double.compare(scale.get(1), 0));
		assertEquals(3, Double.compare(scale.get(2), 0));
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getSize() <em>Get Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getSize()
	 * @generated NOT
	 */
	public void testGetSize() {

		//Check that the size is initially 1
		assertEquals(0, Double.compare(controller.getSize(), 1));
		
		//Set the size and make sure the size is set correctly
		controller.setSize(2);
		assertEquals(0, Double.compare(controller.getSize(), 2));
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getSkew() <em>Get Skew</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getSkew()
	 * @generated NOT
	 */
	public void testGetSkew() {
		
		//Get the controller's initial skew
		List<Double> skew = controller.getSkew();
		
		//Check that the skew is initially 0
		assertEquals(0, Double.compare(skew.get(0), 0));
		assertEquals(0, Double.compare(skew.get(1), 0));
		assertEquals(0, Double.compare(skew.get(2), 0));
		
		//Set the skew to a new value
		controller.setSkew(1, 2, 3);
		skew = controller.getScale();
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that the skew is set correctly
		assertEquals(1, Double.compare(skew.get(0), 0));
		assertEquals(2, Double.compare(skew.get(1), 0));
		assertEquals(3, Double.compare(skew.get(2), 0));
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getTransformation() <em>Get Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getTransformation()
	 * @generated
	 */
	public void testGetTransformation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#getTranslation() <em>Get Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#getTranslation()
	 * @generated NOT
	 */
	public void testGetTranslation() {
		
		//Get the controller's initial translation
		List<Double> translation = controller.getTranslation();
		
		//Check that the translation is initially 0
		assertEquals(0, Double.compare(translation.get(0), 0));
		assertEquals(0, Double.compare(translation.get(1), 0));
		assertEquals(0, Double.compare(translation.get(2), 0));
		
		//Set the skew to a new value
		controller.setTranslation(1, 2, 3);
		translation = controller.getTranslation();
		
		//Check that the controller was notified
		assertTrue(controller.isUpdated());
		
		//Check that the skew is set correctly
		assertEquals(1, Double.compare(translation.get(0), 0));
		assertEquals(2, Double.compare(translation.get(1), 0));
		assertEquals(3, Double.compare(translation.get(2), 0));
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#removeEntity(prototype5.VizObject) <em>Remove Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#removeEntity(prototype5.VizObject)
	 * @generated
	 */
	public void testRemoveEntity__VizObject() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setProperty(java.lang.String, java.lang.String) <em>Set Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setProperty(java.lang.String, java.lang.String)
	 * @generated
	 */
	public void testSetProperty__String_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setRotation(double, double, double) <em>Set Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setRotation(double, double, double)
	 * @generated
	 */
	public void testSetRotation__double_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setScale(double, double, double) <em>Set Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setScale(double, double, double)
	 * @generated
	 */
	public void testSetScale__double_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setSize(double) <em>Set Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setSize(double)
	 * @generated
	 */
	public void testSetSize__double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setSkew(double, double, double) <em>Set Skew</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setSkew(double, double, double)
	 * @generated
	 */
	public void testSetSkew__double_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setTransformation(prototype5.Transformation) <em>Set Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setTransformation(prototype5.Transformation)
	 * @generated
	 */
	public void testSetTransformation__Transformation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#setTranslation(double, double, double) <em>Set Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#setTranslation(double, double, double)
	 * @generated
	 */
	public void testSetTranslation__double_double_double() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#addEntityByCategory(prototype5.VizObject, java.lang.String) <em>Add Entity By Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#addEntityByCategory(prototype5.VizObject, java.lang.String)
	 * @generated
	 */
	public void testAddEntityByCategory__VizObject_String() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#modelUpdate(org.eclipse.emf.common.notify.Notification) <em>Model Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#modelUpdate(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	public void testModelUpdate__Notification() {
		
		
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#viewUpdate(org.eclipse.emf.common.notify.Notification) <em>View Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#viewUpdate(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	public void testViewUpdate__Notification() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#refresh()
	 * @generated
	 */
	public void testRefresh() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '{@link prototype5.AbstractController#synched() <em>Synched</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.AbstractController#synched()
	 * @generated
	 */
	public void testSynched() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} //AbstractControllerTest


class TestController extends AbstractControllerImpl{
	
	boolean updated = false;
	
	public TestController(AbstractMeshComponent model, AbstractView view){
		super(model, view);
	}
	
	@Override
	public void modelUpdate(Notification notification){
		updated = true;
	}
	
	@Override
	public void viewUpdate(Notification notification){
		updated = true;
	}
	
	public boolean isUpdated(){
		boolean temp = updated;
		updated = false;
		return temp;
	}
	
}

class TestMeshComponent extends AbstractMeshComponentImpl{
	
	boolean updated = false;
	
	public TestMeshComponent(List<VizObject> entities) {
		super(entities);
	}
	
	@Override
	public void update(Notification notification){
		updated = true;
	}
	
	public boolean isUpdated(){
		boolean temp = updated;
		updated = false;
		return temp;
	}
}


class TestView extends AbstractViewImpl{
	
	boolean updated = false;
	
	public TestView(){
		super();
	}
	
	@Override
	public Object getRepresentation(){
		return new TestObject();
	}
	
	@Override
	public void update(Notification notification){
		updated = true;
	}
	
	public boolean isUpdated(){
		boolean temp = updated;
		updated = false;
		return temp;
	}
}

class TestObject extends VizObjectImpl{
	public TestObject(){
		super();
	}
}