/**
 */
package prototype5.impl;

import java.util.Map.Entry;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import prototype5.Prototype5Package;
import prototype5.Shape;
import prototype5.VizObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Shape</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ShapeImpl extends AbstractMeshComponentImpl implements Shape {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ShapeImpl() {
		super();
	}

	/**
	 * Set the shape's parent shape. Shapes can have at most one parent, and
	 * this operation will remove any existing parent.
	 * 
	 * @param parent
	 *            The new shape which serves as this shape's parent.
	 */
	public void setParent(VizObject parent) {
		
		//Fail silently if the parent is not a shape
		if (parent instanceof Shape) {
			
			//If there is already a parent, remove it.
			if (!getEntitiesByCategory("Parent").isEmpty()) {
				for (Entry<String, EList<VizObject>> category : entities) {
					if (category.getKey() == "Parent") {
						entities.remove(category);
					}
				}
			}
			
			//Add the parent to the entities map under the parent category
			addEntityByCategory(parent, "Parent");
		}
	}
	
	/*
	 * (non-Javadoc)
	 * @see prototype5.impl.AbstractMeshComponentImpl#addEntity(prototype5.VizObject)
	 */
	@Override
	public void addEntity(VizObject newEntity){
		
		//By default, add an entity as a child shape.
		addEntityByCategory(newEntity, "Children");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Prototype5Package.Literals.SHAPE;
	}

} // ShapeImpl
