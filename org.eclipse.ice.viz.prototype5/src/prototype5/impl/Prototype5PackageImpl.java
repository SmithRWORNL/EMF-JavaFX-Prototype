/**
 */
package prototype5.impl;

import java.util.Map;

import java.util.concurrent.atomic.AtomicBoolean;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.util.EContentAdapter;
import prototype5.AbstractController;
import prototype5.AbstractMeshComponent;
import prototype5.AbstractView;
import prototype5.Edge;
import prototype5.EdgeAndVertexFace;
import prototype5.Element;
import prototype5.Face;
import prototype5.IControllerFactory;
import prototype5.JavaFXController;
import prototype5.JavaFXControllerFactory;
import prototype5.JavaFXMeshComponent;
import prototype5.JavaFXView;
import prototype5.MeshType;
import prototype5.Point;
import prototype5.Prototype5Factory;
import prototype5.Prototype5Package;
import prototype5.Shape;
import prototype5.Transformation;
import prototype5.Vertex;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model <b>Package</b>. <!--
 * end-user-doc -->
 * 
 * @generated
 */
public class Prototype5PackageImpl extends EPackageImpl
		implements Prototype5Package {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass faceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass shapeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass elementEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vertexEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass edgeEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass vizObjectEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass iControllerFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eStringToEStringMapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass eStringToVizObjectMapEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass transformationEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass pointEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractMeshComponentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass abstractControllerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaFXViewEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaFXMeshComponentEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaFXControllerEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass javaFXControllerFactoryEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EClass edgeAndVertexFaceEClass = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EEnum meshTypeEEnum = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType atomicBooleanEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType notificationEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType eContentAdapterEDataType = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private EDataType objectEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the
	 * package package URI value.
	 * <p>
	 * Note: the correct way to create the package is via the static factory
	 * method {@link #init init()}, which also performs initialization of the
	 * package, or returns the registered package, if one already exists. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see prototype5.Prototype5Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Prototype5PackageImpl() {
		super(eNS_URI, Prototype5Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model,
	 * and for any others upon which it depends.
	 * 
	 * <p>
	 * This method is used to initialize {@link Prototype5Package#eINSTANCE}
	 * when that field is accessed. Clients should not invoke it directly.
	 * Instead, they should simply access that field to obtain the package. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Prototype5Package init() {
		if (isInited)
			return (Prototype5Package) EPackage.Registry.INSTANCE
					.getEPackage(Prototype5Package.eNS_URI);

		// Obtain or create and register package
		Prototype5PackageImpl thePrototype5Package = (Prototype5PackageImpl) (EPackage.Registry.INSTANCE
				.get(eNS_URI) instanceof Prototype5PackageImpl
						? EPackage.Registry.INSTANCE.get(eNS_URI)
						: new Prototype5PackageImpl());

		isInited = true;

		// Create package meta-data objects
		thePrototype5Package.createPackageContents();

		// Initialize created meta-data
		thePrototype5Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thePrototype5Package.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Prototype5Package.eNS_URI,
				thePrototype5Package);
		return thePrototype5Package;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getFace() {
		return faceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getShape() {
		return shapeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getElement() {
		return elementEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVertex() {
		return vertexEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEdge() {
		return edgeEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEdge_Length() {
		return (EAttribute) edgeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getVizObject() {
		return vizObjectEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVizObject_Id() {
		return (EAttribute) vizObjectEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVizObject_Description() {
		return (EAttribute) vizObjectEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getVizObject_Name() {
		return (EAttribute) vizObjectEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getVizObject__Clone() {
		return vizObjectEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getVizObject__Copy__VizObject() {
		return vizObjectEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractView() {
		return abstractViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractView_Transformation() {
		return (EReference) abstractViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractView_PreviousTransformation() {
		return (EReference) abstractViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAbstractView_Adapter() {
		return (EAttribute) abstractViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractView__Synched() {
		return abstractViewEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractView__GetRepresentation() {
		return abstractViewEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractView__Update__Notification() {
		return abstractViewEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractView__Refresh__AbstractMeshComponent() {
		return abstractViewEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getIControllerFactory() {
		return iControllerFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getIControllerFactory__CreateController__AbstractMeshComponent() {
		return iControllerFactoryEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEStringToEStringMap() {
		return eStringToEStringMapEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEStringToEStringMap_Key() {
		return (EAttribute) eStringToEStringMapEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEStringToEStringMap_Value() {
		return (EAttribute) eStringToEStringMapEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEStringToVizObjectMap() {
		return eStringToVizObjectMapEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getEStringToVizObjectMap_Key() {
		return (EAttribute) eStringToVizObjectMapEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getEStringToVizObjectMap_Value() {
		return (EReference) eStringToVizObjectMapEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getTransformation() {
		return transformationEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_Rotation() {
		return (EAttribute) transformationEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_Scale() {
		return (EAttribute) transformationEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_Size() {
		return (EAttribute) transformationEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_Skew() {
		return (EAttribute) transformationEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getTransformation_Translation() {
		return (EAttribute) transformationEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__SetRotation__double_double_double() {
		return transformationEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__SetScale__double_double_double() {
		return transformationEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__SetSkew__double_double_double() {
		return transformationEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__SetTranslation__double_double_double() {
		return transformationEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__Clone() {
		return transformationEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__Copy__Object() {
		return transformationEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getTransformation__Equals__Object() {
		return transformationEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getPoint() {
		return pointEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPoint_X() {
		return (EAttribute) pointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPoint_Y() {
		return (EAttribute) pointEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getPoint_Z() {
		return (EAttribute) pointEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getPoint__GetLocation() {
		return pointEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getPoint__UpdateLocation__double_double_double() {
		return pointEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractMeshComponent() {
		return abstractMeshComponentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAbstractMeshComponent_Type() {
		return (EAttribute) abstractMeshComponentEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAbstractMeshComponent_UpdateLock() {
		return (EAttribute) abstractMeshComponentEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractMeshComponent_Entities() {
		return (EReference) abstractMeshComponentEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractMeshComponent_Properties() {
		return (EReference) abstractMeshComponentEClass.getEStructuralFeatures()
				.get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAbstractMeshComponent_Adapter() {
		return (EAttribute) abstractMeshComponentEClass.getEStructuralFeatures()
				.get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__GetEntitiesByCategory__String() {
		return abstractMeshComponentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__GetProperty__String() {
		return abstractMeshComponentEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__SetProperty__String_String() {
		return abstractMeshComponentEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__AddEntity__VizObject() {
		return abstractMeshComponentEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__RemoveEntity__VizObject() {
		return abstractMeshComponentEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__AddEntityByCategory__VizObject_String() {
		return abstractMeshComponentEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__Update__Notification() {
		return abstractMeshComponentEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__Register__VizObject() {
		return abstractMeshComponentEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractMeshComponent__Unregister__VizObject() {
		return abstractMeshComponentEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getAbstractController() {
		return abstractControllerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EAttribute getAbstractController_Disposed() {
		return (EAttribute) abstractControllerEClass.getEStructuralFeatures()
				.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractController_Model() {
		return (EReference) abstractControllerEClass.getEStructuralFeatures()
				.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EReference getAbstractController_View() {
		return (EReference) abstractControllerEClass.getEStructuralFeatures()
				.get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__AddEntity__VizObject() {
		return abstractControllerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__Dispose() {
		return abstractControllerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetEntities() {
		return abstractControllerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetEntitiesByCategory__String() {
		return abstractControllerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetPreviousTransformation() {
		return abstractControllerEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetProperty__String() {
		return abstractControllerEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetRepresentation() {
		return abstractControllerEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetRotation() {
		return abstractControllerEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetScale() {
		return abstractControllerEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetSize() {
		return abstractControllerEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetSkew() {
		return abstractControllerEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetTransformation() {
		return abstractControllerEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__GetTranslation() {
		return abstractControllerEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__RemoveEntity__VizObject() {
		return abstractControllerEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetProperty__String_String() {
		return abstractControllerEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetRotation__double_double_double() {
		return abstractControllerEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetScale__double_double_double() {
		return abstractControllerEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetSize__double() {
		return abstractControllerEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetSkew__double_double_double() {
		return abstractControllerEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetTransformation__Transformation() {
		return abstractControllerEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__SetTranslation__double_double_double() {
		return abstractControllerEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__AddEntityByCategory__VizObject_String() {
		return abstractControllerEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__ModelUpdate__Notification() {
		return abstractControllerEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__ViewUpdate__Notification() {
		return abstractControllerEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__Refresh() {
		return abstractControllerEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EOperation getAbstractController__Synched() {
		return abstractControllerEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJavaFXView() {
		return javaFXViewEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJavaFXMeshComponent() {
		return javaFXMeshComponentEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJavaFXController() {
		return javaFXControllerEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getJavaFXControllerFactory() {
		return javaFXControllerFactoryEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EClass getEdgeAndVertexFace() {
		return edgeAndVertexFaceEClass;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EEnum getMeshType() {
		return meshTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getAtomicBoolean() {
		return atomicBooleanEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getNotification() {
		return notificationEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getEContentAdapter() {
		return eContentAdapterEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EDataType getObject() {
		return objectEDataType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Prototype5Factory getPrototype5Factory() {
		return (Prototype5Factory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package. This method is guarded to
	 * have no affect on any invocation but its first. <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		faceEClass = createEClass(FACE);

		shapeEClass = createEClass(SHAPE);

		elementEClass = createEClass(ELEMENT);

		vertexEClass = createEClass(VERTEX);

		edgeEClass = createEClass(EDGE);
		createEAttribute(edgeEClass, EDGE__LENGTH);

		vizObjectEClass = createEClass(VIZ_OBJECT);
		createEAttribute(vizObjectEClass, VIZ_OBJECT__ID);
		createEAttribute(vizObjectEClass, VIZ_OBJECT__DESCRIPTION);
		createEAttribute(vizObjectEClass, VIZ_OBJECT__NAME);
		createEOperation(vizObjectEClass, VIZ_OBJECT___CLONE);
		createEOperation(vizObjectEClass, VIZ_OBJECT___COPY__VIZOBJECT);

		abstractViewEClass = createEClass(ABSTRACT_VIEW);
		createEReference(abstractViewEClass, ABSTRACT_VIEW__TRANSFORMATION);
		createEReference(abstractViewEClass,
				ABSTRACT_VIEW__PREVIOUS_TRANSFORMATION);
		createEAttribute(abstractViewEClass, ABSTRACT_VIEW__ADAPTER);
		createEOperation(abstractViewEClass, ABSTRACT_VIEW___SYNCHED);
		createEOperation(abstractViewEClass,
				ABSTRACT_VIEW___GET_REPRESENTATION);
		createEOperation(abstractViewEClass,
				ABSTRACT_VIEW___UPDATE__NOTIFICATION);
		createEOperation(abstractViewEClass,
				ABSTRACT_VIEW___REFRESH__ABSTRACTMESHCOMPONENT);

		iControllerFactoryEClass = createEClass(ICONTROLLER_FACTORY);
		createEOperation(iControllerFactoryEClass,
				ICONTROLLER_FACTORY___CREATE_CONTROLLER__ABSTRACTMESHCOMPONENT);

		eStringToEStringMapEClass = createEClass(ESTRING_TO_ESTRING_MAP);
		createEAttribute(eStringToEStringMapEClass,
				ESTRING_TO_ESTRING_MAP__KEY);
		createEAttribute(eStringToEStringMapEClass,
				ESTRING_TO_ESTRING_MAP__VALUE);

		eStringToVizObjectMapEClass = createEClass(ESTRING_TO_VIZ_OBJECT_MAP);
		createEAttribute(eStringToVizObjectMapEClass,
				ESTRING_TO_VIZ_OBJECT_MAP__KEY);
		createEReference(eStringToVizObjectMapEClass,
				ESTRING_TO_VIZ_OBJECT_MAP__VALUE);

		transformationEClass = createEClass(TRANSFORMATION);
		createEAttribute(transformationEClass, TRANSFORMATION__ROTATION);
		createEAttribute(transformationEClass, TRANSFORMATION__SCALE);
		createEAttribute(transformationEClass, TRANSFORMATION__SIZE);
		createEAttribute(transformationEClass, TRANSFORMATION__SKEW);
		createEAttribute(transformationEClass, TRANSFORMATION__TRANSLATION);
		createEOperation(transformationEClass,
				TRANSFORMATION___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(transformationEClass,
				TRANSFORMATION___SET_SCALE__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(transformationEClass,
				TRANSFORMATION___SET_SKEW__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(transformationEClass,
				TRANSFORMATION___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(transformationEClass, TRANSFORMATION___CLONE);
		createEOperation(transformationEClass, TRANSFORMATION___COPY__OBJECT);
		createEOperation(transformationEClass, TRANSFORMATION___EQUALS__OBJECT);

		pointEClass = createEClass(POINT);
		createEAttribute(pointEClass, POINT__X);
		createEAttribute(pointEClass, POINT__Y);
		createEAttribute(pointEClass, POINT__Z);
		createEOperation(pointEClass, POINT___GET_LOCATION);
		createEOperation(pointEClass,
				POINT___UPDATE_LOCATION__DOUBLE_DOUBLE_DOUBLE);

		abstractMeshComponentEClass = createEClass(ABSTRACT_MESH_COMPONENT);
		createEAttribute(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT__TYPE);
		createEAttribute(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT__UPDATE_LOCK);
		createEReference(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT__ENTITIES);
		createEReference(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT__PROPERTIES);
		createEAttribute(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT__ADAPTER);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___GET_ENTITIES_BY_CATEGORY__STRING);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___GET_PROPERTY__STRING);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___SET_PROPERTY__STRING_STRING);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___ADD_ENTITY__VIZOBJECT);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___REMOVE_ENTITY__VIZOBJECT);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___UPDATE__NOTIFICATION);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___REGISTER__VIZOBJECT);
		createEOperation(abstractMeshComponentEClass,
				ABSTRACT_MESH_COMPONENT___UNREGISTER__VIZOBJECT);

		abstractControllerEClass = createEClass(ABSTRACT_CONTROLLER);
		createEAttribute(abstractControllerEClass,
				ABSTRACT_CONTROLLER__DISPOSED);
		createEReference(abstractControllerEClass, ABSTRACT_CONTROLLER__MODEL);
		createEReference(abstractControllerEClass, ABSTRACT_CONTROLLER__VIEW);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___ADD_ENTITY__VIZOBJECT);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___DISPOSE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_ENTITIES);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_ENTITIES_BY_CATEGORY__STRING);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_PREVIOUS_TRANSFORMATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_PROPERTY__STRING);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_REPRESENTATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_ROTATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_SCALE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_SIZE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_SKEW);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_TRANSFORMATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___GET_TRANSLATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___REMOVE_ENTITY__VIZOBJECT);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_PROPERTY__STRING_STRING);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_ROTATION__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_SCALE__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_SIZE__DOUBLE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_SKEW__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_TRANSFORMATION__TRANSFORMATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SET_TRANSLATION__DOUBLE_DOUBLE_DOUBLE);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___ADD_ENTITY_BY_CATEGORY__VIZOBJECT_STRING);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___MODEL_UPDATE__NOTIFICATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___VIEW_UPDATE__NOTIFICATION);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___REFRESH);
		createEOperation(abstractControllerEClass,
				ABSTRACT_CONTROLLER___SYNCHED);

		javaFXViewEClass = createEClass(JAVA_FX_VIEW);

		javaFXMeshComponentEClass = createEClass(JAVA_FX_MESH_COMPONENT);

		javaFXControllerEClass = createEClass(JAVA_FX_CONTROLLER);

		javaFXControllerFactoryEClass = createEClass(
				JAVA_FX_CONTROLLER_FACTORY);

		edgeAndVertexFaceEClass = createEClass(EDGE_AND_VERTEX_FACE);

		// Create enums
		meshTypeEEnum = createEEnum(MESH_TYPE);

		// Create data types
		atomicBooleanEDataType = createEDataType(ATOMIC_BOOLEAN);
		notificationEDataType = createEDataType(NOTIFICATION);
		eContentAdapterEDataType = createEDataType(ECONTENT_ADAPTER);
		objectEDataType = createEDataType(OBJECT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model. This
	 * method is guarded to have no affect on any invocation but its first. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		faceEClass.getESuperTypes().add(this.getAbstractMeshComponent());
		shapeEClass.getESuperTypes().add(this.getAbstractMeshComponent());
		elementEClass.getESuperTypes().add(this.getAbstractMeshComponent());
		vertexEClass.getESuperTypes().add(this.getPoint());
		edgeEClass.getESuperTypes().add(this.getAbstractMeshComponent());
		pointEClass.getESuperTypes().add(this.getAbstractMeshComponent());
		abstractMeshComponentEClass.getESuperTypes().add(this.getVizObject());
		javaFXViewEClass.getESuperTypes().add(this.getAbstractView());
		javaFXMeshComponentEClass.getESuperTypes()
				.add(this.getAbstractMeshComponent());
		javaFXControllerEClass.getESuperTypes()
				.add(this.getAbstractController());
		javaFXControllerFactoryEClass.getESuperTypes()
				.add(this.getIControllerFactory());
		edgeAndVertexFaceEClass.getESuperTypes().add(this.getFace());

		// Initialize classes, features, and operations; add parameters
		initEClass(faceEClass, Face.class, "Face", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(shapeEClass, Shape.class, "Shape", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(elementEClass, Element.class, "Element", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(vertexEClass, Vertex.class, "Vertex", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeEClass, Edge.class, "Edge", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEdge_Length(), ecorePackage.getEDouble(), "length",
				null, 0, 1, Edge.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(vizObjectEClass, VizObject.class, "VizObject", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVizObject_Id(), ecorePackage.getEInt(), "id", null, 0,
				1, VizObject.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVizObject_Description(), ecorePackage.getEString(),
				"description", null, 0, 1, VizObject.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getVizObject_Name(), ecorePackage.getEString(), "name",
				null, 0, 1, VizObject.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEOperation(getVizObject__Clone(), ecorePackage.getEObject(),
				"clone", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = initEOperation(getVizObject__Copy__VizObject(), null,
				"copy", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "otherObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(abstractViewEClass, AbstractView.class, "AbstractView",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractView_Transformation(),
				this.getTransformation(), null, "transformation", null, 0, 1,
				AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractView_PreviousTransformation(),
				this.getTransformation(), null, "previousTransformation", null,
				0, 1, AbstractView.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractView_Adapter(), this.getEContentAdapter(),
				"adapter", null, 0, 1, AbstractView.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEOperation(getAbstractView__Synched(), null, "synched", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractView__GetRepresentation(), this.getObject(),
				"getRepresentation", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractView__Update__Notification(), null,
				"update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "notification", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractView__Refresh__AbstractMeshComponent(),
				null, "refresh", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractMeshComponent(), "model", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(iControllerFactoryEClass, IControllerFactory.class,
				"IControllerFactory", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		op = initEOperation(
				getIControllerFactory__CreateController__AbstractMeshComponent(),
				this.getAbstractController(), "createController", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getAbstractMeshComponent(), "model", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(eStringToEStringMapEClass, Map.Entry.class,
				"EStringToEStringMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToEStringMap_Key(), ecorePackage.getEString(),
				"key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEAttribute(getEStringToEStringMap_Value(),
				ecorePackage.getEString(), "value", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(eStringToVizObjectMapEClass, Map.Entry.class,
				"EStringToVizObjectMap", !IS_ABSTRACT, !IS_INTERFACE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEStringToVizObjectMap_Key(),
				ecorePackage.getEString(), "key", null, 0, 1, Map.Entry.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE,
				!IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEStringToVizObjectMap_Value(), this.getVizObject(),
				null, "value", null, 0, -1, Map.Entry.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(transformationEClass, Transformation.class, "Transformation",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTransformation_Rotation(), ecorePackage.getEDouble(),
				"rotation", null, 3, 3, Transformation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Scale(), ecorePackage.getEDouble(),
				"scale", null, 3, 3, Transformation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Size(), ecorePackage.getEDouble(),
				"size", null, 0, 1, Transformation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Skew(), ecorePackage.getEDouble(),
				"skew", null, 3, 3, Transformation.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getTransformation_Translation(),
				ecorePackage.getEDouble(), "translation", null, 3, 3,
				Transformation.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(
				getTransformation__SetRotation__double_double_double(), null,
				"setRotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getTransformation__SetScale__double_double_double(),
				null, "setScale", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getTransformation__SetSkew__double_double_double(),
				null, "setSkew", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getTransformation__SetTranslation__double_double_double(), null,
				"setTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getTransformation__Clone(), this.getObject(), "clone", 0,
				1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getTransformation__Copy__Object(), null, "copy", 0,
				1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getObject(), "otherObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getTransformation__Equals__Object(),
				ecorePackage.getEBoolean(), "equals", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, this.getObject(), "otherObject", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(pointEClass, Point.class, "Point", !IS_ABSTRACT,
				!IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPoint_X(), ecorePackage.getEDouble(), "x", null, 0, 1,
				Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Y(), ecorePackage.getEDouble(), "y", null, 0, 1,
				Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPoint_Z(), ecorePackage.getEDouble(), "z", null, 0, 1,
				Point.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE,
				!IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPoint__GetLocation(), ecorePackage.getEDouble(),
				"getLocation", 0, -1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getPoint__UpdateLocation__double_double_double(),
				null, "updateLocation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(abstractMeshComponentEClass, AbstractMeshComponent.class,
				"AbstractMeshComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractMeshComponent_Type(), this.getMeshType(),
				"type", null, 0, 1, AbstractMeshComponent.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMeshComponent_UpdateLock(),
				this.getAtomicBoolean(), "updateLock", null, 0, 1,
				AbstractMeshComponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractMeshComponent_Entities(),
				this.getEStringToVizObjectMap(), null, "entities", null, 0, -1,
				AbstractMeshComponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractMeshComponent_Properties(),
				this.getEStringToEStringMap(), null, "properties", null, 0, -1,
				AbstractMeshComponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAbstractMeshComponent_Adapter(),
				this.getEContentAdapter(), "adapter", null, 0, 1,
				AbstractMeshComponent.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(
				getAbstractMeshComponent__GetEntitiesByCategory__String(),
				this.getVizObject(), "getEntitiesByCategory", 0, -1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "category", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractMeshComponent__GetProperty__String(),
				ecorePackage.getEString(), "getProperty", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "property", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getAbstractMeshComponent__SetProperty__String_String(), null,
				"setProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "property", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractMeshComponent__AddEntity__VizObject(),
				null, "addEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "newEntity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractMeshComponent__RemoveEntity__VizObject(),
				null, "removeEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "entity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractMeshComponent__AddEntityByCategory__VizObject_String(),
				null, "addEntityByCategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "newEntity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "category", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractMeshComponent__Update__Notification(),
				null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "notification", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractMeshComponent__Register__VizObject(),
				null, "register", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "entity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractMeshComponent__Unregister__VizObject(),
				null, "unregister", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "entity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEClass(abstractControllerEClass, AbstractController.class,
				"AbstractController", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAbstractController_Disposed(),
				this.getAtomicBoolean(), "disposed", null, 0, 1,
				AbstractController.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getAbstractController_Model(),
				this.getAbstractMeshComponent(), null, "model", null, 0, 1,
				AbstractController.class, !IS_TRANSIENT, !IS_VOLATILE,
				IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAbstractController_View(), this.getAbstractView(),
				null, "view", null, 0, 1, AbstractController.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE,
				IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		op = initEOperation(getAbstractController__AddEntity__VizObject(), null,
				"addEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "newEntity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__Dispose(), null, "dispose", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractController__GetEntities(),
				this.getVizObject(), "getEntities", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractController__GetEntitiesByCategory__String(),
				this.getVizObject(), "getEntitiesByCategory", 0, -1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "category", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractController__GetPreviousTransformation(),
				this.getTransformation(), "getPreviousTransformation", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractController__GetProperty__String(),
				ecorePackage.getEString(), "getProperty", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "property", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractController__GetRepresentation(),
				this.getObject(), "getRepresentation", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__GetRotation(),
				ecorePackage.getEDouble(), "getRotation", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__GetScale(),
				ecorePackage.getEDouble(), "getScale", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__GetSize(),
				ecorePackage.getEDouble(), "getSize", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__GetSkew(),
				ecorePackage.getEDouble(), "getSkew", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__GetTransformation(),
				this.getTransformation(), "getTransformation", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		initEOperation(getAbstractController__GetTranslation(),
				ecorePackage.getEDouble(), "getTranslation", 0, -1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractController__RemoveEntity__VizObject(),
				null, "removeEntity", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "entity", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractController__SetProperty__String_String(),
				null, "setProperty", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "property", 0, 1,
				IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractController__SetRotation__double_double_double(),
				null, "setRotation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractController__SetScale__double_double_double(), null,
				"setScale", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(getAbstractController__SetSize__double(), null,
				"setSize", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "newSize", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractController__SetSkew__double_double_double(), null,
				"setSkew", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractController__SetTransformation__Transformation(),
				null, "setTransformation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getTransformation(), "newTransformation", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(
				getAbstractController__SetTranslation__double_double_double(),
				null, "setTranslation", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "x", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "y", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEDouble(), "z", 0, 1, IS_UNIQUE,
				IS_ORDERED);

		op = initEOperation(
				getAbstractController__AddEntityByCategory__VizObject_String(),
				null, "addEntityByCategory", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getVizObject(), "newEntity", 0, 1, IS_UNIQUE,
				IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "category", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractController__ModelUpdate__Notification(),
				null, "modelUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "notification", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getAbstractController__ViewUpdate__Notification(),
				null, "viewUpdate", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getNotification(), "notification", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractController__Refresh(), null, "refresh", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEOperation(getAbstractController__Synched(), null, "synched", 0, 1,
				IS_UNIQUE, IS_ORDERED);

		initEClass(javaFXViewEClass, JavaFXView.class, "JavaFXView",
				!IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaFXMeshComponentEClass, JavaFXMeshComponent.class,
				"JavaFXMeshComponent", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaFXControllerEClass, JavaFXController.class,
				"JavaFXController", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(javaFXControllerFactoryEClass, JavaFXControllerFactory.class,
				"JavaFXControllerFactory", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(edgeAndVertexFaceEClass, EdgeAndVertexFace.class,
				"EdgeAndVertexFace", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(meshTypeEEnum, MeshType.class, "MeshType");

		// Initialize data types
		initEDataType(atomicBooleanEDataType, AtomicBoolean.class,
				"AtomicBoolean", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(notificationEDataType, Notification.class, "Notification",
				IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(eContentAdapterEDataType, EContentAdapter.class,
				"EContentAdapter", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);
		initEDataType(objectEDataType, Object.class, "Object", IS_SERIALIZABLE,
				!IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// EAnnotation0
		createEAnnotation0Annotations();
	}

	/**
	 * Initializes the annotations for <b>EAnnotation0</b>. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected void createEAnnotation0Annotations() {
		String source = "EAnnotation0";
		addAnnotation(vizObjectEClass, source, new String[] {});
	}

} // Prototype5PackageImpl
