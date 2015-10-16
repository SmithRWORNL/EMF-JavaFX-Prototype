/**
 */
package prototype5;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prototype5.Transformation#getRotation <em>Rotation</em>}</li>
 *   <li>{@link prototype5.Transformation#getScale <em>Scale</em>}</li>
 *   <li>{@link prototype5.Transformation#getSize <em>Size</em>}</li>
 *   <li>{@link prototype5.Transformation#getSkew <em>Skew</em>}</li>
 *   <li>{@link prototype5.Transformation#getTranslation <em>Translation</em>}</li>
 * </ul>
 *
 * @see prototype5.Prototype5Package#getTransformation()
 * @model
 * @generated
 */
public interface Transformation extends EObject {

	/**
	 * Returns the value of the '<em><b>Rotation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rotation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rotation</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Rotation()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getRotation();

	/**
	 * Returns the value of the '<em><b>Scale</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scale</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scale</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Scale()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getScale();

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(double)
	 * @see prototype5.Prototype5Package#getTransformation_Size()
	 * @model
	 * @generated
	 */
	double getSize();

	/**
	 * Sets the value of the '{@link prototype5.Transformation#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(double value);

	/**
	 * Returns the value of the '<em><b>Skew</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skew</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skew</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Skew()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getSkew();

	/**
	 * Returns the value of the '<em><b>Translation</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.Double}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Translation</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Translation</em>' attribute list.
	 * @see prototype5.Prototype5Package#getTransformation_Translation()
	 * @model lower="3" upper="3"
	 * @generated
	 */
	EList<Double> getTranslation();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setRotation(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setScale(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setSkew(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setTranslation(double x, double y, double z);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="prototype5.Object"
	 * @generated
	 */
	Object clone();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherObjectDataType="prototype5.Object"
	 * @generated
	 */
	void copy(Object otherObject);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model otherObjectDataType="prototype5.Object"
	 * @generated
	 */
	boolean equals(Object otherObject);
} // Transformation
