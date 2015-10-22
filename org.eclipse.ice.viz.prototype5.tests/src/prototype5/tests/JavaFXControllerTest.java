/**
 */
package prototype5.tests;

import java.util.ArrayList;

import org.junit.Before;

import junit.textui.TestRunner;
import prototype5.AbstractMeshComponent;
import prototype5.JavaFXController;
import prototype5.JavaFXControllerFactory;
import prototype5.JavaFXMeshComponent;
import prototype5.JavaFXView;
import prototype5.Prototype5Factory;
import prototype5.VizObject;
import prototype5.impl.JavaFXControllerFactoryImpl;
import prototype5.impl.JavaFXControllerImpl;
import prototype5.impl.JavaFXMeshComponentImpl;
import prototype5.impl.JavaFXViewImpl;
import prototype5.impl.VizObjectImpl;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Java FX Controller</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class JavaFXControllerTest extends AbstractControllerTest {

	/**
	 * The controller's model
	 */
	JavaFXMeshComponent component;

	/**
	 * The controller for the part being tested
	 */
	JavaFXController controller;

	/**
	 * The controller's view.
	 */
	JFXTestView view;

	/**
	 * Initialize the test objects
	 */
	@Before
	public void setup() {
		component = new JavaFXMeshComponentImpl(new ArrayList<VizObject>());
		view = new JFXTestView(component);
		controller = new JavaFXControllerImpl(component, view);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(JavaFXControllerTest.class);
	}

	/**
	 * Constructs a new Java FX Controller test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public JavaFXControllerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Java FX Controller test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected JavaFXController getFixture() {
		return (JavaFXController) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createJavaFXController());
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
	 * Checks that the controller correctly responds to updates.
	 */
	public void checkUpdate() {

		// Make a change to the model
		component.addEntity(new TestObject());

		// The controller should have responded to the model's update by
		// refreshing the view.
		assertTrue(view.wasRefreshed());
	}

	/**
	 * A version of the JavaFXView which tracks whether it has received a
	 * refresh() call, for testing purposes.
	 * 
	 * @author Robert Smith
	 *
	 */
	public class JFXTestView extends JavaFXViewImpl {

		/**
		 * Whether or not the view has been refreshed
		 */
		private boolean refreshed = false;

		/**
		 * The default constructor
		 * 
		 * @param model
		 *            The model this class provides a view for.
		 */
		public JFXTestView(JavaFXMeshComponent model) {
			super(model);
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see prototype5.impl.JavaFXViewImpl#refresh(prototype5.
		 * AbstractMeshComponent)
		 */
		@Override
		public void refresh(AbstractMeshComponent model) {
			refreshed = true;
		}

		/**
		 * Gets whether or not the view has been refreshed
		 * 
		 * @return True if the view has previously been refreshed, false
		 *         otherwise.
		 */
		public boolean wasRefreshed() {
			return refreshed;
		}
	}

} // JavaFXControllerTest
