/**
 */
package org.bigraphs.model.bigraphBaseModel;

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
 * @see org.bigraphs.model.bigraphBaseModel.BigraphBaseModelFactory
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
	String eNS_URI = "http://org.bigraphs.model";

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
	BigraphBaseModelPackage eINSTANCE = org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BPlaceImpl <em>BPlace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BPlaceImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPlace()
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
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BRootImpl <em>BRoot</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BRootImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBRoot()
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
	 * The feature id for the '<em><b>BBigraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT__BBIGRAPH = BPLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BRoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT_FEATURE_COUNT = BPLACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BRoot</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BROOT_OPERATION_COUNT = BPLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BNodeImpl <em>BNode</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BNodeImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBNode()
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
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE__ATTRIBUTES = BPLACE_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>BNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE_FEATURE_COUNT = BPLACE_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>BNode</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BNODE_OPERATION_COUNT = BPLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BSiteImpl <em>BSite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BSiteImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBSite()
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
	 * The feature id for the '<em><b>BBigraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE__BBIGRAPH = BPLACE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BSite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE_FEATURE_COUNT = BPLACE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BSite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BSITE_OPERATION_COUNT = BPLACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BPointImpl <em>BPoint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BPointImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPoint()
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
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.NameableType <em>Nameable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.NameableType
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getNameableType()
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
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BLinkImpl <em>BLink</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BLinkImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBLink()
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
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BPortImpl <em>BPort</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BPortImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPort()
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
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BInnerNameImpl <em>BInner Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BInnerNameImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBInnerName()
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
	 * The feature id for the '<em><b>BBigraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME__BBIGRAPH = BPOINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>BInner Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME_FEATURE_COUNT = BPOINT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>BInner Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BINNER_NAME_OPERATION_COUNT = BPOINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BEdgeImpl <em>BEdge</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BEdgeImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBEdge()
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
	 * The feature id for the '<em><b>BBigraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE__BBIGRAPH = BLINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE_FEATURE_COUNT = BLINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BEdge</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEDGE_OPERATION_COUNT = BLINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BOuterNameImpl <em>BOuter Name</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BOuterNameImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBOuterName()
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
	 * The feature id for the '<em><b>BBigraph</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME__BBIGRAPH = BLINK_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>BOuter Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME_FEATURE_COUNT = BLINK_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>BOuter Name</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOUTER_NAME_OPERATION_COUNT = BLINK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.IndexableType <em>Indexable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.IndexableType
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getIndexableType()
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
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BBigraphImpl <em>BBigraph</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BBigraphImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBBigraph()
	 * @generated
	 */
	int BBIGRAPH = 12;

	/**
	 * The feature id for the '<em><b>BRoots</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH__BROOTS = 0;

	/**
	 * The feature id for the '<em><b>BEdges</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH__BEDGES = 1;

	/**
	 * The feature id for the '<em><b>BInner Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH__BINNER_NAMES = 2;

	/**
	 * The feature id for the '<em><b>BOuter Names</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH__BOUTER_NAMES = 3;

	/**
	 * The feature id for the '<em><b>BSites</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH__BSITES = 4;

	/**
	 * The number of structural features of the '<em>BBigraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>BBigraph</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BBIGRAPH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.bigraphs.model.bigraphBaseModel.impl.EStringToEJavaObjectMapImpl <em>EString To EJava Object Map</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.bigraphs.model.bigraphBaseModel.impl.EStringToEJavaObjectMapImpl
	 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getEStringToEJavaObjectMap()
	 * @generated
	 */
	int ESTRING_TO_EJAVA_OBJECT_MAP = 13;

	/**
	 * The feature id for the '<em><b>Key</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EJAVA_OBJECT_MAP__KEY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EJAVA_OBJECT_MAP__VALUE = 1;

	/**
	 * The number of structural features of the '<em>EString To EJava Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EJAVA_OBJECT_MAP_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>EString To EJava Object Map</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ESTRING_TO_EJAVA_OBJECT_MAP_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BPlace <em>BPlace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPlace</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPlace
	 * @generated
	 */
	EClass getBPlace();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBChild <em>BChild</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BChild</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPlace#getBChild()
	 * @see #getBPlace()
	 * @generated
	 */
	EReference getBPlace_BChild();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BPlace#getBPrnt <em>BPrnt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BPrnt</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPlace#getBPrnt()
	 * @see #getBPlace()
	 * @generated
	 */
	EReference getBPlace_BPrnt();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BRoot <em>BRoot</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BRoot</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BRoot
	 * @generated
	 */
	EClass getBRoot();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BRoot#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BBigraph</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BRoot#getBBigraph()
	 * @see #getBRoot()
	 * @generated
	 */
	EReference getBRoot_BBigraph();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BNode <em>BNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BNode</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BNode
	 * @generated
	 */
	EClass getBNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BNode#getBPorts <em>BPorts</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BPorts</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BNode#getBPorts()
	 * @see #getBNode()
	 * @generated
	 */
	EReference getBNode_BPorts();

	/**
	 * Returns the meta object for the map '{@link org.bigraphs.model.bigraphBaseModel.BNode#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>Attributes</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BNode#getAttributes()
	 * @see #getBNode()
	 * @generated
	 */
	EReference getBNode_Attributes();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BSite <em>BSite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BSite</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BSite
	 * @generated
	 */
	EClass getBSite();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BSite#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BBigraph</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BSite#getBBigraph()
	 * @see #getBSite()
	 * @generated
	 */
	EReference getBSite_BBigraph();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BPoint <em>BPoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPoint</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPoint
	 * @generated
	 */
	EClass getBPoint();

	/**
	 * Returns the meta object for the reference '{@link org.bigraphs.model.bigraphBaseModel.BPoint#getBLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>BLink</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPoint#getBLink()
	 * @see #getBPoint()
	 * @generated
	 */
	EReference getBPoint_BLink();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BLink <em>BLink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BLink</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BLink
	 * @generated
	 */
	EClass getBLink();

	/**
	 * Returns the meta object for the reference list '{@link org.bigraphs.model.bigraphBaseModel.BLink#getBPoints <em>BPoints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>BPoints</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BLink#getBPoints()
	 * @see #getBLink()
	 * @generated
	 */
	EReference getBLink_BPoints();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BPort <em>BPort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BPort</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPort
	 * @generated
	 */
	EClass getBPort();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BPort#getBNode <em>BNode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BNode</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BPort#getBNode()
	 * @see #getBPort()
	 * @generated
	 */
	EReference getBPort_BNode();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BInnerName <em>BInner Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BInner Name</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BInnerName
	 * @generated
	 */
	EClass getBInnerName();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BInnerName#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BBigraph</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BInnerName#getBBigraph()
	 * @see #getBInnerName()
	 * @generated
	 */
	EReference getBInnerName_BBigraph();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BEdge <em>BEdge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BEdge</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BEdge
	 * @generated
	 */
	EClass getBEdge();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BEdge#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BBigraph</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BEdge#getBBigraph()
	 * @see #getBEdge()
	 * @generated
	 */
	EReference getBEdge_BBigraph();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BOuterName <em>BOuter Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BOuter Name</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BOuterName
	 * @generated
	 */
	EClass getBOuterName();

	/**
	 * Returns the meta object for the container reference '{@link org.bigraphs.model.bigraphBaseModel.BOuterName#getBBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>BBigraph</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BOuterName#getBBigraph()
	 * @see #getBOuterName()
	 * @generated
	 */
	EReference getBOuterName_BBigraph();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.NameableType <em>Nameable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Nameable Type</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.NameableType
	 * @generated
	 */
	EClass getNameableType();

	/**
	 * Returns the meta object for the attribute '{@link org.bigraphs.model.bigraphBaseModel.NameableType#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.NameableType#getName()
	 * @see #getNameableType()
	 * @generated
	 */
	EAttribute getNameableType_Name();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.IndexableType <em>Indexable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Indexable Type</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.IndexableType
	 * @generated
	 */
	EClass getIndexableType();

	/**
	 * Returns the meta object for the attribute '{@link org.bigraphs.model.bigraphBaseModel.IndexableType#getIndex <em>Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Index</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.IndexableType#getIndex()
	 * @see #getIndexableType()
	 * @generated
	 */
	EAttribute getIndexableType_Index();

	/**
	 * Returns the meta object for class '{@link org.bigraphs.model.bigraphBaseModel.BBigraph <em>BBigraph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>BBigraph</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph
	 * @generated
	 */
	EClass getBBigraph();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBRoots <em>BRoots</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BRoots</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBRoots()
	 * @see #getBBigraph()
	 * @generated
	 */
	EReference getBBigraph_BRoots();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBEdges <em>BEdges</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BEdges</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBEdges()
	 * @see #getBBigraph()
	 * @generated
	 */
	EReference getBBigraph_BEdges();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBInnerNames <em>BInner Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BInner Names</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBInnerNames()
	 * @see #getBBigraph()
	 * @generated
	 */
	EReference getBBigraph_BInnerNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBOuterNames <em>BOuter Names</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BOuter Names</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBOuterNames()
	 * @see #getBBigraph()
	 * @generated
	 */
	EReference getBBigraph_BOuterNames();

	/**
	 * Returns the meta object for the containment reference list '{@link org.bigraphs.model.bigraphBaseModel.BBigraph#getBSites <em>BSites</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>BSites</em>'.
	 * @see org.bigraphs.model.bigraphBaseModel.BBigraph#getBSites()
	 * @see #getBBigraph()
	 * @generated
	 */
	EReference getBBigraph_BSites();

	/**
	 * Returns the meta object for class '{@link java.util.Map.Entry <em>EString To EJava Object Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>EString To EJava Object Map</em>'.
	 * @see java.util.Map.Entry
	 * @model keyId="true" keyDataType="org.eclipse.emf.ecore.EString"
	 *        valueDataType="org.eclipse.emf.ecore.EJavaObject"
	 * @generated
	 */
	EClass getEStringToEJavaObjectMap();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Key</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEJavaObjectMap()
	 * @generated
	 */
	EAttribute getEStringToEJavaObjectMap_Key();

	/**
	 * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see java.util.Map.Entry
	 * @see #getEStringToEJavaObjectMap()
	 * @generated
	 */
	EAttribute getEStringToEJavaObjectMap_Value();

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
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BPlaceImpl <em>BPlace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BPlaceImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPlace()
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
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BRootImpl <em>BRoot</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BRootImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBRoot()
		 * @generated
		 */
		EClass BROOT = eINSTANCE.getBRoot();

		/**
		 * The meta object literal for the '<em><b>BBigraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BROOT__BBIGRAPH = eINSTANCE.getBRoot_BBigraph();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BNodeImpl <em>BNode</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BNodeImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBNode()
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
		 * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BNODE__ATTRIBUTES = eINSTANCE.getBNode_Attributes();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BSiteImpl <em>BSite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BSiteImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBSite()
		 * @generated
		 */
		EClass BSITE = eINSTANCE.getBSite();

		/**
		 * The meta object literal for the '<em><b>BBigraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BSITE__BBIGRAPH = eINSTANCE.getBSite_BBigraph();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BPointImpl <em>BPoint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BPointImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPoint()
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
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BLinkImpl <em>BLink</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BLinkImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBLink()
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
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BPortImpl <em>BPort</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BPortImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBPort()
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
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BInnerNameImpl <em>BInner Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BInnerNameImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBInnerName()
		 * @generated
		 */
		EClass BINNER_NAME = eINSTANCE.getBInnerName();

		/**
		 * The meta object literal for the '<em><b>BBigraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BINNER_NAME__BBIGRAPH = eINSTANCE.getBInnerName_BBigraph();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BEdgeImpl <em>BEdge</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BEdgeImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBEdge()
		 * @generated
		 */
		EClass BEDGE = eINSTANCE.getBEdge();

		/**
		 * The meta object literal for the '<em><b>BBigraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEDGE__BBIGRAPH = eINSTANCE.getBEdge_BBigraph();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BOuterNameImpl <em>BOuter Name</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BOuterNameImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBOuterName()
		 * @generated
		 */
		EClass BOUTER_NAME = eINSTANCE.getBOuterName();

		/**
		 * The meta object literal for the '<em><b>BBigraph</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOUTER_NAME__BBIGRAPH = eINSTANCE.getBOuterName_BBigraph();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.NameableType <em>Nameable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.NameableType
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getNameableType()
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
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.IndexableType <em>Indexable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.IndexableType
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getIndexableType()
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

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.BBigraphImpl <em>BBigraph</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BBigraphImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getBBigraph()
		 * @generated
		 */
		EClass BBIGRAPH = eINSTANCE.getBBigraph();

		/**
		 * The meta object literal for the '<em><b>BRoots</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIGRAPH__BROOTS = eINSTANCE.getBBigraph_BRoots();

		/**
		 * The meta object literal for the '<em><b>BEdges</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIGRAPH__BEDGES = eINSTANCE.getBBigraph_BEdges();

		/**
		 * The meta object literal for the '<em><b>BInner Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIGRAPH__BINNER_NAMES = eINSTANCE.getBBigraph_BInnerNames();

		/**
		 * The meta object literal for the '<em><b>BOuter Names</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIGRAPH__BOUTER_NAMES = eINSTANCE.getBBigraph_BOuterNames();

		/**
		 * The meta object literal for the '<em><b>BSites</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BBIGRAPH__BSITES = eINSTANCE.getBBigraph_BSites();

		/**
		 * The meta object literal for the '{@link org.bigraphs.model.bigraphBaseModel.impl.EStringToEJavaObjectMapImpl <em>EString To EJava Object Map</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.bigraphs.model.bigraphBaseModel.impl.EStringToEJavaObjectMapImpl
		 * @see org.bigraphs.model.bigraphBaseModel.impl.BigraphBaseModelPackageImpl#getEStringToEJavaObjectMap()
		 * @generated
		 */
		EClass ESTRING_TO_EJAVA_OBJECT_MAP = eINSTANCE.getEStringToEJavaObjectMap();

		/**
		 * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_EJAVA_OBJECT_MAP__KEY = eINSTANCE.getEStringToEJavaObjectMap_Key();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ESTRING_TO_EJAVA_OBJECT_MAP__VALUE = eINSTANCE.getEStringToEJavaObjectMap_Value();

	}

} //BigraphBaseModelPackage
