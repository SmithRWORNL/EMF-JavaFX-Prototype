/**
 */
package prototype5.impl;

import org.eclipse.emf.ecore.EClass;
import prototype5.Prototype5Package;
import prototype5.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class VertexImpl extends PointImpl implements Vertex {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VertexImpl() {
		super();
	}
	
	public VertexImpl(double x, double y, double z){
		super(x, y, z);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.VERTEX;
	}

} //VertexImpl
