/**
 */
package prototype5.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc --> A test suite for the '<em><b>prototype5</b></em>'
 * package. <!-- end-user-doc -->
 * 
 * @generated
 */
public class Prototype5Tests extends TestSuite {

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
		TestSuite suite = new Prototype5Tests("prototype5 Tests");
		suite.addTestSuite(FaceTest.class);
		suite.addTestSuite(ShapeTest.class);
		suite.addTestSuite(ElementTest.class);
		suite.addTestSuite(VertexTest.class);
		suite.addTestSuite(EdgeTest.class);
		suite.addTestSuite(VizObjectTest.class);
		suite.addTestSuite(AbstractViewTest.class);
		suite.addTestSuite(TransformationTest.class);
		suite.addTestSuite(PointTest.class);
		suite.addTestSuite(AbstractMeshComponentTest.class);
		suite.addTestSuite(AbstractControllerTest.class);
		suite.addTestSuite(JavaFXViewTest.class);
		suite.addTestSuite(JavaFXMeshComponentTest.class);
		suite.addTestSuite(JavaFXControllerTest.class);
		suite.addTestSuite(JavaFXControllerFactoryTest.class);
		suite.addTestSuite(EdgeAndVertexFaceTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Prototype5Tests(String name) {
		super(name);
	}

} // Prototype5Tests
