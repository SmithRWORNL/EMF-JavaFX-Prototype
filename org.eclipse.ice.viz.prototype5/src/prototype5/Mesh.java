/**
 */
package prototype5;

import java.util.Map;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mesh</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link prototype5.Mesh#getType <em>Type</em>}</li>
 *   <li>{@link prototype5.Mesh#getUpdateLock <em>Update Lock</em>}</li>
 *   <li>{@link prototype5.Mesh#getEntities <em>Entities</em>}</li>
 *   <li>{@link prototype5.Mesh#getProperties <em>Properties</em>}</li>
 * </ul>
 *
 * @see prototype5.Prototype5Package#getMesh()
 * @model
 * @generated
 */
public interface Mesh extends VizObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link prototype5.MeshType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see prototype5.MeshType
	 * @see #setType(MeshType)
	 * @see prototype5.Prototype5Package#getMesh_Type()
	 * @model
	 * @generated
	 */
	MeshType getType();

	/**
	 * Sets the value of the '{@link prototype5.Mesh#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see prototype5.MeshType
	 * @see #getType()
	 * @generated
	 */
	void setType(MeshType value);

	/**
	 * Returns the value of the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Update Lock</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Update Lock</em>' attribute.
	 * @see #setUpdateLock(AtomicBoolean)
	 * @see prototype5.Prototype5Package#getMesh_UpdateLock()
	 * @model dataType="prototype5.AtomicBoolean"
	 * @generated
	 */
	AtomicBoolean getUpdateLock();

	/**
	 * Sets the value of the '{@link prototype5.Mesh#getUpdateLock <em>Update Lock</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Update Lock</em>' attribute.
	 * @see #getUpdateLock()
	 * @generated
	 */
	void setUpdateLock(AtomicBoolean value);

	/**
	 * Returns the value of the '<em><b>Entities</b></em>' reference list.
	 * The list contents are of type {@link java.util.Map.Entry}&lt;java.lang.String, org.eclipse.emf.common.util.EList&lt;prototype5.VizObject>>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entities</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entities</em>' reference list.
	 * @see prototype5.Prototype5Package#getMesh_Entities()
	 * @model mapType="prototype5.EStringToVizObjectMap<org.eclipse.emf.ecore.EString, prototype5.VizObject>"
	 * @generated
	 */
	EList<Map.Entry<String, EList<VizObject>>> getEntities();

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' reference list.
	 * The list contents are of type {@link prototype5.EStringToEStringMap}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' reference list.
	 * @see prototype5.Prototype5Package#getMesh_Properties()
	 * @model
	 * @generated
	 */
	EList<EStringToEStringMap> getProperties();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	VizObject getEntitiesByCategory(String category);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String getProperty(String property);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setProperty(String property, String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addEntity(VizObject newEntity);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void removeEntity(VizObject entity);

} // Mesh
