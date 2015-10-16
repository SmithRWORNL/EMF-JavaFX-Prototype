/**
 */
package prototype5.impl;

import java.util.Map;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EContentAdapter;
import prototype5.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Prototype5FactoryImpl extends EFactoryImpl implements Prototype5Factory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Prototype5Factory init() {
		try {
			Prototype5Factory thePrototype5Factory = (Prototype5Factory)EPackage.Registry.INSTANCE.getEFactory(Prototype5Package.eNS_URI);
			if (thePrototype5Factory != null) {
				return thePrototype5Factory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Prototype5FactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prototype5FactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Prototype5Package.FACE: return createFace();
			case Prototype5Package.SHAPE: return createShape();
			case Prototype5Package.ELEMENT: return createElement();
			case Prototype5Package.VERTEX: return createVertex();
			case Prototype5Package.EDGE: return createEdge();
			case Prototype5Package.VIZ_OBJECT: return createVizObject();
			case Prototype5Package.ABSTRACT_VIEW: return createAbstractView();
			case Prototype5Package.ESTRING_TO_ESTRING_MAP: return (EObject)createEStringToEStringMap();
			case Prototype5Package.ESTRING_TO_VIZ_OBJECT_MAP: return (EObject)createEStringToVizObjectMap();
			case Prototype5Package.TRANSFORMATION: return createTransformation();
			case Prototype5Package.POINT: return createPoint();
			case Prototype5Package.ABSTRACT_MESH_COMPONENT: return createAbstractMeshComponent();
			case Prototype5Package.ABSTRACT_CONTROLLER: return createAbstractController();
			case Prototype5Package.JAVA_FX_VIEW: return createJavaFXView();
			case Prototype5Package.JAVA_FX_MESH_COMPONENT: return createJavaFXMeshComponent();
			case Prototype5Package.JAVA_FX_CONTROLLER: return createJavaFXController();
			case Prototype5Package.JAVA_FX_CONTROLLER_FACTORY: return createJavaFXControllerFactory();
			case Prototype5Package.EDGE_AND_VERTEX_FACE: return createEdgeAndVertexFace();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case Prototype5Package.MESH_TYPE:
				return createMeshTypeFromString(eDataType, initialValue);
			case Prototype5Package.ATOMIC_BOOLEAN:
				return createAtomicBooleanFromString(eDataType, initialValue);
			case Prototype5Package.NOTIFICATION:
				return createNotificationFromString(eDataType, initialValue);
			case Prototype5Package.ECONTENT_ADAPTER:
				return createEContentAdapterFromString(eDataType, initialValue);
			case Prototype5Package.OBJECT:
				return createObjectFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case Prototype5Package.MESH_TYPE:
				return convertMeshTypeToString(eDataType, instanceValue);
			case Prototype5Package.ATOMIC_BOOLEAN:
				return convertAtomicBooleanToString(eDataType, instanceValue);
			case Prototype5Package.NOTIFICATION:
				return convertNotificationToString(eDataType, instanceValue);
			case Prototype5Package.ECONTENT_ADAPTER:
				return convertEContentAdapterToString(eDataType, instanceValue);
			case Prototype5Package.OBJECT:
				return convertObjectToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Face createFace() {
		FaceImpl face = new FaceImpl();
		return face;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Shape createShape() {
		ShapeImpl shape = new ShapeImpl();
		return shape;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element createElement() {
		ElementImpl element = new ElementImpl();
		return element;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex createVertex() {
		VertexImpl vertex = new VertexImpl();
		return vertex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Edge createEdge() {
		EdgeImpl edge = new EdgeImpl();
		return edge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VizObject createVizObject() {
		VizObjectImpl vizObject = new VizObjectImpl();
		return vizObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractView createAbstractView() {
		AbstractViewImpl abstractView = new AbstractViewImpl();
		return abstractView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, String> createEStringToEStringMap() {
		EStringToEStringMapImpl eStringToEStringMap = new EStringToEStringMapImpl();
		return eStringToEStringMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, EList<VizObject>> createEStringToVizObjectMap() {
		EStringToVizObjectMapImpl eStringToVizObjectMap = new EStringToVizObjectMapImpl();
		return eStringToVizObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transformation createTransformation() {
		TransformationImpl transformation = new TransformationImpl();
		return transformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Point createPoint() {
		PointImpl point = new PointImpl();
		return point;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractMeshComponent createAbstractMeshComponent() {
		AbstractMeshComponentImpl abstractMeshComponent = new AbstractMeshComponentImpl();
		return abstractMeshComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractController createAbstractController() {
		AbstractControllerImpl abstractController = new AbstractControllerImpl();
		return abstractController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFXView createJavaFXView() {
		JavaFXViewImpl javaFXView = new JavaFXViewImpl();
		return javaFXView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFXMeshComponent createJavaFXMeshComponent() {
		JavaFXMeshComponentImpl javaFXMeshComponent = new JavaFXMeshComponentImpl();
		return javaFXMeshComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFXController createJavaFXController() {
		JavaFXControllerImpl javaFXController = new JavaFXControllerImpl();
		return javaFXController;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaFXControllerFactory createJavaFXControllerFactory() {
		JavaFXControllerFactoryImpl javaFXControllerFactory = new JavaFXControllerFactoryImpl();
		return javaFXControllerFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EdgeAndVertexFace createEdgeAndVertexFace() {
		EdgeAndVertexFaceImpl edgeAndVertexFace = new EdgeAndVertexFaceImpl();
		return edgeAndVertexFace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeshType createMeshTypeFromString(EDataType eDataType, String initialValue) {
		MeshType result = MeshType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeshTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicBoolean createAtomicBooleanFromString(EDataType eDataType, String initialValue) {
		return (AtomicBoolean)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAtomicBooleanToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Notification createNotificationFromString(EDataType eDataType, String initialValue) {
		return (Notification)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNotificationToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EContentAdapter createEContentAdapterFromString(EDataType eDataType, String initialValue) {
		return (EContentAdapter)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEContentAdapterToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object createObjectFromString(EDataType eDataType, String initialValue) {
		return super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertObjectToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Prototype5Package getPrototype5Package() {
		return (Prototype5Package)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Prototype5Package getPackage() {
		return Prototype5Package.eINSTANCE;
	}

} //Prototype5FactoryImpl
