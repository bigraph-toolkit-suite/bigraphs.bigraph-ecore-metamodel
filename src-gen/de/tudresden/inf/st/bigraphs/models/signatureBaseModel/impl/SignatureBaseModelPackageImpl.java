/**
 */
package de.tudresden.inf.st.bigraphs.models.signatureBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BBasicSignature;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControl;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BControlStatus;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BDynamicSignature;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindPlaceSorting;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSignature;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortAtomic;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BKindSortNonAtomic;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.BSorting;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelFactory;
import de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SignatureBaseModelPackageImpl extends EPackageImpl implements SignatureBaseModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bDynamicSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bKindPlaceSortingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bKindSortNonAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bKindSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bKindSortAtomicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bSortingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bBasicSignatureEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bControlStatusEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see de.tudresden.inf.st.bigraphs.models.signatureBaseModel.SignatureBaseModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SignatureBaseModelPackageImpl() {
		super(eNS_URI, SignatureBaseModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link SignatureBaseModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SignatureBaseModelPackage init() {
		if (isInited) return (SignatureBaseModelPackage)EPackage.Registry.INSTANCE.getEPackage(SignatureBaseModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredSignatureBaseModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		SignatureBaseModelPackageImpl theSignatureBaseModelPackage = registeredSignatureBaseModelPackage instanceof SignatureBaseModelPackageImpl ? (SignatureBaseModelPackageImpl)registeredSignatureBaseModelPackage : new SignatureBaseModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theSignatureBaseModelPackage.createPackageContents();

		// Initialize created meta-data
		theSignatureBaseModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSignatureBaseModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SignatureBaseModelPackage.eNS_URI, theSignatureBaseModelPackage);
		return theSignatureBaseModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBDynamicSignature() {
		return bDynamicSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBControl() {
		return bControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBControl_Name() {
		return (EAttribute)bControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBControl_Arity() {
		return (EAttribute)bControlEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBControl_Status() {
		return (EAttribute)bControlEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBControl_BSig() {
		return (EReference)bControlEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBKindPlaceSorting() {
		return bKindPlaceSortingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBKindPlaceSorting_BPlaceSorting() {
		return (EReference)bKindPlaceSortingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBKindPlaceSorting_BContainedBy() {
		return (EReference)bKindPlaceSortingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBKindPlaceSorting_BCanContain() {
		return (EReference)bKindPlaceSortingEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBKindSortNonAtomic() {
		return bKindSortNonAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBKindSignature() {
		return bKindSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBKindSignature_BKindPlaceSorts() {
		return (EReference)bKindSignatureEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBKindSortAtomic() {
		return bKindSortAtomicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBSorting() {
		return bSortingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBSorting_BControls() {
		return (EReference)bSortingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBBasicSignature() {
		return bBasicSignatureEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBControlStatus() {
		return bControlStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SignatureBaseModelFactory getSignatureBaseModelFactory() {
		return (SignatureBaseModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		bDynamicSignatureEClass = createEClass(BDYNAMIC_SIGNATURE);

		bControlEClass = createEClass(BCONTROL);
		createEAttribute(bControlEClass, BCONTROL__NAME);
		createEAttribute(bControlEClass, BCONTROL__ARITY);
		createEAttribute(bControlEClass, BCONTROL__STATUS);
		createEReference(bControlEClass, BCONTROL__BSIG);

		bKindPlaceSortingEClass = createEClass(BKIND_PLACE_SORTING);
		createEReference(bKindPlaceSortingEClass, BKIND_PLACE_SORTING__BPLACE_SORTING);
		createEReference(bKindPlaceSortingEClass, BKIND_PLACE_SORTING__BCONTAINED_BY);
		createEReference(bKindPlaceSortingEClass, BKIND_PLACE_SORTING__BCAN_CONTAIN);

		bKindSortNonAtomicEClass = createEClass(BKIND_SORT_NON_ATOMIC);

		bKindSignatureEClass = createEClass(BKIND_SIGNATURE);
		createEReference(bKindSignatureEClass, BKIND_SIGNATURE__BKIND_PLACE_SORTS);

		bKindSortAtomicEClass = createEClass(BKIND_SORT_ATOMIC);

		bSortingEClass = createEClass(BSORTING);
		createEReference(bSortingEClass, BSORTING__BCONTROLS);

		bBasicSignatureEClass = createEClass(BBASIC_SIGNATURE);

		// Create enums
		bControlStatusEEnum = createEEnum(BCONTROL_STATUS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		bDynamicSignatureEClass.getESuperTypes().add(this.getBKindSignature());
		bKindSortNonAtomicEClass.getESuperTypes().add(this.getBKindPlaceSorting());
		bKindSignatureEClass.getESuperTypes().add(this.getBSorting());
		bKindSortAtomicEClass.getESuperTypes().add(this.getBKindPlaceSorting());
		bBasicSignatureEClass.getESuperTypes().add(this.getBKindSignature());

		// Initialize classes, features, and operations; add parameters
		initEClass(bDynamicSignatureEClass, BDynamicSignature.class, "BDynamicSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bControlEClass, BControl.class, "BControl", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBControl_Name(), ecorePackage.getEString(), "name", null, 0, 1, BControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBControl_Arity(), ecorePackage.getEInt(), "arity", null, 0, 1, BControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBControl_Status(), this.getBControlStatus(), "status", "ACTIVE", 1, 1, BControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getBControl_BSig(), this.getBSorting(), this.getBSorting_BControls(), "bSig", null, 1, 1, BControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bKindPlaceSortingEClass, BKindPlaceSorting.class, "BKindPlaceSorting", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBKindPlaceSorting_BPlaceSorting(), this.getBKindSignature(), this.getBKindSignature_BKindPlaceSorts(), "bPlaceSorting", null, 1, 1, BKindPlaceSorting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBKindPlaceSorting_BContainedBy(), this.getBKindPlaceSorting(), this.getBKindPlaceSorting_BCanContain(), "bContainedBy", null, 0, -1, BKindPlaceSorting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBKindPlaceSorting_BCanContain(), this.getBKindPlaceSorting(), this.getBKindPlaceSorting_BContainedBy(), "bCanContain", null, 0, -1, BKindPlaceSorting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bKindSortNonAtomicEClass, BKindSortNonAtomic.class, "BKindSortNonAtomic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bKindSignatureEClass, BKindSignature.class, "BKindSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBKindSignature_BKindPlaceSorts(), this.getBKindPlaceSorting(), this.getBKindPlaceSorting_BPlaceSorting(), "bKindPlaceSorts", null, 1, -1, BKindSignature.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bKindSortAtomicEClass, BKindSortAtomic.class, "BKindSortAtomic", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bSortingEClass, BSorting.class, "BSorting", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBSorting_BControls(), this.getBControl(), this.getBControl_BSig(), "bControls", null, 0, -1, BSorting.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bBasicSignatureEClass, BBasicSignature.class, "BBasicSignature", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(bControlStatusEEnum, BControlStatus.class, "BControlStatus");
		addEEnumLiteral(bControlStatusEEnum, BControlStatus.ACTIVE);
		addEEnumLiteral(bControlStatusEEnum, BControlStatus.ATOMIC);
		addEEnumLiteral(bControlStatusEEnum, BControlStatus.PASSIVE);

		// Create resource
		createResource(eNS_URI);
	}

} //SignatureBaseModelPackageImpl
