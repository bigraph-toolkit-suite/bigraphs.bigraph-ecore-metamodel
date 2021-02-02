/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel.util;

import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage
 * @generated
 */
public class SignatureBaseModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SignatureBaseModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SignatureBaseModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SignatureBaseModelPackage.eINSTANCE;
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
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SignatureBaseModelSwitch<Adapter> modelSwitch =
		new SignatureBaseModelSwitch<Adapter>() {
			@Override
			public Adapter caseBDynamicSignature(BDynamicSignature object) {
				return createBDynamicSignatureAdapter();
			}
			@Override
			public Adapter caseBControl(BControl object) {
				return createBControlAdapter();
			}
			@Override
			public Adapter caseBKindPlaceSortings(BKindPlaceSortings object) {
				return createBKindPlaceSortingsAdapter();
			}
			@Override
			public Adapter caseBKindSortNonAtomic(BKindSortNonAtomic object) {
				return createBKindSortNonAtomicAdapter();
			}
			@Override
			public Adapter caseBKindSignature(BKindSignature object) {
				return createBKindSignatureAdapter();
			}
			@Override
			public Adapter caseBKindSortAtomic(BKindSortAtomic object) {
				return createBKindSortAtomicAdapter();
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
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature <em>BDynamic Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature
	 * @generated
	 */
	public Adapter createBDynamicSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl <em>BControl</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl
	 * @generated
	 */
	public Adapter createBControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings <em>BKind Place Sortings</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings
	 * @generated
	 */
	public Adapter createBKindPlaceSortingsAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic <em>BKind Sort Non Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic
	 * @generated
	 */
	public Adapter createBKindSortNonAtomicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature <em>BKind Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature
	 * @generated
	 */
	public Adapter createBKindSignatureAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortAtomic <em>BKind Sort Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortAtomic
	 * @generated
	 */
	public Adapter createBKindSortAtomicAdapter() {
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

} //SignatureBaseModelAdapterFactory
