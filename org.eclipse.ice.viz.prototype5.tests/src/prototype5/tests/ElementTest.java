/**
 */
package prototype5.tests;

import junit.textui.TestRunner;

import prototype5.Element;
import prototype5.Prototype5Factory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Element</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class ElementTest extends AbstractMeshComponentTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ElementTest.class);
	}

	/**
	 * Constructs a new Element test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public ElementTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Element test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Element getFixture() {
		return (Element) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createElement());
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

} // ElementTest
