/**
 */
package prototype5.tests;

import junit.textui.TestRunner;

import prototype5.Prototype5Factory;
import prototype5.Vertex;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>Vertex</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class VertexTest extends PointTest {

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(VertexTest.class);
	}

	/**
	 * Constructs a new Vertex test case with the given name. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public VertexTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Vertex test case. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected Vertex getFixture() {
		return (Vertex) fixture;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(Prototype5Factory.eINSTANCE.createVertex());
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

} // VertexTest
