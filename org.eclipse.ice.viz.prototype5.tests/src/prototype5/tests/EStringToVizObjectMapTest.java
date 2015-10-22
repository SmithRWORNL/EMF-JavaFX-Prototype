/**
 */
package prototype5.tests;

import java.util.Map;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import org.eclipse.emf.common.util.EList;

import prototype5.Prototype5Factory;
import prototype5.Prototype5Package;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> A test case for the model object '
 * <em><b>EString To Viz Object Map</b></em>'. <!-- end-user-doc -->
 * 
 * @generated
 */
public class EStringToVizObjectMapTest extends TestCase {

	/**
	 * The fixture for this EString To Viz Object Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map.Entry<String, EList<VizObject>> fixture = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EStringToVizObjectMapTest.class);
	}

	/**
	 * Constructs a new EString To Viz Object Map test case with the given name.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EStringToVizObjectMapTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this EString To Viz Object Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void setFixture(Map.Entry<String, EList<VizObject>> fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this EString To Viz Object Map test case. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected Map.Entry<String, EList<VizObject>> getFixture() {
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
		setFixture(
				(Map.Entry<String, EList<VizObject>>) Prototype5Factory.eINSTANCE
						.create(Prototype5Package.Literals.ESTRING_TO_VIZ_OBJECT_MAP));
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

} // EStringToVizObjectMapTest
