/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelFactory
 * @model kind="package"
 * @generated
 */
public interface SignatureBaseModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "signatureBaseModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tudresden.inf.st.bigraphs.signature";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "signatureBaseModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SignatureBaseModelPackage eINSTANCE = de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BDynamicSignatureImpl <em>BDynamic Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BDynamicSignatureImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBDynamicSignature()
	 * @generated
	 */
	int BDYNAMIC_SIGNATURE = 0;

	/**
	 * The feature id for the '<em><b>BControls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE__BCONTROLS = 0;

	/**
	 * The number of structural features of the '<em>BDynamic Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BDynamic Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl <em>BControl</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControl()
	 * @generated
	 */
	int BCONTROL = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Arity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__ARITY = 1;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__STATUS = 2;

	/**
	 * The number of structural features of the '<em>BControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings <em>BKind Place Sortings</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindPlaceSortings()
	 * @generated
	 */
	int BKIND_PLACE_SORTINGS = 2;

	/**
	 * The number of structural features of the '<em>BKind Place Sortings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTINGS_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>BKind Place Sortings</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTINGS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortNonAtomicImpl <em>BKind Sort Non Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortNonAtomicImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSortNonAtomic()
	 * @generated
	 */
	int BKIND_SORT_NON_ATOMIC = 3;

	/**
	 * The feature id for the '<em><b>BKind Sorts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC__BKIND_SORTS = BKIND_PLACE_SORTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BKind Sort Non Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC_FEATURE_COUNT = BKIND_PLACE_SORTINGS_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BKind Sort Non Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC_OPERATION_COUNT = BKIND_PLACE_SORTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl <em>BKind Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSignature()
	 * @generated
	 */
	int BKIND_SIGNATURE = 4;

	/**
	 * The feature id for the '<em><b>BControls</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE__BCONTROLS = BDYNAMIC_SIGNATURE__BCONTROLS;

	/**
	 * The feature id for the '<em><b>BKind Place Sorts</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE__BKIND_PLACE_SORTS = BDYNAMIC_SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BKind Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE_FEATURE_COUNT = BDYNAMIC_SIGNATURE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BKind Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE_OPERATION_COUNT = BDYNAMIC_SIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortAtomicImpl <em>BKind Sort Atomic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortAtomicImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSortAtomic()
	 * @generated
	 */
	int BKIND_SORT_ATOMIC = 5;

	/**
	 * The number of structural features of the '<em>BKind Sort Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC_FEATURE_COUNT = BKIND_PLACE_SORTINGS_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BKind Sort Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC_OPERATION_COUNT = BKIND_PLACE_SORTINGS_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControlStatus()
	 * @generated
	 */
	int BCONTROL_STATUS = 6;


	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature <em>BDynamic Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BDynamic Signature</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature
	 * @generated
	 */
	EClass getBDynamicSignature();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature#getBControls <em>BControls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BControls</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature#getBControls()
	 * @see #getBDynamicSignature()
	 * @generated
	 */
	EReference getBDynamicSignature_BControls();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl <em>BControl</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BControl</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl
	 * @generated
	 */
	EClass getBControl();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getName()
	 * @see #getBControl()
	 * @generated
	 */
	EAttribute getBControl_Name();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getArity <em>Arity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Arity</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getArity()
	 * @see #getBControl()
	 * @generated
	 */
	EAttribute getBControl_Arity();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getStatus()
	 * @see #getBControl()
	 * @generated
	 */
	EAttribute getBControl_Status();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings <em>BKind Place Sortings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BKind Place Sortings</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings
	 * @generated
	 */
	EClass getBKindPlaceSortings();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic <em>BKind Sort Non Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BKind Sort Non Atomic</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic
	 * @generated
	 */
	EClass getBKindSortNonAtomic();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic#getBKindSorts <em>BKind Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BKind Sorts</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic#getBKindSorts()
	 * @see #getBKindSortNonAtomic()
	 * @generated
	 */
	EReference getBKindSortNonAtomic_BKindSorts();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature <em>BKind Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BKind Signature</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature
	 * @generated
	 */
	EClass getBKindSignature();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature#getBKindPlaceSorts <em>BKind Place Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BKind Place Sorts</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature#getBKindPlaceSorts()
	 * @see #getBKindSignature()
	 * @generated
	 */
	EReference getBKindSignature_BKindPlaceSorts();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortAtomic <em>BKind Sort Atomic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BKind Sort Atomic</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortAtomic
	 * @generated
	 */
	EClass getBKindSortAtomic();

	/**
	 * Returns the meta object for enum '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>BControl Status</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @generated
	 */
	EEnum getBControlStatus();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SignatureBaseModelFactory getSignatureBaseModelFactory();

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
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BDynamicSignatureImpl <em>BDynamic Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BDynamicSignatureImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBDynamicSignature()
		 * @generated
		 */
		EClass BDYNAMIC_SIGNATURE = eINSTANCE.getBDynamicSignature();

		/**
		 * The meta object literal for the '<em><b>BControls</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BDYNAMIC_SIGNATURE__BCONTROLS = eINSTANCE.getBDynamicSignature_BControls();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl <em>BControl</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BControlImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControl()
		 * @generated
		 */
		EClass BCONTROL = eINSTANCE.getBControl();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONTROL__NAME = eINSTANCE.getBControl_Name();

		/**
		 * The meta object literal for the '<em><b>Arity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONTROL__ARITY = eINSTANCE.getBControl_Arity();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BCONTROL__STATUS = eINSTANCE.getBControl_Status();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings <em>BKind Place Sortings</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSortings
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindPlaceSortings()
		 * @generated
		 */
		EClass BKIND_PLACE_SORTINGS = eINSTANCE.getBKindPlaceSortings();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortNonAtomicImpl <em>BKind Sort Non Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortNonAtomicImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSortNonAtomic()
		 * @generated
		 */
		EClass BKIND_SORT_NON_ATOMIC = eINSTANCE.getBKindSortNonAtomic();

		/**
		 * The meta object literal for the '<em><b>BKind Sorts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BKIND_SORT_NON_ATOMIC__BKIND_SORTS = eINSTANCE.getBKindSortNonAtomic_BKindSorts();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl <em>BKind Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSignature()
		 * @generated
		 */
		EClass BKIND_SIGNATURE = eINSTANCE.getBKindSignature();

		/**
		 * The meta object literal for the '<em><b>BKind Place Sorts</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BKIND_SIGNATURE__BKIND_PLACE_SORTS = eINSTANCE.getBKindSignature_BKindPlaceSorts();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortAtomicImpl <em>BKind Sort Atomic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSortAtomicImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSortAtomic()
		 * @generated
		 */
		EClass BKIND_SORT_ATOMIC = eINSTANCE.getBKindSortAtomic();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControlStatus()
		 * @generated
		 */
		EEnum BCONTROL_STATUS = eINSTANCE.getBControlStatus();

	}

} //SignatureBaseModelPackage
