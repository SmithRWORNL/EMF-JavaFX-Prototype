/**
 */
package prototype5.impl;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

import prototype5.Face;
import prototype5.Prototype5Package;
import prototype5.VizObject;

/**
 * A MeshComponent representing a two dimensional polygon. It is assumed that
 * child entities will be the Edges and/or Vertices which define the Face.
 *
 * @generated
 */
public class FaceImpl extends AbstractMeshComponentImpl implements Face {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FaceImpl() {
		super();
	}

	public FaceImpl(List<VizObject> entities) {
		super(entities);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.FACE;
	}

} // FaceImpl
