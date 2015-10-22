/**
 */
package prototype5.tests;

import java.util.ArrayList;

import org.junit.Before;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import prototype5.AbstractView;
import prototype5.Prototype5Factory;
import prototype5.Transformation;
import prototype5.VizObject;
import prototype5.impl.TransformationImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Abstract View</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>{@link prototype5.AbstractView#synched() <em>Synched</em>}</li>
 * <li>{@link prototype5.AbstractView#getRepresentation()
 * <em>Get Representation</em>}</li>
 * <li>
 * {@link prototype5.AbstractView#update(org.eclipse.emf.common.notify.Notification)
 * <em>Update</em>}</li>
 * <li>{@link prototype5.AbstractView#refresh(prototype5.AbstractMeshComponent)
 * <em>Refresh</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class AbstractViewTest extends TestCase {

	/**
	 * The controller's view
	 */
	TestView view;

	/**
	 * The fixture for this Abstract View test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbstractView fixture = null;

	/**
	 * Initialize the controller before each test.
	 */
	@Before
	public void beforeEachTest() {
		view = new TestView();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AbstractViewTest.class);
	}

	/**
	 * Constructs a new Abstract View test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public AbstractViewTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Abstract View test case. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(AbstractView fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Abstract View test case. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AbstractView getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createAbstractView());
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
	 * Tests the '{@link prototype5.AbstractView#synched() <em>Synched</em>}'
	 * operation. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see prototype5.AbstractView#synched()
	 * @generated
	 */
	public void testSynched() {
		// Get the previous transformation
		Transformation prev = view.getPreviousTransformation();

		// Initially, the previous and current transformations should be
		// identical
		assertTrue(view.getTransformation().equals(prev));

		// Change the transformation
		view.getTransformation().setSize(5);

		// Check that the controller was notified
		assertTrue(view.isUpdated());

		// Makes sure the previous transformation is different from the current
		// one
		assertFalse(view.getTransformation()
				.equals(view.getPreviousTransformation()));

		// Change the transformation a second time
		view.getTransformation().setSize(10);

		// Make sure the previous transformation is different from the current
		// one
		assertFalse(view.getTransformation()
				.equals(view.getPreviousTransformation()));

		// Make sure that the previous transformation hasn't changed
		assertTrue(prev.equals(view.getPreviousTransformation()));

		// Create a new transformation and set it as the controller's
		// transformation
		Transformation transform = new TransformationImpl();
		transform.setSize(20);
		view.setTransformation(transform);

		// Check that the controller was notified
		assertTrue(view.isUpdated());

		// Make sure that the previous transformation hasn't changed
		assertFalse(view.getTransformation()
				.equals(view.getPreviousTransformation()));

		// Make sure that the previous transformation hasn't changed
		assertTrue(prev.equals(view.getPreviousTransformation()));

		// Synchronize the controller
		view.synched();

		// Make sure the previous transformation has been updated.
		assertTrue(view.getTransformation()
				.equals(view.getPreviousTransformation()));

		// Assert the previous transformation has the correct size
		assertEquals(0,
				Double.compare(20, view.getPreviousTransformation().getSize()));
	}

	/**
	 * Tests the '{@link prototype5.AbstractView#getRepresentation()
	 * <em>Get Representation</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.AbstractView#getRepresentation()
	 * @generated
	 */
	public void testGetRepresentation() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractView#update(org.eclipse.emf.common.notify.Notification)
	 * <em>Update</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see prototype5.AbstractView#update(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	public void testUpdate__Notification() {

		// Update the transformation
		view.getTransformation().setSize(2);

		// Check that the view was notified
		assertTrue(view.isUpdated());

		// Set a new transformation
		view.setTransformation(new TransformationImpl());

		// Check that the view was notified
		assertTrue(view.isUpdated());

	}

	/**
	 * Tests the '
	 * {@link prototype5.AbstractView#refresh(prototype5.AbstractMeshComponent)
	 * <em>Refresh</em>}' operation. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see prototype5.AbstractView#refresh(prototype5.AbstractMeshComponent)
	 * @generated
	 */
	public void testRefresh__AbstractMeshComponent() {
		// TODO: implement this operation test method
		// Ensure that you remove @generated or mark it @generated NOT
		fail();
	}

} // AbstractViewTest
