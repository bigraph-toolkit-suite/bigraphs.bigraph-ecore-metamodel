/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BigraphBaseModelFactory
 * @model kind="package"
 * @generated
 */
public interface BigraphBaseModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "bigraphBaseModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://de.tudresden.inf.st.bigraphs.models";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "bigraphBaseModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	BigraphBaseModelPackage eINSTANCE = de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl
			.init();

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPlaceImpl <em>BPlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPlaceImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPlace()
	 * @generated
	 */
	int BPLACE = 0;

	/**
	 * The feature id for the '<em><b>BChild</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPLACE__BCHILD = 0;

	/**
	 * The feature id for the '<em><b>BPrnt</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPLACE__BPRNT = 1;

	/**
	 * The number of structural features of the '<em>BPlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPLACE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>BPlace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPLACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BRootImpl <em>BRoot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BRootImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBRoot()
	 * @generated
	 */
	int BROOT = 1;

	/**
	 * The feature id for the '<em><b>BChild</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT__BCHILD = BPLACE__BCHILD;

	/**
	 * The feature id for the '<em><b>BPrnt</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT__BPRNT = BPLACE__BPRNT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT__INDEX = BPLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BRoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT_FEATURE_COUNT = BPLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BRoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT_OPERATION_COUNT = BPLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl <em>BNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBNode()
	 * @generated
	 */
	int BNODE = 2;

	/**
	 * The feature id for the '<em><b>BChild</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE__BCHILD = BPLACE__BCHILD;

	/**
	 * The feature id for the '<em><b>BPrnt</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE__BPRNT = BPLACE__BPRNT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE__NAME = BPLACE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BPorts</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE__BPORTS = BPLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE_FEATURE_COUNT = BPLACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE_OPERATION_COUNT = BPLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BSiteImpl <em>BSite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BSiteImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBSite()
	 * @generated
	 */
	int BSITE = 3;

	/**
	 * The feature id for the '<em><b>BChild</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE__BCHILD = BPLACE__BCHILD;

	/**
	 * The feature id for the '<em><b>BPrnt</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE__BPRNT = BPLACE__BPRNT;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE__INDEX = BPLACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BSite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE_FEATURE_COUNT = BPLACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BSite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE_OPERATION_COUNT = BPLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPointImpl <em>BPoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPointImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPoint()
	 * @generated
	 */
	int BPOINT = 4;

	/**
	 * The feature id for the '<em><b>BLink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPOINT__BLINK = 0;

	/**
	 * The number of structural features of the '<em>BPoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPOINT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>BPoint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPOINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType <em>Nameable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getNameableType()
	 * @generated
	 */
	int NAMEABLE_TYPE = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_TYPE__NAME = 0;

	/**
	 * The number of structural features of the '<em>Nameable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Nameable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMEABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BLinkImpl <em>BLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BLinkImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBLink()
	 * @generated
	 */
	int BLINK = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK__NAME = NAMEABLE_TYPE__NAME;

	/**
	 * The feature id for the '<em><b>BPoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK__BPOINTS = NAMEABLE_TYPE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_FEATURE_COUNT = NAMEABLE_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BLink</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLINK_OPERATION_COUNT = NAMEABLE_TYPE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPortImpl <em>BPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPortImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPort()
	 * @generated
	 */
	int BPORT = 6;

	/**
	 * The feature id for the '<em><b>BLink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPORT__BLINK = BPOINT__BLINK;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPORT__INDEX = BPOINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>BNode</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPORT__BNODE = BPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPORT_FEATURE_COUNT = BPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BPort</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BPORT_OPERATION_COUNT = BPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BInnerNameImpl <em>BInner Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BInnerNameImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBInnerName()
	 * @generated
	 */
	int BINNER_NAME = 7;

	/**
	 * The feature id for the '<em><b>BLink</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME__BLINK = BPOINT__BLINK;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME__NAME = BPOINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BInner Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME_FEATURE_COUNT = BPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BInner Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME_OPERATION_COUNT = BPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BEdgeImpl <em>BEdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BEdgeImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBEdge()
	 * @generated
	 */
	int BEDGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE__NAME = BLINK__NAME;

	/**
	 * The feature id for the '<em><b>BPoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE__BPOINTS = BLINK__BPOINTS;

	/**
	 * The number of structural features of the '<em>BEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE_FEATURE_COUNT = BLINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE_OPERATION_COUNT = BLINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BOuterNameImpl <em>BOuter Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BOuterNameImpl
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBOuterName()
	 * @generated
	 */
	int BOUTER_NAME = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME__NAME = BLINK__NAME;

	/**
	 * The feature id for the '<em><b>BPoints</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME__BPOINTS = BLINK__BPOINTS;

	/**
	 * The number of structural features of the '<em>BOuter Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME_FEATURE_COUNT = BLINK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>BOuter Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME_OPERATION_COUNT = BLINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType <em>Indexable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getIndexableType()
	 * @generated
	 */
	int INDEXABLE_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXABLE_TYPE__INDEX = 0;

	/**
	 * The number of structural features of the '<em>Indexable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Indexable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INDEXABLE_TYPE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace <em>BPlace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPlace</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace
	 * @generated
	 */
	EClass getBPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBChild <em>BChild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BChild</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBChild()
	 * @see #getBPlace()
	 * @generated
	 */
	EReference getBPlace_BChild();

	/**
	 * Returns the meta object for the container reference '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BPrnt</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPlace#getBPrnt()
	 * @see #getBPlace()
	 * @generated
	 */
	EReference getBPlace_BPrnt();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot <em>BRoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BRoot</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BRoot
	 * @generated
	 */
	EClass getBRoot();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode <em>BNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BNode</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode
	 * @generated
	 */
	EClass getBNode();

	/**
	 * Returns the meta object for the containment reference list '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode#getBPorts <em>BPorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BPorts</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BNode#getBPorts()
	 * @see #getBNode()
	 * @generated
	 */
	EReference getBNode_BPorts();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BSite <em>BSite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSite</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BSite
	 * @generated
	 */
	EClass getBSite();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint <em>BPoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPoint</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint
	 * @generated
	 */
	EClass getBPoint();

	/**
	 * Returns the meta object for the reference '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>BLink</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPoint#getBLink()
	 * @see #getBPoint()
	 * @generated
	 */
	EReference getBPoint_BLink();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLink</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink
	 * @generated
	 */
	EClass getBLink();

	/**
	 * Returns the meta object for the reference list '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink#getBPoints <em>BPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BPoints</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BLink#getBPoints()
	 * @see #getBLink()
	 * @generated
	 */
	EReference getBLink_BPoints();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort <em>BPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPort</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort
	 * @generated
	 */
	EClass getBPort();

	/**
	 * Returns the meta object for the container reference '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort#getBNode <em>BNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BNode</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BPort#getBNode()
	 * @see #getBPort()
	 * @generated
	 */
	EReference getBPort_BNode();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName <em>BInner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInner Name</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BInnerName
	 * @generated
	 */
	EClass getBInnerName();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge <em>BEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BEdge</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BEdge
	 * @generated
	 */
	EClass getBEdge();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName <em>BOuter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOuter Name</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.BOuterName
	 * @generated
	 */
	EClass getBOuterName();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType <em>Nameable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable Type</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType
	 * @generated
	 */
	EClass getNameableType();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType#getName()
	 * @see #getNameableType()
	 * @generated
	 */
	EAttribute getNameableType_Name();

	/**
	 * Returns the meta object for class '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType <em>Indexable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexable Type</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType
	 * @generated
	 */
	EClass getIndexableType();

	/**
	 * Returns the meta object for the attribute '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType#getIndex()
	 * @see #getIndexableType()
	 * @generated
	 */
	EAttribute getIndexableType_Index();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	BigraphBaseModelFactory getBigraphBaseModelFactory();

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
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPlaceImpl <em>BPlace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPlaceImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPlace()
		 * @generated
		 */
		EClass BPLACE = eINSTANCE.getBPlace();

		/**
		 * The meta object literal for the '<em><b>BChild</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPLACE__BCHILD = eINSTANCE.getBPlace_BChild();

		/**
		 * The meta object literal for the '<em><b>BPrnt</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPLACE__BPRNT = eINSTANCE.getBPlace_BPrnt();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BRootImpl <em>BRoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BRootImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBRoot()
		 * @generated
		 */
		EClass BROOT = eINSTANCE.getBRoot();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl <em>BNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BNodeImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBNode()
		 * @generated
		 */
		EClass BNODE = eINSTANCE.getBNode();

		/**
		 * The meta object literal for the '<em><b>BPorts</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BNODE__BPORTS = eINSTANCE.getBNode_BPorts();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BSiteImpl <em>BSite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BSiteImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBSite()
		 * @generated
		 */
		EClass BSITE = eINSTANCE.getBSite();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPointImpl <em>BPoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPointImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPoint()
		 * @generated
		 */
		EClass BPOINT = eINSTANCE.getBPoint();

		/**
		 * The meta object literal for the '<em><b>BLink</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPOINT__BLINK = eINSTANCE.getBPoint_BLink();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BLinkImpl <em>BLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BLinkImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBLink()
		 * @generated
		 */
		EClass BLINK = eINSTANCE.getBLink();

		/**
		 * The meta object literal for the '<em><b>BPoints</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLINK__BPOINTS = eINSTANCE.getBLink_BPoints();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPortImpl <em>BPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BPortImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPort()
		 * @generated
		 */
		EClass BPORT = eINSTANCE.getBPort();

		/**
		 * The meta object literal for the '<em><b>BNode</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BPORT__BNODE = eINSTANCE.getBPort_BNode();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BInnerNameImpl <em>BInner Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BInnerNameImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBInnerName()
		 * @generated
		 */
		EClass BINNER_NAME = eINSTANCE.getBInnerName();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BEdgeImpl <em>BEdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BEdgeImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBEdge()
		 * @generated
		 */
		EClass BEDGE = eINSTANCE.getBEdge();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BOuterNameImpl <em>BOuter Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BOuterNameImpl
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBOuterName()
		 * @generated
		 */
		EClass BOUTER_NAME = eINSTANCE.getBOuterName();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType <em>Nameable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.NameableType
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getNameableType()
		 * @generated
		 */
		EClass NAMEABLE_TYPE = eINSTANCE.getNameableType();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMEABLE_TYPE__NAME = eINSTANCE.getNameableType_Name();

		/**
		 * The meta object literal for the '{@link de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType <em>Indexable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.IndexableType
		 * @see de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getIndexableType()
		 * @generated
		 */
		EClass INDEXABLE_TYPE = eINSTANCE.getIndexableType();

		/**
		 * The meta object literal for the '<em><b>Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INDEXABLE_TYPE__INDEX = eINSTANCE.getIndexableType_Index();

	}

} //BigraphBaseModelPackage
