/**
 */
package de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.impl;

import de.tudresden.inf.st.bigraphs.models.bigraphBaseModel.*;

import java.util.Map;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BigraphBaseModelFactoryImpl extends EFactoryImpl implements BigraphBaseModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BigraphBaseModelFactory init() {
		try {
			BigraphBaseModelFactory theBigraphBaseModelFactory = (BigraphBaseModelFactory) EPackage.Registry.INSTANCE
					.getEFactory(BigraphBaseModelPackage.eNS_URI);
			if (theBigraphBaseModelFactory != null) {
				return theBigraphBaseModelFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new BigraphBaseModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigraphBaseModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case BigraphBaseModelPackage.BROOT:
			return (EObject) createBRoot();
		case BigraphBaseModelPackage.BNODE:
			return (EObject) createBNode();
		case BigraphBaseModelPackage.BSITE:
			return (EObject) createBSite();
		case BigraphBaseModelPackage.BPORT:
			return (EObject) createBPort();
		case BigraphBaseModelPackage.BINNER_NAME:
			return (EObject) createBInnerName();
		case BigraphBaseModelPackage.BEDGE:
			return (EObject) createBEdge();
		case BigraphBaseModelPackage.BOUTER_NAME:
			return (EObject) createBOuterName();
		case BigraphBaseModelPackage.BBIGRAPH:
			return (EObject) createBBigraph();
		case BigraphBaseModelPackage.ESTRING_TO_EJAVA_OBJECT_MAP:
			return (EObject) createEStringToEJavaObjectMap();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BRoot createBRoot() {
		BRootImpl bRoot = new BRootImpl();
		return bRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BNode createBNode() {
		BNodeImpl bNode = new BNodeImpl();
		return bNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BSite createBSite() {
		BSiteImpl bSite = new BSiteImpl();
		return bSite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BPort createBPort() {
		BPortImpl bPort = new BPortImpl();
		return bPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BInnerName createBInnerName() {
		BInnerNameImpl bInnerName = new BInnerNameImpl();
		return bInnerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BEdge createBEdge() {
		BEdgeImpl bEdge = new BEdgeImpl();
		return bEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BOuterName createBOuterName() {
		BOuterNameImpl bOuterName = new BOuterNameImpl();
		return bOuterName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BBigraph createBBigraph() {
		BBigraphImpl bBigraph = new BBigraphImpl();
		return bBigraph;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map.Entry<String, Object> createEStringToEJavaObjectMap() {
		EStringToEJavaObjectMapImpl eStringToEJavaObjectMap = new EStringToEJavaObjectMapImpl();
		return eStringToEJavaObjectMap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BigraphBaseModelPackage getBigraphBaseModelPackage() {
		return (BigraphBaseModelPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static BigraphBaseModelPackage getPackage() {
		return BigraphBaseModelPackage.eINSTANCE;
	}

} //BigraphBaseModelFactoryImpl
