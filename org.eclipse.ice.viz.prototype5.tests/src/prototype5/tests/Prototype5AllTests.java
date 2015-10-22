/**
 */
package prototype5.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>Prototype5</b></em>'
 * model. <!-- end-user-doc -->
 * 
 * @generated
 */
public class Prototype5AllTests extends TestSuite {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new Prototype5AllTests("Prototype5 Tests");
		suite.addTest(Prototype5Tests.suite());
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Prototype5AllTests(String name) {
		super(name);
	}

} // Prototype5AllTests
