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
	 * @model
	 * @generated
	 */
	void synched();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" dataType="prototype5.Object"
	 * @generated
	 */
	Object getRepresentation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model notificationDataType="prototype5.Notification"
	 * @generated
	 */
	void update(Notification notification);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void refresh(AbstractMeshComponent model);

} // AbstractView
