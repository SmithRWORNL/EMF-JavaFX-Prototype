/**
 */
package prototype5.impl;

import org.eclipse.emf.ecore.EClass;

import prototype5.Element;
import prototype5.Prototype5Package;

/**
 * A mesh component representing a volumetric three dimensional part. It is
 * assumed that any child entities will be the Faces, Edges, and/or Vertices
 * which define the element.
 *
 * @generated
 */
public class ElementImpl extends AbstractMeshComponentImpl implements Element {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.ELEMENT;
	}

} // ElementImpl
