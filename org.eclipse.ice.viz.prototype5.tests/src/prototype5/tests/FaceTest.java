/**
 */
package prototype5.tests;

import junit.textui.TestRunner;

import prototype5.Face;
import prototype5.Prototype5Factory;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Face</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class FaceTest extends AbstractMeshComponentTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(FaceTest.class);
	}

	/**
	 * Constructs a new Face test case with the given name. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public FaceTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Face test case. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Face getFixture() {
		return (Face) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createFace());
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

} // FaceTest
