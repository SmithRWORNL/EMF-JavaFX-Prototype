/**
 */
package prototype5;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EContentAdapter;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Abstract View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The view of an AbstractMeshComponent shown to the user. The view is responsible for creating, managing, and updating the datastructure(s) which display the associated AbstractMeshComponent in the view's rendering engine's native data types. 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prototype5.AbstractView#getTransformation <em>Transformation</em>}</li>
 *   <li>{@link prototype5.AbstractView#getPreviousTransformation <em>Previous Transformation</em>}</li>
 *   <li>{@link prototype5.AbstractView#getAdapter <em>Adapter</em>}</li>
 * </ul>
 *
 * @see prototype5.Prototype5Package#getAbstractView()
 * @model
 * @generated
 */
public interface AbstractView extends EObject {
	/**
	 * Returns the value of the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transformation</em>' reference.
	 * @see #setTransformation(Transformation)
	 * @see prototype5.Prototype5Package#getAbstractView_Transformation()
	 * @model
	 * @generated
	 */
	Transformation getTransformation();

	/**
	 * Sets the value of the '{@link prototype5.AbstractView#getTransformation <em>Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transformation</em>' reference.
	 * @see #getTransformation()
	 * @generated
	 */
	void setTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Previous Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Transformation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Transformation</em>' reference.
	 * @see #setPreviousTransformation(Transformation)
	 * @see prototype5.Prototype5Package#getAbstractView_PreviousTransformation()
	 * @model
	 * @generated
	 */
	Transformation getPreviousTransformation();

	/**
	 * Sets the value of the '{@link prototype5.AbstractView#getPreviousTransformation <em>Previous Transformation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Previous Transformation</em>' reference.
	 * @see #getPreviousTransformation()
	 * @generated
	 */
	void setPreviousTransformation(Transformation value);

	/**
	 * Returns the value of the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Adapter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The adapter which is responsible for listening for updates from other objects, usually the transformation.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Adapter</em>' attribute.
	 * @see #setAdapter(EContentAdapter)
	 * @see prototype5.Prototype5Package#getAbstractView_Adapter()
	 * @model dataType="prototype5.EContentAdapter"
	 * @generated
	 */
	EContentAdapter getAdapter();

	/**
	 * Sets the value of the '{@link prototype5.AbstractView#getAdapter <em>Adapter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Adapter</em>' attribute.
	 * @see #getAdapter()
	 * @generated
	 */
	void setAdapter(EContentAdapter value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Signals to the view that the graphical engine has updated to correctly render the view's current state. 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void synched();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Get the graphical representation of the associated model, in a data type apprioriate to the graphical engine. 
	 * 
	 * @return The view's graphical representation
	 * <!-- end-model-doc -->
	 * @model kind="operation" dataType="prototype5.Object"
	 * @generated
	 */
	Object getRepresentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The function called when the view receives an update from an object it is listening to, normally its transformation.
	 * 
	 * @param notification The message received from the observed object
	 * <!-- end-model-doc -->
	 * @model notificationDataType="prototype5.Notification"
	 * @generated
	 */
	void update(Notification notification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Causes the view to redraw its representation, based on the model's current state.
	 * 
	 * @param model The view's associated model
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void refresh(AbstractMeshComponent model);

} // AbstractView
