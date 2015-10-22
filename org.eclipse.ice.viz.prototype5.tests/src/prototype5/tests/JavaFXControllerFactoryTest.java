/**
 */
package prototype5.tests;

import java.util.ArrayList;

import junit.framework.TestCase;

import junit.textui.TestRunner;
import prototype5.JavaFXController;
import prototype5.JavaFXControllerFactory;
import prototype5.JavaFXMeshComponent;
import prototype5.Prototype5Factory;
import prototype5.VizObject;
import prototype5.impl.JavaFXControllerFactoryImpl;
import prototype5.impl.JavaFXMeshComponentImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Java FX Controller Factory</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 * <li>
 * {@link prototype5.IControllerFactory#createController(prototype5.AbstractMeshComponent)
 * <em>Create Controller</em>}</li>
 * </ul>
 * </p>
 * 
 * @generated
 */
public class JavaFXControllerFactoryTest extends TestCase {

	/**
	 * The fixture for this Java FX Controller Factory test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected JavaFXControllerFactory fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaFXControllerFactoryTest.class);
	}

	/**
	 * Constructs a new Java FX Controller Factory test case with the given
	 * name. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaFXControllerFactoryTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Java FX Controller Factory test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(JavaFXControllerFactory fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Java FX Controller Factory test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected JavaFXControllerFactory getFixture() {
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
		setFixture(Prototype5Factory.eINSTANCE.createJavaFXControllerFactory());
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
	 * {@link prototype5.IControllerFactory#createController(prototype5.AbstractMeshComponent)
	 * <em>Create Controller</em>}' operation. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see prototype5.IControllerFactory#createController(prototype5.AbstractMeshComponent)
	 * @generated
	 */
	public void testCreateController__AbstractMeshComponent() {
		// Create a factory and component
		JavaFXControllerFactory factory = new JavaFXControllerFactoryImpl();
		JavaFXMeshComponent component = new JavaFXMeshComponentImpl(
				new ArrayList<VizObject>());

		// Have the factory create a controller and view for the component
		JavaFXController controller = (JavaFXController) factory
				.createController(component);

		// Check that the controller and component were made.
		assertNotNull(controller);
		assertNotNull(controller.getView());
	}

} // JavaFXControllerFactoryTest
