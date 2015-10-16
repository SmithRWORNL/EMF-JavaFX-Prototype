/**
 */
package prototype5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IController Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see prototype5.Prototype5Package#getIControllerFactory()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface IControllerFactory extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	AbstractController createController(AbstractMeshComponent model);

} // IControllerFactory
