/**
 */
package prototype5.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import prototype5.Prototype5Factory;
import prototype5.Prototype5Package;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>EString To EString Map</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EStringToEStringMapTest extends TestCase {

	/**
	 * The fixture for this EString To EString Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map.Entry<String, String> fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EStringToEStringMapTest.class);
	}

	/**
	 * Constructs a new EString To EString Map test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EStringToEStringMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EString To EString Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, String> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EString To EString Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map.Entry<String, String> getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	protected void setUp() throws Exception {
		setFixture((Map.Entry<String, String>) Prototype5Factory.eINSTANCE
				.create(Prototype5Package.Literals.ESTRING_TO_ESTRING_MAP));
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

} // EStringToEStringMapTest
