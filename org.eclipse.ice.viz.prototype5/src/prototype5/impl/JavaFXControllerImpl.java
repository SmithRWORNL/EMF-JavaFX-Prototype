/**
 */
package prototype5.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import prototype5.JavaFXController;
import prototype5.JavaFXMeshComponent;
import prototype5.JavaFXView;
import prototype5.Prototype5Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java FX Controller</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class JavaFXControllerImpl extends AbstractControllerImpl implements JavaFXController {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaFXControllerImpl() {
		super();
	}
	
	/**
	 * Constructor for a JavaFX model and a view of that model.
	 * 
	 * @param model The controller's model.
	 * @param view The controller's view.
	 */
	public JavaFXControllerImpl(JavaFXMeshComponent model, JavaFXView view){
		super(model, view);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.JAVA_FX_CONTROLLER;
	}
	
	@Override
	public void modelUpdate(Notification notification){
		view.refresh(model);
		super.modelUpdate(notification);
		
	}

} //JavaFXControllerImpl
