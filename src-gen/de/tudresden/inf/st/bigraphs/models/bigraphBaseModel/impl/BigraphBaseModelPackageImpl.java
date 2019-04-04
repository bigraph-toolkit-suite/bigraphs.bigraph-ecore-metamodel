/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BSite;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelFactory;
import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BigraphBaseModelPackageImpl extends EPackageImpl implements BigraphBaseModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bSiteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPointEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bPortEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bInnerNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bEdgeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bOuterNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nameableTypeEClass = null;

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
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BigraphBaseModelPackageImpl() {
		super(eNS_URI, BigraphBaseModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link BigraphBaseModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BigraphBaseModelPackage init() {
		if (isInited)
			return (BigraphBaseModelPackage) EPackage.Registry.INSTANCE.getEPackage(BigraphBaseModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredBigraphBaseModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		BigraphBaseModelPackageImpl theBigraphBaseModelPackage = registeredBigraphBaseModelPackage instanceof BigraphBaseModelPackageImpl
				? (BigraphBaseModelPackageImpl) registeredBigraphBaseModelPackage
				: new BigraphBaseModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theBigraphBaseModelPackage.createPackageContents();

		// Initialize created meta-data
		theBigraphBaseModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theBigraphBaseModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BigraphBaseModelPackage.eNS_URI, theBigraphBaseModelPackage);
		return theBigraphBaseModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPlace() {
		return bPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPlace_BChild() {
		return (EReference) bPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPlace_BPrnt() {
		return (EReference) bPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBRoot() {
		return bRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBRoot_Index() {
		return (EAttribute) bRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBNode() {
		return bNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBNode_BPorts() {
		return (EReference) bNodeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBSite() {
		return bSiteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBSite_Index() {
		return (EAttribute) bSiteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPoint() {
		return bPointEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPoint_BLink() {
		return (EReference) bPointEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBLink() {
		return bLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBLink_BPoints() {
		return (EReference) bLinkEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPort() {
		return bPortEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPort_Index() {
		return (EAttribute) bPortEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPort_BNode() {
		return (EReference) bPortEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBInnerName() {
		return bInnerNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBEdge() {
		return bEdgeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBOuterName() {
		return bOuterNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNameableType() {
		return nameableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNameableType_Name() {
		return (EAttribute) nameableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphBaseModelFactory getBigraphBaseModelFactory() {
		return (BigraphBaseModelFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		bPlaceEClass = createEClass(BPLACE);
		createEReference(bPlaceEClass, BPLACE__BCHILD);
		createEReference(bPlaceEClass, BPLACE__BPRNT);

		bRootEClass = createEClass(BROOT);
		createEAttribute(bRootEClass, BROOT__INDEX);

		bNodeEClass = createEClass(BNODE);
		createEReference(bNodeEClass, BNODE__BPORTS);

		bSiteEClass = createEClass(BSITE);
		createEAttribute(bSiteEClass, BSITE__INDEX);

		bPointEClass = createEClass(BPOINT);
		createEReference(bPointEClass, BPOINT__BLINK);

		bLinkEClass = createEClass(BLINK);
		createEReference(bLinkEClass, BLINK__BPOINTS);

		bPortEClass = createEClass(BPORT);
		createEAttribute(bPortEClass, BPORT__INDEX);
		createEReference(bPortEClass, BPORT__BNODE);

		bInnerNameEClass = createEClass(BINNER_NAME);

		bEdgeEClass = createEClass(BEDGE);

		bOuterNameEClass = createEClass(BOUTER_NAME);

		nameableTypeEClass = createEClass(NAMEABLE_TYPE);
		createEAttribute(nameableTypeEClass, NAMEABLE_TYPE__NAME);
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
		bRootEClass.getESuperTypes().add(this.getBPlace());
		bNodeEClass.getESuperTypes().add(this.getBPlace());
		bNodeEClass.getESuperTypes().add(this.getNameableType());
		bSiteEClass.getESuperTypes().add(this.getBPlace());
		bLinkEClass.getESuperTypes().add(this.getNameableType());
		bPortEClass.getESuperTypes().add(this.getBPoint());
		bInnerNameEClass.getESuperTypes().add(this.getBPoint());
		bInnerNameEClass.getESuperTypes().add(this.getNameableType());
		bEdgeEClass.getESuperTypes().add(this.getBLink());
		bOuterNameEClass.getESuperTypes().add(this.getBLink());

		// Initialize classes, features, and operations; add parameters
		initEClass(bPlaceEClass, BPlace.class, "BPlace", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPlace_BChild(), this.getBPlace(), this.getBPlace_BPrnt(), "bChild", null, 0, -1,
				BPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPlace_BPrnt(), this.getBPlace(), this.getBPlace_BChild(), "bPrnt", null, 0, 1, BPlace.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bRootEClass, BRoot.class, "BRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBRoot_Index(), ecorePackage.getEInt(), "index", null, 0, 1, BRoot.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bNodeEClass, BNode.class, "BNode", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBNode_BPorts(), this.getBPort(), this.getBPort_BNode(), "bPorts", null, 0, -1, BNode.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bSiteEClass, BSite.class, "BSite", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBSite_Index(), ecorePackage.getEInt(), "index", null, 0, 1, BSite.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bPointEClass, BPoint.class, "BPoint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBPoint_BLink(), this.getBLink(), this.getBLink_BPoints(), "bLink", null, 1, 1, BPoint.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bLinkEClass, BLink.class, "BLink", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBLink_BPoints(), this.getBPoint(), this.getBPoint_BLink(), "bPoints", null, 1, -1,
				BLink.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bPortEClass, BPort.class, "BPort", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBPort_Index(), ecorePackage.getEInt(), "index", null, 0, 1, BPort.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBPort_BNode(), this.getBNode(), this.getBNode_BPorts(), "bNode", null, 1, 1, BPort.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bInnerNameEClass, BInnerName.class, "BInnerName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(bEdgeEClass, BEdge.class, "BEdge", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(bOuterNameEClass, BOuterName.class, "BOuterName", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(nameableTypeEClass, NameableType.class, "NameableType", IS_ABSTRACT, IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNameableType_Name(), ecorePackage.getEString(), "name", null, 0, 1, NameableType.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //BigraphBaseModelPackageImpl
