/**
 */
package prototype5;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IController Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An interface for classes which instantiate an AbstractView and AbstractController associated with a given model. 
 * <!-- end-model-doc -->
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
	 * <!-- begin-model-doc -->
	 * Creates a new AbstractController to handle interactions with the given model. It also creates an AbstractView of the model, which is also registered with the returned AbstractController. 
	 * 
	 * @param model The model which the controller will manage
	 * @return A new controller which manages the model and its associated view.
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	AbstractController createController(AbstractMeshComponent model);

} // IControllerFactory
