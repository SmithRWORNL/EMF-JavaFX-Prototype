/**
 */
package prototype5.impl;

import org.eclipse.emf.ecore.EClass;
import prototype5.Prototype5Package;
import prototype5.Vertex;

/**
 * A point which specifically serves as the endpoint for one or more Edges. It
 * maintains each edge it is associated with in its entities map.
 *
 * @generated
 */
public class VertexImpl extends PointImpl implements Vertex {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}

	public VertexImpl(double x, double y, double z) {
		super(x, y, z);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.VERTEX;
	}

} // VertexImpl
