/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.util;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage
 * @generated
 */
public class BigraphBaseModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static BigraphBaseModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphBaseModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = BigraphBaseModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BigraphBaseModelSwitch<Adapter> modelSwitch = new BigraphBaseModelSwitch<Adapter>() {
		@Override
		public Adapter caseBPlace(BPlace object) {
			return createBPlaceAdapter();
		}

		@Override
		public Adapter caseBRoot(BRoot object) {
			return createBRootAdapter();
		}

		@Override
		public Adapter caseBNode(BNode object) {
			return createBNodeAdapter();
		}

		@Override
		public Adapter caseBSite(BSite object) {
			return createBSiteAdapter();
		}

		@Override
		public Adapter caseBPoint(BPoint object) {
			return createBPointAdapter();
		}

		@Override
		public Adapter caseBLink(BLink object) {
			return createBLinkAdapter();
		}

		@Override
		public Adapter caseBPort(BPort object) {
			return createBPortAdapter();
		}

		@Override
		public Adapter caseBInnerName(BInnerName object) {
			return createBInnerNameAdapter();
		}

		@Override
		public Adapter caseBEdge(BEdge object) {
			return createBEdgeAdapter();
		}

		@Override
		public Adapter caseBOuterName(BOuterName object) {
			return createBOuterNameAdapter();
		}

		@Override
		public Adapter caseNameableType(NameableType object) {
			return createNameableTypeAdapter();
		}

		@Override
		public Adapter caseIndexableType(IndexableType object) {
			return createIndexableTypeAdapter();
		}

		@Override
		public Adapter caseBBigraph(BBigraph object) {
			return createBBigraphAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace <em>BPlace</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace
	 * @generated
	 */
	public Adapter createBPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot <em>BRoot</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot
	 * @generated
	 */
	public Adapter createBRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode <em>BNode</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode
	 * @generated
	 */
	public Adapter createBNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BSite <em>BSite</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BSite
	 * @generated
	 */
	public Adapter createBSiteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint <em>BPoint</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint
	 * @generated
	 */
	public Adapter createBPointAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink
	 * @generated
	 */
	public Adapter createBLinkAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort <em>BPort</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort
	 * @generated
	 */
	public Adapter createBPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName <em>BInner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName
	 * @generated
	 */
	public Adapter createBInnerNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge <em>BEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge
	 * @generated
	 */
	public Adapter createBEdgeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName <em>BOuter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName
	 * @generated
	 */
	public Adapter createBOuterNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType <em>Nameable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType
	 * @generated
	 */
	public Adapter createNameableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType <em>Indexable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType
	 * @generated
	 */
	public Adapter createIndexableTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BBigraph
	 * @generated
	 */
	public Adapter createBBigraphAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //BigraphBaseModelAdapterFactory
