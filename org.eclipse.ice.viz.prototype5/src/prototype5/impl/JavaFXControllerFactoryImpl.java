/**
 */
package prototype5.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import prototype5.AbstractController;
import prototype5.AbstractMeshComponent;
import prototype5.JavaFXController;
import prototype5.JavaFXControllerFactory;
import prototype5.JavaFXMeshComponent;
import prototype5.JavaFXView;
import prototype5.Prototype5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java FX Controller Factory</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaFXControllerFactoryImpl extends MinimalEObjectImpl.Container implements JavaFXControllerFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFXControllerFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.JAVA_FX_CONTROLLER_FACTORY;
	}

	/*
	 * (non-Javadoc)
	 * @see prototype5.IControllerFactory#createController(prototype5.AbstractMeshComponent)
	 */
	public AbstractController createController(AbstractMeshComponent model) {
		JavaFXController controller = null;

		// If the model is a PlantComponent, create the view and controller.
		if (model instanceof JavaFXMeshComponent) {
			JavaFXView view = new JavaFXViewImpl((JavaFXMeshComponent) model);
			controller = new JavaFXControllerImpl((JavaFXMeshComponent) model, view);
		}
		return controller;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Prototype5Package.JAVA_FX_CONTROLLER_FACTORY___CREATE_CONTROLLER__ABSTRACTMESHCOMPONENT:
				return createController((AbstractMeshComponent)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //JavaFXControllerFactoryImpl
