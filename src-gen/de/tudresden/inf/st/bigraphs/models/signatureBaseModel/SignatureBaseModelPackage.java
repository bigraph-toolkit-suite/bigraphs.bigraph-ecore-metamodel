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
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSortingImpl <em>BSorting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSortingImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBSorting()
	 * @generated
	 */
	int BSORTING = 6;

	/**
	 * The feature id for the '<em><b>BControls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSORTING__BCONTROLS = 0;

	/**
	 * The number of structural features of the '<em>BSorting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSORTING_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BSorting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSORTING_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>BControls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE__BCONTROLS = BSORTING__BCONTROLS;

	/**
	 * The feature id for the '<em><b>BKind Place Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE__BKIND_PLACE_SORTS = BSORTING_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BKind Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE_FEATURE_COUNT = BSORTING_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BKind Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SIGNATURE_OPERATION_COUNT = BSORTING_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>BControls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE__BCONTROLS = BKIND_SIGNATURE__BCONTROLS;

	/**
	 * The feature id for the '<em><b>BKind Place Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE__BKIND_PLACE_SORTS = BKIND_SIGNATURE__BKIND_PLACE_SORTS;

	/**
	 * The number of structural features of the '<em>BDynamic Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE_FEATURE_COUNT = BKIND_SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BDynamic Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BDYNAMIC_SIGNATURE_OPERATION_COUNT = BKIND_SIGNATURE_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>BSig</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL__BSIG = 3;

	/**
	 * The number of structural features of the '<em>BControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>BControl</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BCONTROL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindPlaceSortingImpl <em>BKind Place Sorting</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindPlaceSortingImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindPlaceSorting()
	 * @generated
	 */
	int BKIND_PLACE_SORTING = 2;

	/**
	 * The feature id for the '<em><b>BPlace Sorting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTING__BPLACE_SORTING = 0;

	/**
	 * The feature id for the '<em><b>BContained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTING__BCONTAINED_BY = 1;

	/**
	 * The feature id for the '<em><b>BCan Contain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTING__BCAN_CONTAIN = 2;

	/**
	 * The number of structural features of the '<em>BKind Place Sorting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTING_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>BKind Place Sorting</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_PLACE_SORTING_OPERATION_COUNT = 0;

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
	 * The feature id for the '<em><b>BPlace Sorting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC__BPLACE_SORTING = BKIND_PLACE_SORTING__BPLACE_SORTING;

	/**
	 * The feature id for the '<em><b>BContained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC__BCONTAINED_BY = BKIND_PLACE_SORTING__BCONTAINED_BY;

	/**
	 * The feature id for the '<em><b>BCan Contain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC__BCAN_CONTAIN = BKIND_PLACE_SORTING__BCAN_CONTAIN;

	/**
	 * The number of structural features of the '<em>BKind Sort Non Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC_FEATURE_COUNT = BKIND_PLACE_SORTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BKind Sort Non Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_NON_ATOMIC_OPERATION_COUNT = BKIND_PLACE_SORTING_OPERATION_COUNT + 0;

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
	 * The feature id for the '<em><b>BPlace Sorting</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC__BPLACE_SORTING = BKIND_PLACE_SORTING__BPLACE_SORTING;

	/**
	 * The feature id for the '<em><b>BContained By</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC__BCONTAINED_BY = BKIND_PLACE_SORTING__BCONTAINED_BY;

	/**
	 * The feature id for the '<em><b>BCan Contain</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC__BCAN_CONTAIN = BKIND_PLACE_SORTING__BCAN_CONTAIN;

	/**
	 * The number of structural features of the '<em>BKind Sort Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC_FEATURE_COUNT = BKIND_PLACE_SORTING_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BKind Sort Atomic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BKIND_SORT_ATOMIC_OPERATION_COUNT = BKIND_PLACE_SORTING_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BBasicSignatureImpl <em>BBasic Signature</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BBasicSignatureImpl
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBBasicSignature()
	 * @generated
	 */
	int BBASIC_SIGNATURE = 7;

	/**
	 * The feature id for the '<em><b>BControls</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBASIC_SIGNATURE__BCONTROLS = BKIND_SIGNATURE__BCONTROLS;

	/**
	 * The feature id for the '<em><b>BKind Place Sorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBASIC_SIGNATURE__BKIND_PLACE_SORTS = BKIND_SIGNATURE__BKIND_PLACE_SORTS;

	/**
	 * The number of structural features of the '<em>BBasic Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBASIC_SIGNATURE_FEATURE_COUNT = BKIND_SIGNATURE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BBasic Signature</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBASIC_SIGNATURE_OPERATION_COUNT = BKIND_SIGNATURE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus <em>BControl Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBControlStatus()
	 * @generated
	 */
	int BCONTROL_STATUS = 8;


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
	 * Returns the meta object for the container reference '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getBSig <em>BSig</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BSig</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl#getBSig()
	 * @see #getBControl()
	 * @generated
	 */
	EReference getBControl_BSig();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting <em>BKind Place Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BKind Place Sorting</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting
	 * @generated
	 */
	EClass getBKindPlaceSorting();

	/**
	 * Returns the meta object for the container reference '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting <em>BPlace Sorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BPlace Sorting</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBPlaceSorting()
	 * @see #getBKindPlaceSorting()
	 * @generated
	 */
	EReference getBKindPlaceSorting_BPlaceSorting();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBContainedBy <em>BContained By</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BContained By</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBContainedBy()
	 * @see #getBKindPlaceSorting()
	 * @generated
	 */
	EReference getBKindPlaceSorting_BContainedBy();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBCanContain <em>BCan Contain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BCan Contain</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting#getBCanContain()
	 * @see #getBKindPlaceSorting()
	 * @generated
	 */
	EReference getBKindPlaceSorting_BCanContain();

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
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature <em>BKind Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BKind Signature</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature
	 * @generated
	 */
	EClass getBKindSignature();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature#getBKindPlaceSorts <em>BKind Place Sorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BKind Place Sorts</em>'.
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
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting <em>BSorting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSorting</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting
	 * @generated
	 */
	EClass getBSorting();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting#getBControls <em>BControls</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BControls</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting#getBControls()
	 * @see #getBSorting()
	 * @generated
	 */
	EReference getBSorting_BControls();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BBasicSignature <em>BBasic Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBasic Signature</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BBasicSignature
	 * @generated
	 */
	EClass getBBasicSignature();

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
		 * The meta object literal for the '<em><b>BSig</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BCONTROL__BSIG = eINSTANCE.getBControl_BSig();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindPlaceSortingImpl <em>BKind Place Sorting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindPlaceSortingImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindPlaceSorting()
		 * @generated
		 */
		EClass BKIND_PLACE_SORTING = eINSTANCE.getBKindPlaceSorting();

		/**
		 * The meta object literal for the '<em><b>BPlace Sorting</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BKIND_PLACE_SORTING__BPLACE_SORTING = eINSTANCE.getBKindPlaceSorting_BPlaceSorting();

		/**
		 * The meta object literal for the '<em><b>BContained By</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BKIND_PLACE_SORTING__BCONTAINED_BY = eINSTANCE.getBKindPlaceSorting_BContainedBy();

		/**
		 * The meta object literal for the '<em><b>BCan Contain</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BKIND_PLACE_SORTING__BCAN_CONTAIN = eINSTANCE.getBKindPlaceSorting_BCanContain();

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
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl <em>BKind Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BKindSignatureImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBKindSignature()
		 * @generated
		 */
		EClass BKIND_SIGNATURE = eINSTANCE.getBKindSignature();

		/**
		 * The meta object literal for the '<em><b>BKind Place Sorts</b></em>' containment reference list feature.
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
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSortingImpl <em>BSorting</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BSortingImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBSorting()
		 * @generated
		 */
		EClass BSORTING = eINSTANCE.getBSorting();

		/**
		 * The meta object literal for the '<em><b>BControls</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSORTING__BCONTROLS = eINSTANCE.getBSorting_BControls();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BBasicSignatureImpl <em>BBasic Signature</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.BBasicSignatureImpl
		 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl.SignatureBaseModelPackageImpl#getBBasicSignature()
		 * @generated
		 */
		EClass BBASIC_SIGNATURE = eINSTANCE.getBBasicSignature();

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
