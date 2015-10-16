/**
 */
package prototype5;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see prototype5.Prototype5Factory
 * @model kind="package"
 * @generated
 */
public interface Prototype5Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "prototype5";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/prototype5";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "prototype5";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Prototype5Package eINSTANCE = prototype5.impl.Prototype5PackageImpl.init();

	/**
	 * The meta object id for the '{@link prototype5.impl.VizObjectImpl <em>Viz Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.VizObjectImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getVizObject()
	 * @generated
	 */
	int VIZ_OBJECT = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT__NAME = 2;

	/**
	 * The number of structural features of the '<em>Viz Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT___CLONE = 0;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT___COPY__VIZOBJECT = 1;

	/**
	 * The number of operations of the '<em>Viz Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VIZ_OBJECT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link prototype5.impl.AbstractMeshComponentImpl <em>Abstract Mesh Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.AbstractMeshComponentImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getAbstractMeshComponent()
	 * @generated
	 */
	int ABSTRACT_MESH_COMPONENT = 12;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__ID = VIZ_OBJECT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__DESCRIPTION = VIZ_OBJECT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__NAME = VIZ_OBJECT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__TYPE = VIZ_OBJECT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__UPDATE_LOCK = VIZ_OBJECT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__ENTITIES = VIZ_OBJECT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__PROPERTIES = VIZ_OBJECT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT__ADAPTER = VIZ_OBJECT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Abstract Mesh Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT_FEATURE_COUNT = VIZ_OBJECT_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___CLONE = VIZ_OBJECT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT = VIZ_OBJECT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING = VIZ_OBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING = VIZ_OBJECT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING = VIZ_OBJECT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT = VIZ_OBJECT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT = VIZ_OBJECT_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = VIZ_OBJECT_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION = VIZ_OBJECT_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT = VIZ_OBJECT_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT = VIZ_OBJECT_OPERATION_COUNT + 8;

	/**
	 * The number of operations of the '<em>Abstract Mesh Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_MESH_COMPONENT_OPERATION_COUNT = VIZ_OBJECT_OPERATION_COUNT + 9;

	/**
	 * The meta object id for the '{@link prototype5.impl.FaceImpl <em>Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.FaceImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getFace()
	 * @generated
	 */
	int FACE = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__ID = ABSTRACT_MESH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__DESCRIPTION = ABSTRACT_MESH_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__NAME = ABSTRACT_MESH_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__TYPE = ABSTRACT_MESH_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__UPDATE_LOCK = ABSTRACT_MESH_COMPONENT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__ENTITIES = ABSTRACT_MESH_COMPONENT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__PROPERTIES = ABSTRACT_MESH_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE__ADAPTER = ABSTRACT_MESH_COMPONENT__ADAPTER;

	/**
	 * The number of structural features of the '<em>Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_FEATURE_COUNT = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___CLONE = ABSTRACT_MESH_COMPONENT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___COPY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___GET_PROPERTY__STRING = ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___SET_PROPERTY__STRING_STRING = ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___ADD_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___UPDATE__NOTIFICATION = ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___REGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE___UNREGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT;

	/**
	 * The number of operations of the '<em>Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACE_OPERATION_COUNT = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.ShapeImpl <em>Shape</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.ShapeImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getShape()
	 * @generated
	 */
	int SHAPE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ID = ABSTRACT_MESH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__DESCRIPTION = ABSTRACT_MESH_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__NAME = ABSTRACT_MESH_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__TYPE = ABSTRACT_MESH_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__UPDATE_LOCK = ABSTRACT_MESH_COMPONENT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ENTITIES = ABSTRACT_MESH_COMPONENT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__PROPERTIES = ABSTRACT_MESH_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE__ADAPTER = ABSTRACT_MESH_COMPONENT__ADAPTER;

	/**
	 * The number of structural features of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_FEATURE_COUNT = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___CLONE = ABSTRACT_MESH_COMPONENT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___COPY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___GET_PROPERTY__STRING = ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___SET_PROPERTY__STRING_STRING = ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___ADD_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___UPDATE__NOTIFICATION = ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___REGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE___UNREGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT;

	/**
	 * The number of operations of the '<em>Shape</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHAPE_OPERATION_COUNT = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.ElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.ElementImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getElement()
	 * @generated
	 */
	int ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ID = ABSTRACT_MESH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__DESCRIPTION = ABSTRACT_MESH_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__NAME = ABSTRACT_MESH_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__TYPE = ABSTRACT_MESH_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__UPDATE_LOCK = ABSTRACT_MESH_COMPONENT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ENTITIES = ABSTRACT_MESH_COMPONENT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__PROPERTIES = ABSTRACT_MESH_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT__ADAPTER = ABSTRACT_MESH_COMPONENT__ADAPTER;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_FEATURE_COUNT = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___CLONE = ABSTRACT_MESH_COMPONENT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___COPY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___GET_PROPERTY__STRING = ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___SET_PROPERTY__STRING_STRING = ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___UPDATE__NOTIFICATION = ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___REGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT___UNREGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ELEMENT_OPERATION_COUNT = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.VertexImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 3;

	/**
	 * The meta object id for the '{@link prototype5.impl.EdgeImpl <em>Edge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.EdgeImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getEdge()
	 * @generated
	 */
	int EDGE = 4;

	/**
	 * The meta object id for the '{@link prototype5.impl.AbstractViewImpl <em>Abstract View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.AbstractViewImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getAbstractView()
	 * @generated
	 */
	int ABSTRACT_VIEW = 6;

	/**
	 * The meta object id for the '{@link prototype5.IControllerFactory <em>IController Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.IControllerFactory
	 * @see prototype5.impl.Prototype5PackageImpl#getIControllerFactory()
	 * @generated
	 */
	int ICONTROLLER_FACTORY = 7;

	/**
	 * The meta object id for the '{@link prototype5.impl.EStringToEStringMapImpl <em>EString To EString Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.EStringToEStringMapImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getEStringToEStringMap()
	 * @generated
	 */
	int ESTRING_TO_ESTRING_MAP = 8;

	/**
	 * The meta object id for the '{@link prototype5.impl.EStringToVizObjectMapImpl <em>EString To Viz Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.EStringToVizObjectMapImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getEStringToVizObjectMap()
	 * @generated
	 */
	int ESTRING_TO_VIZ_OBJECT_MAP = 9;

	/**
	 * The meta object id for the '{@link prototype5.impl.TransformationImpl <em>Transformation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.TransformationImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getTransformation()
	 * @generated
	 */
	int TRANSFORMATION = 10;

	/**
	 * The meta object id for the '{@link prototype5.impl.PointImpl <em>Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.PointImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getPoint()
	 * @generated
	 */
	int POINT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ID = ABSTRACT_MESH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__DESCRIPTION = ABSTRACT_MESH_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__NAME = ABSTRACT_MESH_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__TYPE = ABSTRACT_MESH_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__UPDATE_LOCK = ABSTRACT_MESH_COMPONENT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ENTITIES = ABSTRACT_MESH_COMPONENT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__PROPERTIES = ABSTRACT_MESH_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__ADAPTER = ABSTRACT_MESH_COMPONENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__X = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Y = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT__Z = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_FEATURE_COUNT = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 3;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___CLONE = ABSTRACT_MESH_COMPONENT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___COPY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___GET_PROPERTY__STRING = ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___SET_PROPERTY__STRING_STRING = ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___ADD_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___UPDATE__NOTIFICATION = ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___REGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___UNREGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___GET_LOCATION = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Update Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT___UPDATE_LOCATION__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int POINT_OPERATION_COUNT = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ID = POINT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__DESCRIPTION = POINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = POINT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__TYPE = POINT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__UPDATE_LOCK = POINT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ENTITIES = POINT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__PROPERTIES = POINT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ADAPTER = POINT__ADAPTER;

	/**
	 * The feature id for the '<em><b>X</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__X = POINT__X;

	/**
	 * The feature id for the '<em><b>Y</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__Y = POINT__Y;

	/**
	 * The feature id for the '<em><b>Z</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__Z = POINT__Z;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = POINT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___CLONE = POINT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___COPY__VIZOBJECT = POINT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_ENTITIES_BY_CATEGORY__STRING = POINT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_PROPERTY__STRING = POINT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___SET_PROPERTY__STRING_STRING = POINT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ADD_ENTITY__VIZOBJECT = POINT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___REMOVE_ENTITY__VIZOBJECT = POINT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = POINT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___UPDATE__NOTIFICATION = POINT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___REGISTER__VIZOBJECT = POINT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___UNREGISTER__VIZOBJECT = POINT___UNREGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___GET_LOCATION = POINT___GET_LOCATION;

	/**
	 * The operation id for the '<em>Update Location</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX___UPDATE_LOCATION__DOUBLE_DOUBLE_DOUBLE = POINT___UPDATE_LOCATION__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = POINT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ID = ABSTRACT_MESH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__DESCRIPTION = ABSTRACT_MESH_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__NAME = ABSTRACT_MESH_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__TYPE = ABSTRACT_MESH_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__UPDATE_LOCK = ABSTRACT_MESH_COMPONENT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ENTITIES = ABSTRACT_MESH_COMPONENT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__PROPERTIES = ABSTRACT_MESH_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__ADAPTER = ABSTRACT_MESH_COMPONENT__ADAPTER;

	/**
	 * The feature id for the '<em><b>Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE__LENGTH = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_FEATURE_COUNT = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___CLONE = ABSTRACT_MESH_COMPONENT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___COPY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___GET_PROPERTY__STRING = ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___SET_PROPERTY__STRING_STRING = ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___ADD_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___UPDATE__NOTIFICATION = ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___REGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE___UNREGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT;

	/**
	 * The number of operations of the '<em>Edge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_OPERATION_COUNT = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__TRANSFORMATION = 0;

	/**
	 * The feature id for the '<em><b>Previous Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION = 1;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW__ADAPTER = 2;

	/**
	 * The number of structural features of the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Synched</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW___SYNCHED = 0;

	/**
	 * The operation id for the '<em>Get Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW___GET_REPRESENTATION = 1;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW___UPDATE__NOTIFICATION = 2;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW___REFRESH__ABSTRACTMESHCOMPONENT = 3;

	/**
	 * The number of operations of the '<em>Abstract View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_VIEW_OPERATION_COUNT = 4;

	/**
	 * The number of structural features of the '<em>IController Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROLLER_FACTORY_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROLLER_FACTORY___CREATE_CONTROLLER__ABSTRACTMESHCOMPONENT = 0;

	/**
	 * The number of operations of the '<em>IController Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICONTROLLER_FACTORY_OPERATION_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ESTRING_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ESTRING_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To EString Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ESTRING_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To EString Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_ESTRING_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VIZ_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VIZ_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To Viz Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VIZ_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To Viz Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_VIZ_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * The feature id for the '<em><b>Rotation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__ROTATION = 0;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SCALE = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Skew</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__SKEW = 3;

	/**
	 * The feature id for the '<em><b>Translation</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION__TRANSLATION = 4;

	/**
	 * The number of structural features of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Set Rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE = 0;

	/**
	 * The operation id for the '<em>Set Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___SET_SCALE__DOUBLE_DOUBLE_DOUBLE = 1;

	/**
	 * The operation id for the '<em>Set Skew</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___SET_SKEW__DOUBLE_DOUBLE_DOUBLE = 2;

	/**
	 * The operation id for the '<em>Set Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE = 3;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___CLONE = 4;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___COPY__OBJECT = 5;

	/**
	 * The operation id for the '<em>Equals</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION___EQUALS__OBJECT = 6;

	/**
	 * The number of operations of the '<em>Transformation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSFORMATION_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link prototype5.impl.AbstractControllerImpl <em>Abstract Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.AbstractControllerImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getAbstractController()
	 * @generated
	 */
	int ABSTRACT_CONTROLLER = 13;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER__DISPOSED = 0;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER__MODEL = 1;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER__VIEW = 2;

	/**
	 * The number of structural features of the '<em>Abstract Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___ADD_ENTITY__VIZOBJECT = 0;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___DISPOSE = 1;

	/**
	 * The operation id for the '<em>Get Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_ENTITIES = 2;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_ENTITIES_BY_CATEGORY__STRING = 3;

	/**
	 * The operation id for the '<em>Get Previous Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_PREVIOUS_TRANSFORMATION = 4;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_PROPERTY__STRING = 5;

	/**
	 * The operation id for the '<em>Get Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_REPRESENTATION = 6;

	/**
	 * The operation id for the '<em>Get Rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_ROTATION = 7;

	/**
	 * The operation id for the '<em>Get Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_SCALE = 8;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_SIZE = 9;

	/**
	 * The operation id for the '<em>Get Skew</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_SKEW = 10;

	/**
	 * The operation id for the '<em>Get Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_TRANSFORMATION = 11;

	/**
	 * The operation id for the '<em>Get Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___GET_TRANSLATION = 12;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___REMOVE_ENTITY__VIZOBJECT = 13;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_PROPERTY__STRING_STRING = 14;

	/**
	 * The operation id for the '<em>Set Rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE = 15;

	/**
	 * The operation id for the '<em>Set Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_SCALE__DOUBLE_DOUBLE_DOUBLE = 16;

	/**
	 * The operation id for the '<em>Set Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_SIZE__DOUBLE = 17;

	/**
	 * The operation id for the '<em>Set Skew</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_SKEW__DOUBLE_DOUBLE_DOUBLE = 18;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_TRANSFORMATION__TRANSFORMATION = 19;

	/**
	 * The operation id for the '<em>Set Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE = 20;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = 21;

	/**
	 * The operation id for the '<em>Model Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___MODEL_UPDATE__NOTIFICATION = 22;

	/**
	 * The operation id for the '<em>View Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___VIEW_UPDATE__NOTIFICATION = 23;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___REFRESH = 24;

	/**
	 * The operation id for the '<em>Synched</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER___SYNCHED = 25;

	/**
	 * The number of operations of the '<em>Abstract Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_CONTROLLER_OPERATION_COUNT = 26;

	/**
	 * The meta object id for the '{@link prototype5.impl.JavaFXViewImpl <em>Java FX View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.JavaFXViewImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXView()
	 * @generated
	 */
	int JAVA_FX_VIEW = 14;

	/**
	 * The feature id for the '<em><b>Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW__TRANSFORMATION = ABSTRACT_VIEW__TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Previous Transformation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW__PREVIOUS_TRANSFORMATION = ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW__ADAPTER = ABSTRACT_VIEW__ADAPTER;

	/**
	 * The number of structural features of the '<em>Java FX View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW_FEATURE_COUNT = ABSTRACT_VIEW_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Synched</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW___SYNCHED = ABSTRACT_VIEW___SYNCHED;

	/**
	 * The operation id for the '<em>Get Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW___GET_REPRESENTATION = ABSTRACT_VIEW___GET_REPRESENTATION;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW___UPDATE__NOTIFICATION = ABSTRACT_VIEW___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW___REFRESH__ABSTRACTMESHCOMPONENT = ABSTRACT_VIEW___REFRESH__ABSTRACTMESHCOMPONENT;

	/**
	 * The number of operations of the '<em>Java FX View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_VIEW_OPERATION_COUNT = ABSTRACT_VIEW_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.JavaFXMeshComponentImpl <em>Java FX Mesh Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.JavaFXMeshComponentImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXMeshComponent()
	 * @generated
	 */
	int JAVA_FX_MESH_COMPONENT = 15;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__ID = ABSTRACT_MESH_COMPONENT__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__DESCRIPTION = ABSTRACT_MESH_COMPONENT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__NAME = ABSTRACT_MESH_COMPONENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__TYPE = ABSTRACT_MESH_COMPONENT__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__UPDATE_LOCK = ABSTRACT_MESH_COMPONENT__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__ENTITIES = ABSTRACT_MESH_COMPONENT__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__PROPERTIES = ABSTRACT_MESH_COMPONENT__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT__ADAPTER = ABSTRACT_MESH_COMPONENT__ADAPTER;

	/**
	 * The number of structural features of the '<em>Java FX Mesh Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT_FEATURE_COUNT = ABSTRACT_MESH_COMPONENT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___CLONE = ABSTRACT_MESH_COMPONENT___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___COPY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___GET_PROPERTY__STRING = ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___SET_PROPERTY__STRING_STRING = ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___UPDATE__NOTIFICATION = ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___REGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT___UNREGISTER__VIZOBJECT = ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT;

	/**
	 * The number of operations of the '<em>Java FX Mesh Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_MESH_COMPONENT_OPERATION_COUNT = ABSTRACT_MESH_COMPONENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.JavaFXControllerImpl <em>Java FX Controller</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.JavaFXControllerImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXController()
	 * @generated
	 */
	int JAVA_FX_CONTROLLER = 16;

	/**
	 * The feature id for the '<em><b>Disposed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER__DISPOSED = ABSTRACT_CONTROLLER__DISPOSED;

	/**
	 * The feature id for the '<em><b>Model</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER__MODEL = ABSTRACT_CONTROLLER__MODEL;

	/**
	 * The feature id for the '<em><b>View</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER__VIEW = ABSTRACT_CONTROLLER__VIEW;

	/**
	 * The number of structural features of the '<em>Java FX Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER_FEATURE_COUNT = ABSTRACT_CONTROLLER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___ADD_ENTITY__VIZOBJECT = ABSTRACT_CONTROLLER___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Dispose</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___DISPOSE = ABSTRACT_CONTROLLER___DISPOSE;

	/**
	 * The operation id for the '<em>Get Entities</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_ENTITIES = ABSTRACT_CONTROLLER___GET_ENTITIES;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_ENTITIES_BY_CATEGORY__STRING = ABSTRACT_CONTROLLER___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Previous Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_PREVIOUS_TRANSFORMATION = ABSTRACT_CONTROLLER___GET_PREVIOUS_TRANSFORMATION;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_PROPERTY__STRING = ABSTRACT_CONTROLLER___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Get Representation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_REPRESENTATION = ABSTRACT_CONTROLLER___GET_REPRESENTATION;

	/**
	 * The operation id for the '<em>Get Rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_ROTATION = ABSTRACT_CONTROLLER___GET_ROTATION;

	/**
	 * The operation id for the '<em>Get Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_SCALE = ABSTRACT_CONTROLLER___GET_SCALE;

	/**
	 * The operation id for the '<em>Get Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_SIZE = ABSTRACT_CONTROLLER___GET_SIZE;

	/**
	 * The operation id for the '<em>Get Skew</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_SKEW = ABSTRACT_CONTROLLER___GET_SKEW;

	/**
	 * The operation id for the '<em>Get Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_TRANSFORMATION = ABSTRACT_CONTROLLER___GET_TRANSFORMATION;

	/**
	 * The operation id for the '<em>Get Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___GET_TRANSLATION = ABSTRACT_CONTROLLER___GET_TRANSLATION;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___REMOVE_ENTITY__VIZOBJECT = ABSTRACT_CONTROLLER___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_PROPERTY__STRING_STRING = ABSTRACT_CONTROLLER___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Set Rotation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_CONTROLLER___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Set Scale</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_SCALE__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_CONTROLLER___SET_SCALE__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Set Size</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_SIZE__DOUBLE = ABSTRACT_CONTROLLER___SET_SIZE__DOUBLE;

	/**
	 * The operation id for the '<em>Set Skew</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_SKEW__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_CONTROLLER___SET_SKEW__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Set Transformation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_TRANSFORMATION__TRANSFORMATION = ABSTRACT_CONTROLLER___SET_TRANSFORMATION__TRANSFORMATION;

	/**
	 * The operation id for the '<em>Set Translation</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE = ABSTRACT_CONTROLLER___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = ABSTRACT_CONTROLLER___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Model Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___MODEL_UPDATE__NOTIFICATION = ABSTRACT_CONTROLLER___MODEL_UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>View Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___VIEW_UPDATE__NOTIFICATION = ABSTRACT_CONTROLLER___VIEW_UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Refresh</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___REFRESH = ABSTRACT_CONTROLLER___REFRESH;

	/**
	 * The operation id for the '<em>Synched</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER___SYNCHED = ABSTRACT_CONTROLLER___SYNCHED;

	/**
	 * The number of operations of the '<em>Java FX Controller</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER_OPERATION_COUNT = ABSTRACT_CONTROLLER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.JavaFXControllerFactoryImpl <em>Java FX Controller Factory</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.JavaFXControllerFactoryImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXControllerFactory()
	 * @generated
	 */
	int JAVA_FX_CONTROLLER_FACTORY = 17;

	/**
	 * The number of structural features of the '<em>Java FX Controller Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER_FACTORY_FEATURE_COUNT = ICONTROLLER_FACTORY_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Controller</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER_FACTORY___CREATE_CONTROLLER__ABSTRACTMESHCOMPONENT = ICONTROLLER_FACTORY___CREATE_CONTROLLER__ABSTRACTMESHCOMPONENT;

	/**
	 * The number of operations of the '<em>Java FX Controller Factory</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JAVA_FX_CONTROLLER_FACTORY_OPERATION_COUNT = ICONTROLLER_FACTORY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.impl.EdgeAndVertexFaceImpl <em>Edge And Vertex Face</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.impl.EdgeAndVertexFaceImpl
	 * @see prototype5.impl.Prototype5PackageImpl#getEdgeAndVertexFace()
	 * @generated
	 */
	int EDGE_AND_VERTEX_FACE = 18;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__ID = FACE__ID;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__DESCRIPTION = FACE__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__NAME = FACE__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__TYPE = FACE__TYPE;

	/**
	 * The feature id for the '<em><b>Update Lock</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__UPDATE_LOCK = FACE__UPDATE_LOCK;

	/**
	 * The feature id for the '<em><b>Entities</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__ENTITIES = FACE__ENTITIES;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__PROPERTIES = FACE__PROPERTIES;

	/**
	 * The feature id for the '<em><b>Adapter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE__ADAPTER = FACE__ADAPTER;

	/**
	 * The number of structural features of the '<em>Edge And Vertex Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE_FEATURE_COUNT = FACE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Clone</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___CLONE = FACE___CLONE;

	/**
	 * The operation id for the '<em>Copy</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___COPY__VIZOBJECT = FACE___COPY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Get Entities By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___GET_ENTITIES_BY_CATEGORY__STRING = FACE___GET_ENTITIES_BY_CATEGORY__STRING;

	/**
	 * The operation id for the '<em>Get Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___GET_PROPERTY__STRING = FACE___GET_PROPERTY__STRING;

	/**
	 * The operation id for the '<em>Set Property</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___SET_PROPERTY__STRING_STRING = FACE___SET_PROPERTY__STRING_STRING;

	/**
	 * The operation id for the '<em>Add Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___ADD_ENTITY__VIZOBJECT = FACE___ADD_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Remove Entity</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___REMOVE_ENTITY__VIZOBJECT = FACE___REMOVE_ENTITY__VIZOBJECT;

	/**
	 * The operation id for the '<em>Add Entity By Category</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = FACE___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___UPDATE__NOTIFICATION = FACE___UPDATE__NOTIFICATION;

	/**
	 * The operation id for the '<em>Register</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___REGISTER__VIZOBJECT = FACE___REGISTER__VIZOBJECT;

	/**
	 * The operation id for the '<em>Unregister</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE___UNREGISTER__VIZOBJECT = FACE___UNREGISTER__VIZOBJECT;

	/**
	 * The number of operations of the '<em>Edge And Vertex Face</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EDGE_AND_VERTEX_FACE_OPERATION_COUNT = FACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link prototype5.MeshType <em>Mesh Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see prototype5.MeshType
	 * @see prototype5.impl.Prototype5PackageImpl#getMeshType()
	 * @generated
	 */
	int MESH_TYPE = 19;

	/**
	 * The meta object id for the '<em>Atomic Boolean</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.concurrent.atomic.AtomicBoolean
	 * @see prototype5.impl.Prototype5PackageImpl#getAtomicBoolean()
	 * @generated
	 */
	int ATOMIC_BOOLEAN = 20;


	/**
	 * The meta object id for the '<em>Notification</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.notify.Notification
	 * @see prototype5.impl.Prototype5PackageImpl#getNotification()
	 * @generated
	 */
	int NOTIFICATION = 21;


	/**
	 * The meta object id for the '<em>EContent Adapter</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.util.EContentAdapter
	 * @see prototype5.impl.Prototype5PackageImpl#getEContentAdapter()
	 * @generated
	 */
	int ECONTENT_ADAPTER = 22;


	/**
	 * The meta object id for the '<em>Object</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Object
	 * @see prototype5.impl.Prototype5PackageImpl#getObject()
	 * @generated
	 */
	int OBJECT = 23;


	/**
	 * Returns the meta object for class '{@link prototype5.Face <em>Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Face</em>'.
	 * @see prototype5.Face
	 * @generated
	 */
	EClass getFace();

	/**
	 * Returns the meta object for class '{@link prototype5.Shape <em>Shape</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shape</em>'.
	 * @see prototype5.Shape
	 * @generated
	 */
	EClass getShape();

	/**
	 * Returns the meta object for class '{@link prototype5.Element <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see prototype5.Element
	 * @generated
	 */
	EClass getElement();

	/**
	 * Returns the meta object for class '{@link prototype5.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see prototype5.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for class '{@link prototype5.Edge <em>Edge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge</em>'.
	 * @see prototype5.Edge
	 * @generated
	 */
	EClass getEdge();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.Edge#getLength <em>Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Length</em>'.
	 * @see prototype5.Edge#getLength()
	 * @see #getEdge()
	 * @generated
	 */
	EAttribute getEdge_Length();

	/**
	 * Returns the meta object for class '{@link prototype5.VizObject <em>Viz Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Viz Object</em>'.
	 * @see prototype5.VizObject
	 * @generated
	 */
	EClass getVizObject();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.VizObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see prototype5.VizObject#getId()
	 * @see #getVizObject()
	 * @generated
	 */
	EAttribute getVizObject_Id();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.VizObject#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see prototype5.VizObject#getDescription()
	 * @see #getVizObject()
	 * @generated
	 */
	EAttribute getVizObject_Description();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.VizObject#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see prototype5.VizObject#getName()
	 * @see #getVizObject()
	 * @generated
	 */
	EAttribute getVizObject_Name();

	/**
	 * Returns the meta object for the '{@link prototype5.VizObject#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see prototype5.VizObject#clone()
	 * @generated
	 */
	EOperation getVizObject__Clone();

	/**
	 * Returns the meta object for the '{@link prototype5.VizObject#copy(prototype5.VizObject) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see prototype5.VizObject#copy(prototype5.VizObject)
	 * @generated
	 */
	EOperation getVizObject__Copy__VizObject();

	/**
	 * Returns the meta object for class '{@link prototype5.AbstractView <em>Abstract View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract View</em>'.
	 * @see prototype5.AbstractView
	 * @generated
	 */
	EClass getAbstractView();

	/**
	 * Returns the meta object for the reference '{@link prototype5.AbstractView#getTransformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Transformation</em>'.
	 * @see prototype5.AbstractView#getTransformation()
	 * @see #getAbstractView()
	 * @generated
	 */
	EReference getAbstractView_Transformation();

	/**
	 * Returns the meta object for the reference '{@link prototype5.AbstractView#getPreviousTransformation <em>Previous Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Previous Transformation</em>'.
	 * @see prototype5.AbstractView#getPreviousTransformation()
	 * @see #getAbstractView()
	 * @generated
	 */
	EReference getAbstractView_PreviousTransformation();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.AbstractView#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter</em>'.
	 * @see prototype5.AbstractView#getAdapter()
	 * @see #getAbstractView()
	 * @generated
	 */
	EAttribute getAbstractView_Adapter();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractView#synched() <em>Synched</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synched</em>' operation.
	 * @see prototype5.AbstractView#synched()
	 * @generated
	 */
	EOperation getAbstractView__Synched();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractView#getRepresentation() <em>Get Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Representation</em>' operation.
	 * @see prototype5.AbstractView#getRepresentation()
	 * @generated
	 */
	EOperation getAbstractView__GetRepresentation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractView#update(org.eclipse.emf.common.notify.Notification) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see prototype5.AbstractView#update(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	EOperation getAbstractView__Update__Notification();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractView#refresh(prototype5.AbstractMeshComponent) <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see prototype5.AbstractView#refresh(prototype5.AbstractMeshComponent)
	 * @generated
	 */
	EOperation getAbstractView__Refresh__AbstractMeshComponent();

	/**
	 * Returns the meta object for class '{@link prototype5.IControllerFactory <em>IController Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IController Factory</em>'.
	 * @see prototype5.IControllerFactory
	 * @generated
	 */
	EClass getIControllerFactory();

	/**
	 * Returns the meta object for the '{@link prototype5.IControllerFactory#createController(prototype5.AbstractMeshComponent) <em>Create Controller</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Controller</em>' operation.
	 * @see prototype5.IControllerFactory#createController(prototype5.AbstractMeshComponent)
	 * @generated
	 */
	EOperation getIControllerFactory__CreateController__AbstractMeshComponent();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To EString Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To EString Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EString"
	 * @generated
	 */
	EClass getEStringToEStringMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEStringMap()
	 * @generated
	 */
	EAttribute getEStringToEStringMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEStringMap()
	 * @generated
	 */
	EAttribute getEStringToEStringMap_Value();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To Viz Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To Viz Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueType="prototype5.VizObject" valueMany="true"
	 * @generated
	 */
	EClass getEStringToVizObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToVizObjectMap()
	 * @generated
	 */
	EAttribute getEStringToVizObjectMap_Key();

	/**
	 * Returns the meta object for the reference list '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToVizObjectMap()
	 * @generated
	 */
	EReference getEStringToVizObjectMap_Value();

	/**
	 * Returns the meta object for class '{@link prototype5.Transformation <em>Transformation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transformation</em>'.
	 * @see prototype5.Transformation
	 * @generated
	 */
	EClass getTransformation();

	/**
	 * Returns the meta object for the attribute list '{@link prototype5.Transformation#getRotation <em>Rotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Rotation</em>'.
	 * @see prototype5.Transformation#getRotation()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Rotation();

	/**
	 * Returns the meta object for the attribute list '{@link prototype5.Transformation#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Scale</em>'.
	 * @see prototype5.Transformation#getScale()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Scale();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.Transformation#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see prototype5.Transformation#getSize()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Size();

	/**
	 * Returns the meta object for the attribute list '{@link prototype5.Transformation#getSkew <em>Skew</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Skew</em>'.
	 * @see prototype5.Transformation#getSkew()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Skew();

	/**
	 * Returns the meta object for the attribute list '{@link prototype5.Transformation#getTranslation <em>Translation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Translation</em>'.
	 * @see prototype5.Transformation#getTranslation()
	 * @see #getTransformation()
	 * @generated
	 */
	EAttribute getTransformation_Translation();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#setRotation(double, double, double) <em>Set Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Rotation</em>' operation.
	 * @see prototype5.Transformation#setRotation(double, double, double)
	 * @generated
	 */
	EOperation getTransformation__SetRotation__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#setScale(double, double, double) <em>Set Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Scale</em>' operation.
	 * @see prototype5.Transformation#setScale(double, double, double)
	 * @generated
	 */
	EOperation getTransformation__SetScale__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#setSkew(double, double, double) <em>Set Skew</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Skew</em>' operation.
	 * @see prototype5.Transformation#setSkew(double, double, double)
	 * @generated
	 */
	EOperation getTransformation__SetSkew__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#setTranslation(double, double, double) <em>Set Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Translation</em>' operation.
	 * @see prototype5.Transformation#setTranslation(double, double, double)
	 * @generated
	 */
	EOperation getTransformation__SetTranslation__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#clone() <em>Clone</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Clone</em>' operation.
	 * @see prototype5.Transformation#clone()
	 * @generated
	 */
	EOperation getTransformation__Clone();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#copy(java.lang.Object) <em>Copy</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Copy</em>' operation.
	 * @see prototype5.Transformation#copy(java.lang.Object)
	 * @generated
	 */
	EOperation getTransformation__Copy__Object();

	/**
	 * Returns the meta object for the '{@link prototype5.Transformation#equals(java.lang.Object) <em>Equals</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Equals</em>' operation.
	 * @see prototype5.Transformation#equals(java.lang.Object)
	 * @generated
	 */
	EOperation getTransformation__Equals__Object();

	/**
	 * Returns the meta object for class '{@link prototype5.Point <em>Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Point</em>'.
	 * @see prototype5.Point
	 * @generated
	 */
	EClass getPoint();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.Point#getX <em>X</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>X</em>'.
	 * @see prototype5.Point#getX()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_X();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.Point#getY <em>Y</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Y</em>'.
	 * @see prototype5.Point#getY()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Y();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.Point#getZ <em>Z</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Z</em>'.
	 * @see prototype5.Point#getZ()
	 * @see #getPoint()
	 * @generated
	 */
	EAttribute getPoint_Z();

	/**
	 * Returns the meta object for the '{@link prototype5.Point#getLocation() <em>Get Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Location</em>' operation.
	 * @see prototype5.Point#getLocation()
	 * @generated
	 */
	EOperation getPoint__GetLocation();

	/**
	 * Returns the meta object for the '{@link prototype5.Point#updateLocation(double, double, double) <em>Update Location</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update Location</em>' operation.
	 * @see prototype5.Point#updateLocation(double, double, double)
	 * @generated
	 */
	EOperation getPoint__UpdateLocation__double_double_double();

	/**
	 * Returns the meta object for class '{@link prototype5.AbstractMeshComponent <em>Abstract Mesh Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Mesh Component</em>'.
	 * @see prototype5.AbstractMeshComponent
	 * @generated
	 */
	EClass getAbstractMeshComponent();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.AbstractMeshComponent#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see prototype5.AbstractMeshComponent#getType()
	 * @see #getAbstractMeshComponent()
	 * @generated
	 */
	EAttribute getAbstractMeshComponent_Type();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.AbstractMeshComponent#getUpdateLock <em>Update Lock</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update Lock</em>'.
	 * @see prototype5.AbstractMeshComponent#getUpdateLock()
	 * @see #getAbstractMeshComponent()
	 * @generated
	 */
	EAttribute getAbstractMeshComponent_UpdateLock();

	/**
	 * Returns the meta object for the reference list '{@link prototype5.AbstractMeshComponent#getEntities <em>Entities</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Entities</em>'.
	 * @see prototype5.AbstractMeshComponent#getEntities()
	 * @see #getAbstractMeshComponent()
	 * @generated
	 */
	EReference getAbstractMeshComponent_Entities();

	/**
	 * Returns the meta object for the reference list '{@link prototype5.AbstractMeshComponent#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Properties</em>'.
	 * @see prototype5.AbstractMeshComponent#getProperties()
	 * @see #getAbstractMeshComponent()
	 * @generated
	 */
	EReference getAbstractMeshComponent_Properties();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.AbstractMeshComponent#getAdapter <em>Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adapter</em>'.
	 * @see prototype5.AbstractMeshComponent#getAdapter()
	 * @see #getAbstractMeshComponent()
	 * @generated
	 */
	EAttribute getAbstractMeshComponent_Adapter();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#getEntitiesByCategory(java.lang.String) <em>Get Entities By Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entities By Category</em>' operation.
	 * @see prototype5.AbstractMeshComponent#getEntitiesByCategory(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__GetEntitiesByCategory__String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see prototype5.AbstractMeshComponent#getProperty(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__GetProperty__String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#setProperty(java.lang.String, java.lang.String) <em>Set Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Property</em>' operation.
	 * @see prototype5.AbstractMeshComponent#setProperty(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__SetProperty__String_String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#addEntity(prototype5.VizObject) <em>Add Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Entity</em>' operation.
	 * @see prototype5.AbstractMeshComponent#addEntity(prototype5.VizObject)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__AddEntity__VizObject();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#removeEntity(prototype5.VizObject) <em>Remove Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Entity</em>' operation.
	 * @see prototype5.AbstractMeshComponent#removeEntity(prototype5.VizObject)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__RemoveEntity__VizObject();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#addEntityByCategory(prototype5.VizObject, java.lang.String) <em>Add Entity By Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Entity By Category</em>' operation.
	 * @see prototype5.AbstractMeshComponent#addEntityByCategory(prototype5.VizObject, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__AddEntityByCategory__VizObject_String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#update(org.eclipse.emf.common.notify.Notification) <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see prototype5.AbstractMeshComponent#update(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__Update__Notification();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#register(prototype5.VizObject) <em>Register</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Register</em>' operation.
	 * @see prototype5.AbstractMeshComponent#register(prototype5.VizObject)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__Register__VizObject();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractMeshComponent#unregister(prototype5.VizObject) <em>Unregister</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Unregister</em>' operation.
	 * @see prototype5.AbstractMeshComponent#unregister(prototype5.VizObject)
	 * @generated
	 */
	EOperation getAbstractMeshComponent__Unregister__VizObject();

	/**
	 * Returns the meta object for class '{@link prototype5.AbstractController <em>Abstract Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Controller</em>'.
	 * @see prototype5.AbstractController
	 * @generated
	 */
	EClass getAbstractController();

	/**
	 * Returns the meta object for the attribute '{@link prototype5.AbstractController#getDisposed <em>Disposed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Disposed</em>'.
	 * @see prototype5.AbstractController#getDisposed()
	 * @see #getAbstractController()
	 * @generated
	 */
	EAttribute getAbstractController_Disposed();

	/**
	 * Returns the meta object for the reference '{@link prototype5.AbstractController#getModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Model</em>'.
	 * @see prototype5.AbstractController#getModel()
	 * @see #getAbstractController()
	 * @generated
	 */
	EReference getAbstractController_Model();

	/**
	 * Returns the meta object for the reference '{@link prototype5.AbstractController#getView <em>View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>View</em>'.
	 * @see prototype5.AbstractController#getView()
	 * @see #getAbstractController()
	 * @generated
	 */
	EReference getAbstractController_View();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#addEntity(prototype5.VizObject) <em>Add Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Entity</em>' operation.
	 * @see prototype5.AbstractController#addEntity(prototype5.VizObject)
	 * @generated
	 */
	EOperation getAbstractController__AddEntity__VizObject();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#dispose() <em>Dispose</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dispose</em>' operation.
	 * @see prototype5.AbstractController#dispose()
	 * @generated
	 */
	EOperation getAbstractController__Dispose();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getEntities() <em>Get Entities</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entities</em>' operation.
	 * @see prototype5.AbstractController#getEntities()
	 * @generated
	 */
	EOperation getAbstractController__GetEntities();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getEntitiesByCategory(java.lang.String) <em>Get Entities By Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Entities By Category</em>' operation.
	 * @see prototype5.AbstractController#getEntitiesByCategory(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractController__GetEntitiesByCategory__String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getPreviousTransformation() <em>Get Previous Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Previous Transformation</em>' operation.
	 * @see prototype5.AbstractController#getPreviousTransformation()
	 * @generated
	 */
	EOperation getAbstractController__GetPreviousTransformation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getProperty(java.lang.String) <em>Get Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Property</em>' operation.
	 * @see prototype5.AbstractController#getProperty(java.lang.String)
	 * @generated
	 */
	EOperation getAbstractController__GetProperty__String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getRepresentation() <em>Get Representation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Representation</em>' operation.
	 * @see prototype5.AbstractController#getRepresentation()
	 * @generated
	 */
	EOperation getAbstractController__GetRepresentation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getRotation() <em>Get Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Rotation</em>' operation.
	 * @see prototype5.AbstractController#getRotation()
	 * @generated
	 */
	EOperation getAbstractController__GetRotation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getScale() <em>Get Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Scale</em>' operation.
	 * @see prototype5.AbstractController#getScale()
	 * @generated
	 */
	EOperation getAbstractController__GetScale();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getSize() <em>Get Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Size</em>' operation.
	 * @see prototype5.AbstractController#getSize()
	 * @generated
	 */
	EOperation getAbstractController__GetSize();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getSkew() <em>Get Skew</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Skew</em>' operation.
	 * @see prototype5.AbstractController#getSkew()
	 * @generated
	 */
	EOperation getAbstractController__GetSkew();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getTransformation() <em>Get Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Transformation</em>' operation.
	 * @see prototype5.AbstractController#getTransformation()
	 * @generated
	 */
	EOperation getAbstractController__GetTransformation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#getTranslation() <em>Get Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Translation</em>' operation.
	 * @see prototype5.AbstractController#getTranslation()
	 * @generated
	 */
	EOperation getAbstractController__GetTranslation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#removeEntity(prototype5.VizObject) <em>Remove Entity</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove Entity</em>' operation.
	 * @see prototype5.AbstractController#removeEntity(prototype5.VizObject)
	 * @generated
	 */
	EOperation getAbstractController__RemoveEntity__VizObject();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setProperty(java.lang.String, java.lang.String) <em>Set Property</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Property</em>' operation.
	 * @see prototype5.AbstractController#setProperty(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractController__SetProperty__String_String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setRotation(double, double, double) <em>Set Rotation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Rotation</em>' operation.
	 * @see prototype5.AbstractController#setRotation(double, double, double)
	 * @generated
	 */
	EOperation getAbstractController__SetRotation__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setScale(double, double, double) <em>Set Scale</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Scale</em>' operation.
	 * @see prototype5.AbstractController#setScale(double, double, double)
	 * @generated
	 */
	EOperation getAbstractController__SetScale__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setSize(double) <em>Set Size</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Size</em>' operation.
	 * @see prototype5.AbstractController#setSize(double)
	 * @generated
	 */
	EOperation getAbstractController__SetSize__double();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setSkew(double, double, double) <em>Set Skew</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Skew</em>' operation.
	 * @see prototype5.AbstractController#setSkew(double, double, double)
	 * @generated
	 */
	EOperation getAbstractController__SetSkew__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setTransformation(prototype5.Transformation) <em>Set Transformation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Transformation</em>' operation.
	 * @see prototype5.AbstractController#setTransformation(prototype5.Transformation)
	 * @generated
	 */
	EOperation getAbstractController__SetTransformation__Transformation();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#setTranslation(double, double, double) <em>Set Translation</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Translation</em>' operation.
	 * @see prototype5.AbstractController#setTranslation(double, double, double)
	 * @generated
	 */
	EOperation getAbstractController__SetTranslation__double_double_double();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#addEntityByCategory(prototype5.VizObject, java.lang.String) <em>Add Entity By Category</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Entity By Category</em>' operation.
	 * @see prototype5.AbstractController#addEntityByCategory(prototype5.VizObject, java.lang.String)
	 * @generated
	 */
	EOperation getAbstractController__AddEntityByCategory__VizObject_String();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#modelUpdate(org.eclipse.emf.common.notify.Notification) <em>Model Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Model Update</em>' operation.
	 * @see prototype5.AbstractController#modelUpdate(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	EOperation getAbstractController__ModelUpdate__Notification();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#viewUpdate(org.eclipse.emf.common.notify.Notification) <em>View Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>View Update</em>' operation.
	 * @see prototype5.AbstractController#viewUpdate(org.eclipse.emf.common.notify.Notification)
	 * @generated
	 */
	EOperation getAbstractController__ViewUpdate__Notification();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#refresh() <em>Refresh</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Refresh</em>' operation.
	 * @see prototype5.AbstractController#refresh()
	 * @generated
	 */
	EOperation getAbstractController__Refresh();

	/**
	 * Returns the meta object for the '{@link prototype5.AbstractController#synched() <em>Synched</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Synched</em>' operation.
	 * @see prototype5.AbstractController#synched()
	 * @generated
	 */
	EOperation getAbstractController__Synched();

	/**
	 * Returns the meta object for class '{@link prototype5.JavaFXView <em>Java FX View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java FX View</em>'.
	 * @see prototype5.JavaFXView
	 * @generated
	 */
	EClass getJavaFXView();

	/**
	 * Returns the meta object for class '{@link prototype5.JavaFXMeshComponent <em>Java FX Mesh Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java FX Mesh Component</em>'.
	 * @see prototype5.JavaFXMeshComponent
	 * @generated
	 */
	EClass getJavaFXMeshComponent();

	/**
	 * Returns the meta object for class '{@link prototype5.JavaFXController <em>Java FX Controller</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java FX Controller</em>'.
	 * @see prototype5.JavaFXController
	 * @generated
	 */
	EClass getJavaFXController();

	/**
	 * Returns the meta object for class '{@link prototype5.JavaFXControllerFactory <em>Java FX Controller Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Java FX Controller Factory</em>'.
	 * @see prototype5.JavaFXControllerFactory
	 * @generated
	 */
	EClass getJavaFXControllerFactory();

	/**
	 * Returns the meta object for class '{@link prototype5.EdgeAndVertexFace <em>Edge And Vertex Face</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Edge And Vertex Face</em>'.
	 * @see prototype5.EdgeAndVertexFace
	 * @generated
	 */
	EClass getEdgeAndVertexFace();

	/**
	 * Returns the meta object for enum '{@link prototype5.MeshType <em>Mesh Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Mesh Type</em>'.
	 * @see prototype5.MeshType
	 * @generated
	 */
	EEnum getMeshType();

	/**
	 * Returns the meta object for data type '{@link java.util.concurrent.atomic.AtomicBoolean <em>Atomic Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Atomic Boolean</em>'.
	 * @see java.util.concurrent.atomic.AtomicBoolean
	 * @model instanceClass="java.util.concurrent.atomic.AtomicBoolean"
	 * @generated
	 */
	EDataType getAtomicBoolean();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.common.notify.Notification <em>Notification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Notification</em>'.
	 * @see org.eclipse.emf.common.notify.Notification
	 * @model instanceClass="org.eclipse.emf.common.notify.Notification"
	 * @generated
	 */
	EDataType getNotification();

	/**
	 * Returns the meta object for data type '{@link org.eclipse.emf.ecore.util.EContentAdapter <em>EContent Adapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>EContent Adapter</em>'.
	 * @see org.eclipse.emf.ecore.util.EContentAdapter
	 * @model instanceClass="org.eclipse.emf.ecore.util.EContentAdapter"
	 * @generated
	 */
	EDataType getEContentAdapter();

	/**
	 * Returns the meta object for data type '{@link java.lang.Object <em>Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Object</em>'.
	 * @see java.lang.Object
	 * @model instanceClass="java.lang.Object"
	 * @generated
	 */
	EDataType getObject();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Prototype5Factory getPrototype5Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link prototype5.impl.FaceImpl <em>Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.FaceImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getFace()
		 * @generated
		 */
		EClass FACE = eINSTANCE.getFace();

		/**
		 * The meta object literal for the '{@link prototype5.impl.ShapeImpl <em>Shape</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.ShapeImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getShape()
		 * @generated
		 */
		EClass SHAPE = eINSTANCE.getShape();

		/**
		 * The meta object literal for the '{@link prototype5.impl.ElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.ElementImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getElement()
		 * @generated
		 */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
		 * The meta object literal for the '{@link prototype5.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.VertexImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '{@link prototype5.impl.EdgeImpl <em>Edge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.EdgeImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getEdge()
		 * @generated
		 */
		EClass EDGE = eINSTANCE.getEdge();

		/**
		 * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EDGE__LENGTH = eINSTANCE.getEdge_Length();

		/**
		 * The meta object literal for the '{@link prototype5.impl.VizObjectImpl <em>Viz Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.VizObjectImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getVizObject()
		 * @generated
		 */
		EClass VIZ_OBJECT = eINSTANCE.getVizObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIZ_OBJECT__ID = eINSTANCE.getVizObject_Id();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIZ_OBJECT__DESCRIPTION = eINSTANCE.getVizObject_Description();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VIZ_OBJECT__NAME = eINSTANCE.getVizObject_Name();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIZ_OBJECT___CLONE = eINSTANCE.getVizObject__Clone();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation VIZ_OBJECT___COPY__VIZOBJECT = eINSTANCE.getVizObject__Copy__VizObject();

		/**
		 * The meta object literal for the '{@link prototype5.impl.AbstractViewImpl <em>Abstract View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.AbstractViewImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getAbstractView()
		 * @generated
		 */
		EClass ABSTRACT_VIEW = eINSTANCE.getAbstractView();

		/**
		 * The meta object literal for the '<em><b>Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VIEW__TRANSFORMATION = eINSTANCE.getAbstractView_Transformation();

		/**
		 * The meta object literal for the '<em><b>Previous Transformation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION = eINSTANCE.getAbstractView_PreviousTransformation();

		/**
		 * The meta object literal for the '<em><b>Adapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_VIEW__ADAPTER = eINSTANCE.getAbstractView_Adapter();

		/**
		 * The meta object literal for the '<em><b>Synched</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_VIEW___SYNCHED = eINSTANCE.getAbstractView__Synched();

		/**
		 * The meta object literal for the '<em><b>Get Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_VIEW___GET_REPRESENTATION = eINSTANCE.getAbstractView__GetRepresentation();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_VIEW___UPDATE__NOTIFICATION = eINSTANCE.getAbstractView__Update__Notification();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_VIEW___REFRESH__ABSTRACTMESHCOMPONENT = eINSTANCE.getAbstractView__Refresh__AbstractMeshComponent();

		/**
		 * The meta object literal for the '{@link prototype5.IControllerFactory <em>IController Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.IControllerFactory
		 * @see prototype5.impl.Prototype5PackageImpl#getIControllerFactory()
		 * @generated
		 */
		EClass ICONTROLLER_FACTORY = eINSTANCE.getIControllerFactory();

		/**
		 * The meta object literal for the '<em><b>Create Controller</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ICONTROLLER_FACTORY___CREATE_CONTROLLER__ABSTRACTMESHCOMPONENT = eINSTANCE.getIControllerFactory__CreateController__AbstractMeshComponent();

		/**
		 * The meta object literal for the '{@link prototype5.impl.EStringToEStringMapImpl <em>EString To EString Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.EStringToEStringMapImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getEStringToEStringMap()
		 * @generated
		 */
		EClass ESTRING_TO_ESTRING_MAP = eINSTANCE.getEStringToEStringMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_ESTRING_MAP__KEY = eINSTANCE.getEStringToEStringMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_ESTRING_MAP__VALUE = eINSTANCE.getEStringToEStringMap_Value();

		/**
		 * The meta object literal for the '{@link prototype5.impl.EStringToVizObjectMapImpl <em>EString To Viz Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.EStringToVizObjectMapImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getEStringToVizObjectMap()
		 * @generated
		 */
		EClass ESTRING_TO_VIZ_OBJECT_MAP = eINSTANCE.getEStringToVizObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_VIZ_OBJECT_MAP__KEY = eINSTANCE.getEStringToVizObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ESTRING_TO_VIZ_OBJECT_MAP__VALUE = eINSTANCE.getEStringToVizObjectMap_Value();

		/**
		 * The meta object literal for the '{@link prototype5.impl.TransformationImpl <em>Transformation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.TransformationImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getTransformation()
		 * @generated
		 */
		EClass TRANSFORMATION = eINSTANCE.getTransformation();

		/**
		 * The meta object literal for the '<em><b>Rotation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__ROTATION = eINSTANCE.getTransformation_Rotation();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__SCALE = eINSTANCE.getTransformation_Scale();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__SIZE = eINSTANCE.getTransformation_Size();

		/**
		 * The meta object literal for the '<em><b>Skew</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__SKEW = eINSTANCE.getTransformation_Skew();

		/**
		 * The meta object literal for the '<em><b>Translation</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSFORMATION__TRANSLATION = eINSTANCE.getTransformation_Translation();

		/**
		 * The meta object literal for the '<em><b>Set Rotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTransformation__SetRotation__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Scale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___SET_SCALE__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTransformation__SetScale__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Skew</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___SET_SKEW__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTransformation__SetSkew__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getTransformation__SetTranslation__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Clone</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___CLONE = eINSTANCE.getTransformation__Clone();

		/**
		 * The meta object literal for the '<em><b>Copy</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___COPY__OBJECT = eINSTANCE.getTransformation__Copy__Object();

		/**
		 * The meta object literal for the '<em><b>Equals</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TRANSFORMATION___EQUALS__OBJECT = eINSTANCE.getTransformation__Equals__Object();

		/**
		 * The meta object literal for the '{@link prototype5.impl.PointImpl <em>Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.PointImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getPoint()
		 * @generated
		 */
		EClass POINT = eINSTANCE.getPoint();

		/**
		 * The meta object literal for the '<em><b>X</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__X = eINSTANCE.getPoint_X();

		/**
		 * The meta object literal for the '<em><b>Y</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Y = eINSTANCE.getPoint_Y();

		/**
		 * The meta object literal for the '<em><b>Z</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute POINT__Z = eINSTANCE.getPoint_Z();

		/**
		 * The meta object literal for the '<em><b>Get Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT___GET_LOCATION = eINSTANCE.getPoint__GetLocation();

		/**
		 * The meta object literal for the '<em><b>Update Location</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation POINT___UPDATE_LOCATION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getPoint__UpdateLocation__double_double_double();

		/**
		 * The meta object literal for the '{@link prototype5.impl.AbstractMeshComponentImpl <em>Abstract Mesh Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.AbstractMeshComponentImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getAbstractMeshComponent()
		 * @generated
		 */
		EClass ABSTRACT_MESH_COMPONENT = eINSTANCE.getAbstractMeshComponent();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MESH_COMPONENT__TYPE = eINSTANCE.getAbstractMeshComponent_Type();

		/**
		 * The meta object literal for the '<em><b>Update Lock</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MESH_COMPONENT__UPDATE_LOCK = eINSTANCE.getAbstractMeshComponent_UpdateLock();

		/**
		 * The meta object literal for the '<em><b>Entities</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MESH_COMPONENT__ENTITIES = eINSTANCE.getAbstractMeshComponent_Entities();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_MESH_COMPONENT__PROPERTIES = eINSTANCE.getAbstractMeshComponent_Properties();

		/**
		 * The meta object literal for the '<em><b>Adapter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_MESH_COMPONENT__ADAPTER = eINSTANCE.getAbstractMeshComponent_Adapter();

		/**
		 * The meta object literal for the '<em><b>Get Entities By Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING = eINSTANCE.getAbstractMeshComponent__GetEntitiesByCategory__String();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING = eINSTANCE.getAbstractMeshComponent__GetProperty__String();

		/**
		 * The meta object literal for the '<em><b>Set Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING = eINSTANCE.getAbstractMeshComponent__SetProperty__String_String();

		/**
		 * The meta object literal for the '<em><b>Add Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT = eINSTANCE.getAbstractMeshComponent__AddEntity__VizObject();

		/**
		 * The meta object literal for the '<em><b>Remove Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT = eINSTANCE.getAbstractMeshComponent__RemoveEntity__VizObject();

		/**
		 * The meta object literal for the '<em><b>Add Entity By Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = eINSTANCE.getAbstractMeshComponent__AddEntityByCategory__VizObject_String();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION = eINSTANCE.getAbstractMeshComponent__Update__Notification();

		/**
		 * The meta object literal for the '<em><b>Register</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT = eINSTANCE.getAbstractMeshComponent__Register__VizObject();

		/**
		 * The meta object literal for the '<em><b>Unregister</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT = eINSTANCE.getAbstractMeshComponent__Unregister__VizObject();

		/**
		 * The meta object literal for the '{@link prototype5.impl.AbstractControllerImpl <em>Abstract Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.AbstractControllerImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getAbstractController()
		 * @generated
		 */
		EClass ABSTRACT_CONTROLLER = eINSTANCE.getAbstractController();

		/**
		 * The meta object literal for the '<em><b>Disposed</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ABSTRACT_CONTROLLER__DISPOSED = eINSTANCE.getAbstractController_Disposed();

		/**
		 * The meta object literal for the '<em><b>Model</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTROLLER__MODEL = eINSTANCE.getAbstractController_Model();

		/**
		 * The meta object literal for the '<em><b>View</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_CONTROLLER__VIEW = eINSTANCE.getAbstractController_View();

		/**
		 * The meta object literal for the '<em><b>Add Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___ADD_ENTITY__VIZOBJECT = eINSTANCE.getAbstractController__AddEntity__VizObject();

		/**
		 * The meta object literal for the '<em><b>Dispose</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___DISPOSE = eINSTANCE.getAbstractController__Dispose();

		/**
		 * The meta object literal for the '<em><b>Get Entities</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_ENTITIES = eINSTANCE.getAbstractController__GetEntities();

		/**
		 * The meta object literal for the '<em><b>Get Entities By Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_ENTITIES_BY_CATEGORY__STRING = eINSTANCE.getAbstractController__GetEntitiesByCategory__String();

		/**
		 * The meta object literal for the '<em><b>Get Previous Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_PREVIOUS_TRANSFORMATION = eINSTANCE.getAbstractController__GetPreviousTransformation();

		/**
		 * The meta object literal for the '<em><b>Get Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_PROPERTY__STRING = eINSTANCE.getAbstractController__GetProperty__String();

		/**
		 * The meta object literal for the '<em><b>Get Representation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_REPRESENTATION = eINSTANCE.getAbstractController__GetRepresentation();

		/**
		 * The meta object literal for the '<em><b>Get Rotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_ROTATION = eINSTANCE.getAbstractController__GetRotation();

		/**
		 * The meta object literal for the '<em><b>Get Scale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_SCALE = eINSTANCE.getAbstractController__GetScale();

		/**
		 * The meta object literal for the '<em><b>Get Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_SIZE = eINSTANCE.getAbstractController__GetSize();

		/**
		 * The meta object literal for the '<em><b>Get Skew</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_SKEW = eINSTANCE.getAbstractController__GetSkew();

		/**
		 * The meta object literal for the '<em><b>Get Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_TRANSFORMATION = eINSTANCE.getAbstractController__GetTransformation();

		/**
		 * The meta object literal for the '<em><b>Get Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___GET_TRANSLATION = eINSTANCE.getAbstractController__GetTranslation();

		/**
		 * The meta object literal for the '<em><b>Remove Entity</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___REMOVE_ENTITY__VIZOBJECT = eINSTANCE.getAbstractController__RemoveEntity__VizObject();

		/**
		 * The meta object literal for the '<em><b>Set Property</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_PROPERTY__STRING_STRING = eINSTANCE.getAbstractController__SetProperty__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Rotation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getAbstractController__SetRotation__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Scale</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_SCALE__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getAbstractController__SetScale__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Size</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_SIZE__DOUBLE = eINSTANCE.getAbstractController__SetSize__double();

		/**
		 * The meta object literal for the '<em><b>Set Skew</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_SKEW__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getAbstractController__SetSkew__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Set Transformation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_TRANSFORMATION__TRANSFORMATION = eINSTANCE.getAbstractController__SetTransformation__Transformation();

		/**
		 * The meta object literal for the '<em><b>Set Translation</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE = eINSTANCE.getAbstractController__SetTranslation__double_double_double();

		/**
		 * The meta object literal for the '<em><b>Add Entity By Category</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING = eINSTANCE.getAbstractController__AddEntityByCategory__VizObject_String();

		/**
		 * The meta object literal for the '<em><b>Model Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___MODEL_UPDATE__NOTIFICATION = eINSTANCE.getAbstractController__ModelUpdate__Notification();

		/**
		 * The meta object literal for the '<em><b>View Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___VIEW_UPDATE__NOTIFICATION = eINSTANCE.getAbstractController__ViewUpdate__Notification();

		/**
		 * The meta object literal for the '<em><b>Refresh</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___REFRESH = eINSTANCE.getAbstractController__Refresh();

		/**
		 * The meta object literal for the '<em><b>Synched</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ABSTRACT_CONTROLLER___SYNCHED = eINSTANCE.getAbstractController__Synched();

		/**
		 * The meta object literal for the '{@link prototype5.impl.JavaFXViewImpl <em>Java FX View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.JavaFXViewImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXView()
		 * @generated
		 */
		EClass JAVA_FX_VIEW = eINSTANCE.getJavaFXView();

		/**
		 * The meta object literal for the '{@link prototype5.impl.JavaFXMeshComponentImpl <em>Java FX Mesh Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.JavaFXMeshComponentImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXMeshComponent()
		 * @generated
		 */
		EClass JAVA_FX_MESH_COMPONENT = eINSTANCE.getJavaFXMeshComponent();

		/**
		 * The meta object literal for the '{@link prototype5.impl.JavaFXControllerImpl <em>Java FX Controller</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.JavaFXControllerImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXController()
		 * @generated
		 */
		EClass JAVA_FX_CONTROLLER = eINSTANCE.getJavaFXController();

		/**
		 * The meta object literal for the '{@link prototype5.impl.JavaFXControllerFactoryImpl <em>Java FX Controller Factory</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.JavaFXControllerFactoryImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getJavaFXControllerFactory()
		 * @generated
		 */
		EClass JAVA_FX_CONTROLLER_FACTORY = eINSTANCE.getJavaFXControllerFactory();

		/**
		 * The meta object literal for the '{@link prototype5.impl.EdgeAndVertexFaceImpl <em>Edge And Vertex Face</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.impl.EdgeAndVertexFaceImpl
		 * @see prototype5.impl.Prototype5PackageImpl#getEdgeAndVertexFace()
		 * @generated
		 */
		EClass EDGE_AND_VERTEX_FACE = eINSTANCE.getEdgeAndVertexFace();

		/**
		 * The meta object literal for the '{@link prototype5.MeshType <em>Mesh Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see prototype5.MeshType
		 * @see prototype5.impl.Prototype5PackageImpl#getMeshType()
		 * @generated
		 */
		EEnum MESH_TYPE = eINSTANCE.getMeshType();

		/**
		 * The meta object literal for the '<em>Atomic Boolean</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.concurrent.atomic.AtomicBoolean
		 * @see prototype5.impl.Prototype5PackageImpl#getAtomicBoolean()
		 * @generated
		 */
		EDataType ATOMIC_BOOLEAN = eINSTANCE.getAtomicBoolean();

		/**
		 * The meta object literal for the '<em>Notification</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.common.notify.Notification
		 * @see prototype5.impl.Prototype5PackageImpl#getNotification()
		 * @generated
		 */
		EDataType NOTIFICATION = eINSTANCE.getNotification();

		/**
		 * The meta object literal for the '<em>EContent Adapter</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.ecore.util.EContentAdapter
		 * @see prototype5.impl.Prototype5PackageImpl#getEContentAdapter()
		 * @generated
		 */
		EDataType ECONTENT_ADAPTER = eINSTANCE.getEContentAdapter();

		/**
		 * The meta object literal for the '<em>Object</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Object
		 * @see prototype5.impl.Prototype5PackageImpl#getObject()
		 * @generated
		 */
		EDataType OBJECT = eINSTANCE.getObject();

	}

} //Prototype5Package
